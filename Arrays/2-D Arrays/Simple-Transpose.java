import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    //   static void transpose(int arr[][], int n)
    // {
    //     for (int i = 0; i < n; i++)
    //         for (int j = i+1; j < n; j++)
    //         {
    //              int temp = arr[i][j];
    //              arr[i][j] = arr[j][i];
    //              arr[j][i] = temp;
    //         }
    // }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
