package TCS_DSA_PYQ;
import java.util.*;

public class Circular_Kriya_Max_Sum {


    // Linear DP: max sum of non-adjececnt elements in arr[]
    static long maxLinear(int [] arr, int start, int end) {
        long prev1=0, prev2=0;
        for(int i=start; i<=end; i++) {
            long curr = Math.max(prev1, prev2 + arr[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }


    // Circular DP: two passes to handle circular wrap around
    static long maxCircular(int n) {
        int [] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = i+1;

        if(n == 1) return arr[0];


        long pass1 = maxLinear(arr, 1, n-1);
        long pass2 = maxLinear(arr, 0, n-2);
        return Math.max(pass1, pass2);
    }


    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in kriya: ");
        int n = sc.nextInt();
        System.out.println("Enter number of kriya cycles: ");
        int m = sc.nextInt();
        long sumOnePattern = maxCircular(n);
        System.out.println("Sum for one pattern: " + sumOnePattern);
        System.out.println("Final answer: " + sumOnePattern * m);
    }
}
