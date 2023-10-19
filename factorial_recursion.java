
//factorial using recursion
import java.util.*;

class factorial_recursion {
    int fact(int n) {
        int result;
        if (n == 0) {
            return 1;
        }
        result = n * fact(n - 1);
        return result;
    }

    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number to find factorial:");
            int num = s.nextInt();
            if (num < 0) {
                System.out.println("Cannot find factorial");
            } else {
                factorial_recursion f = new factorial_recursion();
                int z = f.fact(num);
                System.out.println("Factorial is: " + z);
            }
        }
    }
}
