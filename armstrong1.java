
//armstrong number 
import java.util.*;

class armstrong1 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter number:");
            int num = s.nextInt();
            int temp = num, digits = 0, remainder, result = 0;
            while (temp > 0) {
                temp = temp / 10;
                digits++;
            }
            temp = num;
            while (temp > 0) {
                remainder = temp % 10;
                result += (Math.pow(remainder, digits));
                temp = temp / 10;
            }
            if (result == num) {
                System.out.println("Armstrong number");
            } else {
                System.out.println("Not an Armstrong Number.");
            }
        }
    }
}
