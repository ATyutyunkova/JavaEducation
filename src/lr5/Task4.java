package lr5;

public class Task4 {
    public static void main(String[] args) {}
}

class CharIntClass {
    private int intField;
    private char charField;

    CharIntClass(int intField, char charField) {
        this.intField = intField;
        this.charField = charField;
    }

    CharIntClass(double value) {
        this.charField = (char) value;
        this.intField = (int) (value - (int) value * 100);
    }
}