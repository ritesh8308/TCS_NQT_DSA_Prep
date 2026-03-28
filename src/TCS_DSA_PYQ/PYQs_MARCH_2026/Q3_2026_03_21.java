/**
* Question 3: Parking Charge Calculator (Shift 2)
 * Calculate total parking fees based on hourly rates.
*
* First 2 hours: ₹100 per hour
* Next 3 hours: ₹50 per hour
* Beyond 5 hours: ₹20 per hour
* Solution (17:35-19:57): The solution splits the total hours into segments and multiplies by the respective rates to get the total cost.
 * */

package TCS_DSA_PYQ.PYQs_MARCH_2026;
import java.util.*;

public class Q3_2026_03_21 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();

        if(hr < 0) {
            System.out.println("Invalid Input");
        }   else{
            if(hr <= 2) {
                System.out.println(100*hr);
            }else if(hr <= 5) {
                System.out.println((100*2) + (50*(hr - 2)));
            }   else{
                System.out.println((100*2) + (50*3) + (20*(hr-5)));
            }
        }

        sc.close();
    }
}
