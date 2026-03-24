/**
 * Question 4: Balloon Capacity Problem (Shift 2)
 * Determine the maximum number of people that can fit in a balloon based on weight capacity using a greedy approach.
 *
 * Input: Balloon capacity ($Y$), and an array of individual weights.
 * Solution (19:59-25:40): The solution sorts the weights in ascending order and adds people one by one until the capacity is reached. This greedy approach ensures maximum people can fly.
 * */


package TCS_DSA_PYQ.PYQs_MARCH_2026;
import java.util.*;

public class Q4_2026_03_21 {


    public static int maxPeople(int [] weights, int lim) {
        int maxW = 0;
        int count = 0;
        Arrays.sort(weights);
        for(int a:weights) {
            if(maxW + a <= lim) {
                maxW += a;
                count++;
            }   else{
                break;
            }
        }
        return count;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int lim = sc.nextInt();
        sc.nextLine();

        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "").trim();
        String [] tokens = input.split("\\s*,\\s*");

        int [] weights = new int[tokens.length];
        for(int i=0; i<tokens.length; i++) {
            weights[i] = Integer.parseInt(tokens[i]);
        }



        int ans = maxPeople(weights, lim);
        System.out.println(ans);
        sc.close();
    }
}
