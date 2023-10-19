
//armstrong number for 3 digit number
import java.util.*;

class armstrong {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int var, remainder, result = 0;
            System.out.println("enter the number:");
            int num = s.nextInt();
            var = num;
            while (var != 0) {
                remainder = var % 10;
                result += remainder * remainder * remainder;
                var = var / 10;
            }
            if (result == num) {
                System.out.println("armstrong number");
            } else {
                System.out.println("not an armstrong number");
            }
        }
    }
}
