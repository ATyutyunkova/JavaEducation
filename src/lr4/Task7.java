package lr4;

public class Task7 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] array = new int[rows][cols];
        int counter = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = counter++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = counter++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%-3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
