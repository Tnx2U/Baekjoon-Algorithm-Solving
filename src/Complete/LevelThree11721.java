/*알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.

한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.*/

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
