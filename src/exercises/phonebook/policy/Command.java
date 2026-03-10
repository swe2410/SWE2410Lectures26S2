package exercises.phonebook.policy;//package pbook;


import exercises.phonebook.phonebook.PhoneBook;

public abstract class Command {
   protected PhoneBook pb; // phonebook to modify

   public Command(PhoneBook _pb) {
      pb = _pb;
   }

   public PhoneBook book() {
      return pb;
   }

   public abstract void execute(); // executing the command

   public abstract void unexecute(); // undoing the command
}
