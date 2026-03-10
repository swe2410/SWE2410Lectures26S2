package week8.texteditor;

public class SwapCommand implements Command {

    private TextDocument doc;
    private String backup;

    public SwapCommand(TextDocument doc) {
        this.doc = doc;
    }

    public void execute() {
        backup = doc.getText();
        doc.swapFirstLast();
    }

    public void undo() {
        doc.setText(backup);
    }
}