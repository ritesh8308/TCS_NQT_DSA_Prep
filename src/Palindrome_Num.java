public class Palindrome_Num {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rem = 0, rev = 0;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == x) {
            return true;
        }   else{
            return false;
        }

    }
}
