/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week4.prep.label.ver1;

public abstract class Label {
    private String text;
    public String getText() {
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
    public abstract String getType();
    public abstract String render();
}
