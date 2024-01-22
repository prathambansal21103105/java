import java.util.Scanner;

public class patternQuestion {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        for(int i=0;i<rows;i++){
            int st=i;
            for(int j=0;j<rows;j++){
                char c=(char)('A'+(st+j)%26);
                System.out.print(c);
            }
            System.out.println(" ");
        }
    }
}
