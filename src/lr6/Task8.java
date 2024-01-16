package lr6;

public class Task8 {
    public static void main(String[] args) {
        double average = Task8Class.calcAverage(new int[]{1, 2, 3, 4, 5});
        System.out.println(average);
    }
}

class Task8Class {
    public static double calcAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
