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
	public static void displayBoard()
		{
		
		
		System.out.println();
		System.out.println("    1   2   3");
		System.out.println("  -------------");
		System.out.println("A |" + "  "  + board[0][0] + "|" + "  " + board[0][1] + "|" + "  "+ board[0][2] + "|"  );
		System.out.println("  -------------");
		System.out.println("B |" + "  "  + board[1][0] + "|" + "  " + board[1][1] + "|" + "  " + board[1][2] + "|"  );
		System.out.println("  -------------");
		System.out.println("C |" + "  "  + board[2][0] + "|" + "  " + board[2][1] + "|" + "  " + board[2][2] + "|"  );
		System.out.println("  -------------");
		System.out.println();
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
	
		 public static boolean isDraw() 
			 {
	      for (int row = 0; row < 3; row++) 
	    	  {
	         for (int column = 0; column < 3; column++) 
	        	 {
	            if (board[TicTacToePlayer.row][TicTacToePlayer.column].equals("  ")) 
	            	{
	               return false;  
	            	}
	        	 }
	    	  }
	      return true;
			 }
		 
		 public static boolean isMoveValid()
		 	{
			if(!TicTacToeBoard.board[TicTacToePlayer.row][TicTacToePlayer.column].equals("  "))
				{
					return true;
				}
				
		 		else

					return false;
		 	}
		 
	}
