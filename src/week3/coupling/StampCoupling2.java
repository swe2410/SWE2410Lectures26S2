/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StampCoupling2 {
    void save(TextField field) {
        String text = field.getText();
    }
    private static void printFirst(List<String> names) {
        System.out.println(names.get(0));
    }
    private static void process(int[] data) {
        int id = data[0];
    }
    public static void main(String[] args) {
        List<String> names =
                new ArrayList<>(Arrays.asList("Leah", "Ren", "Sophia", "Ian"));
        printFirst(names);
        int[] ids = {1,2,3,4};
        process(ids);
    }
}
