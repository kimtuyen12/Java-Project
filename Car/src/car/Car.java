/*
Tuyen Pham
TUID 915591991
Section 4
04/16/2018
Assignment 10
This assignment is to write a short driver program to test your Car class with a short array of Cars.
 */
package car;

public class Car {
   String make,model;
   int year;
   double MPG,milesDriven;
   private double fuelCapacity,fuelRemaining;
   
   //constructer
   public Car(String make,String model,int year,double MPG,double fuelCapacity,double fuelRemaining){
       this.make=make;
       this.model=model;
       this.year=year;
       this.MPG=MPG;
       this.fuelCapacity=fuelCapacity;
       this.fuelRemaining=fuelRemaining;
   }
   
   //fillTank
   public void fillTank(double m){
       //if tank is not full
       if(m+this.fuelRemaining<=this.fuelCapacity){
           this.fuelRemaining=this.fuelRemaining+m;
       }
       //tank is full
       else{
           this.fuelRemaining=this.fuelCapacity;
       }
   }
   
   //drive function
   public void drive(double m){
       //adding it to milesDriven
       this.milesDriven=this.milesDriven+m;
       //reducting the fuel
       this.fuelRemaining=this.fuelRemaining-(m/this.MPG);
   }
   //getFuelRemaining()
   public double getFuelRemaining(){
       return this.fuelRemaining;
   }
   
   //toString() method as printCar
   public String toString(){
       String result="";
       result+=(this.make+" "+this.model+" "+this.year);
       result+=("\nMPG : "+this.MPG);
       result+=("\nTotal Capacity: "+this.fuelCapacity);
       result+=("\nFuelRemaining: "+this.fuelRemaining);
       result+=("\nmilesDriven: "+this.milesDriven);
      
       return result;
   }
   

}



