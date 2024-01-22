import java.util.Scanner;

public class LinkedListUse {
    public static void print(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static Node<Integer> takeInput(){
        Node<Integer>head=null;
        Node<Integer>temp=null;
        Scanner s=new Scanner(System.in);
        int data=0;
        while(true){
            data=s.nextInt();
            if(data==-1){
                break;
            }
            else{
                if(head==null){
                    head=new Node<Integer>(data);
                    temp=head;
                }
                else{
                    Node<Integer>newNode= new Node<Integer>(data);
                    temp.next=newNode;
                    temp=temp.next;
                }

            }
        }
        return head;
    }
    public static Node<Integer> insert(Node<Integer> head, Node<Integer> newNode, int pos){
        if(pos==0){
            newNode.next=head;
            return newNode;
        }
        else{
            Node<Integer>temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            Node<Integer>nextNode=temp.next;
            temp.next=newNode;
            newNode.next=nextNode;
            return head;
        }
    }
    public static Node<Integer> delete(Node<Integer>head, int pos){
        if(pos==0){
            return head.next;
        }
        else{
            Node<Integer>temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return head;
        }
    }
    public static void main(String[] args){
        Node<Integer>node1=new Node<Integer>(10);
        // Node<Integer>node2=new Node<Integer>(20);
        // Node<Integer>node3=new Node<Integer>(30);
        Node<Integer>head=takeInput();
        print(head);
        System.out.println();
        head=insert(head,node1,2);
        print(head);
        System.out.println();
        head=delete(head,2);
        print(head);
        // System.out.println();
        // head=delete(head,0);
        // print(head);
        // node1.next=node2;
        // node2.next=node3;
        // System.out.println(node1.data);
        // System.out.println(node1.next);
        // System.out.println(node1.next);
        // System.out.println(node2);
        
    }
}
