
//fibonacci series
import java.util.*;

class fibonacci {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number upto which fibonacci series:");
            int n = sc.nextInt();
            int c, a = 0, b = 1;
            System.out.println("Fibonacci series is:");
            System.out.println(a + "\n" + b);
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
        }
    }
}
