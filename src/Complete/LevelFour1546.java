/*�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ밪�� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.

���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.

�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

package Complete;

import java.util.Scanner;

public class LevelFour1546 {
	public static void main(String[] args){
		double[] scores;
		int scoreNum;
		double max=0,total=0;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		
		scoreNum = scan.nextInt();
		scores = new double[scoreNum];
		
		for(int i=0; i<scoreNum; i++){
			scores[i] = scan.nextInt();
			if(scores[i]>max)
				max = scores[i];
		}
		
		for(int i=0; i<scoreNum; i++){
			scores[i] = scores[i]/max*100;
			total += scores[i];
		}
		
		avg = total/scoreNum;
		
		System.out.printf("%.2f",avg);
	}
}
