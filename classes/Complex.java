package classes;
public class Complex {
    private int real;
    private int imaginary;
    public Complex(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void setReal(int real){
        this.real=real;
    }
    public void setImaginary(int imaginary){
        this.imaginary=imaginary;
    }
    public int getReal(){
        return real;
    }
    public int getImaginary(){
        return imaginary;
    }
    public void add(Complex c2){
        this.real=this.real+c2.real;
        this.imaginary=this.imaginary+c2.imaginary;
    }
    public void multiply(Complex c2){
        this.real=(this.real*c2.getReal())-(this.imaginary*c2.getImaginary());
        this.imaginary=(this.imaginary*c2.getReal())+(this.real*c2.getImaginary());
    }
    public Complex conjugate(){
        return new Complex(real,-imaginary);
    }
    public void print(){
        String k=(imaginary>=0)? "+":"";
        System.out.println(real+k+imaginary+"i");
    }
    public static Complex add(Complex c1, Complex c2){
        int real1=c1.getReal()+c2.getReal();
        int imaginary1=c1.getImaginary()+c2.getImaginary();
        return new Complex(real1,imaginary1);
    }
    public static Complex multiply(Complex c1, Complex c2){
        int real1=(c1.getReal()*c2.getReal())-(c1.getImaginary()*c2.getImaginary());
        int imaginary1=(c1.getImaginary()*c2.getReal())+(c1.getReal()*c2.getImaginary());
        return new Complex(real1, imaginary1);
    }
}
