//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
package Complete;

import java.util.Scanner;

public class LevelThree11720 {

	public static void main(String[] args) {
		int inputNum;
		int total = 0;
		String inputs[];
		String input;
		
		Scanner scan = new Scanner(System.in);
		inputNum = scan.nextInt();
		inputs = new String[inputNum];
		
		input = scan.next();
		
		for(int i=0; i<inputNum; i++){
			inputs[i] = Character.toString(input.charAt(i));
			total += Integer.parseInt(inputs[i]);
		}
		
		System.out.println(total);
	}

}
