package lr7.task5;

public class Task5 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Cat");
        SubClass1 subClass1 = new SubClass1("Dog", 10);
        SubClass2 subClass2 = new SubClass2("Human", 'A');

        superClass.displayInfo();
        subClass1.displayInfo();
        subClass2.displayInfo();

        SuperClass subClass1AsSuper = new SubClass1("Monkey", 10);
        subClass1AsSuper.displayInfo();
    }
}

class SuperClass {
    protected String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public void displayInfo() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", string value: " + text);
    }
}

class SubClass1 extends SuperClass {
    protected int intValue;

    public SubClass1(String text, int intValue) {
        super(text);
        this.intValue = intValue;
    }

    @Override
    public void displayInfo() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", string value: " + text + ", integer value: " + intValue);
    }
}

class SubClass2 extends SuperClass {
    protected char charValue;

    public SubClass2(String text, char charValue) {
        super(text);
        this.charValue = charValue;
    }

    @Override
    public void displayInfo() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", string value: " + text + ", char value: " + charValue);
    }
}