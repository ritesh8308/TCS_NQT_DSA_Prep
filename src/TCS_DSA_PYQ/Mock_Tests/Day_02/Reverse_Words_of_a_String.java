package TCS_DSA_PYQ.Mock_Tests.Day_02;
import java.util.*;

public class Reverse_Words_of_a_String {

    public String reverseWors(String s) {
        int n = s.length();
        Stack<String> st = new Stack<>();

        // seperating single word at a time from String s:
        for(int i=0; i<n; i++) {
            if (s.charAt(i) == ' ') continue;

            StringBuilder sb1 = new StringBuilder();

            while (i < n && s.charAt(i) != ' ') {
                sb1.append(s.charAt(i));
                i++;
            }

            st.push(sb1.toString());
        }

            StringBuilder sb2 = new StringBuilder();

            while (!st.isEmpty()) {
                sb2.append(st.pop());
                //if(! st.isEmpty())
                sb2.append(" ");
            }



        return sb2.toString();
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you string: ");
        String s = sc.nextLine();

        Reverse_Words_of_a_String rw = new Reverse_Words_of_a_String();

        String ans = rw.reverseWors(s);
        System.out.println(ans);
        sc.close();
    }
}
