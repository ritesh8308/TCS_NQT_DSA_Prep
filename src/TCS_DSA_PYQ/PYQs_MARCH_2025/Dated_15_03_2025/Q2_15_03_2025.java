/**
 * Question 2: Equalizing Three IntegersProblem
 * Statement:You are given three integers: $p$, $q$, and $r$.
 * Your task is to perform operations to make all three numbers equal.
 *
 * In one operation, you can:
 * Add 1 to any two of the numbers.
 * Subtract 1 from the third number.
 *
 * You need to determine and print the minimum number of operations required,
 * to make $p$, $q$, and $r$ equal.
 * If it is not possible to make all three numbers equal, print -1
 * */


package TCS_DSA_PYQ.PYQs_MARCH_2025.Dated_15_03_2025;
import java.util.*;

public class Q2_15_03_2025 {

        public static int minOperations(int p, int q, int r) {
            if (p == q && q == r) return 0;

            List<Integer> arr = new ArrayList<>(Arrays.asList(p, q, r));
            Collections.sort(arr);

            int step = 0;
            while (true) {
                // Logic: Add 1 to the two smallest, subtract 1 from the largest
                arr.set(0, arr.get(0) + 1);
                arr.set(1, arr.get(1) + 1);
                arr.set(2, arr.get(2) - 1);
                step++;

                if (arr.get(0).equals(arr.get(1)) && arr.get(1).equals(arr.get(2)))
                    return step;

                Collections.sort(arr);

                // Exit condition if it becomes impossible
                if ((arr.get(0).equals(arr.get(1)) && arr.get(1) + 1 == arr.get(2))
                        || (arr.get(1).equals(arr.get(2)) && arr.get(0) + 1 == arr.get(1)))
                    return -1;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int t = sc.nextInt();
                while (t-- > 0) {
                    int p = sc.nextInt();
                    int q = sc.nextInt();
                    int r = sc.nextInt();
                    int ans = minOperations(p, q, r);
                    System.out.print(ans + " ");
                }
            }
            sc.close();
        }
    }