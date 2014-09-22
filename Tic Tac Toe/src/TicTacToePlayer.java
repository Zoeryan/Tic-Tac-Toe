import java.util.Scanner;
public class TicTacToePlayer
{
private static String move;
	

	public static void greetPlayer()
		{
		System.out.println("Hello!\nWelcome to Tic-Tac-Toe!\nYou will be playing as 'X'!");

		}
	public static void addPlayerMove()
		{
		
		System.out.println("Please enter the coordinates of your move. (ex. B1)");
		Scanner keyboard = new Scanner(System.in);
		move = keyboard.nextLine();
		switch(move.substring(0,1))
		{
		
		//YOU NEED TO FIGURE OUT WHAT IS WRONG HERE
		//case "A";
		//(move.substring(0).equals("A"))
			{
			String marker  = TicTacToeBoard.board[0][1];
			marker.equals(0);
			}
		if(move.substring(0).equals("B"))
			{
			String marker = TicTacToeBoard.board("",0);
			marker.equals(1);
			}
		if(move.substring(0).equals("C"))
			{
			String marker = TicTacToeBoard.board("",0);
			marker.equals(2);
			}
		if(move.substring(1).equals("1"))
			{
			int value = TicTacToeBoard.board("",0) == 1;
			}
		
		
		}
	
	public static void sayGoodbye()
		{
		System.out.println("Thanks for playing!");
		}
	}
