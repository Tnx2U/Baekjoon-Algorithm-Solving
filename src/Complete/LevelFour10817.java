// 3���� ���� �Է°��� �־����� �� �ι�°�� ū ���� ã��

package Complete;

import java.util.Scanner;

public class LevelFour10817 {

	public static void main(String[] args) {
		int first, second, third, max;
		Scanner scan = new Scanner(System.in);
		
		first = scan.nextInt();
		second = scan.nextInt();
		third = scan.nextInt();
		
		int firstMax = Math.max(first, second);
		int secondMax = Math.max(second, third);
		int thirdMax = Math.max(first, third);
		
		if(firstMax == secondMax)
			System.out.println(thirdMax);
		else if(firstMax > secondMax)
			System.out.println(secondMax);
		else 
			System.out.println(firstMax);
	}

}
