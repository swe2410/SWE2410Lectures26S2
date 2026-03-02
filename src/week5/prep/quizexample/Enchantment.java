/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.prep.quizexample;

public abstract class Enchantment
        implements Weapon {
    protected Weapon weapon;
    public Enchantment(Weapon weapon){
        this.weapon = weapon;
    }
}
