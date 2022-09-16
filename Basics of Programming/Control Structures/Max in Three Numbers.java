import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n1 , n2, n3 , max;
       n1 = sc.nextInt();
       n2 = sc.nextInt();
       n3 = sc.nextInt();
       max = (n1>n2)? (n1>n3 ? n1 : n3) : (n2>n3 ? n2:n3);
        System.out.println(max);
    }
}
