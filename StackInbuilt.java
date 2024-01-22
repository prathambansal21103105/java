import java.util.Stack;

public class StackInbuilt {
    public static void main(String[] args){
        Stack<Integer>stk=new Stack<Integer>();
        stk.push(1);
        System.out.println(stk.peek());
        int val=stk.pop();
        System.out.println(val);
        if(stk.isEmpty()){
            System.out.println("Empty");
        }
    }
}
