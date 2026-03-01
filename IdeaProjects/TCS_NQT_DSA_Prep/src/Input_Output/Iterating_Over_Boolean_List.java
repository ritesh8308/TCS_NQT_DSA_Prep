package Input_Output;

import java.util.*;

public class Iterating_Over_Boolean_List {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Boolean> list = new ArrayList<>();
       // list = [true, false, false];
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            list.add(sc.nextBoolean());
        }

//        System.out.println(list);
//        for(int i=0; i<list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }

        for(boolean a:list) {
            System.out.print(a+" ");
        }

    }
}
