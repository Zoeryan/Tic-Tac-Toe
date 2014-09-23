import java.util.Scanner;

 
public class TicTacToeRunner
	{

	
	public static void main(String[] args)
		{
		TicTacToePlayer.greetPlayer();
		TicTacToePlayer.pickMarker();
		TicTacToeBoard.fillBoard();
		TicTacToeBoard.makeBoard();
		
		while(!TicTacToeBoard.isGameOver())
			TicTacToePlayer.addPlayerMove();
			TicTacToeBoard.makeBoard();
			TicTacToeBoard.isMoveValid();
			TicTacToeComputer.computerMove();
			//TicTacToeBoard.isGameOver();
			TicTacToePlayer.sayGoodbye();
		}

	}
