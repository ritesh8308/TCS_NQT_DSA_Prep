package LeetCode_DSA_problems;
import java.util.*;

// LeetCode : problem no. 14

public class Longest_Prefix_String {

    public static String longest_Prefix(String [] strs) {
        String prefix = strs[0];
        int prefixLength = prefix.length();
        if(strs == null || strs.length == 0)    return "No Prefix Present!";

        for(int i=0; i< strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefixLength--;
                prefix = prefix.substring(0, prefixLength);

                if(prefixLength == 0)   return "No Prefix Present";
            }
        }
        return prefix;
    }

    /***
     *
     * // class Solution {
     * //     public String longestCommonPrefix(String[] strs) {
     * //         if(strs == null || strs.length == 0)    return "";
     *
     * //         String prefix = strs[0];
     * //         int prefLength = prefix.length();
     *
     * //         for(int i=1; i<strs.length; i++) {
     * //             String s = strs[i];
     * //             while(prefLength > s.length() || !prefix.equals(s.substring(0,prefLength))) {
     * //                 prefLength--;
     * //                 if(prefLength == 0) {
     * //                     return "";
     * //                 }
     * //                 prefix = prefix.substring(0,prefLength);
     * //             }
     * //         }
     *
     * //         return prefix;
     * //     }
     * // }
     * */
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0) System.out.println("No Prefix Present");
        sc.nextLine();
        String [] strs = new String[n];
        String input = sc.nextLine();
        input = input.replace("[\"","").replace("\"]", "").trim();
        strs = input.split("\\s*\",\\s*\"\\s*");

        System.out.println("Longest Prefix Present: " + longest_Prefix(strs));
        sc.close();
    }
}
