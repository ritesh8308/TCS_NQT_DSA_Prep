package LeetCode_DSA_problems;
import java.util.*;

// LeetCode : problem 1704
public class Alike_Halves_of_String {

    public static boolean halvesAreAlike(String s){
        String sLower = s.toLowerCase();

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int vowelsCount = 0;
        int midIndex = sLower.length()/2;

        for(int i=0; i<midIndex; i++) {
            char charA = sLower.charAt(i);
            char charB = sLower.charAt(midIndex+i);
            if(vowels.contains(charA))  vowelsCount++;
            if(vowels.contains(charB))  vowelsCount--;
        }

        return vowelsCount == 0;
    }

//    public static boolean halvesAreAlike(String s) {
//        return (noOfVowels(s,0,s.length()/2)) == (noOfVowels(s,s.length()/2,s.length()));
//    }
//
//    private static int noOfVowels(String s, int start, int end){
//        int count = 0;
//        for(int i = start; i < end; i++){
//            if(isVowel(s.charAt(i))){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    private static boolean isVowel(char c){
//        c = toLowerCase(c);
//        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
//    }
//
//    private static char toLowerCase(char c){
//        return (c = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c);
//    }





    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // String in input must have even number of characters

        int k = s.length();
        while(k%2 != 0){
            System.out.println("Enter String with even letters: ");
            s = sc.nextLine();
            k = s.length();
        }
        System.out.println("is String alike? :" + halvesAreAlike(s));
    }
}

