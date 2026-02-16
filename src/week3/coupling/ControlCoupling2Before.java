/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

public class ControlCoupling2Before {
    private static class Order{ }
    private static void processOrder(
            Order o, boolean retry, boolean notifyUser) {
        if (retry) {
            retryPayment(o);
        }
        if (notifyUser) {
            sendEmail(o);
        }
    }
    private static void sendEmail(Order o) {
        System.out.println("Sending an email");
    }

    private static void retryPayment(Order o) {
        System.out.println("Retrying payment");
    }
    public static void main(String[] args) {
        Order o1 = new Order();
        boolean retry = true;
        boolean notifyUser = true;
        processOrder(o1, retry, notifyUser);
    }
}
