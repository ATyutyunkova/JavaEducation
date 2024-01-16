package lr3;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Ввведите количество чисел Фибоначчи: ");
        int count = id.nextInt();
        int first = 0;
        int second = 1;
        int next = 1;
        for (int i = count; i > 0; --i) {
            System.out.printf(next + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
