package lr6;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Исходный массив: " + Arrays.toString(charArray));
        Task9Class.swap(charArray);
        System.out.println("Итог: " + Arrays.toString(charArray));
    }
}

class Task9Class {
    public static void swap(char[] charArray) {
        int length = charArray.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }
    }
}
