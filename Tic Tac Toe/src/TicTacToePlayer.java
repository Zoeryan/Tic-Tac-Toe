import java.util.Scanner;
public class TicTacToePlayer
{
static int row;
static int column;
static String move;
static String playerMarker;
static String computerMarker;


	public static void greetPlayer()
		{
		System.out.println("Hello!\nWelcome to Tic-Tac-Toe!");

		}
	public static void pickMarker()
		{
		System.out.println("Would you like to play as X or O?");
		Scanner keyboard = new Scanner(System.in);
		playerMarker = keyboard.nextLine();
		if ((!"X".equals(playerMarker) && (!"O".equals(playerMarker))))
			{
			System.out.println("Sorry, that is not a valid option.");
			}
		if ("X".equals(playerMarker))
			{
			computerMarker = "O";
			System.out.println("Okay, you will play as " + playerMarker + "!");
			}
		else 
			{
			computerMarker = "X";
			System.out.println("Okay, you will play as O!");
			}
		}
	public static void addPlayerMove()
	{
		do
			{
			System.out.println("Please enter the coordinates of your move. (ex. B1)");
			Scanner keyboard = new Scanner(System.in);
			move = keyboard.nextLine();
				switch(move.substring(0,1))
					{
					case "A":
					case "a":
					row = 0;
					break;
					case "B":
					case "b":
					row = 1;
					break;
					case "C":
					case "c":
					row = 2;
					break;
					}
					
				column= Integer.parseInt(move.substring(1)) - 1;
				TicTacToeBoard.board[row][column] = playerMarker;
				TicTacToeBoard.board[TicTacToePlayer.row][TicTacToePlayer.column] = TicTacToePlayer.playerMarker;
			}
		while(TicTacToeBoard.isMoveValid());
			
	}


	public static void sayGoodbye()
		{
		System.out.println("Thanks for playing!");
		}
	}
