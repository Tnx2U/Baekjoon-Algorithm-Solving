package Complete;

import java.util.Scanner;

//Perpose : a b를 입력받아 사칙연산을 모두 출력하는 문제
public class LevelTwo10869 {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		
		a= scan.nextInt();
		b= scan.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

}
