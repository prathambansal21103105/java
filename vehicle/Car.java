package vehicle;

public class Car extends Vehicle {
    int numGears;
    boolean isConvertible;
    public Car(int numGears, int maxSpeed){
        super(maxSpeed);
        this.numGears=numGears;
        System.out.println("Car constructor.");
    }
    public void print(){
        super.print();
        System.out.println("Vehicle numGears:"+numGears);
        System.out.println("Vehicle isConvertible:"+isConvertible);
    }
    public boolean convertible(){
        return isConvertible;
    }
    public boolean isMotorized(){
        return false;
    }
}
/*
if a data member is final we can't change it after initialization
if a function is final we can't override it
if a class is final we can't inherit it
interface is an abstract class with all its methods abstract
to inherit an interface we use implements instead of extends

 * 
 */