package lr3;

public class Task8 {
    public static void main(String[] args) {
        char[] charArray = new char[10];
        char currentChar = 'A';
        int counter = 0;

        while (counter < 10) {
            if (currentChar != 'A' && currentChar != 'E' && currentChar != 'I' && currentChar != 'O' && currentChar != 'U') {
                charArray[counter] = currentChar;
                counter++;
            }
            currentChar++;
        }

        System.out.println("Содержимое массива согласных букв:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
