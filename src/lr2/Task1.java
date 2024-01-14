package lr2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number % 3 == 0) {
            System.out.println(number + " делится на 3");
        } else {
            System.out.println(number + " не делится на 3");
        }
    }
}
