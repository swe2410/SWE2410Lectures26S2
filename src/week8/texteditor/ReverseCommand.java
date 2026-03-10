package week8.texteditor;

public class ReverseCommand implements Command {

    private TextDocument doc;
    private String prevText;

    public ReverseCommand(TextDocument doc) {
        this.doc = doc;
    }

    public void execute() {
        prevText = doc.getText();
        doc.reverse();
    }

    public void undo() {
        doc.setText(prevText);
    }
}