package lr5;

public class Task2 {
    public static void main(String[] args) {
        new CharsClass('A', 'Z').print();
    }
}

class CharsClass {
    private char first;
    private char second;

    public CharsClass(char first, char second){

        this.first = first;
        this.second = second;
    }

    public void print() {
        int startCode = first;
        int endCode = second;

        if (startCode <= endCode) {
            for (int i = startCode; i <= second; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = endCode; i <= startCode; i++) {
                System.out.print((char) i + " ");
            }
        }

        System.out.println();
    }
}