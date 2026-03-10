package week8.texteditor;

public class TextDocument {
    private String text;
    public TextDocument(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void toUpperCase() {
        text = text.toUpperCase();
    }

    public void exclaim() {
        text = "!!!" + text + "!!!";
    }
    public void reverse() {
        text = new StringBuilder(text).reverse().toString();
    }

    public void swapFirstLast() {
        String[] words = text.split(" ");
        if (words.length > 1) {
            String temp = words[0];
            words[0] = words[words.length - 1];
            words[words.length - 1] = temp;
        }
        text = String.join(" ", words);
    }
}