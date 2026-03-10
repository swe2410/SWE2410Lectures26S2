package week8.texteditor;

public class UppercaseCommand implements Command {
    private TextDocument doc;
    private String prevText;
    public UppercaseCommand(TextDocument doc) {
        this.doc = doc;
    }
    public void execute() {
        prevText = doc.getText();
        doc.toUpperCase();
    }
    public void undo() {
        doc.setText(prevText);
    }
}