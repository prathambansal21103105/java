public class quickSort {
    public static int partition(int arr[], int st, int end){
        int val=arr[st];
        int count=0;
        for(int i=st;i<=end;i++){
            if(arr[i]<val){
                count++;
            }
        }
        int temp=arr[st+count];
        arr[st+count]=arr[st];
        arr[st]=temp;
        int i=st;
        int j=st+count+1;
        while(i<count+st && j<end+1){
            if(arr[i]>=val && arr[j]<val){
                int temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
                i++;
                j++;
            }
            else if(arr[i]<val && arr[j]<val){
                i++;
            }
            else if(arr[i]>=val && arr[j]>=val){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        return count+st;
    }
    public static void quicksort(int arr[], int st, int end){
        if(st<end){
            int pivot=partition(arr,st,end);
            quicksort(arr, st, pivot);
            quicksort(arr, pivot+1, end);
        }
        else{
            return;
        }
    }
    public static void main(String[] args){
        int[] arr={7,1,6,2,5,3,4};
        quicksort(arr,0,arr.length-1);
        // int val=partition(arr, 0, 6);
        // System.out.println(val);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
}
