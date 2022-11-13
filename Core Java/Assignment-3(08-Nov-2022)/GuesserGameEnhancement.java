package ineuron.ai.corejava.GuesserGame;
//Enhancements
//1. Tie between Players will be resolved by Third umpire based on past records.(Probability p1=0.35, p2=0.40, p3=0.25)
//2.Guesser and player  can select number only in provided range(10-50) otherwise screen will prompt again
//to guess the number  in the given range
import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		do{
		System.out.println("Guesser kindly guess the number in the range of 10 and 50");
		guessNum=scan.nextInt();
		}while(!(guessNum>=10 && guessNum<=50));
		return guessNum;
	}	
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		do {
		System.out.println("Player kindly guess the number in the range of 10 and 50");
		guessNum=scan.nextInt();
		}while(!(guessNum>=10 && guessNum<=50));
		return guessNum;
	}
}

class FieldUmpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		ThirdUmpire tu=new ThirdUmpire(numFromPlayer1,numFromPlayer2,numFromPlayer3);
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				tu.compareBetweenThree();
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				tu.compareBetweenTwo(numFromPlayer2,numFromPlayer3);
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				tu.compareBetweenTwo(numFromPlayer1,numFromPlayer3);
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				tu.compareBetweenTwo(numFromPlayer2,numFromPlayer3);
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	
}
class ThirdUmpire{
	double score=0;
	FieldUmpire f=new FieldUmpire();
	int tieScore1;
	int tieScore2;
	int tieScore3;
	
	public ThirdUmpire() {
		
	}
	public ThirdUmpire(int p1, int p2,int p3) {
		tieScore1=p1;
		tieScore2=p2;
		tieScore3=p3;
		
	}
	public void compareBetweenThree(){
		System.out.println("Player 2 is the winner based on past records");
	}
	public void compareBetweenTwo(int score1,int score2) {
		if(tieScore1==score1 && tieScore2==score2) {
		System.out.println("Player 2 is the winner based on past records");
		}
		if(tieScore1==score1 && tieScore3==score2) {
			System.out.println("Player 1 is the winner based on past records");
		}
		if(tieScore2==score1 && tieScore3==score2) {
			System.out.println("Player 2 is the winner based on past records");
		}
	}
}


public class GuesserGameEnhancement {

	public static void main(String[] args) {
		
			FieldUmpire fu=new FieldUmpire();
			fu.collectNumFromGuesser();
			fu.collectNumFromPlayers();
			fu.compare();

	}

}

