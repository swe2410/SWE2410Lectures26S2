/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/19/2026
 */

package prep.dogexample;

public class Chihuahua extends Dog {
    public Chihuahua(String name) {
        super(name);
    }
    @Override
    public void noise() {
        System.out.println("Yip");
    }
    public void display(){
        System.out.println("This is a Chihuahua with hair "+hasHair);
    }
    public void pet(){
        System.out.println("You pet the Chihuahua.");
    }

}
