import java.util.Scanner;

public class prime {

    public static boolean prime(int n){
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimes(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printPrimes(n);
    }
}
