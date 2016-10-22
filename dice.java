import java.util.Random;
import java.util.Scanner;

public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Random r = new Random();

		System.out.println("안녕하세요 ^^");
		System.out.println("D I C E  G A M E !!!!!");
		System.out.print("주사위를 굴려볼까요?");

		System.out.print(s.nextLine());
		
		int randomValue1 = r.nextInt(6)+1;
		System.out.println(randomValue1);
		
		System.out.print("컴퓨터가 주사위를 굴려 볼까요?");
		
		System.out.print(s.nextLine());
		
		int randomValue2 = r.nextInt(6)+1;
		System.out.println(randomValue2);
		
		if(randomValue1>randomValue2)
		{
			System.out.println("You Win!");
		}
		else if(randomValue1<randomValue2)
		{
			System.out.println("You Lose!");
		}
		else
		{
			System.out.println("Draw");
		}
	}
}