import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long gcd(long m, long n){
        // if(m==0)
        // return n;
        // if(n==0)
        // return m;
        // if(m>n)
        // return gcd(m-n,n);
        // return gcd(m, n-m);
         if (n == 0)
        return m;
      return gcd(n, m % n);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n= sc.nextLong();
        System.out.println(gcd(m,n));
        
    }
}
