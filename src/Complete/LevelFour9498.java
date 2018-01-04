//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
package Complete;

import java.util.Scanner;

public class LevelFour9498 {

	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		
		input = scan.nextInt();
		
		if(input>=90)
			System.out.println("A");
		else if(input >= 80)
			System.out.println("B");
		else if(input >= 70)
			System.out.println("C");
		else if(input >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}

}
