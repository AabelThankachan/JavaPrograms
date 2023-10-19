
//palindrome string
import java.util.*;

class palindrome_string {
    static String reverse_string(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the string");
            String str = s.nextLine();
            str = str.toLowerCase();
            String str_rev = reverse_string(str);
            str_rev = str_rev.toLowerCase();
            if (str.equals(str_rev)) {
                System.out.println("Palindrome string");
            } else {
                System.out.println("Not palindrome string");
            }
        }
    }
}
