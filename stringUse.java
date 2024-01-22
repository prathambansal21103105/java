public class stringUse {
    public static void main(String[] args){
        String s="abcdefgh";
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(5));
        System.out.println(s.charAt(6));
        System.out.println(s.substring(1));
        System.out.println(s.substring(1,6));
        System.out.println(s.length());
        System.out.println(s.contains("cdef"));
        s=s+"ijk";
        System.out.println(s);
    }
}
