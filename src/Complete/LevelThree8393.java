//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

package Complete;

import java.util.Scanner;

public class LevelThree8393 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result=0;
		
		for(int i=1;i<=input;i++){
			result += i;
		}
		
		System.out.println(result);
	}

}
