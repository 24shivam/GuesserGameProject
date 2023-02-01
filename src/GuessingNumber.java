//HERE I CREATED GUESSER GAME PROJECT IN WHICH GUEESERMAN CAN TAKE INPUT AS NUMBER FOR GUESSING GAME THEN 
//THEIR ARE 3 PLAYER (PLAYER 1,PLAYER 2,PLAYER 3,) THEY ARE ALSO TAKING THREE DIFFERENT INPUT FROM USER FOR THE 
//PURPOSE OF MATCHING THE SAME TO GUESSER NUMBER THEN DECLARE THE RESULT OF PLAYERS { ON THE BASICS OF MACHING THE PLAYERS NUMBER TO GUESSER MAN NUMBER }


//HERE I IMPLEMENT SOME CONDITION WHICH ARE GIVEN BELOW=>
//1>GUESSER MAN INPUT SHOULD BE IN RANGE OF 0 TO 99. IF THIS CONDITION IS FALSE THE PLAYER METHOD 
//CAN NOT EXECUTED .

//2> IF PLAYER 1&2 OR PLAYER 2&3 OR PLAYER 1&3 ARE ENTERING SAME VALUE THE RESULT SHOW AS => MATCH DRAW


//
//

import java.util.*;

class GuesserMan{
	int GuesserManNum;
	int guess(){ //method
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Number between 0 to 99 ");
		GuesserManNum=scan.nextInt();
		return GuesserManNum;
}
}

class PlayerGuessing{
	int playerNum;
	int guess() {
		Scanner scan =new Scanner(System.in);


		playerNum=scan.nextInt();

			return playerNum;

	}
}
class MatchingNumMan
{
	int GuesserNumMan;
	int playerNum1;
	int playerNum2;
	int playerNum3;
	
	int takingNumFromGuesserMan(){
		GuesserMan gm=new GuesserMan();
		GuesserNumMan= gm.guess();
		return GuesserNumMan;
		
			
	}
	void takingNumFromPlayer() {
		PlayerGuessing pg=new PlayerGuessing();
		System.out.println("Player 1 enter the Number ");
		playerNum1=pg.guess();
		System.out.println("Player 2 enter the Number ");
		playerNum2=pg.guess();
		System.out.println("Player 3 enter the Number ");
		playerNum3=pg.guess();
//		return takingNumFromPlayer();
	}
	

	void compare()
	{
		if(GuesserNumMan==playerNum1)
		{
			if(GuesserNumMan==playerNum2 && GuesserNumMan==playerNum3)
			{
				System.out.println("Game Tied !!!");
			}
			else if(GuesserNumMan==playerNum2 )
			{
				System.out.println("MATCH DRAW (because player 1 and player 2  are enter same number)");
			}
			else if(GuesserNumMan==playerNum3)
			{
				System.out.println(" MATCH DRAW (because player 1 and player3  are enter same number)");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(GuesserNumMan==playerNum2)
		{
			if(GuesserNumMan==playerNum3)
			{
				System.out.println("MATCH DRAW (because player 2 and player 3 are enter same number)");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(GuesserNumMan==playerNum3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	
	
}

public class GuessingNumber {

	public static void main(String[] args) {
		
			MatchingNumMan mnm=new MatchingNumMan();
			int number = mnm.takingNumFromGuesserMan();

			
			if(number<=0 || number<=99) 
			{
				

				mnm.takingNumFromPlayer();

			
			
			}
			else 
			{
				System.out.println("Enter a valid number ");
			}
			
			
			mnm.compare();
		

		}

	}


