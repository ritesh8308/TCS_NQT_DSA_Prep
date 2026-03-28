package TCS_DSA_PYQ;
import java.util.*;

public class Dutch_National_Flag_Algorithm_Sort_Marbles {

    public static void sortColors(int [] arr) {
        int low=0, mid=0, high=arr.length - 1;

        while(mid <= high) {
            if(arr[mid] == 0) {
                int temp=arr[low];  arr[low]=arr[mid];  arr[mid]=temp;
                low++;
                mid++;
            }   else if(arr[mid] == 1) {
                mid++;
            }
            else{
                int temp=arr[mid];  arr[mid]=arr[high];   arr[high]=temp;
                high--;
            }


        }
    }
    public static void main(String [] args) {
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();
        String [] parts = input.split(" C");
        int n = Integer.parseInt(parts[0]);
        int [] marbles = new int[n];

        for(int i=0; i<n; i++) {
            marbles[i] = Integer.parseInt(parts[i+1]);
        }
        sortColors(marbles);
        System.out.println(Arrays.toString(marbles));
    }
}
