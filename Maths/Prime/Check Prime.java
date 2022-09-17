import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int i =2;
    public static boolean isPrime(int n)
{
    if (n == 0 || n == 1)
    {
        return false;
    }
    if (n == i)
        return true;
         
    if (n % i == 0)
    {
        return false;
    }
    i++;
    return isPrime(n);
}
   
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
