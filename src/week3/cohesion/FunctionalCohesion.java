/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/12/2026
 */

package week3.cohesion;

public class FunctionalCohesion {
    private class PasswordValidator {
        private boolean isValid(String password) {
            return hasMinLength(password)
                    && hasUppercase(password)
                    && hasNumber(password);
        }
        private boolean hasMinLength(String p) {
            return p.length() >= 8;
        }
        private boolean hasUppercase(String p) {
            return p.matches(".*[A-Z].*");
        }
        private boolean hasNumber(String p) {
            return p.matches(".*\\d.*");
        }
    }
}
