import java.util.Scanner;

public class Space_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                ans.append("%20");
            }   else {
                ans.append(ch);
            }
        }

        System.out.println(ans.toString());
        sc.close();
    }
}
