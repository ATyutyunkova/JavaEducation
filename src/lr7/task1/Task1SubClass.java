package lr7.task1;

public class Task1SubClass extends Task1SuperClass {
    private String str2;

    public Task1SubClass(String text) {
        super(text);
    }

    public Task1SubClass(String text1, String text2) {
        super(text1);
        str2 = text2;
    }

    @Override
    public String toString() {
        return "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1() + "\n" +
                " str 2 = " + this.str2;
    }
}
