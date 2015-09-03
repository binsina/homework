package Tryout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.nio.channels.Pipe;
import java.util.Random;
import javax.xml.soap.MessageFactory;
public class Tryout {

	   public static void main(String[] args){
	    Player Player1 = new Player();
	    Player Computer = new Player();
	    String turn = "Player1";
	    Scanner input = new Scanner(System.in);
	    String holdorroll = "roll";
	    int dieNum;

	    Player1.turnScore = 0;
	    Computer.turnScore = 0;
	    //both players are equal to zero
         JOptionPane.showConfirmDialog(null,"Are you ready to Play!!!!");
         //use prompt window screen to interact with user           
         

         
	    String message1 = "Please Enter your Name to begin the Game'?";
         JOptionPane.showInputDialog(message1);
	    message1=input.toString();
         //System.out.println("Please Enter your Name to start the Game ");
		//String fPlayer1 = input.nextLine();
	    JOptionPane.showMessageDialog(null,"Welcome to Pig Dice Game! Before we Begin lets go over the Rules");
	    JOptionPane.showMessageDialog(null,"1.The player and the computer starts out with zero points");
	    JOptionPane.showMessageDialog (null,"2. The winner is the first player to reach 100 points or more");
	    JOptionPane.showMessageDialog(null,"If the player rolls a 1 on the first roll or any roll, then the players turn is over");
	    JOptionPane.showMessageDialog(null,"The objective is to get as close to 100 points without rolling a 1");
	    JOptionPane.showMessageDialog(null,"GOOD LUCK !!!!!!!!!");
	    
	    while (Player1.getScore()<100 &&  Computer.getScore()<100){
	        System.out.println(Player1.getScore()<100 &&  Computer.getScore()<100); 
	        System.out.println("Your score is "+ Player1.turnScore + " and computer's score is " + Computer.getScore());
	        if (turn == "Player1"){
	            System.out.println("Rolling the die...");
	            dieNum = rollDie();
	            System.out.println("You rolled a " + dieNum);
	            if (dieNum == 1){
	                System.out.println("Now it's the computer's turn!");
	                JOptionPane.showMessageDialog(null,"You rolled a 1. Now it's your oppPlayer1nt's turn!");
	                Player1.turnScore = 0;
	                turn = "Computer";
	                continue;
	            }
	            Player1.turnScore += dieNum;
	            if (Player1.turnScore >= 100){
	                System.out.println("Got here!");
	                Player1.totalScore += Player1.turnScore;
	                break;
	                }
	            String message = "You rolled a " + dieNum + ".\nYour turn-score is " + Player1.turnScore + 
	                ", and your total score is " + Player1.totalScore + ". \nDo you want to 'hold' or 'roll'?";
	            holdorroll = JOptionPane.showInputDialog(message);
	            System.out.println("Is it hold?" + ("hold".equals(holdorroll)));
	            if ("hold".equals(holdorroll)){
	                Player1.totalScore = Player1.turnScore;
	                Player1.turnScore = 0;
	                System.out.println("Your score is "+ Player1.totalScore);
	                turn = "Computer";
	                continue;
	            }
	            }
	        else if (turn == "Computer")
	        {
	        Computer.totalScore = 100;
	        }
	        
	    }  
	    JOptionPane.showMessageDialog(null,"Final score: Player1:"+ " " + Player1.getScore() +" " + "Computer: " +" " + Computer.getScore());
	    if (Computer.totalScore >= 100)
	    	JOptionPane.showMessageDialog(null,"Player wins!");
	    else
	    	JOptionPane.showMessageDialog(null,"Computer wins!");
	    }       
	    public static int rollDie(){
	        //random function to output number from 1 to 6
	        int roll1 = (int)(System.currentTimeMillis() % 6)+1;
	        return roll1;
	}
	}

    class Player extends Pig{
   public int totalScore, turnScore;
    public boolean turn = false;
    public Player(){
        totalScore = 0;
    }
   
  public int getScore(){
      return totalScore;
    }
}