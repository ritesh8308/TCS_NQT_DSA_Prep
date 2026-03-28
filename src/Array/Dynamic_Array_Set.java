package Array;
import java.util.*;

public class Dynamic_Array_Set {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.startsWith("{") && input.endsWith("}")) {
            input = input.substring(1, input.length() - 1);
        }

        String [] ch = input.split(",");

        ArrayList<Integer> arr = new ArrayList<>();

        for(String token:ch) {
            int num = Integer.parseInt(token);
            arr.add(num);
        }

        for(int a:arr) {
            System.out.print(a+" ");
        }

        sc.close();
    }
}
