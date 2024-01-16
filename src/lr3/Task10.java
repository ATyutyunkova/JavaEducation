package lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Random random = new Random();

        int counter = 0;
        while (counter < array.length) {
            array[counter] = random.nextInt(10);
            counter++;
        }

        System.out.println("Изначальный массив случайных чисел: " + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Отсортированный массив в порядке убывания: " + Arrays.toString(array));
    }
}
