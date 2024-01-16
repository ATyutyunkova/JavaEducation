package lr3;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Ввведите количество чисел Фибоначчи: ");
        int count = id.nextInt();
        int first = 0;
        int second = 1;
        int next = 1;
        while(count > 0) {
            System.out.print(next + " ");
            next = first + second;
            first = second;
            second = next;
            count--;
        }
    }
}
