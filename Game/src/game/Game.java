/*
Tuyen Pham
TUID 915591991
Section 4
03/23/2018
Assignment 7
This assignment is to implement the game, but play will be against the computer.
 */
package game;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static String userChance;
    public static String playRound;
    public static char compMove;
    public static String computerMove;
    public static int count = 0;
    public static int countOfUserWin = 0;
    public static int countOfCompWin = 0;

    public static void gameRules(){
        System.out.println ("Knoppäng beats Björnarp and Grönby");
        System.out.println ("Björnarp beats Grönby");
        System.out.println ("Grönby beats Vilshult");
        System.out.println ("Vilshult beats Knoppäng and Björnarp");
        System.out.println ("The computer wins in the event of a tie");   
    }
    public static char computerMove(){
        String Alphabet = "KBGV";
        Random rnd = new Random();
        char compMove = Alphabet.charAt(rnd.nextInt(4));
        return compMove; 
    }
    public static String getUserInput(){
        Scanner console = new Scanner (System.in);
        while (!(userChance.equalsIgnoreCase("K")||userChance.equalsIgnoreCase("B")||userChance.equalsIgnoreCase("G")||userChance.equalsIgnoreCase("V"))){
            System.out.println ("Enter correct move: B'jornarp, 'G'ronby, 'K'noppang, or 'V'ilshult");
            userChance = console.next();    
        }
        count ++;
        if (userChance.equalsIgnoreCase("K")){
            userChance = "Knoppäng";
        }
        if (userChance.equalsIgnoreCase("B")){
            userChance = "Björnarp";
        }
        if (userChance.equalsIgnoreCase("G")){
            userChance = "Grönby";
        }
        if (userChance.equalsIgnoreCase("V")){
            userChance = "Vilshult";
        }
        return userChance;
    }
    public static String whoWon(String userChance, String computerMove){
        if (userChance.equalsIgnoreCase("Knoppäng")){
            if (computerMove.equalsIgnoreCase("Björnarp") || computerMove.equalsIgnoreCase("Grönby")){
                return "You won";
            } else{
                return "You lose";
            }
        }
        if (userChance.equalsIgnoreCase("Björnarp")){
            if (computerMove.equalsIgnoreCase("Grönby")){
                return "You won";
            } else{
                return "You lose";
            }
        }
        if (userChance.equalsIgnoreCase("Grönby")){
            if (computerMove.equalsIgnoreCase("Vilshult")){
                return "You won";
            } else{
                return "You lose";
            }
        }
        if (userChance.equalsIgnoreCase("Vilshult")){
            if (computerMove.equalsIgnoreCase("Knoppäng") || computerMove.equalsIgnoreCase("Björnarp")){
                return "You won";
            }else{
                return "You lose";
            }
        }
        return null;
    }
    
    public static void gameEnd(int count, int countOfUserWin, int countOftCompWin){
        System.out.println ("Total number of times played: " + count);
        System.out.println ("Number of time you won " + countOfUserWin);
        System.out.println ("Number of time computer won " + countOfCompWin);
    }
    
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println ("Welcome to the game of Hemnesbrim");
        System.out.println ("Would you like to play a round? yes or no");
        playRound = console.next();
        while (!playRound.equals("n")){
            gameRules();
            userChance = console.next();
            userChance = getUserInput();
            System.out.println ("Your move: " + userChance);
            compMove = computerMove();
            if (compMove == 'K'){
                computerMove = "Knoppäng";
                System.out.println ("Computer move = " + computerMove);
            }
            if (compMove == 'B'){
                computerMove = "Björnarp";
                System.out.println ("Computer move = " + computerMove);
            }
            if (compMove == 'G'){
                computerMove = "Grönby";
                System.out.println ("Computer move = " + computerMove);
            }
            if (compMove == 'V'){
                computerMove = "Vilshult";
                System.out.println ("Computer move = " + computerMove);
            }
            if (whoWon(userChance,computerMove).equalsIgnoreCase("You won")){
                countOfUserWin ++;
            } else {
                countOfCompWin ++;
            }
            System.out.println ("Would you like to continue? ");
            playRound = console.next();
        }
        gameEnd (count, countOfUserWin, countOfCompWin);
    }
    
}