/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/8/2026
 */

package week3.coupling;

public class Student {
    private final String name;
    public Student(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
