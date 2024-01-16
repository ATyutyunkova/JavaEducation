package lr5;

public class Task5 {
    public static void main(String[] args) {}
}

class Task5Class {
    private int field;

    public Task5Class(int value) {
        setField(value);
    }

    public void setField(int value) {
        if (value <= 100) {
            this.field = value;
        } else {
            this.field = 100;
        }
    }

    public void setFieldValue() {
        this.field = 0;
    }

    public int getField() {
        return this.field;
    }
}