package TCS_DSA_PYQ.Mock_Tests.Day_09;
import java.util.*;

public class Calculate_MAX_Altitude_Biker_Acheived {


    public int max_Altitude(int [] gain) {
        int current_Alt = 0;
        int max_Alt = 0;

        for(int a:gain) {
            current_Alt += a;
            max_Alt = Math.max(max_Alt, current_Alt);
        }

        return max_Alt;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] gain = new int[n];
        for(int i=0; i<n; i++) {
            gain[i] = sc.nextInt();
        }

        Calculate_MAX_Altitude_Biker_Acheived ma = new Calculate_MAX_Altitude_Biker_Acheived();
        int ans = ma.max_Altitude(gain);
        System.out.println(ans);
        sc.close();
    }
}
