package LeetCode_DSA_problems;
import java.util.*;

public class Largest_Odd_Number_in_String {

    public static String l_Odd(String s) {
        for(int i=s.length()-1; i>=0; i--) {
            if((s.charAt(i)-'0') % 2 == 1) {
                return s.substring(0, i+1);
            }
        }

        return "";
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ans = l_Odd(s);
        System.out.println(ans);
    }
}
