package LeetCode_DSA_problems;

import java.util.Scanner;

// LeetCode : Problem 38
public class RLE_Count_and_Say {
    public static String count_And_Say(int n) {
        if(n==1)    return "1";  // Base Case

        String prev = count_And_Say(n-1);
        StringBuilder sb = new StringBuilder();

        int i=0;
        while(i < prev.length()) {
            int count = 1;
            while(i+1 < prev.length() && prev.charAt(i) == prev.charAt(i+1)) {
                i++;
                count++;
            }
            sb.append(count).append(prev.charAt(i));
            i++;
        }

        return sb.toString();
    }


    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Run Length Encoding for "+n+"is: " + count_And_Say(n));
    }
}
