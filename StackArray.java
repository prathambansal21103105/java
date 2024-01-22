public class StackArray {
    private int data[];
    private int top;

    public StackArray(){
        data=new int[10];
        top=-1;
    }

    public StackArray(int capacity){
        data=new int[capacity];
        top=-1;
    }

    public boolean isEmpty(){
        return top==-1;
    };

    public int size(){
        return top+1;
    };

    public int top() throws StackEmptyException{
        if(size()==0){
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        return data[top];
    };

    public int pop() throws StackEmptyException{
        if(size()==0){
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        int temp=data[top];
        top--;
        return temp;
    }



}
