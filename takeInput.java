import java.util.Scanner;
public class takeInput {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        String str="abcd";
        str=scan.nextLine();
        System.out.println(str);
        char c=str.charAt(0);
        int i=scan.nextInt();
        int j=scan.nextInt();
        short s=scan.nextShort();
        long l=scan.nextLong();
        double d=scan.nextDouble();
        float f=scan.nextFloat();
        System.out.println(i+j+s+l+d+f);
        System.out.println(c);
        
    }
}
