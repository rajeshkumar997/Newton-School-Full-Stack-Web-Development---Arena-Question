import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*" +" ");
            }
             System.out.println();
        }
       
    }
}
