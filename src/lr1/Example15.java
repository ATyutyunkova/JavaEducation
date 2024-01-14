package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;

        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разность чисел: " + difference);
    }
}
