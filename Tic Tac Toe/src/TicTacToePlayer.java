import java.util.Scanner;
public class TicTacToePlayer
	{

	public static void greetPlayer()
		{
		System.out.println("Hello! Welcome to Tic-Tac-Toe!\nYou will be playing as 'X'!");

		}
	public static void addPlayerMove()
		{
		System.out.println("Please enter to coordinates of your move. (ex. B1)");
		Scanner keyboard = new Scanner(System.in);
		playerMove =  keyboard.nextLine();
		}
	}
