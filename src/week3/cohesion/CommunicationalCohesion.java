/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/12/2026
 */

package week3.cohesion;

public class CommunicationalCohesion {
    private class Student {}
    public class StudentReport {
        void generate(Student student) {
            calculateGPA(student);
            formatReport(student);
            printReport(student);
        }
        private void calculateGPA(Student s) { }
        private void formatReport(Student s) { }
        private void printReport(Student s) { }
    }
}
