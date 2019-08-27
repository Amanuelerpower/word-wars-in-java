# word-wars-in-java
This code has errors in it the code is for a "word wars" game where users  select words from an array of letters and the constanants are supposed to be removed and players compete for the most points if you could kindly find the reason for the errors in this code.moved
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.word.wars;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 19014293
 */
public class java {
    
    static String firstplayer ;
     static String secondplayer;
    static String first_word = " ";
    static String second_word = " ";
    static char isChar;
    static int first_points;
    static int second_points;
    static String admit;
    static String authentic = "no";
    static String temporary;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Intro();
        UserInput();
    }
    
    public static void Intro(){
        System.out.println("Welcome to the Water Wars Game! "
                + "\n"
                + "\n"
                + "Press (1) to start the game.");
        
    }
    
    public static void UserInput(){
        Scanner kb = new Scanner(System.in);
        
       int option = kb.nextInt();
       Scanner yo = new Scanner(System.in);
       
       Scanner is = new Scanner(System.in);
       
       if(option == 1)
        {
            System.out.println("Enter player 1 name: ");
            String name1 = yo.nextLine();
            
            System.out.println("Enter player 2 name: ");
            String name2 = is.nextLine();
            
            
            System.out.println("LETS PLAY WORD WARS !!!");
            
            String lettersArray[] ={"a","b","c","d","e","f","g","h",
                "i","j","k","l","m","n","o","p","q","r","s",
                "t","u","v","w","x","y","z"};
            String vowels[] = {"a","e","i","o","u"};
            
            while (!first_word.equals("???") || !first_word.equals("???")) {
                System.out.println("Alphabet letters left: " +Arrays.toString(lettersArray));
                System.out.println(name1 +" Enter your word: ");
                
               first_word = is.nextLine();
               
                if (!first_word.equals("???")) {
                    System.out.println("Enter (y) if both players agree on the word");
                   admit = kb.nextLine();
                   
                    if (admit.equals("y")) {
                        while (authentic.equals("no")) {
                        for (int y = 0; y < first_word.length(); y++) {
                            isChar = first_word.charAt(y);
                            temporary = String.valueOf(isChar);
                            List<String> list = Arrays.asList(lettersArray);
                            if (list.contains(temporary) || temporary.equals("?")) {
                                authentic = "yes";
                            }
                            else{
                                
                                System.out.println(" ERROR YOU ENTERED A WORD THAT IS NOT VALID CONTAINS LETTERS"
                                        + " YOU CANNOT INPUT . PLEASE ENTER ANOTER WORD!!!");
                            
                                authentic = "no";
                                
                                System.out.println(firstplayer +" Enter you");
                                first_word = kb.nextLine();
                                
                                System.out.println("Enter (y) if both players agree on the word ");
                                
                                admit = kb.nextLine();
                                
                                if (admit.equals("y")) {
                                    if (authentic.equals("yes")) {
                                        first_points = first_points + first_word.length();
                                        
                                        for (int i = 0; i < first_word.length(); i++) {
                                            isChar = first_word.charAt(i);
                                            temporary = String.valueOf(isChar);
                                            
                                            
                                            List<String>  doing = new ArrayList <String>(Arrays.asList(vowels));
                                            
                                            if (doing.contains(temporary)) {
                                                vowels = doing.toArray(vowels);
                                                
                                            }
                                            else{
                                                vowels = doing.toArray(vowels);
                                            
                                                   List<String> doing2 = new ArrayList<String>(Arrays.asList(lettersArray));
                                                   
                                                   if (doing2.contains(temporary)) {
                                                       doing2.remove(temporary);
                                                       lettersArray = doing2.toArray(lettersArray);
                                                       
                                                   }    
                                            }
                                        }
                                    }
                                }
                            }
                    authentic = "no";  
                            if (!first_word.equals("???")){
                                System.out.println("Alphabet letters left:"  +Arrays.toString(lettersArray));
                                System.out.println(secondplayer +" enter your word ");
                                second_word = kb.nextLine();
                                
                                System.out.println("Enter  (y) if both playerss agree on the the word");
                                admit = kb.nextLine();
                                if(admit.equals("y")){
                                    while (authentic.equals("y")) {
                                        while (authentic.equals("no")) {
                                            for (int i = 0; i < 10; i++) {
                                                isChar = second_word.charAt(i);
                                                temporary = String.valueOf(isChar);
                                                
                                                List<String> values = Arrays.asList(lettersArray);
                                                if(values.contains(temporary) || temporary.equals("?")){
                                                    authentic = "yes";
                                                }
                                                else{
                                                    System.out.println("ERROR YOU ENTERED A WORD THAT IS NOT VALID CONTAINS LETTERS"
                                        + " YOU CANNOT INPUT . PLEASE ENTER ANOTER WORD!!!");
                                                    authentic = "no";
                                                    
                                                    System.out.println( secondplayer +"  Enter your word : ");
                                                }
                                            second_word = kb.nextLine();
                                            
                                                System.out.println("Enter (y) if both players agree on the word ");
                                                
                                                admit = kb.nextLine();
                                            
                                            }
                                        }
                                    }
                                    if (admit.equals("y")) {
                                        if (authentic.equals("yes")) {
                                            
                                            second_points = second_points + second_word.length();
                                            
                                            for (int i = 0; i < second_word.length(); i++) {
                                                
                                                isChar = second_word.charAt(i);
                                                temporary = String.valueOf(isChar);
                                                List <String> doing1 = new ArrayList<String>(Arrays.asList(vowels));
                                                
                                                if (doing1.contains(temporary)) {
                                                    vowels = doing1.toArray(vowels);
                                                }
                                                else{
                                                    vowels = doing1.toArray(vowels);
                                                    
                                                    // Scan an Array of arrays for letters
                                                    
                                                    List<String>  isdoing  = new ArrayList<String> (Arrays.asList(lettersArray));
                                                    if (isdoing.contains(temporary)) {
                                                        isdoing.remove(temporary);
                                                        lettersArray = isdoing.toArray(lettersArray);
                                                        
                                                    }
                                                }
                                            }
                                        }
                                        
                                    }
          
                                }
                            }
                          }    
                        }
                        
                        
                    }
                }
                
               // showing who the winner is 
               
                if (first_points > second_points) {
                    System.out.println("WINNER OF THE GAME IS:  " +firstplayer +"  with of a score of " +first_points );
                    System.out.println("YOUR NAME HAS BEEN SAVED TO THE HALL OF FAME!!!!");
                    System.out.println("THE GAME IS OVER THANK YOU FOR PLAYING WORD WARS!!!");
                }
                if (second_points > first_points) {
                    System.out.println("WINNER OF THE GAME IS:  " +secondplayer +"  with of a score of " +second_points );
                    System.out.println("YOUR NAME HAS BEEN SAVED TO THE HALL OF FAME!!!!");
                    System.out.println("THE GAME IS OVER THANK YOU FOR PLAYING WORD WARS!!!");
                }
            }
        }
       
       
       
        
        
    }
    
}
// Output is this  

Press (1) to start the game.
1
Enter player 1 name: 
josh
Enter player 2 name: 
mandy
LETS PLAY WORD WARS !!!
Alphabet letters left: [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
josh Enter your word: 
yellow
Enter (y) if both players agree on the word
Alphabet letters left: [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
josh Enter your word: 
ben
Enter (y) if both players agree on the word
y
Alphabet letters left:[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
null enter your word 

