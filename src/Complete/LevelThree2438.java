package Complete;

import java.util.Scanner;

public class LevelThree2438 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i=1; i<=input; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
