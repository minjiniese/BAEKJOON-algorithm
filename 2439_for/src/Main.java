import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력
		int n= sc.nextInt();
		//줄의 수 
		for(int i=1; i<=n ; i++) {
			//한 줄에 대한 반복문
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
