package Array;
import java.util.*;


public class Right_Rotation_By_Swapping {

        public static void reverse(int [] arr, int i, int j) {
            while(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }


        public static void right_Shift_ByK(int [] arr, int k) {
            int n = arr.length;
            k = k%n;
            reverse(arr, n-k, n-1);
            reverse(arr, 0, n-1-k);
            reverse(arr, 0, n-1);
        }


        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array: ");
            int n = sc.nextInt();
            int [] arr = new int[n];
            System.out.println("Enter the R_Shift_Value: ");
            int k = sc.nextInt();

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            right_Shift_ByK(arr, k);
            System.out.println(Arrays.toString(arr));
        }
    }


