/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week4.prep.label.ver1;

public abstract class Formatting extends Label {
    public Label label;
    public Formatting(Label label){
        this.label = label;
    }
    @Override
    public String getType() {
        return label.getType();
    }
}
