package lr7.task2;

public class Task2SubClass extends Task2SuperClass {
    public int integerField;

    public Task2SubClass(int integerValue, String text) {
        super(text);
        this.integerField = integerValue;
    }

    @Override
    public void setText() {
        super.setText();
        this.integerField = 0;
    }

    public void setText(String text) {
        super.setText(text);
    }

    public void setIntegerField(int value) {
        this.integerField = value;
    }

    public void setValues(String text, int value) {
        super.setText(text);
        this.integerField = value;
    }
}
