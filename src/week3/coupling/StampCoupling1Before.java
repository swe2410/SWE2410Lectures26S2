/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

public class StampCoupling1Before {
    private static class Student {
        private String name;
        private int id;
        private double gpa;
        public Student(String name, int id, double gpa){
            this.name = name;
            this.gpa = gpa;
            this.id = id;
        }
        public double getGpa() {
            return gpa;
        }
    }
    private static class HonorRoll {
        private static boolean qualifies(Student s) {
            return s.getGpa() >= 3.5;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Diana", 12, 3.95);
        System.out.println(HonorRoll.qualifies(s1));
    }
}
