import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,X;
		//N�� X�� �� �Է�
		N = sc.nextInt();
		X = sc.nextInt();
		//A�� �迭 ����
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			//A[i]�� �� �ֱ�
			A[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			//A[i]�� ���� X���� ������ ���
			if(A[i]<X)
				System.out.print(A[i]+" ");
		}

	}

}
