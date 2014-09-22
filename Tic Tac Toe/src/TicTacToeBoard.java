import java.util.ArrayList;
public class TicTacToeBoard
	{
	private String marker;
	private int value;
	static String board;
	
	
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
		ArrayList<TicTacToeBoard> board = new ArrayList <TicTacToeBoard>();	
			for(int i = 0; i < 3; i++)
				{
				for(int j = 0; j < 3; j++)
					{
					board.add(new TicTacToeBoard("", 0 ));
					}
					
				}
		}
	public static void makeBoard()
		{
		TicTacToeBoard  board[][] = new TicTacToeBoard [3][3];
		
		System.out.println();
		System.out.println("     1     2    3");
		System.out.println("  -----------------");
		System.out.println("A | " + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|"  );
		System.out.println("  -----------------");
		System.out.println("B | " + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|"  );
		System.out.println("  -----------------");
		System.out.println("C | " + board[2][0] + "|" + board[2][1] + "|" +  board[2][2] + "|"  );
		System.out.println("  -----------------");
		System.out.println();
		}
	
	public static void isMoveValid()
		{
		if(!TicTacToeBoard.board.equals(0))
			{
			System.out.println();
			}
		else
			{
			System.out.println("You cannot play that  move");
			TicTacToePlayer.addPlayerMove();
			}
		}
	
	public static void isGameOver()
		{
		if()
		}
	
	}
