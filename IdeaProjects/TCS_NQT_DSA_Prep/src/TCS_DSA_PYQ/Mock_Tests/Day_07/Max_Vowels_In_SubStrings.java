package TCS_DSA_PYQ.Mock_Tests.Day_07;
import java.util.*;

public class Max_Vowels_In_SubStrings {

    public static int maxVowelCount(String s, int n) {
        int maxCount = 0;
        int currentCount = 0;
        String vowels = "aeiou";

        for(int i=0; i<n; i++) {
            if(vowels.indexOf(s.charAt(i)) != -1) {
                currentCount++;
            }
        }

        maxCount = currentCount;

        for(int i=n; i<s.length(); i++) {

            if(vowels.indexOf(s.charAt(i)) != -1) {
                currentCount++;
            }

            if(vowels.indexOf(s.charAt(i-n)) != -1) {
                currentCount--;
            }
        }

        maxCount = Math.max(maxCount, currentCount);

        if(maxCount == n)   return maxCount;

        return maxCount;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase().trim();
        int n = sc.nextInt();

        int ans = maxVowelCount(s, n);
        System.out.println(ans);
        sc.close();
    }
}
