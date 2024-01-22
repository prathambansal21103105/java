public class explicitDataType {
    public static void main(String[] args){
        int i=107;
        long l=i;
        l=123456789000L;
        i=(int)l;
        System.out.println(i);
        System.out.println(l);
        i=107;
        char c=(char)i;
        System.out.println(c);
    }
}
