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
			TicTacToeBoard.isMoveValid();
			TicTacToeBoard.isBoardFull();
			TicTacToeBoard.makeBoard();
			
			TicTacToeComputer.computerMove();
			TicTacToeBoard.board[TicTacToePlayer.row][TicTacToePlayer.column] = TicTacToePlayer.computerMarker;
			TicTacToeBoard.isMoveValid();
			TicTacToeBoard.isBoardFull();
			TicTacToeBoard.makeBoard();
			TicTacToePlayer.sayGoodbye();
		}

	}
