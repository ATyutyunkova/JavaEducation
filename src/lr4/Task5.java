package lr4;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;
        int[][] originalArray = new int[rows][cols];

        Random random = new Random();
        for (int i = 0; i < rows; i++) { // заполняем случайными числами
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Изначальный массив:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(originalArray[i]));
        }

        int[][] rotatedArray = new int[cols][rows];
        for (int i = 0; i < rows; i++) { // меняем местами
            for (int j = 0; j < cols; j++) {
                rotatedArray[j][i] = originalArray[i][j];
            }
        }

        System.out.println("Повернутый массив:");
        for (int i = 0; i < cols; i++) {
            System.out.println(Arrays.toString(rotatedArray[i]));
        }
    }
}
