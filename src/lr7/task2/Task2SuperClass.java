package lr7.task2;

public class Task2SuperClass {
    private String text;

    public Task2SuperClass(String text) {
        this.text = text;
    }

    public void setText() {
        this.text = "default";
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLength() {
        return this.text.length();
    }
}
