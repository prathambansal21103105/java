package classes;
public class DynamicArray {
    private int data[];
    private int nextIndex;

    private DynamicArray(){
        data=new int[5];
        nextIndex=0;
    }
    public int size(){
        return nextIndex;
    }
    public void add(int element){
        if(nextIndex==data.length){
            restructure();
        }
        data[nextIndex]=element;
        nextIndex++;
    }
    public void set(int index, int element){
        if(index>nextIndex){
            return;
        }
        if(index<nextIndex){
            data[index]=element;
        }
        else{
            add(element);
        }
    }
    public int get(int index){
        if(index>=nextIndex){
            return -1;
        }
        return data[index];
    }
    public boolean isEmpty(){
        return nextIndex==0;
    }
    public int removeLast(){
        if(isEmpty()){
            return -1;
        }
        else{
            nextIndex--;
            int val=data[nextIndex];
            data[nextIndex]=0;
            return val;
        }
    }
    private void restructure(){
        int temp[]=data;
        data=new int[data.length*2];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }
}
