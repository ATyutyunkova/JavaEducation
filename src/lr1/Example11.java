package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите ваш год рождения: ");
        int birthYear = scanner.nextInt();

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;

        System.out.println("Привет, " + name + "! Вам " + age + " лет.");
    }
}
