package lr5;

public class Task1 {
    public static void main(String[] args) {
        var charClassInstance =  new CharClass();
        charClassInstance.setCharField('a');
        charClassInstance.consolePrintCharAndCode();
    }
}

class CharClass {
    private char charField;

    public void setCharField(char charField) {
        this.charField = charField;
    }

    public int getCharCode() {
        return charField;
    }

    public void consolePrintCharAndCode() {
        System.out.println("Символ: " + charField);
        System.out.println("Код: " + getCharCode());
    }
}