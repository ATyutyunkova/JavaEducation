package lr4;

public class Task3 {
    public static void main(String[] args) {
        int height = 5;
        int width = 10;
        int[][] array = new int[height][width];

        // создаем двумерный массив из двоек
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = 2;
            }
        }

        // рисуем прямоугольник в консоли
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
