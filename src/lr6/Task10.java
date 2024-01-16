package lr6;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Task10Class.findMaxMin(6, 2, 0, -1, 11)));
    }
}

class Task10Class {
    public static int[] findMaxMin(int... numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            max = Math.max(max, number);
            min = Math.min(min, number);
        }

        return new int[]{max, min};
    }
}