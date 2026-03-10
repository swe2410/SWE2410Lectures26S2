package exercises.phonebook.phonebook;//package pbook;
//
// Build:
//      javac -cp support/junit-4.10.jar *.java
// Run:
//      java -cp '.:support/*' org.junit.runner.JUnitCore TestDomain TestPolicy
// On windows:
//      javac -cp ".;c:/apps/java/*" *.java
//      java -cp ".;c:/apps/java/*" org.junit.runner.JUnitCore TestDomain TestPolicy

import java.util.*;

// phonebook; iterator guaranteed to process items in alphabetical order
public class PhoneBook implements Iterable<Entry> {
   protected Map<String, Entry> book = new TreeMap<String, Entry>();

   // add entry to phone book; precondition: item not present already
   public void add(Entry e) {
      book.put(e.name(), e);
   }

   // remove entry from phone book; does nothing if name is not in book
   public void remove(String name) {
      book.remove(name);
   }

   // return entry for given name; precondition: name is in book
   public Entry lookup(String name) {
      return book.get(name);
   }

   // return true iff phonebook is empty
   public boolean isEmpty() {
      return book.isEmpty();
   }

   // return iterator over values in map
   public Iterator<Entry> iterator() {
      return book.values().iterator();
   }

   public String toString() {
      StringBuffer result = new StringBuffer();
      for (Entry e : this) {
         result.append(e.toString());
         result.append("\n");
      }
      return result.toString();
   }
}
