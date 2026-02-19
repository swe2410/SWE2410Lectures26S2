/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.prep.quizexample;

public class WeaponDriver {
    public static void main(String[] args) {
        Weapon sword = new Sword();
        System.out.println("This sword does ");
        System.out.println(sword.getDmg());
        System.out.println();

        System.out.println("Adding ice enchantment");
        sword = new IceEnchantment(sword);
        System.out.println("This sword does ");
        System.out.println(sword.getDmg());
        System.out.println();

//        System.out.println("Adding fire enchantment");
//        sword = new FireEnchantment(sword);
//        System.out.println("This sword does ");
//        System.out.println(sword.getDmg());
    }
}
