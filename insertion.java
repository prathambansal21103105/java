import java.util.Scanner;

public class insertion {

    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] v=new int[n];
        for(int i=0;i<n;i++){
            v[i]=s.nextInt();
        }
        insertionSort(v);
        for(int i=0;i<n;i++){
            System.out.print(v[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
