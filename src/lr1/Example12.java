package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();

        int currentYear = LocalDate.now().getYear();
        int birthYear = currentYear - age;

        System.out.println("Ваш год рождения " + birthYear);
    }
}
