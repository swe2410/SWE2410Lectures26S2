/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week4.prep.label.ver2;

public class PlainLabel extends AbstractLabel {
    @Override
    public String getType() {
        return "Plain";
    }
    @Override
    public String render() {
        return getText();
    }
}
