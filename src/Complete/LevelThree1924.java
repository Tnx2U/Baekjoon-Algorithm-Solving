//오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.

package Complete;

import java.util.Scanner;

public class LevelThree1924 {

	public static void main(String[] args) {
		int months, days;
		int totalDays=0;
		int selectWhatDay;
		String whatDay = null;
		
		Scanner scan = new Scanner(System.in);
		months = scan.nextInt();
		days = scan.nextInt();
		
		switch(months){
		case 12 : 
			totalDays += 30;
		case 11 :
			totalDays += 31;
		case 10 :
			totalDays += 30;
		case 9 :
			totalDays += 31;
		case 8 :
			totalDays += 31;
		case 7 :
			totalDays += 30;
		case 6 :
			totalDays += 31;
		case 5 :
			totalDays += 30;
		case 4 :
			totalDays += 31;
		case 3 :
			totalDays += 28;
		case 2 :
			totalDays += 31;
		case 1 :
			totalDays += 0;
			break;
		default :
			System.out.println("월수를 잘못 입력하셨습니다.");
			break;
		}
		
		totalDays += days;
		selectWhatDay = totalDays%7;
		
		switch(selectWhatDay){
		case 1 :
			whatDay = "MON";
			break;
		case 2 :
			whatDay = "TUE";
			break;
		case 3 :
			whatDay = "WED";
			break;
		case 4 :
			whatDay = "THU";
			break;
		case 5 :
			whatDay = "FRI";
			break;
		case 6 :
			whatDay = "SAT";
			break;
		case 0 :
			whatDay = "SUN";
			break;
		}
		
		System.out.println(whatDay);
	}

}
