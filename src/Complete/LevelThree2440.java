//ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����

package Complete;

import java.util.Scanner;

public class LevelThree2440 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i=input; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
