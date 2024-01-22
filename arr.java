public class arr {
    public static void printarr(int[] arr){
        int n=arr.length;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max1=Math.max(max1,arr[i]);
            // System.out.println(arr[i]);
        }
        System.out.print("Largest:");
        System.out.println(max1);
        arr[0]=max1;
    }
    public static void main(String[] args){
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=i;
        }
        // printarr(arr);
        // for(int i=0;i<10;i++){
        //     System.out.println(arr[i]);
        // }
        System.out.println(arr);
    }
}
