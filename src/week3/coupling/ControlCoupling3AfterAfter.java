/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

public class ControlCoupling3AfterAfter {
    private static interface User {
        void generateReport();
    }
    private static class AdminUser implements User {
        @Override
        public void generateReport() {
            System.out.println("Admin report");
        }
    }
    private static class NonAdminUser implements User {
        @Override
        public void generateReport() {
            System.out.println("Non Admin report");
        }
    }
    private static class ReportGenerator {
        private User user;
        public void setUser(User user) {
            this.user = user;
        }
        public void generateReport(){
            user.generateReport();
        }
    }
    public static void main(String[] args) {
        ReportGenerator rg = new ReportGenerator();
        boolean isAdmin = false;
        if(isAdmin){
            rg.setUser(new AdminUser());
        } else {
            rg.setUser(new NonAdminUser());
        }
        rg.generateReport();
    }
}
