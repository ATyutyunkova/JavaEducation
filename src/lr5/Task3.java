package lr5;
public class Task3 {
    public static void main(String[] args) {
        new IntClass();
        new IntClass(1);
        new IntClass(1, 2);
    }
}

class IntClass {
    private int first;
    private int second;

    public IntClass() {
        this.first = 0;
        this.second = 0;
    }

    public IntClass(int first) {
        this.first = first;
        this.second = 0;
    }

    public IntClass(int first, int second) {
        this.first = first;
        this.second = second;
    }
}