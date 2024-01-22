package vehicle;

// import vehicleTemp.Truck;

public class vehicleUse {
    public static void main(String[] args){
        // Vehicle v1=new Vehicle();
        // System.out.println(" ");
        // Car c1=new Car(10,100);
        // System.out.println(" ");
        // Truck t1=new Truck();
        // System.out.println(" ");

        // v1.print();
        // c1.numGears=10;
        // c1.color="Black";
        // c1.isConvertible=true;
        // c1.setMaxSpeed(200);
        // c1.print();
        // t1.color="Black";
        // t1.print();
        // c1.printCar();
        // c1.maxSpeed=200;
        // c1.setMaxSpeed(300);
        // System.out.println(c1.getMaxSpeed());
        Vehicle k1=new Car(10,100);
        Vehicle v=new Car(10,100);
        // System.out.println(v.convertible()); //error because every vehicle doesn't have convertible function
        // v.print(); //it calls the print function of the car sub class though it is a reference of vehicle class
        // when we call convertible function it doesn't compile
        // print function compiles because it is present in vehicle base class
        // when it comes to calling the function it is decided on runtime which will be called it was a car object so print function of car was called instead of print function of vehicle class
    }
}
