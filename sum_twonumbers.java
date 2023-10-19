
//finding sum of two numbers
import java.util.*;

class sum_twonumbers {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            int x = s.nextInt();
            System.out.println("Enter second number:");
            int y = s.nextInt();
            int z = x + y;
            System.out.println("Sum of numbers is " + z);
        }
    }
}