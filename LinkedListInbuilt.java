import java.util.LinkedList;

public class LinkedListInbuilt {
    public static void main(String[] args){
        LinkedList<Integer>list=new LinkedList<>();
        list.add(10);
        list.add(30);
        list.addFirst(40);
        list.set(2,100);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
