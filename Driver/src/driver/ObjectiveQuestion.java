/*
Tuyen Pham
05/01/2018
Assignment 11 Objective Question class
 */
package driver;

class ObjectiveQuestion extends Question{
   private String correctAnswer;
   ObjectiveQuestion(int point,int diff, int ansSpace, String text, String corr){
       super(point,diff,ansSpace,text);
       correctAnswer=corr;
   }
  
    public String getcorrectAnswer(){
        return correctAnswer;
    }
    
    
    public String printStudentVersion(){
        return getQuestionText();
    }
    
    public String printAnswerKeyVersion(){
        return getQuestionText() + "\n" + correctAnswer;
    }
}
