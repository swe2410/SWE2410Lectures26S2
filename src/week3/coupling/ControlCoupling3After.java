/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

public class ControlCoupling3After {
    private static class ReportGenerator {
        private void generateUserReport() {
            System.out.println("User report");
        }
        private void generateAdminReport() {
            System.out.println("Admin report");
        }
    }
    public static void main(String[] args) {
        ReportGenerator rg = new ReportGenerator();
        boolean isAdmin = false;
        if(isAdmin){
            rg.generateAdminReport();
        } else {
            rg.generateUserReport();
        }
    }
}
