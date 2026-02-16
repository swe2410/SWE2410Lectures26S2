/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/8/2026
 */

package week3.coupling;

public class Account {
    private double exchangeRate = 0.25;
    public double bal;

    public void withdraw(double amount){
        //prevent overdraft
        if(amount <= bal){
            //apply exchange rate
            double modifiedAmount = amount * exchangeRate;
            bal -= modifiedAmount;
        }
    }
    private void secret(){
        System.out.println("42");
    }
}
