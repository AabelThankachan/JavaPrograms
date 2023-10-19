
//frequency of a given character in string
import java.util.*;

class frequency_character {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter string:");
            String str = s.nextLine();
            System.out.println("Enter character:");
            char character = s.nextLine().charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (character == str.charAt(i)) {
                    count++;
                }
            }
            System.out.println("Frequency of given character is: " + count);
        }
    }
}