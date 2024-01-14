package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название текущего дня недели: ");
        String dayOfWeek = scanner.nextLine();

        System.out.println("Введите название месяца: ");
        String month = scanner.nextLine();

        System.out.println("Введите номер дня в месяце: ");
        int dayOfMonth = scanner.nextInt();

        System.out.println("День недели: " + dayOfWeek);
        System.out.println("Месяц: " + month);
        System.out.println("День в месяце: " + dayOfMonth);
    }
}
