package lr6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] subArray = Task6Class.getSubArray(new int[]{1, 2, 3, 4, 5}, 4);
        System.out.println(Arrays.toString(subArray));
    }
}

class Task6Class {
    private static int[] arrayField;

    public static int[] getSubArray(int[] array, int n) {
        if (n >= array.length || n < 0) {
            arrayField = Arrays.copyOf(array, array.length);
        } else {
            arrayField = Arrays.copyOfRange(array, 0, n);
        }
        return arrayField;
    }
}
