/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/13/2026
 */

package week4.prep.icecream;

public abstract class Toppings implements IceCreamProduct {
    protected IceCreamProduct product;
    public Toppings(IceCreamProduct product){
        this.product = product;
    }
}
