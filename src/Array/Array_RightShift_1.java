package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_RightShift_1 {

    public static int[] right_Shift_By1(int [] arr){
        int n = arr.length;
        int temp = arr[n-1];

        for(int i=n-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        return arr;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of an array in same row with single space: ");
        sc.nextLine();

        String [] ch = sc.nextLine().split(" ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(ch[i]);
        }

        right_Shift_By1(arr);

        //    System.out.println(arr); : prints the arrays memory address: Hashcode Representation
        System.out.println(Arrays.toString(arr));

        //we cannot pritnt array elements directly to string
        // use Arrays.toString() / Arrays.deeptoString()

    }
}
