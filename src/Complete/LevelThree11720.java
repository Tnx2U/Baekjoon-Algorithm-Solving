//N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
