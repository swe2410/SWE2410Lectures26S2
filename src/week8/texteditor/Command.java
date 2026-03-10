package week8.texteditor;

public interface Command {
    void execute();
    void undo();
}