package TCS_DSA_PYQ;
import java.util.Scanner;

public class Tower_of_Hanoi {


        // Recursive function to solve Tower of Hanoi
        public static void solveHanoi(int n, String from, String to, String aux) {
            // Base Case: If there's only 1 disk, move it directly
            if (n == 1) {
                System.out.println("move disk 1 from rod " + from + " to rod " + to);
                return;
            }

            // Step 1: Move n-1 disks from 'from' to 'aux' using 'to' as helper
            solveHanoi(n - 1, from, aux, to);

            // Step 2: Move the nth disk from 'from' to 'to'
            System.out.println("move disk " + n + " from rod " + from + " to rod " + to);

            // Step 3: Move n-1 disks from 'aux' to 'to' using 'from' as helper
            solveHanoi(n - 1, aux, to, from);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of disks: ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Total moves: 0");
            } else {
                // Rod names: 1 (from), 3 (to), 2 (aux) as per your image example
                solveHanoi(n, "1", "3", "2");
                System.out.println("Total moves: " + (int)(Math.pow(2, n) - 1));
            }
            sc.close();
        }
    }

