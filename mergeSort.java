public class mergeSort {
    public static void merge(int arr[], int st, int mid, int end){
        int arr1[]=new int[end-st+1];
        int i=st;
        int j=mid;
        int k=0;
        while(i<mid && j<end+1){
            if(arr[i]<=arr[j]){
                arr1[k]=arr[i];
                i++;
            }
            else{
                arr1[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            arr1[k]=arr[i];
            i++;
            k++;
        }
        while(j<end+1){
            arr1[k]=arr[j];
            j++;
            k++;
        }
        for(int iter=0;iter<end-st+1;iter++){
            arr[st+iter]=arr1[iter];
        }
    }
    public static void mergesort(int arr[], int st, int end){
        if(st<end){
            int mid=st+(end-st)/2;
            mergesort(arr, st, mid);
            mergesort(arr, mid+1, end);
            merge(arr,st,mid+1,end);
        }
        else{
            return;
        }
    }
    public static void main(String[] args){
        int[] arr={7,1,6,2,5,3,4};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }   
}
