import java.util.*;

public class Char_Freq_S04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char ch = (char) ('a' + i);
                System.out.println(ch + " " + freq[i]);
            }
        }
        sc.close();
    }
}
