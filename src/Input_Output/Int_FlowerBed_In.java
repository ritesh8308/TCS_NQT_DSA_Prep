package Input_Output;

import java.util.*;

public class Int_FlowerBed_In {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read the first number (n)
        int n = sc.nextInt();

        // 2. Read the rest of the line as a string and parse it
        String line = sc.nextLine();
        String[] parts = line.trim().split("\\s+");

        int[] flowerbed = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            flowerbed[i] = Integer.parseInt(parts[i]);
        }

        // 3. Print correctly using Arrays.toString()
        System.out.println("n: " + n);
        System.out.println("Flowerbed: " + Arrays.toString(flowerbed));
    }
}