import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
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
        rotateAndPrint(arr, n);
        System.out.println("");
        rotateAndPrint(arr, n);
    }
    public static void rotateAndPrint(int arr[][], int n){
       for(int i=0; i<n/2; i++){
           for(int j=i; j<n-i-1; j++){
               int temp = arr[i][j];
                arr[i][j] = arr[n-j-1][i];
                arr[n-j-1][i] = arr[n-i-1][n-j-1];
                arr[n-i-1][n-j-1] = arr[j][n-i-1];
                arr[j][n-i-1] = temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
