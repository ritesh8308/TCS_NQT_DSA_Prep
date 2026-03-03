package TCS_DSA_PYQ.Mock_Tests.Day_04;

import java.util.*;

public class String_Compression {

    public static int stringCompression(char[] chars) {
        int n = chars.length;
        int write = 0;  // pointer to write compressed result
        int i = 0;  // pointer to read characters from chars[]
        while(i < n) {
            char ch = chars[i];
            int count = 0;

            while(i<n && chars[i] == ch) {
                count++;
                i++;
            }

            chars[write++] = ch;

            if(count > 1) {
                String cntstr = String.valueOf(count);
                for(char c : cntstr.toCharArray()) {
                    chars[write++] = c;
                }
            }

        }
        return write;
    }
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    input = input.replace("[", "").replace("]", "").trim();
    String [] tokens = input.split("\\s*,\\s*");

    int n = tokens.length;
    char [] chars = new char[n];
    for(int i=0; i<n; i++) {
        chars[i] = tokens[i].charAt(0);
    }

    int a = stringCompression(chars);
    System.out.println(a);

    char [] cp = Arrays.copyOfRange(chars,0,a);
    System.out.println(cp);
}
}
