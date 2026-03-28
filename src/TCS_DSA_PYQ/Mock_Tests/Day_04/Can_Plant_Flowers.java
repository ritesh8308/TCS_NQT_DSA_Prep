package TCS_DSA_PYQ.Mock_Tests.Day_04;

import java.util.Scanner;

public class Can_Plant_Flowers {

        public boolean plant(int [] arr, int n) {

            for(int i=0; i<arr.length; i++) {
                boolean  left = (i==0) || arr[i-1] == 0;
                boolean right = (i==arr.length-1) || arr[i+1] == 0;

                if(arr[i]==0 && left && right) {
                    arr[i] = 1;
                    n--;

                    if(n==0)  return true;
                }
            }
            return n<=0;
        }

        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            String input = sc.nextLine();
            String [] tokens = input.trim().split(" ");

            int [] arr = new int[tokens.length];
            for(int i=0; i<tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            Can_Plant_Flowers p = new Can_Plant_Flowers();
            System.out.println(p.plant(arr, n));
        }

    }


