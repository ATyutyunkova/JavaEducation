package lr9.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task6 {
    public static void main(String[] args) {
        HashMap<Integer, String> alphabet = new HashMap<>();

        alphabet.put(0, "1");
        alphabet.put(1, "223");
        alphabet.put(2, "rtr");
        alphabet.put(3, "lol");
        alphabet.put(4, "hello");
        alphabet.put(5, "key");
        alphabet.put(6, "mom");
        alphabet.put(7, "help");
        alphabet.put(8, "hey");
        alphabet.put(9, "dad");
        alphabet.put(10, "qwerty");

        Set<Integer> keys = alphabet.keySet();
        ArrayList<String> values = new ArrayList<>(alphabet.values());

        for (Integer key: keys) {
            if (key > 5) {
                System.out.println(alphabet.get(key));
            }
            else if (key == 0) {
                String result = String.join(", ", values);
                System.out.println(result);
            }
        }
        int dig = 1;

        for (Map.Entry <Integer, String> entry: alphabet.entrySet()) {
            if (entry.getValue().length() > 5) {
                dig = dig * entry.getKey();
            }
        }
        System.out.println(dig);



    }
}
