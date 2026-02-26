package Array;
import java.io.*;
//import java.util.*;



public class BR_First_Second_Smallest_InArray {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // reading n:
        String line1 = br.readLine();
        if (line1 == null) return;
        int n = Integer.parseInt(line1.trim());


        // Reading array elements:
        String line2 = br.readLine();
        if(line2 == null) return;
        String [] parts = line2.trim().split("\\s+");

        int first = Integer.MAX_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            int current = Integer.parseInt(parts[i]);

            if(current < first) {
                second = first;
                first = current;
            }   else if(current < second && current != first) {
                second = current;
            }
        }

        // If second is still a MAX_VALUE it means no distinct second smallest exists
        if(second == Integer.MAX_VALUE) {
            System.out.println("-1");
        }   else  {
            System.out.println(first+ " "+second);

        }
    }
}
