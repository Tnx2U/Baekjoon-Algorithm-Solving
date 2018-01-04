/*세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최대값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.*/

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
