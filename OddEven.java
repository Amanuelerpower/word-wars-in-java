/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddeven;

import java.util.Scanner;
import java.util.Random;

public class OddEven{
static int sum ;
static int firstplayer;
static int sum1;
static int val;
public static void main(String[] args){
Prompt();
Middle();
loops yo = new loops();
yo.Again();
}

public static void Prompt( ){
System.out.println(" Lets play a game called Odds and Evens \n \n");
System.out.print("What is your name:     ");
    
Scanner name = new Scanner(System.in);
String just = name.nextLine();
System.out.println("Good luck " +just);
System.out.print("\n To play the Game either enter (O) or (E) "
	+" to play as an even or odd");




}

public static void Middle(){
Scanner be = new Scanner(System.in);
String is = be.next();

if(is.equalsIgnoreCase("O")){
    
	System.out.println("\n \n You choose odds so the sum of an odd "
		+" is the winner between you and the computer chose a number between 0 and 5  \n");
			
		Scanner in = new Scanner(System.in);
		int firstplayer = in.nextInt();
			

		Random rand = new Random();
                    System.out.println("-----");
                int val = (int)(Math.random() * 6);
		  

	
                    sum1 = firstplayer + val;

		if( firstplayer>= 0 && firstplayer < 6){
		if(sum % 2 == 0){
                    System.out.println("Your number is " +firstplayer +" the computer chose " +val + " "
                            + "Your number " +firstplayer + " + " +val +" equals " +(firstplayer + val) + " ! ");
 			System.out.println("Hooray you won!!!");
		}
		else {
		 System.out.println("Your number is " +firstplayer +" the computer chose " +val + " "
                            + "Your number " +firstplayer + " + " +val +" equals " +(firstplayer + val) + " ! ");	
                    System.out.println("Ooops you lost try again!");
			}

	}else{
                    System.out.println("Enter any  the numbers between 0 and 5 only ");
                }
}

        

 if(is.equalsIgnoreCase("E")){
System.out.println("\n \n You choose evens so the sum of an even "
		+" is the winner between you and the computer chose a number between 0 and 5 \n \n");
			
		Scanner sup = new Scanner(System.in);
		firstplayer = sup.nextInt();
			

	
	int random = (int)(Math.random() * 6);	
        
       int sum;
       
		
		

		sum = firstplayer + random;
                    if( firstplayer>= 0 && firstplayer < 6){
		if(sum % 2 == 0){
 		
                     System.out.println("Your number is " +firstplayer +" the computer chose " +random + " "
                            + "Your number " +firstplayer + " + " +val +" equals " +(firstplayer + random) + " ! ");
                    System.out.println("Hooray you won!!! ");
		}
		else {
		 System.out.println("Your number is " +firstplayer +" the computer chose " +random + " "
                            + "Your number " +firstplayer + " + " +random +" equals " +(firstplayer + random) + " ! ");	
                    System.out.println("Oops you lost try again");
			}


	}
                    else{
    
                    System.out.println("Enter any  other character and then press enter to exit!!!");
                
}
    
}

            
        }

public static class loops{
    public void Again(){
            
        Scanner exit = new Scanner(System.in);

        System.out.println("Would you like to play again press (y) for yes "
                     +"any other key for no.");
            String dis = exit.nextLine();
if(dis.equalsIgnoreCase("y")){
    for (int i = 0; dis.equalsIgnoreCase("y");) {
       
        {
            if (i > 0 ) {
                
                
                            if (dis.equalsIgnoreCase("y")){
                    Prompt();
                    Middle();
                   
                }else{
                    System.out.println("Thank you for playing");
                
                }
            }
            if (i == 0) {
            Prompt();
   
            Middle();    
            i++;
            }
            System.out.println("Would you like to play again press (y) for yes and other "
                    + "keys for no.");
            dis = exit.next();
            dis.equalsIgnoreCase(dis);
   
    }
    }if (!(dis.equalsIgnoreCase("y"))) {
             System.out.println("Thank you hope to see you soon! "
            + " "); 
        }
}       
{
          
            }
    }
}
}

