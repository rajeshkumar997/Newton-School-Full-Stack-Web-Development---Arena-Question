import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean digitPresent(int x,int d){
        while(x>0){
            if(x%10 == d)
            break;

            x= x/10;
        }
        return(x>0);
    }
    static void printNumbers(int n, int d){
        for(int i=0; i<=n; i++){
            if(i == d || digitPresent(i,d))
            System.out.print(i+ " ");
        }
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int d = sc.nextInt();
        printNumbers(n,d);              
    }
}
