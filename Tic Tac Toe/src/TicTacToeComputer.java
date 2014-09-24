import java.lang.Math;

public class TicTacToeComputer {
	static int anyRow;
	static int anyColumn;
	
	public static void computerMove()
	{
		do
		{
		double randomNumber1 = Math.random();
		anyRow = (int) ((randomNumber1 * 10) %3);
		double randomNumber2 = Math.random();
		anyColumn = (int) ((randomNumber2 * 10) %3);	

		TicTacToePlayer.column = anyColumn;
		TicTacToePlayer.row = anyRow;
		TicTacToeBoard.isMoveValid();
		}
	while (TicTacToeBoard.isMoveValid());
	}

}
