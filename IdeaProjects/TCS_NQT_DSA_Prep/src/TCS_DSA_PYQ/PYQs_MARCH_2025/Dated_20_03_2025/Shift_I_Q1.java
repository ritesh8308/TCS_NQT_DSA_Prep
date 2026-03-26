/**
 * Q. Given an integer N,
 * your task is to find the sum of the first N prime numbers.
 *
 * A prime number is a natural number greater than 1 that has
 * no positive divisors other than 1 and itself.
 *
 * Your program should efficiently calculate the sum of the first N prime numbers and
 * print the result.
 *
 * ExampleIf $N = 4$:
 * The first 4 prime numbers are: 2, 3, 5, 7.
 * The sum is: $2 + 3 + 5 + 7 = 17$.
 *
 * Output: 17
 * */



package TCS_DSA_PYQ.PYQs_MARCH_2025.Dated_20_03_2025;
import java.util.*;

public class Shift_I_Q1 {

    public static boolean isPrime(int n) {

        if(n==0 || n==1)    return false;
        for(int i=2; i*i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
       return true;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        int count = 0;
        int num = 2;

        int [] arr = new int[n];
        while(count < n) {
            if(isPrime(num)) {
                sum += num;
                arr[count] = num;
                count++;
            }
            num++;
        }

        System.out.println("Sum of first "+n+" Prime numbers is: " + sum);
        System.out.println();

        System.out.print("Prime numbers are: ");
        for(int a:arr) {
            System.out.print(a + " ");
        }

        sc.close();
    }
}
