/**
 * Question: Expense Management System
 *
 * Write a program to manage expenses from a given total income.
 * Input:
 * Total Income: An integer value representing the total money available
 * Expenses: For each expense, take the following inputs repeatedly until the user enters "done":
 * Category: A string representing the type of expense (e.g., "food", "shopping").
 * Expense: An integer value for the amount spent.
 *
 *
 * Output:
 * Print the Total Income.
 * Print the Total Expenses (the sum of all expenses entered).
 * Print the Total Savings ($Total Income - Total Expenses$).
 * Print the Breakdown of expenses for each category.
 * */

/**
 * Input:
 * Total Income: 1000
 * Category: food
 * Expense: 200
 * Category: shopping
 * Expense: 300
 * Category: bill
 * Expense: 50
 * (done)
 * */



/**
 * Output:
 *
 * Total Income: 1000
 * Total Expenses: 550
 * Total Savings: 450
 * Category:
 * food: 200
 * shopping: 300
 * bill: 50
 * */


package TCS_DSA_PYQ.PYQs_MARCH_2025.Dated_25_03_2025;
import java.util.*;

public class Q1_25_03_2025 {


    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int totalIncome = sc.nextInt();
        sc.nextLine();

        int totalExpense = 0;

        Map<String, Integer> map = new LinkedHashMap<>();

        while(true) {
            String category = sc.nextLine();   // Use --> sc.next() -----> iff : Food: 250000

            if(category.equals("done"))     break; // .equals() is used to compare real contains of strings

            int expense = sc.nextInt();
            sc.nextLine();

            map.put(category, map.getOrDefault(category, 0) + expense);
            totalExpense += expense;
        }

        System.out.println(totalIncome);
        System.out.println(totalExpense);
        System.out.println(totalIncome - totalExpense);

        // printing Final list:
        for(Map.Entry<String, Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }

        sc.close();
    }
}
