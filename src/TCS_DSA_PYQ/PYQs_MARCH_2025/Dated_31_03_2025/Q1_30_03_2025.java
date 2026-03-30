/**
 * Problem Statement:
 *  You are given two integers, $n1$ and $n2$.
 *  Your task is to find the $n1^{th}$ and $n2^{th}$ prime numbers,
 *  compute their product, and then subtract 1 from the result.
 *
 *  Input: 4 5
 *  Output: 76
 *
 *  Explanation:
 *  * The 4th prime number is 7.
 *  The 5th prime number is 11.
 *  Product: $7 \times 11 = 77
 *  $Result: $77 - 1 = 76$
 * */


package TCS_DSA_PYQ.PYQs_MARCH_2025.Dated_31_03_2025;
import java.util.*;

public class Q1_30_03_2025 {

    public static boolean isPrime(int n) {
        if(n<=1)    return false;
        if(n<=3)    return true;
        if(n%2 == 0 || n%3 == 0)    return false;
        for(int i=5; i*i<=n; i+=6) {
            if(n%i == 0 || n%(i+2) == 0) {

                return false;
            }
        }

        return true;
    }

    // Calculating nth Prime for input position:
    public static int nthPrime(int n) {
        int num = 2, nth_Prime = 2;
        int count = 0;
        while(count < n) {
            if(isPrime(num)) {
                count++;
                nth_Prime = num;
            }
            num++;
        }

        return nth_Prime;
    }


    // I/O:
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>0 && y>0) {
            int x_Prime = nthPrime(x);
            int y_Prime = nthPrime(y);

            System.out.println((x_Prime * y_Prime) - 1);

        }   else{
            System.out.println("Invalid Index !");
        }

        sc.close();
    }
}
