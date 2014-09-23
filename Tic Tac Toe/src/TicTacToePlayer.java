import java.util.Scanner;
public class TicTacToePlayer
{
private static int row;
private static int column;
private static String move;
private static String playermarker;
private static String computerMarker;


	public static void greetPlayer()
		{
		System.out.println("Hello!\nWelcome to Tic-Tac-Toe!");

		}
	public static void pickMarker()
		{
		System.out.println("Would you like to play as X or O?");
		Scanner keyboard = new Scanner(System.in);
		String playerMarker = keyboard.nextLine();
		if ((!"X".equals(playerMarker) && (!"O".equals(playerMarker))))
			{
			System.out.println("That is not a valid option.");
			}
		if ("X".equals(playerMarker))
			{
			computerMarker = "O";
			System.out.println("You will play " + playerMarker);
			}
		else 
			{
			computerMarker = "X";
			System.out.println("You will play O");
			}
		}
	public static void addPlayerMove()
	{
		
		System.out.println("Please enter the coordinates of your move. (ex. B1)");
		Scanner keyboard = new Scanner(System.in);
		move = keyboard.nextLine();
		switch(move.substring(0,1))
		{
		case "A":
		case "a":
			{
			row = 0;
			break;
			}
		case "B":
		case "b":
			{
			row = 1;
			break;
			}
		case "C":
		case "c":
			{
			row = 2;
			break;
			}
		}
		
		switch(move.substring(1,2))
		{
		case "1":
			{
			column = 0;
			break;
			}
		case "2":
			{
			column = 1;
			break;
			}
		case "3":
			{
			column = 2;
			break;
			}
		}
		TicTacToeBoard.board.set(row).set;
	}
	
	public static void sayGoodbye()
		{
		System.out.println("Thanks for playing!");
		}
	}
