package LeetCode_DSA_problems;
import java.util.*;

public class Assign_Cookies {

    public static int content_Children(int [] g, int [] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int cookiesIndex = 0;
        int contentChildren = 0;

        while(cookiesIndex < s.length && contentChildren < g.length) {
            if(s[cookiesIndex] >= g[contentChildren]) {
                contentChildren++;
            }
            cookiesIndex++;
        }

        return contentChildren;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "").trim();
        String[] tokens = input.split(",\\s*");
        int[] g = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            g[i] = Integer.parseInt(tokens[i]);
        }


        String input1 = sc.nextLine();
        input1 = input1.replace("[", "").replace("]", "").trim();
        String[] tokens1 = input1.split(",\\s*");
        int[] s = new int[tokens1.length];
        for (int i = 0; i < tokens1.length; i++) {
            s[i] = Integer.parseInt(tokens1[i]);
        }

        int ans = content_Children(g, s);
        System.out.println("Maximum children satisfied: " + ans);

    }
}
