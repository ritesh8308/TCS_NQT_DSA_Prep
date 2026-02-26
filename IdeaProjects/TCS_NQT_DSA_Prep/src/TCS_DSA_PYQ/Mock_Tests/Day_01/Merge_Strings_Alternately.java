package TCS_DSA_PYQ.Mock_Tests.Day_01;
import java.util.*;


public class Merge_Strings_Alternately {

    public static String merge_Alternately(String w1, String w2) {
        StringBuilder sb = new StringBuilder();
        int n = w1.length();
        int m = w2.length();
        int maxLength = Math.max(n, m);

        for (int i = 0; i < maxLength; i++) {
            if (i < n) sb.append(w1.charAt(i));
            if (i < m) sb.append(w2.charAt(i));
        }

        return sb.toString();
    }


//    public static String merge_Alternately(String w1, String w2) {
//        int n = w1.length();
//        int m = w2.length();
//
//        int i=0, j=0;
//        StringBuilder sb = new StringBuilder();
//
//        while(i<n && j<m) {
//            sb.append(w1.charAt(i));
//            sb.append(w2.charAt(j));
//
//            i++;
//            j++;
//        }
//
//        while(i<n) {
//            sb.append(w1.charAt(i));
//            i++;
//        }
//
//        while(j<m) {
//            sb.append(w2.charAt(j));
//            j++;
//        }
//
//        return sb.toString();
//    }


     public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String w1 = sc.nextLine();
        String w2 = sc.nextLine();

        String op = merge_Alternately(w1, w2);
        System.out.println(op);
        sc.close();
    }
}
