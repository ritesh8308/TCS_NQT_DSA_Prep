/**
 * Question 3: Find the Single ElementProblem
 * Statement:You are given an array where every element appears twice except for one single element that appears only once.
 * You need to find and print that single element.
 *
 * Example:
 *
 * Input: $N = 5$, $Arr = [1, 1, 2, 2, 3]
 *$Output: 3
 *
 * **/

/**
 * * You can go with following Approaches:
 *  * 1) XOR operation amongst arr elements
 *  * 2) Nested for loop
 *  * 3) HashMap
 * */

// Optimal With XOR approach


package TCS_DSA_PYQ.PYQs_MARCH_2025;
import java.util.*;

public class Q3_15_03_2025 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int single = 0;
        //int [] arr = new int[n]; ---> No need to store | we can directly use input

        if(n >= 3) {
            for (int i = 0; i < n; i++) {
                single ^= sc.nextInt();
            }
        }

        System.out.println(single);
        sc.close();
    }
}
