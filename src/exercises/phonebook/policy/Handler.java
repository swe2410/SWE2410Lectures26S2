package exercises.phonebook.policy;//package pbook;

import exercises.phonebook.phonebook.Entry;
import exercises.phonebook.phonebook.PhoneBook;

// top level policy operations for use from user interface
public class Handler {
   protected History history = new History();
   protected PhoneBook pb = new PhoneBook();

   // add a new phone entry
   public void addEntry(String name, String phone_number) {
      history.doCommand(new AddCommand(pb, new Entry(name, phone_number)));
   }

   // remove an existing entry; does nothing if entry not there
   public void removeEntry(String name) {
      history.doCommand(new RemoveCommand(pb, name));
   }

   // return the history
   public History getHistory() {
      return history;
   }

   // return the phone book
   public PhoneBook getPhoneBook() {
      return pb;
   }

   // undoes last command if there is one to undo, otherwise does nothing
   public void undo() {
      if (history.nextToUndo() != null)
         history.undo();
   }

   // redo last undone command if there is one to do, otherwise does nothing
   public void redo() {
      if (history.nextToRedo() != null)
         history.redo();
   }
}
