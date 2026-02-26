import java.util.*;

public class E01 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long minVal = Long.MAX_VALUE;
        long maxVal = Long.MIN_VALUE;


        for (int i = 0; i < n; i++){
            long x = sc.nextLong();
            if (x < minVal) minVal = x;
            if (x > maxVal) maxVal = x;
        }

        System.out.println(minVal + " " + maxVal);
        sc.close();
    }
}
