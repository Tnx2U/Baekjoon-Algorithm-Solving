package Complete;

import java.util.Scanner;

public class LevelFour10871 {

	public static void main(String[] args) {
		int N,X;
		int[] A;
	
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		X = scan.nextInt();
		
		A = new int[N];
		
		for(int i=0; i<N; i++){
			A[i] = scan.nextInt();
			if(A[i] < X)
				System.out.print(A[i]+" ");
		}
	}
}
