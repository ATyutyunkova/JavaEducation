package lr3;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int first = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int second = scanner.nextInt();

        int start = Math.min(first, second);
        int end = Math.max(first, second);

        System.out.println("Целые числа от " + start + " до " + end + ":");

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}
