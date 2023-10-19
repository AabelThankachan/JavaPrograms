import java.util.*;

class sum {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter number up to which sum needed:");
            int n = s.nextInt();
            System.out.println("The numbers are:");
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers is " + sum);
        }
    }
}
