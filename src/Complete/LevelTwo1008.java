package Complete;

import java.util.Scanner;

//Perpose : a와 b를 줄 때 a/b 구하기
public class LevelTwo1008 {

	public static void main(String[] args) {
		double a,b;
		double result;
		Scanner scan = new Scanner(System.in);
		
		a= scan.nextDouble();
		b= scan.nextDouble();
		result = a/b;
		
		System.out.println(result);

	}
}
