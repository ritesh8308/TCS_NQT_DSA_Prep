package LeetCode_DSA_problems;

import java.util.*;

public class Groupping_Anagrams {


    /***
     * Complexity
     * Time complexity: O(m∗nlogn)
     * Space complexity: O(mn)
     * */
    public static List<List<String>> findAnagrams(String [] arr) {
        HashMap<String, List<String>> ans = new HashMap<>();

        for(String s:arr) {
            char [] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }




//    Complexity
//    Time complexity: O(m∗n)
//    Space complexity: O(mn)

//     public List<List<String>> groupAnagrams(String[] strs) {
//         HashMap<String, List<String>> ans = new HashMap<>();

//         for(String s:strs) {
//             int [] count = new int[26];

//             // count the frequency of each letter in s:
//             for(char c:s.toCharArray()) {
//                 count[c-'a']++;
//             }

//             StringBuilder sb = new StringBuilder();
//             for(int num:count) {
//                 sb.append(num).append("#");
//             }
//             String key = sb.toString();
//             if(!ans.containsKey(key)) {
//                 ans.put(key, new ArrayList<>());
//             }
//             ans.get(key).add(s);
//         }

//         return new ArrayList<>(ans.values());
//     }
// }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "").trim();
        String [] arr = input.split(",");

        List<List<String>> ans = findAnagrams(arr);
        for(List<String> ls:ans) {
            System.out.println(ls);
        }

        sc.close();
    }
}
