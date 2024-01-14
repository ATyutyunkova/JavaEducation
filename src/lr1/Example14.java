package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int inputNumber = scanner.nextInt();

        int number1 = inputNumber - 1;
        int number2 = inputNumber;
        int number3 = inputNumber + 1;
        int number4 = (number1 + number2 + number3) * (number1 + number2 + number3);

        System.out.println("Последовательность: " + number1 + ", " + number2 + ", " + number3 + ", " + number4);
    }
}
