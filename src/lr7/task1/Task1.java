package lr7.task1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(new Task1SuperClass("HELLO"));
        System.out.println(new Task1SubClass("HELLO"));
        System.out.println(new Task1SubClass("HELLO", "WORLD"));
    }
}
