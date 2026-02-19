/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week5.prep.label.ver2;

public abstract class Formatting implements Label {
    protected Label label;
    public Formatting(Label label){
        this.label = label;
    }
    @Override
    public String getType() {
        return label.getType();
    }
    @Override
    public void setText(String text) {
        label.setText(text);
    }
    @Override
    public String getText() {
        return label.getText();
    }
}
