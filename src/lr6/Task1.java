package lr6;

public class Task1 {
    public static void main(String[] args) {
        new Task1Class().setFieldValue('A');
        new Task1Class().setFieldValue("Kitty");
        new Task1Class().setFieldValue(new char[]{'Z'});
        new Task1Class().setFieldValue(new char[]{'C', 'a', 't'});
    }
}

class Task1Class {
    char charField;
    String stringField;

    public void setFieldValue(char value) {
        this.charField = value;
        System.out.println("Символьная запись: " + value);
    }

    public void setFieldValue(String value) {
        this.stringField = value;
        System.out.println("Строковая запись: " + value);
    }

    public void setFieldValue(char[] value) {
        if (value.length == 1) {
            this.charField = value[0];
            System.out.println("Символьная запись из массива чаров: " + value[0]);
        } else {
            this.stringField = String.valueOf(value);
            System.out.println("Строковая запись из массива чаров: " + String.valueOf(value));
        }
    }
}