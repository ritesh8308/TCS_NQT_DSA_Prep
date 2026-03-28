package Array;
import java.util.*;

public class Left_Shift_By_K {

    public static void left_Shift_ByK(int [] arr, int k) {
        int n = arr.length;
        k = k%n;
        int [] temp = new int[k];

        for(int i=0; i<k; i++) {
            temp[i] = arr[i];
        }

        for(int i=k; i<n; i++) {
            arr[i-k] = arr[i];
        }

        for(int i=0; i<k; i++) {
            arr[n-k+i] = temp[i];
        }

    }
    public static void main(String [] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
int [] arr = new int[n];

for(int i=0; i<n; i++) {
    arr[i] = sc.nextInt();
}

left_Shift_ByK(arr, k);

for(int a:arr) {
    System.out.print(a + " ");
}

    }
}
