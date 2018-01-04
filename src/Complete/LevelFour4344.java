/*
입력
첫째 줄에는 테스트케이스 C가 주어진다.
둘째 줄부터 각 테스트케이스 마다 첫 수로 정수 N(1 <= N <= 1000)명의 학생이 주어지고 그 다음으로 N명의 0부터 100 사이의 점수가 이어서 주어진다.

출력
각 케이스마다 한줄씩 평균을 넘는 학생들의 비율을 소수점 넷째자리에서 반올림하여 출력한다.
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
