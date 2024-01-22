package classes;
// import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args){
        Student s1=new Student("Pratham Bansal",105);
        Student s2=new Student("Anisha Singla",105);
        // s1.name="Pratham Bansal";
        // s1.setRollNumber(105);
        // s2.name="Anisha Singla";
        // s2.setRollNumber(105);
        // System.out.println(s1.name);
        // System.out.println(s1.getRollNumber());
        // System.out.println(s2.name);
        // System.out.println(s2.getRollNumber());
        s1.print();
        s2.print();
        // s1.getNumber();
        System.out.println(Student.numStudents);
    }
}
