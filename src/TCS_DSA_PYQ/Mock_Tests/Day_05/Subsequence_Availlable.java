package TCS_DSA_PYQ.Mock_Tests.Day_05;
import java.util.*;

public class Subsequence_Availlable {

        public static boolean subSequence(String s, String t) {
            int sptr=0, tptr=0;

            while(sptr<s.length() && tptr<t.length()) {
                if(s.charAt(sptr) == t.charAt(tptr)) {
                    sptr++;
                }

                tptr++;
            }

            return sptr==s.length();
        }

        public static void main(String[] args) {
            // write your code here
            Scanner sc = new Scanner(System.in);

            String s = sc.nextLine();
            String t = sc.nextLine();

            boolean ans = subSequence(s, t);
            System.out.println(ans);
        }
    }

