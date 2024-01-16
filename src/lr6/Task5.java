package lr6;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(Task5Class.calc(2));
    }
}

class Task5Class {
    public static int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (int) Math.pow(i, 2);
        }
        return sum;
    }
}
