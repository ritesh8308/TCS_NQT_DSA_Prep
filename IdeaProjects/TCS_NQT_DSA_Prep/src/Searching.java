public class Searching {
    public static void main(String[] args) {
        int arr [] = {6,4,10,8,6,1,7,2,};
        int n = arr.length;
        int k = 10;
        int ans = -1;
        for (int i=0; i<n; i++) {
            if(arr[i] == k) {
                ans = i;
                break;
            }
        }

        System.out.println("The element is present at: " + ans + "index.");
    }
}
