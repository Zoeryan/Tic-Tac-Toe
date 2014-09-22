import java.util.Scanner;
import java.util.ArrayList;
 
public class TicTacToeRunner
	{
	
	
	public static void main(String[] args)
		{
		TicTacToePlayer.greetPlayer();
		TicTacToeBoard.fillBoard();
		TicTacToeBoard.makeBoard();
		TicTacToePlayer.addPlayerMove();
		TicTacToeBoard.isMoveValid();
		TicTacToeBoard.isGameOver();
		TicTacToePlayer.sayGoodbye();
		}

	}
