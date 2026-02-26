package Array;
import java.util.*;

public class Array_Input {

        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            sc.nextLine();  // consumes new line with elements of an array.
            int [] arr = new int[n];

            System.out.println("Enter " + n + " numbers of elements separated by Space");
            String [] numbers = sc.nextLine().split(" ");

            if(numbers.length != n) {
                System.out.println("Error: You must enter exactly " + n + " numbers!");
                sc.close();
                return;
            }

            for(int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }

            for(int a:arr) {
                System.out.print(a + " ");
            }

            sc.close();
        }
    }

