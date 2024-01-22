import java.util.Scanner;

public class mergeSorted {

    public static int[] merge(int arr1[], int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int[] res=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(k<n+m){
            if(i<n && j<m){
                if(arr1[i]<=arr2[j]){
                    res[k]=arr1[i];
                    i++;
                }
                else{
                    res[k]=arr2[j];
                    j++;
                }
            }
            else if(i<n){
                res[k]=arr1[i];
                i++;
            }
            else{
                res[k]=arr2[j];
                j++;
            }
            k++;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[] v1=new int[n];
        int[] v2=new int[m];
        for(int i=0;i<n;i++){
            v1[i]=s.nextInt();
        }
        for(int i=0;i<m;i++){
            v2[i]=s.nextInt();
        }
        int[] res=merge(v1,v2);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
