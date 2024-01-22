package generics;

import interfaces.PrintInterface;
// import vehicle.Vehicle;

public class PairUse {
    public static<T extends PrintInterface> void print(T arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i].print();
            // System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        // Pair p1=new Pair(1, 1);
        // p1.setFirst(10);
        // System.out.println(p1.getFirst());
        // System.out.println(p1.getSecond());
        Pair<Integer,Integer>p1=new Pair<>(1,2);
    }
}
