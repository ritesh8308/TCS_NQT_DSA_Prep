package Array;
import java.util.*;

public class Right_Shift_By_K {

    public static void right_Shift_ByK(int [] arr, int k) {
        int n = arr.length;
        k = k%n;
        int [] temp = new int[k];

        for(int i=0; i<k; i++) {
            temp[i] = arr[(n-k)+i];
        }

        for(int i=n-k-1; i>=0; i--) {
            arr[i+k] = arr[i];
        }

        for(int i=0; i<k; i++){
            arr[i] = temp[i];
        }
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
