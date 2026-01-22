/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/19/2026
 */

package prep.dogexample;

public class DogDriver {
    private static Animal makeAnimal(){
        if(Math.random() < 0.5){
            return new Dog("Spot");
        } else {
            return new Chihuahua("Fido");
        }
    }
    public static void main(String[] args) {
        Animal animal;
        for(int i = 0; i < 5; i++){
            System.out.println("Animal " + i);
            animal = makeAnimal();
            animal.pet();
        }
    }
}
