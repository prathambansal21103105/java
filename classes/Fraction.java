package classes;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator,int denominator){
        // if(denominator==0){
        //     Exception e=new Exception("denominator can't be 0");
        //     throw e;
        // }
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }
    public void add(Fraction f2){
        this.numerator=this.numerator*f2.getDenominator()+this.denominator*f2.getNumerator();
        this.denominator=this.denominator*f2.getDenominator();
        simplify();
    }
    public void multiply(Fraction f2){
        this.numerator=this.numerator*f2.getNumerator();
        this.denominator=this.denominator*f2.getDenominator();
        simplify();
    }
    private void simplify(){
        int gcd=1;
        int smaller=Math.min(numerator,denominator);
        for(int i=2;i<=smaller;i++){
            if(numerator%i==0 && denominator%i==0){
                gcd=i;
            }
        }
        numerator/=gcd;
        denominator/=gcd;
    }
    public void setNumerator(int numerator){
        this.numerator=numerator;
        simplify();
    }
    public void setDenominator(int denominator) throws ZeroDenominatorException{
        if(denominator==0){
            ZeroDenominatorException e=new ZeroDenominatorException();
            throw e;
        }
        this.denominator=denominator;
        simplify();
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void print(){
        System.out.println(numerator+"/"+denominator);
    }

}
