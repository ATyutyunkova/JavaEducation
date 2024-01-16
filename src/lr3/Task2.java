package lr3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String dayName = scanner.nextLine().toLowerCase();

        switch (dayName) {
            case "понедельник":
                System.out.println("Порядковый номер дня: 1");
                break;
            case "вторник":
                System.out.println("Порядковый номер дня: 2");
                break;
            case "среда":
                System.out.println("Порядковый номер дня: 3");
                break;
            case "четверг":
                System.out.println("Порядковый номер дня: 4");
                break;
            case "пятница":
                System.out.println("Порядковый номер дня: 5");
                break;
            case "суббота":
                System.out.println("Порядковый номер дня: 6");
                break;
            case "воскресенье":
                System.out.println("Порядковый номер дня: 7");
                break;
            default:
                System.out.println("Такого дня нет");
        }
    }
}
