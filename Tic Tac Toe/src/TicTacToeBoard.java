import java.util.ArrayList;
public class TicTacToeBoard
	{
	private String marker;
	private int value;
	static String[][] board  = new String[3][3] ;	
	
	
	public TicTacToeBoard(String m, int v)
		{
		marker = m;
		value = v;
		
		}
	
		public String getMarker()
			{
			return marker;
			}
		public int getValue()
			{
			return value;
			}
		public void setMarker()
			{
			this.marker = marker;
			}
		public void setValue()
			{
			this.value = value;
			}
		
		
		public static void fillBoard()
		{	
			for(int i = 0; i < 3; i++)
				{
				for(int j = 0; j < 3; j++)
					{
					board[i][j] = " ";
					}
					
				}
		}
	public static void makeBoard()
		{
		
		
		System.out.println();
		System.out.println("     1     2    3");
		System.out.println("  -------------");
		System.out.println("A |" + "  "  + board[0][0] + "|" + "  " + board[0][1] + "|" + "  "+ board[0][2] + "|"  );
		System.out.println("  -------------");
		System.out.println("B |" + "  "  + board[1][0] + "|" + "  " + board[1][1] + "|" + "  " + board[1][2] + "|"  );
		System.out.println("  -------------");
		System.out.println("C |" + "  "  + board[2][0] + "|" + "  " + board[2][1] + "|" + "  " + board[2][2] + "|"  );
		System.out.println("  -------------");
		System.out.println();
		}

	public static boolean isMoveValid()
		{
		if(!TicTacToeBoard.board[TicTacToePlayer.row][TicTacToePlayer.column].equals(" "))
			{
			System.out.println();
			return true;
			}
		else
			{
			System.out.println("You cannot play that  move");
			TicTacToePlayer.addPlayerMove();
			return false;
			}
		}
	
	public static boolean isGameOver()
	{
		{
			if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && !board[0][1].equals(" ")) ||
				(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][1].equals(" ")) ||
				(board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && !board[2][1].equals(" ")) ||
				(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && !board[1][0].equals(" ")) ||				
				(board[0][1].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][1].equals(" ")) ||
				(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && !board[1][2].equals(" ")) ||
				(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[1][1].equals(" ")) ||
				(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[1][1].equals(" ")))
				{
				System.out.println("The game is over!");
				return true;
				}
			return false;
			}
	
	}
	// BOOLEAN??
	public static boolean isBoardFull()
	{
		boolean isFull = true;
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			if (TicTacToeBoard.board[i][j] == "X" || TicTacToeBoard.board[i][j] == "O"  )
			{
				System.out.println("Looks like this game is a tie!");
				return true;
			}
			
			else
				{
				return false;
				}
		}
	}
	
	}
