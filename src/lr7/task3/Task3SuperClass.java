package lr7.task3;

public class Task3SuperClass {
    public int integerValue;

    public Task3SuperClass(int value) {
        this.integerValue = value;
    }

    public void setValue(int value) {
        this.integerValue = value;
    }

    @Override
    public String toString() {
        return "super" + "\n"
                + " Class name: " + this.getClass().getSimpleName() + "\n" +
                " integer value = " + integerValue;
    }
}
