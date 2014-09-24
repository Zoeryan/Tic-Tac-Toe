import java.util.Scanner;

 
public class TicTacToeRunner
	{

	
	public static void main(String[] args)
		{
		TicTacToePlayer.greetPlayer();
		TicTacToePlayer.pickMarker();
		TicTacToeBoard.fillBoard();
		TicTacToeBoard.displayBoard();
		
		while(!TicTacToeBoard.isGameOver()) //&& !TicTacToeBoard.isBoardFull())
			{
			TicTacToePlayer.addPlayerMove();
			TicTacToeBoard.board[TicTacToePlayer.row][TicTacToePlayer.column] = TicTacToePlayer.playerMarker;
			TicTacToeBoard.displayBoard();
			
			TicTacToeComputer.computerMove();
			TicTacToeBoard.board[TicTacToePlayer.row][TicTacToePlayer.column] = TicTacToePlayer.computerMarker;
			TicTacToeBoard.displayBoard();
			}
			TicTacToePlayer.sayGoodbye();
			
		}

	}
