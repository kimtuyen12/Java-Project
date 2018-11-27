/*
Tuyen Pham
05/01/2018
Assignment 11 Multiple Choice Question class
 */
package driver;

class MultipleChoiceQuestion extends Question{
    private String[] possibleAnswers;
    private String correctAnswer;
    
    MultipleChoiceQuestion(int point,int diff, int ansSpace, String text, String[] possAnswers, String corr){
        super(point,diff,ansSpace,text);
        possibleAnswers = possAnswers;
        correctAnswer=corr;
   }
  
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    
    
    public String printStudentVersion(){
        String a = getQuestionText(); 
        for(int i = 0; i < possibleAnswers.length; i++)
           a += "\n" + "     " + (i+1) + ": " + possibleAnswers[i];
     
       return a;
    }
    
    public String printAnswerKeyVersion(){
        String a = getQuestionText(); 
        for(int i = 0; i < possibleAnswers.length; i++){
            if(possibleAnswers[i].equals(correctAnswer)){
                a += "\n" + "     " + (i+1) + ": " + "****" + correctAnswer + "****";
                
            }
            else
               a += "\n" + "     " + (i+1) + ": " + possibleAnswers[i]; 
        }
        return a;
        
    }
}

