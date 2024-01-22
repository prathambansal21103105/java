package vehicle;

import interfaces.PrintInterface;

public abstract class Vehicle implements PrintInterface {
    protected String color;
    private int maxSpeed;
    public Vehicle(int maxSpeed){
        this.maxSpeed=maxSpeed;
        System.out.println("Vehicle constructor.");
    }
    public void setMaxSpeed(int speed){
        maxSpeed=speed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void print(){
        System.out.println("Vehicle color:"+color);
        System.out.println("Vehicle speed:"+maxSpeed);
    }
    public abstract boolean isMotorized();
}
//friendly is only visible inside the package
//protected is visible to all subclasses
//if we have an abstract class we can't make objects of that class but make objects of subclasses
/*
order-
public
protected
default/friendly
private
 * 
 */