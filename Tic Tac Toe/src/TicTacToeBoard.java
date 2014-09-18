
public class TicTacToeBoard
	{
	String Marker;
	int Value;
	static String [][] layout;
	static String noMarker = "";
	static int noValue = 0;
	
	public TicTacToeBoard(String m, int v)
		{
		Marker = m;
		Value = v;
		
		}
	
		public String getMarker()
			{
			return Marker;
			}
		public int getValue()
			{
			return Value;
			}
		public void setMarker()
			{
			this.Marker = Marker;
			}
		public void setValue()
			{
			this.Value = Value;
			}
		
		
		public static void makeLayout()
		{
			TicTacToeBoard[][] layout = new TicTacToeBoard [3][3];
			for(int i = 0; i < 3; i++)
				{
				for(int j = 0; j < 3; j++)
					{
					layout.add(noMarker, noValue);
					}
					
				}
		}
	public static void makeBoard()
		{
		TicTacToeBoard [][] board = new TicTacToeBoard [3][3];
		System.out.println("       1       2       3");
		System.out.println("------------------------");
		System.out.println("A | " + layout[0][0] + "|" + layout [0][1] + "|" + layout[0][2] + "|"  );
		System.out.println("------------------------");
		System.out.println("B | " + layout[1][0] + "|" + layout[1][1] + "|" + layout[1][2] + "|"  );
		System.out.println("------------------------");
		System.out.println("C | " + layout[2][0] + "|" + layout[2][1] + "|" +  layout[2][2] + "|"  );
		System.out.println("------------------------");
		System.out.println();
		}
	
	}
