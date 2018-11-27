/*
Tuyen Pham
TUID 915591991
Section 4
05/01/2018
Assignment 11 Driver
This assignment is to write a short driver program to test your Car class with a short array of Cars.
 */
package driver;

import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        Question[] questionList = new Question[3];
        String[] q1answers = {"Peter Griffin", "Scooby Doo", "Spongebob Squarepants", "Eric Cartman"};

        questionList[0] = new MultipleChoiceQuestion(10, 5, 10, "\nWho lives in a pineapple under the sea?", q1answers, "Spongebob Squarepants");
        questionList[1] = new FillInTheBlankQuestion(5, 3, 10, "___ was the 16th US President?\n", "Abraham Lincoln");
        questionList[2] = new ObjectiveQuestion(5, 3, 10, "\nWhat is the answer of 2+3?\n", "The answer is 5");

        Test myTest = new Test(questionList);
        System.out.println(myTest);

        System.out.println(myTest.printTestStudentVersion());

        System.out.println("ANSWER KEY:\n");
        System.out.println(myTest.printTestAnswerKey());

        System.out.println("Enter the name of the file you want to save the student version of the test to: ");
        String printStudentVersion = in.next();
        PrintStream out = new PrintStream(new File(printStudentVersion));
        out.println(myTest.printTestStudentVersion());

        System.out.println("Enter the name of the file you want to save the answer key version of the test to: ");
        String printTestAnswerKey = in.next();
        PrintStream out1 = new PrintStream(new File(printTestAnswerKey));
        out1.println(myTest.printTestAnswerKey());
    }
}
