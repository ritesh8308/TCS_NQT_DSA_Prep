/**
 * Question 1: Discount Calculator (Shift 1)
 * This question asks to calculate the final price after a discount based on the purchase amount.
 * Condition < ₹1000: 5% off
 * Condition ₹1000 - ₹5000: 10% off
 * Condition > ₹5000: 15% off
 * Error Handling: Negative amounts should print an error message.
 * Solution (0:43-4:25): The solution uses conditional statements (if-else) to apply the correct percentage based on the input amount.
 * */



package TCS_DSA_PYQ.PYQs_MARCH_2026;
import java.util.*;

public class Q1_2026_03_21 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        double d = 0;
        if(n < 0) {
            System.out.println("Invalid Amount");
        }   else {
            if(n <= 1000) {
                d = 0.05;
            }   else if(n <= 5000) {
                d = 0.1;
            }   else {
                d = 0.15;
            }
        }

        n = n - n*d;
        System.out.printf("%.2f", n);
        sc.close();
    }
}
