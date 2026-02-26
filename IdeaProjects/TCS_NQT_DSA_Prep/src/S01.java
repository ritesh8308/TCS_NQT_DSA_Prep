import java.util.*;

public class S01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int vowels =0, consonants = 0;
        String vs = "aeiou";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vs.indexOf(ch) != -1) {
                vowels++;
            }   else {
                consonants++;
            }
        }

        System.out.println(vowels + " " + consonants);
        sc.close();
    }
}
