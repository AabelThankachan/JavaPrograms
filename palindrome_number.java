
//palindrome number
import java.util.*;

class palindrome_number {
    static int reversed_no(int n) {
        int reverse_n = 0;
        while (n > 0) {
            reverse_n = reverse_n * 10 + n % 10;
            n = n / 10;
        }
        return reverse_n;
    }

    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter number:");
            int num = s.nextInt();
            int reverse = reversed_no(num);
            if (reverse == num) {
                System.out.println("Palindrome number");
            } else {
                System.out.println("Not Palindrome number");
            }
        }
    }
}
