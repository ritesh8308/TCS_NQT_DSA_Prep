import java.util.*;
public class E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long firstMin = Long.MAX_VALUE, secondMin = Long.MAX_VALUE;
        long firstMax = Long.MIN_VALUE, secondMax = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
           long x = sc.nextLong();


           // FOR MIN
            if (x < firstMin){
                secondMin = firstMin;
                firstMin = x;
            }   else if(x > firstMin && x < secondMin){
                secondMin = x;
            }


            // FOR MAX
            if (x > firstMax) {
                secondMax = firstMax;
                firstMax = x;
            }   else if (x < firstMax && x > secondMax) {
                secondMax = x;
            }
        }

        long ansSecondMin = (secondMin == Long.MAX_VALUE) ? -1 : secondMin;
        long ansSecondMax = (secondMax == Long.MIN_VALUE) ? -1 : secondMax;

        System.out.println(ansSecondMin + " " + ansSecondMax);
        sc.close();

    }

}
