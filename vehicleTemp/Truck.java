package vehicleTemp;
import vehicle.Vehicle;

public class Truck extends Vehicle {
    int maxLoadingCapacity;
    public Truck(){
        super(100);
        System.out.println("Truck constructor");
    }
    public void print(){
        super.print();
        System.out.println("Max loading Capacity:"+maxLoadingCapacity);
    }
    public boolean isMotorized(){
        return false;
    }
}