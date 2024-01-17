package lr7.task3;

public class Task3SubClass1 extends Task3SuperClass {
    public char charValue;

    public Task3SubClass1(int integerValue, char charValue) {
        super(integerValue);
        this.charValue = charValue;
    }

    public void setValue(int integerValue, char charValue) {
        super.setValue(integerValue);
        this.charValue = charValue;
    }

    @Override
    public String toString() {
        return "sub 1" + "\n"
                + " Class name: " + this.getClass().getSimpleName() + "\n" +
                " integer value = " + integerValue + "\n" +
                " char value = " + charValue;
    }
}
