import java.util.Scanner;

public class functions {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        int ncr=fact(n)/(fact(r)*fact(n-r));
        System.out.println(ncr);
    }
}