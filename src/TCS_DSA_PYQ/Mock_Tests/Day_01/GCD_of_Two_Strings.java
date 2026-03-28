package TCS_DSA_PYQ.Mock_Tests.Day_01;
// import java.util.*;
import java.io.*;

public class GCD_of_Two_Strings {

    private static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static String gcdOfStrings(String s1, String s2) {
        if(! (s1+s2).equals(s2+s1)) return "";

        int gcd_Length = gcd(s1.length(), s2.length());

        return s1.substring(0, gcd_Length);
    }
    public static void main(String [] keywords) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        String gcd_String = gcdOfStrings(s1, s2);
        System.out.println("GCD of Two Strings is: " + gcd_String);
    }
}
