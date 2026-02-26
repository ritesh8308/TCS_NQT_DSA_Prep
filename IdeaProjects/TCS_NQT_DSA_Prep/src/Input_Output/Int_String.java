package Input_Output;
import java.util.*;

public class Int_String {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sc.nextLine();
        String s = sc.nextLine();
        System.out.println(n+ " "+s);
        sc.close();
    }
}
