package exercises.phonebook.policy;//package pbook;

import exercises.phonebook.phonebook.Entry;
import exercises.phonebook.phonebook.PhoneBook;

public class RemoveCommand extends Command {
   protected String name_to_remove;
   protected Entry old_entry;

   public RemoveCommand(PhoneBook pbk, String n) {
      super(pbk);
      name_to_remove = n;
   }

   public void execute() {
      old_entry = book().lookup(name_to_remove);
      book().remove(name_to_remove);
   }

   public void unexecute() {
      book().add(old_entry);
   }
}
