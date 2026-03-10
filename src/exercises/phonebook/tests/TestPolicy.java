package exercises.phonebook.tests;//package pbook;

import static org.junit.jupiter.api.Assertions.*;

import exercises.phonebook.phonebook.Entry;
import exercises.phonebook.phonebook.PhoneBook;
import exercises.phonebook.policy.AddCommand;
import exercises.phonebook.policy.Handler;
import exercises.phonebook.policy.History;
import exercises.phonebook.policy.RemoveCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPolicy {

   static PhoneBook pb;

   @BeforeEach
   public void setUp() throws Exception {
      pb = new PhoneBook();
   }

   @Test
   public void testAddCommand() {
      AddCommand ac = new AddCommand(pb, new Entry("one", "1"));
      assertTrue(pb.isEmpty()); // sanity check
      // test first execute, unexecute
      ac.execute();
      assertEquals("one: 1\n", pb.toString());
      ac.unexecute();
      assertTrue(pb.isEmpty());
      // ensure repeatable:
      ac.execute();
      assertEquals("one: 1\n", pb.toString());
      ac.unexecute();
      assertTrue(pb.isEmpty());
   }

   @Test
   public void testRemoveCommand() {
      pb.add(new Entry("one", "1"));
      RemoveCommand rc = new RemoveCommand(pb, "one");
      assertEquals("one: 1\n", pb.toString()); // sanity check
      // test first execute, unexecute
      rc.execute();
      assertTrue(pb.isEmpty());
      rc.unexecute();
      assertEquals("one: 1\n", pb.toString());
      // ensure repeatable:
      rc.execute();
      assertTrue(pb.isEmpty());
      rc.unexecute();
      assertEquals("one: 1\n", pb.toString());
   }

   @Test
   public void testHistoryExecWithOneCommand() {
      AddCommand ac = new AddCommand(pb, new Entry("one", "1"));
      History h = new History();
      assertTrue(pb.isEmpty()); // sanity check
      // test adding and executing a command
      h.doCommand(ac);
      assertEquals("one: 1\n", pb.toString());
      h.undo();
      assertTrue(pb.isEmpty());
      // redo:
      h.redo();
      assertEquals("one: 1\n", pb.toString());
      // ensure can undo this one as well:
      h.undo();
      assertTrue(pb.isEmpty());
   }

   @Test
   public void testEmptyHistory() {
      History h = new History();
      assertNull(h.nextToRedo());
      assertNull(h.nextToUndo());
   }

   @Test
   // in addition to testing that multiple commands can be done and undone, ensures next_to_do/undo are correct
   public void testHistoryMultipleCommands() {
      AddCommand ac = new AddCommand(pb, new Entry("charlie", "3"));
      RemoveCommand rc = new RemoveCommand(pb, "charlie");
      History h = new History();
      h.doCommand(ac);
      assertEquals("charlie: 3\n", pb.toString()); // sanity check
      h.doCommand(rc);
      assertTrue(pb.isEmpty());                    // ensure removed charlie
      assertEquals(rc, h.nextToUndo());          // ensure correct top of history stack
      h.undo();
      // have undone the remove, next would be to undo the add
      assertEquals("charlie: 3\n", pb.toString()); // confirm undid the remove
      assertEquals(ac, h.nextToUndo());          // check next operation to undo
      assertEquals(rc, h.nextToRedo());          // correct item at top of redo stack
      // check redoing the remove
      h.redo();
      assertTrue(pb.isEmpty());
      // now undo both and check final state
      h.undo();
      h.undo();
      assertTrue(pb.isEmpty());
      assertEquals(ac, h.nextToRedo());
      assertNull(h.nextToUndo());
   }

   @Test
   // test case with multiple commands on history, ensuring can undo and redo them
   public void testDeepHistory() {
      History h = new History();
      pb.add(new Entry("a", "1"));
      pb.add(new Entry("b", "2"));
      pb.add(new Entry("c", "3"));
      pb.add(new Entry("d", "4"));
      assertEquals("a: 1\nb: 2\nc: 3\nd: 4\n", pb.toString()); // sanity check
      h.doCommand(new RemoveCommand(pb, "a"));
      h.doCommand(new RemoveCommand(pb, "b"));
      h.doCommand(new RemoveCommand(pb, "c"));
      h.doCommand(new RemoveCommand(pb, "d"));
      assertTrue(pb.isEmpty());  // ensure all commands executed
      for (int i = 0; i < 3; ++i)
         h.undo();
      assertEquals("b: 2\nc: 3\nd: 4\n", pb.toString()); // phonebook restored except for "a" entry
      for (int i = 0; i < 3; ++i)
         h.redo();
      assertTrue(pb.isEmpty());  // ensure all undone commands redone
      for (int i = 0; i < 4; ++i)
         h.undo();
      assertEquals("a: 1\nb: 2\nc: 3\nd: 4\n", pb.toString()); // complete phonebook restored
   }

   @Test
   // test that add works and is added to the history
   public void testHandlerAddOperation() {
      Handler h = new Handler();
      h.addEntry("Tony", "num1");
      h.addEntry("Bob", "Bob's Number");
      assertEquals("Bob: Bob's Number\nTony: num1\n", h.getPhoneBook().toString());
      h.undo();
      assertEquals("Tony: num1\n", h.getPhoneBook().toString());
      h.redo();
      assertEquals("Bob: Bob's Number\nTony: num1\n", h.getPhoneBook().toString());
   }

   @Test
   // test that remove works and is added to the history
   public void testHandlerRemoveOperation() {
      Handler h = new Handler();
      h.getPhoneBook().add(new Entry("Zeke", "z"));
      h.getPhoneBook().add(new Entry("Yu", "y"));
      h.getPhoneBook().add(new Entry("Manchu", "m"));
      h.removeEntry("Yu");
      assertEquals("Manchu: m\nZeke: z\n", h.getPhoneBook().toString());
      h.removeEntry("Zeke");
      assertEquals("Manchu: m\n", h.getPhoneBook().toString());
      h.undo();
      assertEquals("Manchu: m\nZeke: z\n", h.getPhoneBook().toString());
      h.redo();
      assertEquals("Manchu: m\n", h.getPhoneBook().toString());
   }

}
