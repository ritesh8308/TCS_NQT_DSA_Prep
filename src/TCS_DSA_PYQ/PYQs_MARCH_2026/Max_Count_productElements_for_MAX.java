package TCS_DSA_PYQ.PYQs_MARCH_2026;
import java.util.*;

public class Max_Count_productElements_for_MAX {

public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    long lim = sc.nextLong();
    long maxP = 1;

    int count = 0;

    for(int i=0; i<n; i++) {
        if(arr[i] == 0) {
            count++;
            continue; // maxP will be always less than lim due to : arr[i] = 0;
        }
        if(maxP <= lim/arr[i]) {  // Using division (limit / arr[i]) is safer than multiplication
            maxP *= arr[i];
            count++;
        }   else {
            break;
        }
    }

    System.out.println(count);
    sc.close();
    }
}
