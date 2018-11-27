/*
Tuyen Pham
05/01/2018
Assignment 11 Fill In The Blank Question class
 */
package driver;

class FillInTheBlankQuestion extends Question{
    private String correctAnswer;
    FillInTheBlankQuestion(int point,int diff, int ansSpace, String text, String corr){
        super(point,diff,ansSpace,text);
        correctAnswer=corr;
    }
    
    public String toString(){
       return "__ "+ getQuestionText() +" ,point="+ getPoints() +" ,difficulty="+ getDifficulty() +" ,space="+ getAnswerSpace();
   }
    
     public String getcorrectAnswer(){
        return correctAnswer;
    }
     
    public String printStudentVersion(){
        return getQuestionText();
    }
    
    public String printAnswerKeyVersion(){
        return "___" + correctAnswer + getQuestionText();
    }
}

