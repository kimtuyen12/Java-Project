/*
Tuyen Pham
TUID 915591991
Section 4
04/16/2018
Assignment 10
This assignment is to write a simple main driver method to test your fraction class and each of its methods.
 */
package fraction;

public class Fraction {
   private int numerator,denominator;
   
   //constructer
   public Fraction(int n,int d){
       check(d);
       this.numerator=n;
       this.denominator=d;
       reduce();
   }
  
   //If d is 0, throw an ArithmeticException
   public void check(int d){
       if(d==0){
           throw new ArithmeticException("Denominator shouldn't be zero");
       }
   }
   //Returns the value of the numerator field
   public int getNum(){
       return this.numerator;
   }
   //   Returns the value of the denominator field

   public int getDenom(){
       return this.denominator;
   }
   //Sets the numerator field to the value given in n

   public void setNum(int n){
       this.numerator=numerator;
   }
   //Sets the denominator field to the value given in d. If d is 0, throw an ArithmeticException.
   public void setDenum(int d)   {
       check(d);
       this.denominator=d;
   }
   //Returns the fraction that is the sum of the subject of the method and a.
   public Fraction add(Fraction a){
       if(a==null){
           return null;
       }
      
       Fraction result=new Fraction(1,1);
       result.numerator=this.numerator*a.denominator+this.denominator*a.numerator;
       result.denominator=this.denominator*a.denominator;
       result.reduce();
       //System.out.println(result);
       return result;
      
   }
   //Returns true if subject of method and argument of call are equal.
   // Fractions a/b and c/d are equal if a*d and b*c are equal or since the fractions are normalized, if a==c and b==d.
   public boolean equals(Fraction a){
          
       return this.numerator*a.denominator==this.denominator*a.numerator;
   }
   //reducting fraction
   public void reduce(){
       int r=gcd(this.numerator,this.denominator);
       this.numerator/=r;
       this.denominator/=r;
   }
   //gcd
   int gcd(int x, int y)
    {
        int r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
   //toString()
   public String toString(){
       return this.numerator+"/"+this.denominator;
   }
 
  
}

