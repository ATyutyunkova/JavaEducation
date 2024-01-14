package timus.task_1264;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N, M;
        N = in.nextInt();
        M = in.nextInt();
        in.close();
        int time = N * (M + 1);
        System.out.print(time);
        out.flush();
    }
}
