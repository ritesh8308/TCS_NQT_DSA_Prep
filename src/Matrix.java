import java.util.*;

public class Matrix {
    public static void findNearestDivisible(int N, int [][] arr) {
        for (int i = 0; i < N; i++) {
            StringBuilder row = new StringBuilder();

            for (int j = 0; j < N; j++) {
                int val = arr[i][j];
                int remainder = val % 5;  // remainder = -4 to 4;
                int result;

                /*
                 * LOGIC:
                 * 1,2 round down to 0
                 * 3,4 round down to 5
                 * also negative numbers can occur in input.
                 * */

                // rem = 3,4 : add 1,2 in val
                if (remainder >= 3) {
                    result = val + (5 - remainder);
                }

                // FOR -VE ELEMENT: Aij
                // rem = -3,-4 : add -1,-2 in val
                else if (remainder <= -3) {
                    result = val - (5 + remainder);
                }

                // rem = (-2), (-1), 0, 1, 2 : subtract rem only from Aij;
                else {
                    result = val - remainder;
                }
                row.append(result).append(" ");
            }

        System.out.println(row.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(sc.hasNextInt()) {
                        arr[i][j] = sc.nextInt();

                    }
                }
            }
            findNearestDivisible(N, arr);
        }
    sc.close();
    }
}

