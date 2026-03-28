/**
 *
 * Question 3: Valid Concatenated Pairs Count:
 *
 * You are given an array of integers and a range $[X, Y]$.
 * You need to form all possible pairs $(NUM[i], NUM[j])$ from the array, concatenate them as strings,
 * and then check if the resulting number falls within the inclusive range $[X, Y]$.
 *
 * Important Rules:
 * Pairs can be the same index: A number can be paired with itself (e.g., $(5, 5) ---> 55$).
 * Order matters: $(5, 15)$ is $515$, while $(15, 5)$ is $155$.
 * Range Check: $X <= \text{ConcatenatedValue} <= Y$.
 *
 * Sample Case (from your screen)
 * Inputs:
 * $N = 4$
 * $NUM = [5, 15, 1, 9]$
 * $X = 10, Y = 99
 *
 * $Calculations:
 * $(5, 5) \rightarrow 55$ (Valid: $10 \le 55 \le 99$)
 * $(5, 15) \rightarrow 515$ (Invalid: $> 99$)
 * $(5, 1) \rightarrow 51$ (Valid: $10 \le 51 \le 99$)
 * $(5, 9) \rightarrow 59$ (Valid: $10 \le 59 \le 99$)
 *
 * ...and so on for all combinations.
 * */


package TCS_DSA_PYQ.PYQs_MARCH_2025.Dated_25_03_2025;
import java.util.*;

public class Q3_25_03_2025 {


    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        int count = 0;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                String t = String.valueOf(arr[i]) + arr[j];
                int sum = Integer.parseInt(t);
                if(x <= sum && sum <= y) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
