/*
�Է�
ù° �ٿ��� �׽�Ʈ���̽� C�� �־�����.
��° �ٺ��� �� �׽�Ʈ���̽� ���� ù ���� ���� N(1 <= N <= 1000)���� �л��� �־����� �� �������� N���� 0���� 100 ������ ������ �̾ �־�����.

���
�� ���̽����� ���پ� ����� �Ѵ� �л����� ������ �Ҽ��� ��°�ڸ����� �ݿø��Ͽ� ����Ѵ�.
*/
package Complete;

import java.util.Scanner;

public class LevelFour4344 {

	public static void main(String[] args) {
		int numOfCase;
		int[][] scores;
		double[] lessAvg;
		double[] average;
		
		Scanner scan = new Scanner(System.in);
		
		numOfCase = scan.nextInt();
		scores = new int[numOfCase][];
		average = new double[numOfCase];
		lessAvg = new double[numOfCase];
		
		for(int i=0; i<numOfCase; i++){
			scores[i] = new int[scan.nextInt()];
			for(int j=0; j<scores[i].length; j++){
				scores[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i < numOfCase; i++){
			average[i] = getAvg(scores[i]);
		}
		
		for(int i=0; i<numOfCase; i++){
			lessAvg[i] = getRatio(scores[i], average[i]);
			System.out.printf("%.3f%%%n",lessAvg[i]);
		}
	}
	
	private static double getRatio(int[] scores, double avg) {
		double result;
		double count=0;
		
		for(int i=0; i<scores.length; i++){
			if(scores[i] > avg)
				count++;
		}
		
		result = (count/scores.length)*100; 
		
		return result;
	}

	static double getAvg(int[] input){
		int total=0;
		double result;
		
		for(int i=0; i< input.length; i++){
			total += input[i];
		}
		
		result = total/input.length;
		
		return result;
	}

}
