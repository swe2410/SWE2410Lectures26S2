/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.prep.quizexample;

import java.util.Random;

public interface Weapon {
    public final Random NUMBER_GENERATOR =
            new Random();
    public String getDmg();
}
