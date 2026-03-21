package TCS_DSA_PYQ.PYQs_MARCH_2026;
import java.util.*;

public class Q1_2026_03_20{


    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Invalid Input");
            } else {

            int cost = switch (n) {
                case 1        ->    2000;
                case 2, 3     ->    5000;
                case 4, 5, 6  ->    9000;
                case 7, 8, 9  ->    12000;
                default       ->    15000;
            };

                System.out.println("Cost: " + cost);
        }
    }
        sc.close();
    }
}







//import java.util.Scanner;

//public class GymMembership {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking integer input for months
//        System.out.print("Enter the number of months: ");
//        int months = scanner.nextInt();
//
//        // Membership cost calculation logic
//        if (months <= 0) {
//            System.out.println("Invalid Input");
//        } else {
//            int cost;
//            if (months == 1) {
//                cost = 2000;
//            } else if (months >= 2 && months <= 3) {
//                cost = 5000;
//            } else if (months >= 4 && months <= 6) {
//                cost = 9000;
//            } else { // months > 6
//                cost = 15000;
//            }
//
//            System.out.println("Cost: " + cost);
//        }
//
//        scanner.close();
//    }
//}