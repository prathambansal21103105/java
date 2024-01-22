import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int i=scan.nextInt();
        // int iter=1;
        // while(iter<=i){
        //     System.out.print(iter);
        //     System.out.print(" ");
        //     iter++;
        // }
        // System.out.println(" ");
        if(i%2==0){
            System.out.println("Non-Prime");
        }
        else{
            for(int j=3;j*j<=i;j++){
                if(i%j==0){
                    System.out.println("Non-prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
    }
}