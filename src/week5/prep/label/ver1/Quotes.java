/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week5.prep.label.ver1;

public class Quotes extends Formatting{
    public Quotes(Label label) {
        super(label);
    }
    @Override
    public String render() {
        return "\"" + label.render() + "\"";
    }
}
