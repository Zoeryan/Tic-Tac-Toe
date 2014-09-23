import java.lang.Math;

public class TicTacToeComputer {
	int anyRow;
	int anyColumn;
	
	public static void computerMove()
	{

	do
		{
		double randomNumberOne = Math.random();
		anyRow = (int)(randomNumberOne* 10)%3;
		double randomNumberTwo = Math.random();
		anyColumn = (int)(randomNumberTwo*10)%3;
		}
	
	while
		{
		TicTacToeBoard.isMoveValid = true;
		}
	}

}
