package lr6;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(Task3Class.findMax(2,1,3));
        System.out.println(Task3Class.findMin(2,1,3));
        System.out.println(Task3Class.findAverage(1,2,3,4));
    }
}

class Task3Class {
    public static int findMax(int... numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            max = Math.max(max, number);
        }
        return max;
    }

    public static int findMin(int... numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            min = Math.min(min, number);
        }
        return min;
    }

    public static double findAverage(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}
