package timus.task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        byte f = in.nextByte();
        in.close();

        int tasks = 12 - f;

        String result;
        if (tasks > 5) {
            result = "NO";
        } else {
            result = "YES";
        }

        System.out.print(result);
        out.flush();
    }
}
