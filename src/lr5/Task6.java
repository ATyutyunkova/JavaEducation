package lr5;

public class Task6 {
    public static void main(String[] args) {}
}

class Task6Class {
    private int min;
    private int max;

    public Task6Class(int first, int second) {
        setMinMax(first, second);
    }

    public void setMinMax(int first, int second) {
        this.min = Math.min(first, second);
        this.max = Math.max(first, second);
    }

    public void setMinMax(int value) {
        this.min = Math.min(this.min, value);
        this.max = Math.max(this.max, value);
    }

    public void consolePrintMinMax() {
        System.out.println("Min: " + this.min + ", Max: " + this.max);
    }
}