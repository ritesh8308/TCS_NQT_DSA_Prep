package LeetCode_DSA_problems;
// LeetCode: problem 1358
import java.util.Scanner;

public class Number_of_Substrings {

    public int numberOfSubstrings(String s) {
        int len = s.length();

        // Tracking last position of a,b,c
        int [] lastPos = {-1, -1, -1};
        int total = 0;

        for(int pos=0; pos<len; pos++) {
            // update last position of current character
            lastPos[s.charAt(pos) - 'a'] = pos;

            // Add count of valid substrings ending at current position
            // If any character is missing, min will be -1
            // Else min gives leftmost required character position
            total += (1+Math.min(lastPos[0],Math.min(lastPos[1], lastPos[2])));
        }

        return total;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Number_of_Substrings ns = new Number_of_Substrings();
        System.out.println("Number of possible substrings are: " + ns.numberOfSubstrings(s));
    }
}
