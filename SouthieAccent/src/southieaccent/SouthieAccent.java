/*
Tuyen Pham
TUID 915591991
Section 4
03/30/2018
Assignment 8
This assignment is to help Brody transforms it so that it when read, the speaker would have a South Boston (or Southie) accent.
 */
package southieaccent;
import java.io.*;
import java.util.*;

public class SouthieAccent {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner (new File ("Jawsscript.txt"));
        
            String output = "";

            while (input.hasNext()){
                String currentWord = input.next();
                output += convert(currentWord) + " ";

            }
            PrintStream out = new PrintStream (new File ("out.txt"));
            out.println(output);
        
    }
    
     public static String replaceCharAt(String s, int pos, char c){
        return s.substring(0, pos) + c + s.substring(pos+1);
    }
    
    public static String replace (String s){
        for (int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                if(s.charAt(i+1) == 'r'){
                    s = replaceCharAt(s, i+1,'h');
                } else if(s.charAt(i+1) == 'R'){
                    s = replaceCharAt(s, i+1,'H');
                }
            }
        }
        return s;
    }
    
    public static String append (String s){
        StringBuffer sb;
        if (s.equals("a")){
            return s;
        } else if (s.endsWith("a")){
            sb = new StringBuffer (s);
            sb.append("r");
            return (sb.toString()); 
        }
        return s;
    }
    
    public static String replaceWord (String s){
        s = s.replace("very","wicked");
        return s;   
    }
    
    public static String exception1 (String s){
        StringBuffer sb;
        if (s.endsWith("r")){
            sb = new StringBuffer (s);
            sb.deleteCharAt (s.length() - 1);
            if (sb.toString().endsWith("ee")||sb.toString().endsWith("i")){
                sb.append("yah");
                return (sb.toString());
            } 
        }
      
        return s;
    }

    
    public static String exception2 (String s){
        StringBuffer sb;
        if (s.endsWith("r")){
            sb = new StringBuffer (s);
            sb.deleteCharAt (s.length() - 1);
            if (sb.toString().endsWith("oo")){
                sb.append("wah");
                return sb.toString();
            }
        }
        
        return s;   
    }
    
    public static String convert (String s){
            
            s = exception1(s);
            s = exception2(s);
            s = replaceWord(s);
            s = replace(s);
            s = append(s);
            
        return s;
    }
    
   
}
