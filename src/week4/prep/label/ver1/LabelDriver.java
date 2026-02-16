/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week4.prep.label.ver1;

public class LabelDriver {
    public static void main(String[] args) {
        Label label1 = new PlainLabel();
        label1.setText("Hello World!");
        label1 = new Quotes(label1);
        System.out.println("Text of the decorator");
        System.out.println(label1.getText());
        System.out.println("Text of the inner component");
        System.out.println(((Quotes)label1).label.getText());

        System.out.println("Rendered text");
        System.out.println(label1.render());
    }
}
