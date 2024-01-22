import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class arrayList{
    public static int reduction(int x, SinglyLinkedListNode a){
        if(a==null){
            return 0;
        }
        ArrayList<Integer>v=new ArrayList<Integer>();
        while(a!=null){
            v.add(a.data);
            a=a.next;            
        }
        Collections.sort(v);
        int i=0;
        int j=v.size()-1;
        int total=v.size();
        if(total==1){
            return total;
        }
        while(true){
            if(i==j){
                break;
            }
            if(v.get(i)+v.get(j)<=x){
                total-=1;
                j--;
            }
            else{
                j--;
            }
        }
        return total;
    }
    public static int couples(int n, String line){
        int j=0;
        for(int i=0;i<line.length();i++){
            if(line.charAt(i)=='B'){
                continue;
            }
            else{
                j=i;
                break;
            }
        }
        ArrayList<Integer>girls=new ArrayList<Integer>();
        ArrayList<Integer>boys=new ArrayList<Integer>();
        int total=0;
        for(int i=j;i<line.length();i++){
            if(line.charAt(i)=='G'){
                girls.add(i);
            }
            else{
                boys.add(i);
            }
        }
        int i=0;
        j=0;
        while(i<girls.size() && j<boys.size()){
            if(girls.get(i)<boys.get(j)){
                total++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return total;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        // int n=s.nextInt();
        // String line=s.nextLine();
        // System.out.println(couples(n,line));
        int x=s.nextInt();
        int n=s.nextInt();
        SinglyLinkedListNode head=new SinglyLinkedListNode(0, null);
        SinglyLinkedListNode temp=new SinglyLinkedListNode(0, null);
        for(int i=0;i<n;i++){
            int val=s.nextInt();
            if(i==0){
                head.data=val;
                temp=head;
            }
            else{
                SinglyLinkedListNode extra=new SinglyLinkedListNode(val, null);
                temp.next=extra;
                temp=temp.next;
            }
        }
        System.out.println(reduction(x,head));
    }
}
