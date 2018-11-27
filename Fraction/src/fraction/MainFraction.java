/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author Tuyen Pham
 */
public class MainFraction {
      public static void main(String args[]){
       Fraction f1=new Fraction(8,4);
       Fraction f2=new Fraction(4,16);
       System.out.println("F1="+f1);
       System.out.println("F2="+f2);
       System.out.println("Checking to see if F1 is equal to F2: " + f1.equals(f2));
       System.out.println(f1+"+"+f2+"="+f1.add(f2));
   }
}
