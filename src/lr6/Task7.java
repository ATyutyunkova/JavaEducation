package lr6;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Task7Class.convertToIntArray(new char[]{'A', 'B', 'C'})));
    }
}

class Task7Class {
    static int[] arrayField;

    public static int[] convertToIntArray(char[] charArray) {
        arrayField = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            arrayField[i] = charArray[i];
        }
        return arrayField;
    }
}
