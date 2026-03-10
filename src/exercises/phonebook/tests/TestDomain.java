package exercises.phonebook.tests;

import exercises.phonebook.phonebook.Entry;
import exercises.phonebook.phonebook.PhoneBook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDomain {

   @Test
   public void testEntry() {
      Entry e = new Entry("my entry", "1234");
      assertEquals("my entry", e.name());
      assertEquals("1234", e.phone());
      assertEquals("my entry: 1234", e.toString());
   }

   @Test
   public void testEntryComparison() {
      Entry one = new Entry("one", "1");
      Entry two = new Entry("two", "0"); // phone number chosen to sort before one's
      assertTrue(one.compareTo(two) < 0);
      assertTrue(two.compareTo(one) > 0);
      assertTrue(one.compareTo(one) == 0);
   }

   @Test
   public void testEmptyPhonebook() {
      PhoneBook pb = new PhoneBook();
      assertTrue(pb.isEmpty());
      assertEquals("", pb.toString());
   }

   @Test
   public void testSingleItemPhonebook() {
      PhoneBook pb = new PhoneBook();
      pb.add(new Entry("x", "1"));
      assertEquals("x: 1\n", pb.toString());
      assertFalse(pb.isEmpty());
      pb.remove("y");
      assertEquals("x: 1\n", pb.toString());
      pb.remove("x");
      assertTrue(pb.isEmpty());
   }

   @Test
   public void testFourItemPhonebook() {
      PhoneBook pb = new PhoneBook();
      pb.add(new Entry("a", "1"));
      pb.add(new Entry("c", "3"));
      pb.add(new Entry("b", "2"));
      pb.add(new Entry("d", "4"));
      assertEquals("a: 1\nb: 2\nc: 3\nd: 4\n", pb.toString());
      pb.remove("c");
      assertEquals("a: 1\nb: 2\nd: 4\n", pb.toString());
   }

   @Test
   public void testPhoneBookLookup() {
      PhoneBook pb = new PhoneBook();
      Entry jen = new Entry("jen", "0");
      Entry jaz = new Entry("jaz", "1");
      pb.add(jen);
      pb.add(jaz);
      // see that both are in the phonebook
      assertEquals(jen, pb.lookup("jen"));
      assertEquals(jaz, pb.lookup("jaz"));
      // check what happens if a non-existent entry is looked up
      assertNull(pb.lookup("jake"));
      // check case sensitivity
      assertNull(pb.lookup("Jen"));
   }
}
