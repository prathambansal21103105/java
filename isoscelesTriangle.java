import java.util.Scanner;

public class isoscelesTriangle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        for(int i=1;i<=rows;i++){
            int blanks=rows-i;
            for(int j=0;j<blanks;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.print(i);
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
