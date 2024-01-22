import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        for(int iter=1;iter<=i;iter++){
            for(int j=1;j<=iter;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
