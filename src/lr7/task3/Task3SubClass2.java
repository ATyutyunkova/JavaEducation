package lr7.task3;

public class Task3SubClass2 extends Task3SubClass1 {
    public String stringValue;

    public Task3SubClass2(int integerValue, char charValue, String stringValue) {
        super(integerValue, charValue);
        this.stringValue = stringValue;
    }

    public void setValue(int integerValue, char charValue, String stringValue) {
        super.setValue(integerValue, charValue);
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return "sub 1" + "\n"
                + " Class name: " + this.getClass().getSimpleName() + "\n" +
                " integer value = " + integerValue + "\n" +
                " char value = " + charValue + "\n" +
                " string value = " + stringValue;
    }
}
