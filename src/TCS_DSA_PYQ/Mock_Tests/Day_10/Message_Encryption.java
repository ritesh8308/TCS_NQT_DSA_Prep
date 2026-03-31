/**
 * Q2. The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages
 * is shifted by a number of places down the alphabet.
 *
 * For example, with a shift of 1, P would be replaced by Q, Q would become R, and so on.
 * To pass an encrypted message from one person to another, it is first necessary that both parties have the 'Key' for The cipher,
 * so that the sender may encrypt and the receiver may decrypt it. Key is the number of OFFSET to shift the cipher alphabet.
 *
 * Key can have basic shifts from 1 to 25 positions as there are 26 total alphabets.
 *
 * As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9.
 * Digits can also be shifted by key places.
 *
 * For Example, if a given plain text contains any digit with values 5 and key=2, then 5 will be replaced by 7,
 *
 * "-"(minus sign) OR Special_Symbols will remain as it is.
 *
 * Key value less than 0 should result into "INVALID INPUT"
 *
 * Input:
 * First line: Plaintext string
 * Second line: Key (integer)
 *
 * Output:
 * encrypted string
 *
 * Example:
 * i/p: String@21_do
 *      1
 *
 * o/p: Tusjoh@32_ep
 * */



/**
 * import java.util.*;
 *
 * public class Main {
 * 	public static void main(String[] args) {
 * 		Scanner sc = new Scanner(System.in);
 * 		String s = sc.nextLine();
 *
 * 		if(!sc.hasNextInt())	return;
 * 		int key = sc.nextInt();
 * 		if(key < 0) {
 * 			System.out.println("INVALID INPUT");
 * 			return;
 * 		        }
 *
 * 		StringBuilder sb = new StringBuilder();
 *
 * 		for(char ch:s.toCharArray()) {
 *
 * 			if(Character.isUpperCase(ch)) {
 * 				char eCh = (char) (((ch - 'A' + key) % 26) + 'A');
 * 				sb.append(eCh);
 *            }else if(Character.isLowerCase(ch)){
 * 				char eCh = (char) (((ch - 'a' + key) % 26) + 'a');
 * 				sb.append(eCh);
 *            }else if(Character.isDigit(ch)) {
 * 				char eCh = (char) (((ch - '0' + key) % 10) + '0');
 * 				sb.append(eCh);
 *            }else {
 * 				sb.append(ch);
 *            }
 *
 *        }
 *
 * 		System.out.println(sb.toString());
 * 		sc.close();    * 	}
 * }
 * */


package TCS_DSA_PYQ.Mock_Tests.Day_10;
import java.util.*;

public class Message_Encryption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char[] arr = s.toCharArray();

        int key = sc.nextInt();
        if(key < 0) System.out.println("INVALID INPUT !");

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            char ch = arr[i];
            if(ch >= 'A' && ch <= 'Z') {
                char eChar = (char) (((ch-'A' + key) % 26) + 'A');
                sb.append(eChar);
            }else if(ch >= 'a' && ch <= 'z') {
                char eChar = (char) (((ch-'a' + key) % 26) + 'a');
                sb.append(eChar);
            }else if(ch >= '0' && ch <= '9') {
                char eChar = (char) (((ch-'0' + key) % 10) + '0');
                sb.append(eChar);
            }else {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
 }
