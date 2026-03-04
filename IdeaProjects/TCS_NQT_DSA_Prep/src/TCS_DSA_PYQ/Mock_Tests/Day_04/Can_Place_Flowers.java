package TCS_DSA_PYQ.Mock_Tests.Day_04;
import java.util.*;

public class Can_Place_Flowers {

    public boolean canPlaceFlowers(int [] arr, int n) {
        for(int i=0; i<arr.length; i++) {
            boolean left = (i==0) || (arr[i] == 0);
            boolean right = (i == arr.length-1) || (arr[i+1] == 0);
            if(arr[i] == 0 && left && right) {
                arr[i] = 1;
                n--;

                if(n==0) return true; // early exit
            }
        }
        return n <= 0;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        /***
         * ip: 5 1 0 0 0 1 0 1 0 0 0 0 1 0 1 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0 0 0 0
         * where n = number of flowers to plant = 5
         * arr [] = [1 0 0 0 1 0 1 0 0 0 0 1 0 1 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0 0 0 0]
         *
         * then code:
         *
         * public static void main(String [] args) {
         *     Scanner sc = new Scanner(System.in);
         *     int n = sc.nextInt();
         *
         *     String input = sc.nextLine();
         *     String [] tokens = input.trim().split(" ");
         *
         *     int [] arr = new int[tokens.length];
         *     for(int i=0; i<tokens.length; i++) {
         *         arr[i] = Integer.parseInt(tokens[i]);
         *     }
         *
         * }
         * */
        System.out.println("Enter no. of samplings: ");
        int n = sc.nextInt();
        sc.nextLine();  // requires as we are taking input of "String" after "int"
        String input = sc.nextLine();
        input = input.replace("[","").replace("]","");

        String [] tokens = input.split("\\s*,\\s*");

        ArrayList<Integer> flowerbed = new ArrayList<>();
        for(String token : tokens) {
            flowerbed.add(Integer.parseInt(token));
        }


        /***
         * FUNCTIONS TO MANIPULATE LISTS:
         *add: list.add(value)
         * update: list.set(i,value);
         * get: list.get(i);
         * size: list.size();
         *
         * **/

        int [] arr = new int[flowerbed.size()];
        for(int i=0; i<flowerbed.size(); i++) {
            arr[i] = flowerbed.get(i);
        }

        Can_Place_Flowers f = new Can_Place_Flowers();
        boolean ans = f.canPlaceFlowers(arr, n);
        System.out.println(ans);
    }
}
