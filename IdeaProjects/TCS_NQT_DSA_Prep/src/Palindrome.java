import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int left = 0, right = s.length() - 1;
        boolean isPal = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPal = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPal ? "YES" : "NO");
        sc.close();
    }
}
