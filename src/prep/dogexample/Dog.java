/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/19/2026
 */

package prep.dogexample;

public class Dog extends Mammal implements Animal {
    private String name;
    public Dog(String name){
        this.name = name;
    }
    public void wagTail(){
        System.out.println(name + " wags their tail.");
    }
    public void noise(){
        System.out.println("Bark");
    }
    @Override
    public void display(){
        System.out.println("This mammal is a dog with fur "+ hasHair);
    }
    @Override
    public void pet() {
        System.out.println("You pet the dog.");
    }
}

