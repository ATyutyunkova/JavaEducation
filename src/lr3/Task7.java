package lr3;

import java.util.Arrays;
import java.util.Collections;

public class Task7 {
    public static void main(String[] args) {
        int size = 10;
        Character[] charArray = new Character[size];

        char letter = 'a';

        for (int i = 0; i < size; i++) {
            charArray[i] = letter;
            letter += 2;
        }

        System.out.println("Массив в прямом порядке:");
        for (Character c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        Arrays.sort(charArray, Collections.reverseOrder());

        System.out.println("Массив в обратном порядке:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
