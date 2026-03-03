package Input_Output;

import java.util.*;

public class Iterating_Over_Boolean_List {
    public static void main(String [] args) {

        //Scanner sc = new Scanner(System.in);
        ArrayList<Boolean> list = new ArrayList<>(Arrays.asList(true, false, true));
        Collections.addAll(list, true, false, true, true);

        for(boolean a:list) {
            System.out.print(a+" ");
        }

//        ArrayList<Boolean> list = new ArrayList<>();
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++) {
//            list.add(sc.nextBoolean());
//        }
//
//        System.out.println(list);
//        for(int i=0; i<list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }

    }
}
