import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
       // int t = 0;
        Scanner sc =new Scanner(System.in);
        int f = sc.nextInt();
        int t = (f-32)*5/9;
        System.out.println(t);
    }
}
