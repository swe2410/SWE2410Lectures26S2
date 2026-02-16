/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/8/2026
 */

package week3.coupling;

import java.lang.reflect.Field;

public class StudentRegistrar {
    public static void main(String[] args)
            throws NoSuchFieldException,
            IllegalAccessException {
        Student s1 = new Student("Emily");

        //System.out.println(s1.name);

        //Get the Field object for the private field name
        Field privateField = Student.class.getDeclaredField("name");

        // Make the field accessible
        privateField.setAccessible(true);

        //Get the current value
        String name = (String) privateField.get(s1);
        System.out.println("Current Value: " + name);

        //Set a new value
        String newValue = "Sam";
        privateField.set(s1, newValue);

        // Verify the new value
        System.out.println("New Value: " + privateField.get(s1));
        System.out.println("New Value (via getter): " + s1.getName());
    }
}
