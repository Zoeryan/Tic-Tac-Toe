import java.lang.Math;

public class TicTacToeComputer {
	static int anyRow;
	static int anyColumn;
	
	public static void computerMove()
	{
		{
		double randomNumber1 = Math.random();
		anyRow = (int) ((randomNumber1 * 10) %3);
		double randomNumber2 = Math.random();
		anyColumn = (int) ((randomNumber2 * 10) %3);	

		TicTacToePlayer.column = anyColumn;
		TicTacToePlayer.row = anyRow;
		System.out.println("Here is my move!");
		}

	}
}
