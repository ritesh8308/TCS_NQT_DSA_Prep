package TCS_DSA_PYQ.Mock_Tests.Day_03;
import java.util.*;

public class Increasing_Triplet {

    public boolean increasing_triple(int [] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n:arr) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }


    public static void main(String [] args) {
        Scanner  sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Increasing_Triplet it = new Increasing_Triplet();
        boolean ans = it.increasing_triple(arr);
        System.out.println(ans);
    }
}
