package classes;

public class FractionUse {
    public static void temp(){
        Fraction f1=new Fraction(1, 3);
        Fraction f2=new Fraction(2, 3);
        try{
            f2.setDenominator(0);
            //every line after the line causing the exception is not executed.
        }catch(ZeroDenominatorException e){
            System.out.println("Hey don't set denominator as 0.");
        }finally{
            System.out.println("It executes everytime.");
        }
    }
    public static void main(String[] args){
        temp();
    }
    
}
