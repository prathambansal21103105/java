import java.util.Scanner;

public class selection {

    public static void selectionSort(int[] arr){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            int min1=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]<min1){
                    int temp=min1;
                    min1=arr[j];
                    arr[j]=temp;
                }
            }
            arr[i]=min1;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        selectionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
