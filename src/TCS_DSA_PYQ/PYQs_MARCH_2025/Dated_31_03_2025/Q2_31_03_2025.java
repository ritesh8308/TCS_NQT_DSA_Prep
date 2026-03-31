/**
 * Problem Statement:
 * Write a program that reads a string input from the user
 * and removes all consecutive duplicate characters
 * while maintaining the original order of distinct characters.
 *
 * Input: 223334566777
 * Output: 234567
 *
 * Example: 22223344422 ----> 2342
 * (Note: Only consecutive duplicates are removed;
 * if the character appears again later after a different character, it remains).
 * */


package TCS_DSA_PYQ.PYQs_MARCH_2025.Dated_31_03_2025;
import java.util.*;

public class Q2_31_03_2025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char [] tokens = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(tokens[0]);
        for(int i=1; i<tokens.length; i++) {

            if(tokens[i] != tokens[i-1]) {
                sb.append(tokens[i]);
            }
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
