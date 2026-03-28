package Input_Output;
import java.util.*;

public class Print_Decimal_Upto_TwoPlaces {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        System.out.printf("%.2f", d);
    }
}
