/*���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.

�� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

package Complete;

import java.util.Scanner;

public class LevelThree11721 {

	public static void main(String[] args) {
		String input;
		String[] sliceInputs;
		int divTen;
		
		Scanner scan= new Scanner(System.in);
		input = scan.next();
		sliceInputs = new String[input.length()];
		divTen = input.length()/10;
		
		for(int i=0; i<=divTen; i++){
			if(i == divTen)
				sliceInputs[i] = input.substring(i*10, input.length());
			else
				sliceInputs[i] = input.substring(i*10, (i+1)*10);
			
			System.out.println(sliceInputs[i]);
		}
	}
}
