import java.lang.reflect.Array;
import java.util.ArrayList;

public class Seperate_Int {
   public int [] rearrangeArray(int[] nums) {
       ArrayList<Integer> positive = new ArrayList<>();
       ArrayList<Integer> negative = new ArrayList<>();

       for (int i=0; i < nums.length; i++) {
           if(nums[i] > 0) {
               positive.add(nums[i]);
           }
       }

       for (int i=0; i<nums.length; i++) {
           if(nums[i] < 0) {
               negative.add(nums[i]);
           }
       }

       int [] arr =new int[nums.length];

       int k = 0;
       int c = 0;
       while(c < positive.size()) {
           arr[k] = positive.get(c);
           arr[k+1] = negative.get(c);

           k += 2;
           c++;
       }
       return arr;
   }
}
