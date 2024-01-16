package lr3;

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        int counter = 0;
        while (counter < array.length) {
            array[counter] = random.nextInt(10);
            counter++;
        }

        System.out.println("Массив случайных чисел: " + Arrays.toString(array));

        int minValue = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.println("Индексы элементов с минимальным значением: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                System.out.println("Индекс: " + i + ", Значение: " + array[i]);
            }
        }
    }
}
