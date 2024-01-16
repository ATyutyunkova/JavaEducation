package lr4;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;
        int[][] originalArray = new int[rows][cols];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Изначальный массив:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(originalArray[i]));
        }

        int randomRow = random.nextInt(rows);
        int randomCol = random.nextInt(cols);

        // создаем новый массив и удаляем случайную строку и столбец
        int[][] newArray = new int[rows - 1][cols - 1];
        for (int row = 0, newRow = 0; row < rows; row++) {
            if (row == randomRow) {
                continue;
            }
            for (int col = 0, newCol = 0; col < cols; col++) {
                if (col == randomCol) {
                    continue;
                }
                newArray[newRow][newCol] = originalArray[row][col];
                newCol++;
            }
            newRow++;
        }

        System.out.println("Массив после удаления строки " + randomRow + " и столбца " + randomCol + ":");
        for (int i = 0; i < rows - 1; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }
    }
}
