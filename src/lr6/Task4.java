package lr6;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(Task4Class.calcDoubleFactorial(6));
    }
}
 class Task4Class{
     public static int calcDoubleFactorial(int n) {
         if (n <= 0) {
             return 1;
         } else {
             int result = n;
             while ((n -= 2) > 0) {
                 result *= n;
             }
             return result;
         }
     }
 }