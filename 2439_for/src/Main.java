import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�Է�
		int n= sc.nextInt();
		//���� �� 
		for(int i=1; i<=n ; i++) {
			//�� �ٿ� ���� �ݺ���
			for(int j=0;j<n; j++) {
				if(j >= n-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("\n");
			
		}
		sc.close();
	}

}
