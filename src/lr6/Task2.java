package lr6;

public class Task2 {
    public static void main(String[] args) {
        Task2Class.showAndAddValue();
        Task2Class.showAndAddValue();
        Task2Class.showAndAddValue();
        Task2Class.showAndAddValue();
    }
}

class Task2Class{
    private static int value = 0;

    public static void showAndAddValue() {
        System.out.println(value);
        value++;
    }
}
