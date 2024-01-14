package lr2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int fourthDigitFromRight = (number / 1000) % 10;
        System.out.println("Количество тысяч в числе: " + fourthDigitFromRight);
    }
}
