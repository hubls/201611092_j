import java.util.Random;
import java.util.Scanner;

public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Random r = new Random();

		System.out.println("�ȳ��ϼ��� ^^");
		System.out.println("D I C E  G A M E !!!!!");
		System.out.print("�ֻ����� ���������?");

		System.out.print(s.nextLine());
		
		int randomValue1 = r.nextInt(6)+1;
		System.out.println(randomValue1);
		
		System.out.print("��ǻ�Ͱ� �ֻ����� ���� �����?");
		
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