/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.prep.quizexample;

public class IceEnchantment extends Enchantment {
    public IceEnchantment(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String getDmg() {
        final int baseDamage = 6;
        return baseDamage + " Ice " + weapon.getDmg();
    }
}
