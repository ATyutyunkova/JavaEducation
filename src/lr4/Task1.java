package lr4;

public class Task1 {
    public static void main(String[] args) {
        int height = 11;
        int width = 23;

        for (int i = 1; i <= height; i++) {
            for (var j = 0; j < width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
