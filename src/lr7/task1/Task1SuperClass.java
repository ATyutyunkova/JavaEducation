package lr7.task1;

public class Task1SuperClass {
    private String str1;

    public Task1SuperClass(String text) {
        this.str1 = text;
    }

    public String getStr1(){
        return str1;
    }

    @Override
    public String toString() {
        return "super" + "\n"
                + " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.str1;
    }
}
