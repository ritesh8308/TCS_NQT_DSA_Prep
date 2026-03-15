package TCS_DSA_PYQ.Mock_Tests.Day_06;
import java.util.*;
import java.io.*;

public class Smallest_Product_Digit_for_N {

    public static long getSmallestInteger(int n) {
        if (n == 0) return 10;

        if (n < 10) return n;

        List<Integer> digits = new ArrayList<>();

        for (int i = 9; i >= 2; i--) {
            while (n % i == 0) {
                digits.add(i);
                n /= i;
            }
        }

        if (n > 1) return -1;

        Collections.sort(digits);

        long result = 0;
        for (int d : digits) {
            result = result * 10 + d;

            if (result < 0) return -1;
        }
        return result;

    }

    public static void main(String[] args) throws IOException {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter positive integer N:");
            String input = br.readLine();

            if (input == null || input.isEmpty()) return;


            int n = Integer.parseInt(input.trim());
            long s = getSmallestInteger(n);
            System.out.println("Output: " + s);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input: Please enter an integer.");
        }

    }
}
