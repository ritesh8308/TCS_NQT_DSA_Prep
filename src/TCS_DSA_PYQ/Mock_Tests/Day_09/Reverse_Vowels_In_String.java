package TCS_DSA_PYQ.Mock_Tests.Day_09;
import java.util.*;

public class Reverse_Vowels_In_String {

    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'A') ||
                (ch == 'e' || ch == 'E') ||
                (ch == 'i' || ch == 'I') ||
                (ch == 'o' || ch == 'O') ||
                (ch == 'u' || ch == 'U');
    }


    public static String rVowels(String s) {
        char [] word = s.toCharArray();
        int i=0;
        int j = s.length() -1;

        while(i<j) {
            while(i<j && !isVowel(word[i]))     i++;
            while(i<j && !isVowel(word[j]))     j--;

            // Swapping:
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;

            i++;
            j--;
        }
        return new String(word);
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ans = rVowels(s);
        System.out.println(ans);

        sc.close();
    }
}
