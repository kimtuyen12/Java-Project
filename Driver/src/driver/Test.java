/*
Tuyen Pham
05/01/2018
Assignment 11 Test class
 */
package driver;

class Test{
   private Question[] questions;
   private int totalPoints;

   public Test(Question [] questions){
       this.questions=questions;
       for(int i=0;i<questions.length;i++){
           totalPoints += questions[i].getPoints();
       }
   }
   
   public String toString(){
       return "Number of question :"+ questions.length+ " Total Points :"+ totalPoints;
   }
   
   public String printTestStudentVersion(){
       String output = "";
       
       for (int a = 0; a < questions.length; a++)
           output += questions[a].printStudentVersion() + "\n";
       
       return output;
   }
   
   public String printTestAnswerKey(){
       String output = "";
       
       for (int a = 0; a < questions.length; a++)
           output += questions[a].printAnswerKeyVersion() + "\n\n";
       
       return output;
   }
}