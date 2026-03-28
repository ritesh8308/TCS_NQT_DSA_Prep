package TCS_DSA_PYQ.PYQs_MARCH_2026;
import java.util.*;


class Transaction {
    int index;
    String sender, receiver;
    int amount, time;
    String key;

    Transaction(int index, String s, String r, int a, int t) {
        this.index = index;
        this.sender = s;
        this.receiver = r;
        this.amount = a;
        this.time = t;
        this.key = s + "|" + r + "|" + a;
    }
}


public class Q2_2026_03_20 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Transaction> allTransactions = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String [] tokens = sc.nextLine().trim().split(",");
            // pass i:Index
            allTransactions.add(new Transaction(i, tokens[0].trim(), tokens[1].trim(),
                                                    Integer.parseInt(tokens[2].trim()),
                                                    Integer.parseInt(tokens[3].trim())));
        }

        Map<String, Transaction> lastSeen = new HashMap<>();
        Set<Integer> fraudTransactions = new TreeSet<>();

        for(Transaction current:allTransactions) {
            if(lastSeen.containsKey(current.key)) {
                Transaction previous = lastSeen.get(current.key);
                if(current.time - previous.time <= 60) {
                    fraudTransactions.add(previous.index);
                    fraudTransactions.add(current.index);
                }
            }
            lastSeen.put(current.key, current);
        }

        for(int idx:fraudTransactions) {
            System.out.println("Transaction at index " + idx + " is fraud.");
        }
    }
}





















