package LeetCode_DSA_problems;
import java.util.*;


public class Valid_Parentheses {

    public static boolean validParantheses(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for(char c:s.toCharArray()) {
            if(mapping.containsValue(c)) {
                st.push(c);
            }   else if(st.isEmpty() || mapping.get(c) != st.pop()) {
                return false;
            }
        }


        return st.isEmpty();
    }



    /**
     *
     *
     * class Solution {
     *     public boolean isValid(String s) {
     *         Stack<Character> stack = new Stack<>();
     *
     *         for (int i = 0; i < s.length(); i++) {
     *             char cur = s.charAt(i);
     *             if (!stack.isEmpty()) {
     *                 char last = stack.peek();
     *                 if (isPair(last, cur)) {
     *                     stack.pop();
     *                     continue;
     *                 }
     *             }
     *             stack.push(cur);
     *         }
     *
     *         return stack.isEmpty();
     *     }
     *
     *     private boolean isPair(char last, char cur) {
     *         return (last == '(' && cur == ')') ||
     *                (last == '{' && cur == '}') ||
     *                (last == '[' && cur == ']');
     *     }
     * }
     * **/
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean ans = validParantheses(s);
        System.out.println(ans);
    }
}
