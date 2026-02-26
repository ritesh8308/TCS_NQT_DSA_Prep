package Array;
import java.util.*;

public class Array_LeftShift_By1 {

    /**
     * void : no return value
     * int [] : return arr;
     * int : return arr.length;
     * */

    public static void left_Rotate_Array(int [] arr) {
        int n = arr.length;
        int temp = arr[0];

        for(int i=0; i<n-1; i++) {
            arr[i] = arr[i+1];
        }

        arr[n-1] = temp;
       // return arr;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        left_Rotate_Array(arr);
        for(int a:arr) {
            System.out.println(a + " ");
        }
    }
}
