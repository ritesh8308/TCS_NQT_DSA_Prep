package TCS_DSA_PYQ.Mock_Tests.Day_03;

import java.util.*;

public class Product_of_Array_Except_self {

    public int[] productExceptSelf(int [] arr) {
        int n = arr.length;

        int [] op = new int[n];
        for(int i=0; i<n; i++) {
            op[i] = 1;
        }

        int left = 1;
        for(int i=0; i<n; i++) {
            op[i] *= left;
            left *= arr[i];
        }

        int right = 1;
        for(int i=n-1; i>=0; i--) {
            op[i] *= right;
            right *= arr[i];
        }

        return op;
    }


    /* OR YOU CAN TRY WITH '/' METHOD:
     *
     * public class Product_of_Array_Except_self {
     *     int n = arr.length;
     *     int product = 1;
     *     int count_0 = 0;
     *
     *     for(int i=0; i<n; i++) {
     *
     *         if(arr[i] != 0) {
     *             product *= arr[i];
     *         }    else{
     *             count_0++;
     *         }
     *     }
     *
     *     if(count_0 == 0) {
     *          for(int i=0; i<n; i++) {
     *              arr[i] = product/arr[i];
     *          }
     *     }
     *
     *     else if(count_0 == 1) {
     *         for(int i=0; i<n; i++) {
     *             if(arr[i] == 0)  arr[i] = product;
                   else     arr[i] = 0;
                  }
               }

          * else{
          * for(int i=0; i<n; i++) {
          *      arr[i] = 0;
          *     }
          * }
     */

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Product_of_Array_Except_self es = new Product_of_Array_Except_self();

        int [] op = es.productExceptSelf(arr);
        System.out.println(Arrays.toString(op));
    }
}
