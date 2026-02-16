/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/8/2026
 */

package week3.coupling;

public class AccountServices {
    public void withdraw(Account a, double amount){
        a.withdraw(amount);
    }
}
