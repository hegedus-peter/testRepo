package net.allround.tapsol.collator.jenkinsproject;

/**
 *
 * @author hegedusp
 */
public class Main {
    
    public static double divide(double a, double b) //return a/b
    {
        if(0==b)
            throw new ArithmeticException();
        return a/b;
    }    
    
     public static double add(double a, double b) //return a+b
    {
        return a+b;
    } 
    
    public static void main(String[] args) {
       double retVal = divide(1,0);
       double add = add(1,2);
        System.out.println("The result: " + retVal );
    }

}
