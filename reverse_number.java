
//reverse of a number
import java.util.*;

class reverse_number {
    static int reversed_number(int n) {
        int reverse_n = 0;
        while (n > 0) {
            reverse_n = reverse_n * 10 + n % 10;
            n = n / 10;
        }
        return reverse_n;
    }

    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter number to reverse:");
            int num = s.nextInt();
            int reverse = reversed_number(num);
            System.out.println("Reverse of " + num + " is " + reverse);
        }
    }
}