package TCS_DSA_PYQ.PYQs_MARCH_2026;
import java.util.*;

public class Q1_2026_03_20{


    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Membership plan's subscription cost is: " + 2000);
                break;

            case 3:
                System.out.println("Membership plan's subscription cost is: " + 5000);
                break;

            case 6:
                System.out.println("Membership plan's subscription cost is: " + 9000);
                break;

            case 9:
                System.out.println("Membership plan's subscription cost is: " + 12000);
                break;

            case 12:
                System.out.println("Membership plan's subscription cost is: " + 15000);
                break;

            default:
                System.out.println("Error: You're chosen plan is Unavaillable.");
                break;
        }
    }else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}