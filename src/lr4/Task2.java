package lr4;

public class Task2 {
    public static void main(String[] args) {
        int height = 10;
        int width = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j <= width; j++) {
                System.out.print("+");
            }
            width++;
            System.out.println();
        }
    }
}
