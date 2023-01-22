import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ones = 0;
        int zeros = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                ones++;
            } else {
            zeros++;
        }
        }
        System.out.println(ones + " " + zeros);
    }
}
