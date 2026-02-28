package TCS_DSA_PYQ;
import java.util.*;

public class GCD_Nums {
    public static int gcd(int n1, int n2) {
        while(n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }

    public static void main(String [] words) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int ans = gcd(n1, n2);
        System.out.println(ans);
    }
}
