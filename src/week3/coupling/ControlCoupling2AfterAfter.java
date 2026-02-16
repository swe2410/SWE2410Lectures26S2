/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

import java.util.ArrayList;
import java.util.List;

public class ControlCoupling2AfterAfter {
    private static class Order{ }
    interface OrderAction {
        void execute(Order o);
    }
    private static class RetryPayment implements OrderAction {
        public void execute(Order o) {
            System.out.println("Retrying payment");
        }
    }
    private static class NotifyUser implements OrderAction {
        public void execute(Order o) {
            System.out.println("Notifying user");
        }
    }
    private static class OrderProcessor {
        private final Order o;
        private final List<OrderAction> actions;

        OrderProcessor(Order o, List<OrderAction> actions) {
            this.o = o;
            this.actions = actions;
        }
        void process() {
            for (OrderAction action : actions) {
                action.execute(o);
            }
        }
    }
    public static void main(String[] args) {
        Order o1 = new Order();
        List<OrderAction> actions = new ArrayList<>();
        actions.add(new RetryPayment());
        actions.add(new NotifyUser());
        new OrderProcessor(o1, actions).process();
    }
}
