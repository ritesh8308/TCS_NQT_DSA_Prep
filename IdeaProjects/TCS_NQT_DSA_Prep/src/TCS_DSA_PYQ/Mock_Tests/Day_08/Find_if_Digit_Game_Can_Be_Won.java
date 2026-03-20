package TCS_DSA_PYQ.Mock_Tests.Day_08;
import java.util.*;

public class Find_if_Digit_Game_Can_Be_Won {


    public static boolean gameWin(int [] nums) {

        int x=0, y=0;
        for(int a:nums) {
            if(a > 9) {
               x += a;
            }   else {
                y += a;
            }
        }

        return !(x == y);
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "").trim();
        String [] tokens = input.split("\\s*,\\s*");

        int [] nums = new int[tokens.length];
        for(int i=0; i<tokens.length; i++) {
            nums[i] = Integer.parseInt(tokens[i]);
        }

        boolean ans = gameWin(nums);
        System.out.println(ans);

        sc.close();

    }
}
