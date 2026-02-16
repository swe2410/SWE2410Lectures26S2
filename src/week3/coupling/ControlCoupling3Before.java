/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

public class ControlCoupling3Before {
    private static class ReportGenerator {
        private void generate(boolean isAdmin) {
            if (isAdmin) {
                System.out.println("Admin report");
            } else {
                System.out.println("User report");
            }
        }
    }
    public static void main(String[] args) {
        ReportGenerator rg = new ReportGenerator();
        boolean isAdmin = false;
        rg.generate(isAdmin);
    }
}
