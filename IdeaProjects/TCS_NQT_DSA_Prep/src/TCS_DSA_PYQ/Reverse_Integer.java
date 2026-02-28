package TCS_DSA_PYQ;
import java.util.*;

public class Reverse_Integer {

    public static int reverseInteger(int n) {
        boolean isNegative = n<0;
        n = Math.abs(n);
        int reversed = 0;
        while(n != 0) {
            int digit = n%10;
            reversed = reversed*10 + digit;
            n /= 10;
        }
        return isNegative ? -reversed : reversed;
    }
    
        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a integer: ");
            int n = sc.nextInt();
            System.out.println(reverseInteger(n));
        }
}
