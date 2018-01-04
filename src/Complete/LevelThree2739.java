package Complete;

import java.util.Scanner;

public class LevelThree2739 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i=1; i<=9;i++){
			System.out.println(input+" * "+i+" = "+input*i);
		}
		
	}

}
