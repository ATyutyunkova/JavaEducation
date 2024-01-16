package lr4;

public class Task4 {
    public static void main(String[] args) {
        int height = 10;
        int[][] array = new int[height][];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++) {
                array[i] = new int[i + 1];
                array[i][j] = 0;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
