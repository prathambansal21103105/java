package classes;

public class Student {

    private String name;
    private final int rollNumber;
    static int numStudents;
    // final data members can be initialized as soon as they are declared;

    public Student(String name ,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
        numStudents++;
    }
    
    public void print(){
        System.out.println(name+":"+rollNumber);
    }

    public void getNumber(){
        System.out.println(numStudents);
    }
}

/*
friendly - visible in the same package
public - visible everywhere
private - can not be changed anywhere else except the class itself
 * 
 */
// public Student(){
//     rollNumber=0;
// }
// public void setRollNumber(int roll){
//     if(roll<=0){
//         return;
//     }
//     rollNumber=roll;
// }
// public int getRollNumber(){
//     return rollNumber;
// }