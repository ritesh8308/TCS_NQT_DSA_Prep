/**
 * Q1. Curtain Color Packing
 * A furnishing company is manufacturing a new collection of curtains.
 * The curtains are of two colors: aqua (a) and black (b).
 * The curtain colors for a batch of a curtains are represented as a string:
 * str consisting only of the characters a and b.
 *
 * They pack the curtains into boxes, each box holding up to L curtains in the order they appear
 * (i.e., by taking contiguous substrings of length ; if w is not a multiple of L, the final box will contain the remaining curtains and will be shorter than L).
 *
 * They then label the box that contains the maximum number of aqua-colored curtains (a).
 * Your task is to compute how many aqua curtains are in that labeled box.
 *
 * Input
 * First line: a string str of length #, containing only a and b.
 * Second line: an integer 1, the capacity of each box.
 *
 * Output
 * A single integer: the maximum number of a characters in any box (substring) when str is divided into segments of length L (the last segment may be shorter).
 *
 * Example-
 * Input:
 * bbbabbaabaaababa
 * 3
 * Output:
 * 3
 * */



package TCS_DSA_PYQ.Mock_Tests.Day_10;
import java.util.*;

public class Max_AquaColored_Curatains_InBox {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int L = sc.nextInt();
        if(L <= 0){
            System.out.println("INVALID BOX SIZE !");
        }

        int n = input.length();
        int max_a = 0;

        // Instead Using SubStrings:
        for (int i = 0; i < n; i += L) {
            String box = input.substring(i, Math.min(i + L, n));
            int currentCount = (int) box.chars().filter(ch -> ch == 'a').count();
            max_a = Math.max(max_a, currentCount);
        }

//        char[] arr = input.toCharArray();
//         // traversing Boxes:
//        for(int i=0; i<n; i+=L) {
//            int count = 0;
//            int num = Math.min(i+L, n);
//
//           // traversing curtains inside every single box:
//            for(int j=i; j<num; j++) {
//                if(arr[j] == 'a')  count++;
//            }
//
//            max_a = Math.max(max_a, count);
//        }

        System.out.println(max_a);
        sc.close();
    }
}



