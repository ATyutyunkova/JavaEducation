package lr3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        while (size <= 0) {
            try {
                System.out.print("Введите размер массива: ");
                size = scanner.nextInt();

                if (size <= 0) {
                    System.out.println("Размер массива должен быть положительным числом");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: введено некорректное значение");
                scanner.next();
            }
        }

        int[] array = new int[size];
        int count = 0;

        for (int i = 2; count < size; i += 5) {
            array[count] = i;
            count++;
        }

        System.out.println("Созданный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
