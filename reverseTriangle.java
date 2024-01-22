import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                int blanks=rows-i-1;
                if(j<blanks){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
