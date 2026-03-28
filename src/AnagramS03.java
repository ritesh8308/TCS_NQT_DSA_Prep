import java.util.*;

public class AnagramS03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim().toLowerCase();
        String s2 = sc.nextLine().trim().toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("NO");
            return;
        }

        int [] freq = new int[26];
        for (int i = 0; i < s2.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int x : freq) {
            if (x != 0) {
                System.out.println("NO");
                sc.close();
                return;
            }
        }
        System.out.println("YES");
        sc.close();
    }
}
