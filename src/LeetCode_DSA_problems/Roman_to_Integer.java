package LeetCode_DSA_problems;
import java.util.*;

public class Roman_to_Integer {

    public static int romanToInt(String s) {
        int res = 0;
        // immutable hashmap
        HashMap<Character, Integer> roman = new HashMap<>(Map.of(
                'I', 1, 'V', 5, 'X', 10, 'L', 50,
                'C', 100, 'D', 500, 'M', 1000));

        // else use roman.put('I', 1)

        for(int i=0; i<s.length()-1; i++) {
            if(roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))) {
                res -= roman.get(s.charAt(i));
            }   else {
                res += roman.get(s.charAt(i));
            }
        }
        return res + roman.get(s.charAt(s.length()-1));
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ans = romanToInt(s);
        System.out.println(ans);
    }
}
