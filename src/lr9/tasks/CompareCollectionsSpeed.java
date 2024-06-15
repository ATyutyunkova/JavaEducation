package lr9.tasks;
import java.util.*;

public class CompareCollectionsSpeed {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        SortedSet <Integer> sortedSet = new TreeSet<>();
        System.out.println("Время выполнения операции получения элемента arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции получения элемента arrayDeque = " + getRunningTime(arrayDeque));

    }

    private static long getRunningTime(List<Integer> list){

        for (int i = 1; i < 5000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 2000000; i < 2100000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTime(Deque<Integer> deque){

        for (int i = 1; i < 5000000; i++) {
            deque.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            deque.getFirst();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTime(SortedSet<Integer> set){

        for (int i = 1; i < 5000000; i++) {
            set.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 5000000; i > 4990000; i--) {
            set.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}

