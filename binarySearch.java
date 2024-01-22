import java.util.Scanner;

public class binarySearch {

    public static int binary(int[] arr, int target){
        int st=0;
        int end=arr.length;
        int pos=end;
        while(st<=end){
            int mid=st+((end-st)>>1);
            if(arr[mid]>=target){
                pos=Math.min(pos,mid);
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        if(arr[pos]==target){
            return pos;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        int val=binary(arr,target);
        System.out.println(val);
    }

}
