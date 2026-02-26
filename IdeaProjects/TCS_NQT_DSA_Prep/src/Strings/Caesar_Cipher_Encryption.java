package Strings;
import java.util.*;

/**
 * Example:
 *
 * IP:  Enter your PlainText: All the best
 *Enter the Key: 1
 *OP:  The encrypted Text is: Bmm uif Cftu
 *
 * Note:
 * Z  --->  A,B,...
 * 9  --->  0,1,2...
 * @/$/#  --->  Remains one and same.
 *
 * */


public class Caesar_Cipher_Encryption {

//    public static void Encryption(String [] s, int k){
//        Try to use minimal methods in NQT
//    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your plain text: ");
        String s = sc.nextLine();
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        if(key == 0) {
            System.out.println("INVALID  OUTPUT");
        }   else {
            StringBuilder encryptedText = new StringBuilder();
            for(int i=0; i<s.length(); i++) {
                char ch = s.charAt(i);

                if(ch >= '0' && ch <= '9') {
                    // for 0-9
                    ch = (char) (ch+key);
                    if(ch > '9') {
                        int left = (ch - '9');
                        ch = (char) ('0' + left - 1);
                    }
                }

                    else if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + key);
                    if(ch > 'Z') {
                        int left = (ch - 'Z');
                        ch = (char) ('A' + left-1);
                    }
                }
                    else if(ch >= 'a' && ch <= 'z') {
                        ch = (char) (ch+key);
                        if(ch > 'z') {
                            int left = (ch - 'z');
                            ch = (char) ('a' + left-1);
                        }
                }
                    encryptedText.append(ch);
            }
            System.out.println("The encrypted text is: "+ encryptedText.toString());
        }sc.close();

    }
}
