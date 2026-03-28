/**
 * Question 2: String Character Analysis
 * Write a program that processes a given string to determine:
 * The first non-repeating character (if present).
 * The most repeated character in the string.
 *
 * Special Conditions:
 * If multiple characters have the same highest frequency,
 * print the first non-repeating character first, then the repeating character.
 *
 * If the input string is empty, print "Invalid Input".
 *
 * If all characters in the string are repeating, print "None" followed by the first repeating character.
 *
 * Sample Input/Output (Based on Logic)
 * Input: aabbc
 *
 * Analysis: a: 2, b: 2, c: 1.
 * First Non-Repeating: c
 * Most Repeated: a (appears first among those with frequency 2).
 *
 * Output: c a
 *
 * Input: aabb
 * Analysis: All characters repeat.

 * Output: None a
 * */

package TCS_DSA_PYQ.PYQs_MARCH_2025.Dated_25_03_2025;
import java.util.*;

public class Q2_25_03_2025 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextLine()) {
            System.out.println("Invalid Input");
            return;
        }

        String s = sc.nextLine();
        if(s.isEmpty()) {
            System.out.println("Invalid Input");
            return;
        }

        Map<Character, Integer> count = new LinkedHashMap<>();
        for(char ch:s.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }


        // Find firstNonRepeating char:
        String firstNonRepeating = "None";
        for(char ch:s.toCharArray()) {
            if(count.get(ch) == 1) {
                firstNonRepeating = String.valueOf(ch);
                break;
            }
        }


        // Find most repeated:
        char mostRepeated = s.charAt(0);
        int maxFreq = 0;
        for(Map.Entry<Character, Integer> entry:count.entrySet()) {
            if(entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();;
                mostRepeated = entry.getKey();
            }
        }

        System.out.println(firstNonRepeating + " " + mostRepeated);

        sc.close();
    }
 }

