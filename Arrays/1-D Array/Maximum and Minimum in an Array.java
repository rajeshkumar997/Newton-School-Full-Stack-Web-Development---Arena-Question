import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n;i++){
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            int min = arr[0];

            for(int i=0; i<n; i++){
                if(arr[i]>max){
                    max = arr[i];
                }
                if(arr[i]<min){
                    min = arr[i];
                }
            }
            System.out.print(max + " " + min);
            System.out.println();
        }
    }
}
