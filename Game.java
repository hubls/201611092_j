class Game {
	String a, b;
	
	public Game(String a, String b) {
		this.a = a;
		this.b = b;
		
		rspPlay(a, b);
	}
	
	public void Play(String a, String b) {
		if (a.equals("scissor")) {
			if (b.equals("rock"))
				System.out.println("Player2 Win");
			else if (b.equals("paper"))
				System.out.println("Player1 win");
			else
				System.out.println("Draw");
		}
		else if (a.equals("rock")) {
			if (b.equals("scissor"))
				System.out.println("Player1 win");
			else if (b.equals("paper"))
				System.out.println("Player2 win");
			else
				System.out.println("Draw");
		}
		else {
			if (b.equals("scissor"))
				System.out.println("Player2 win");
			else if (b.equals("rock"))
				System.out.println("Player1 win");
			else
				System.out.println("Draw");
		}
	}
	
	public static void main(String[] args) {
		String a = "paper";
		String b = "scissor";
		
		System.out.println("Player1 is " + a + "Player2 is " + b +"So");
		Game g = new Game(a, b);
	}
}