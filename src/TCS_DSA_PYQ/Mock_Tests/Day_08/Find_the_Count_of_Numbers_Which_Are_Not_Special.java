package TCS_DSA_PYQ.Mock_Tests.Day_08;
import java.util.*;

public class Find_the_Count_of_Numbers_Which_Are_Not_Special {


    public static int countNonSpecial(int l, int r) {
        int lim = (int) Math.sqrt(r);

        boolean [] isPrime = new boolean[lim+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // Sieve of Eratosthenes for identifying primes:
        for(int i=2; i*i<=lim; i++) {
            for(int j=i*i; j<=lim; j+=i) {
                isPrime[j] = false;
            }
        }

        int totalCount = (r-l)+1;
        int countSpecial = 0;
        for(int i=2; i<=lim; i++) {
            if(isPrime[i]) {
                int square = i*i;
                if(square >= l  &&  square <= r) {
                    countSpecial++;
                }
            }
        }
        return (totalCount - countSpecial);
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        int ans = countNonSpecial(l, r);
        System.out.println(ans);
        sc.close();
    }
}
