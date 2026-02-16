/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

public class ControlCoupling2After {
    private static class Order{ }
    private static class OrderProcessor {
        private Order o;
        private boolean retry;
        private boolean notify;
        private OrderProcessor(
                Order o, boolean retry, boolean notify){
            this.o = o;
            this.retry = retry;
            this.notify = notify;
        }
        public void process(){
            if(retry){
                System.out.println("Retrying payment");
            }
            if(notify){
                System.out.println("Retrying payment");
            }
        }
    }
    public static void main(String[] args) {
        Order o1 = new Order();
        boolean retry = true;
        boolean notifyUser = true;
        OrderProcessor op = new OrderProcessor(o1, retry, notifyUser);
        op.process();
    }
}
