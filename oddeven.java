
//checking if a number is odd or even
import java.util.*;

class oddeven {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int x = s.nextInt();
            if (x % 2 == 0) {
                System.out.println(x + " is even number");
            } else {
                System.out.println(x + " is odd number");
            }
        }
    }
}
