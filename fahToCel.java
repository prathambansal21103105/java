import java.util.Scanner;

public class fahToCel {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int fah=scan.nextInt();
        int cel=(int)((5.0/9)*(fah-32));
        System.out.println(cel);
        char c=97;
        char d=(char)(c+3);
        System.out.println(c);
        System.out.println(d);

    }
}
