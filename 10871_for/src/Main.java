import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,X;
		//N과 X의 값 입력
		N = sc.nextInt();
		X = sc.nextInt();
		//A의 배열 선언
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			//A[i]에 값 넣기
			A[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			//A[i]의 값이 X보다 작으면 출력
			if(A[i]<X)
				System.out.print(A[i]+" ");
		}

	}

}
