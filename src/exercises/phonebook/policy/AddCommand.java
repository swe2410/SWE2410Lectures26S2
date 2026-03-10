package exercises.phonebook.policy;//package pbook;

import exercises.phonebook.phonebook.Entry;
import exercises.phonebook.phonebook.PhoneBook;

public class AddCommand extends Command {
   protected Entry entry_to_add;

   public AddCommand(PhoneBook pbk, Entry e) {
      super(pbk);
      entry_to_add = e;
   }

   public void execute() {
      book().add(entry_to_add);
   }

   public void unexecute() {
      book().remove(entry_to_add.name());
   }
}
