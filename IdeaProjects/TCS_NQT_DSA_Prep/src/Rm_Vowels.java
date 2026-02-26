import java.util.Scanner;

public class Rm_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String vowels = "aeiouAEIOU";
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) == -1) {
                ans.append(ch);
            }
        }

        System.out.println(ans.toString());
        sc.close();
    }
}
