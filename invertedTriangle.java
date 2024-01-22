import java.util.Scanner;

public class invertedTriangle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        for(int i=0;i<rows;i++){
            int stars=rows-i;
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
