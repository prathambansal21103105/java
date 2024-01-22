import java.util.Scanner;
public class add2num {
    public static void main(String [] args){
        int i=10;
        int j=15;
        short s=123;
        long l=12345;
        char c='a';
        boolean b=true;
        System.out.println(i);
        System.out.println(j);
        System.out.println(s);
        System.out.println(l);
        System.out.println(c);
        System.out.println(b);
        Scanner scan=new Scanner(System.in);
        i=scan.nextInt();
        j=scan.nextInt();
        System.out.println(i+j);

    }
}
/*
short 2 bytes
int 4 bytes
long 8 bytes
float 4 bytes
double 8 bytes
char 2 bytes
boolean 1 bytes
*/