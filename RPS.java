package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RPS {
	
	static int rock = 1;
	static int paper = 2;
	static int scissors = 3;
	
	
	public static void main( String[] args) {
		
		System.out.println("Play Game");
		System.out.println("Select 1, 2 or 3, for Rock, Paper, Scissors");
		Scanner personChoice = new Scanner(System.in);
		int a = personChoice.nextInt();
		
		Random randomNumber = new Random();
		int x = randomNumber.nextInt(3) + 1;
		playgame();
	}
	public static String playgame() {
			 int randomNumber = 0;
			if(randomNumber == rock){
		         int personChoice = 0;
				if(personChoice == rock){
		          return "TIE!";
		     }    else if(personChoice == paper){
		            return"You win! :) ";
		     }    else if(personChoice == scissors){
		            return "You lose! :( ";
		     }
		    
		     else if(randomNumber == paper){
		         if(personChoice == rock){
		           return"You lose! :( ";
		     }   else if(personChoice == scissors){
		             return"You win! :) ";
		     }   else if(personChoice == paper){
		             return"TIE!";
		     } 

		     else if(randomNumber == scissors){
		         if(personChoice == rock){
		             return"You win! :) ";
		     }   else if(personChoice == scissors){
		             return" TIE!";
		     }   else if(personChoice == paper){
		            return" You lose! :( ";		
		}		
		}
	}
	}			
}
}
