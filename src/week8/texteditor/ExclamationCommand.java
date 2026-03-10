package week8.texteditor;

public class ExclamationCommand implements Command {
    private TextDocument doc;
    private String prevText;

    public ExclamationCommand(TextDocument doc){
        this.doc = doc;
    }
    @Override
    public void execute() {
        prevText = doc.getText();
        doc.exclaim();
    }

    @Override
    public void undo() {
        doc.setText(prevText);
    }
}
