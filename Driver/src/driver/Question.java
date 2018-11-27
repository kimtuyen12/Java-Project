/*
Tuyen Pham
05/01/2018
Assignment 11 Question class
 */
package driver;

class Question {
    private int points;
    private int difficulty;
    private int answerSpace;
    private String questionText;
    
      //general constructor
    public Question(int points, int difficulty, int answerSpace, String questionText) {
        this.points = points;
        this.difficulty = difficulty;
        this.answerSpace = answerSpace;
        this.questionText = questionText;
    }

    //prints all aspects of the string
    public String toString() {
        return "points = " + points + ", difficulty=" + difficulty + ", answerSpace=" + answerSpace + ", questionText=" + questionText;
    }
    
    public int getPoints(){
        return points;
    }
    
     public int getDifficulty(){
        return difficulty;
    }
     
    public int getAnswerSpace(){
        return answerSpace;
    }
    
     public String getQuestionText(){
        return questionText;
    }
     
    public String printStudentVersion(){
        return getQuestionText();
    }
    
    public String printAnswerKeyVersion(){
        return "";
    }
}
