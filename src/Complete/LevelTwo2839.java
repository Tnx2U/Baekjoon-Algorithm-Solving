/*����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.

����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.

����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

package Complete;

import java.util.Scanner;

public class LevelTwo2839 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int result=-1;
		int fiveCount,threeCount;
		int maxFiveCount;
		int input;
		int temp;
		
		input = scan.nextInt();
		
		maxFiveCount = input/5;
		for(int i=maxFiveCount; i>=0; i--){
			 temp = input - i*5;
			 if(temp%3==0){
				 result = i + temp/3;
				 break;
			 }
		}
		
		/*
		if(input%5 < 3){
			if(input == 5)
				maxFiveCount = 1;
			else
				maxFiveCount = input/5 - 1;
		}else{
			maxFiveCount = input/5;
		}
		
		for(int i=0; i<=maxFiveCount; i++){
			temp = input - i*5;
			if(temp%3 == 0){
				threeCount = temp/3;
				fiveCount = i;
				result = threeCount + fiveCount;
			}
		}
		*/
		
		System.out.println(result);

	}
}
