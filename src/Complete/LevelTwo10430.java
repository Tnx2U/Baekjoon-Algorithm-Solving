
/*(A+B)%C�� (A%C + B%C)%C �� ������?

(A��B)%C�� (A%C �� B%C)%C �� ������?

�� �� A, B, C�� �־����� ��, ���� �װ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

package Complete;

import java.util.Scanner;

public class LevelTwo10430 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		
		a= scan.nextInt();
		b= scan.nextInt();
		c= scan.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println((a%c + b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c * b%c)%c);
		
	}

}
