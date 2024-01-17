package lr7.task2;

public class Task2 {
    public static void main(String[] args) {
        Task2SuperClass v1 = new Task2SuperClass("Cat");
        System.out.println("Task2SuperClass text length: " + v1.getLength());

        v1.setText();
        System.out.println("Task2SuperClass text length: " + v1.getLength());

        v1.setText("Cats");
        System.out.println("Task2SuperClass text length: " + v1.getLength());

        Task2SubClass v2 = new Task2SubClass(123, "Dog");
        System.out.println("Task2SubClass text length: " + v2.getLength());
        System.out.println("Task2SubClass integerField: " + v2.integerField);

        v2.setText("Dogs");
        System.out.println("Task2SubClass text length: " + v2.getLength());

        v2.setText();
        System.out.println("Task2SubClass text length: " + v2.getLength());
        System.out.println("Task2SubClass integerField: " + v2.integerField);

        v2.setIntegerField(333);
        System.out.println("Task2SubClass integerField: " + v2.integerField);

        v2.setValues("Ok", 22);
        System.out.println("Task2SubClass text length: " + v2.getLength());
        System.out.println("Task2SubClass integerField: " + v2.integerField);
    }
}

