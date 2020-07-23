import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=1, B=1;
		//Vector클래스 사용
		Vector<Integer> sum = new Vector<Integer>(5);
		while(true) {
			//A와 B입력받기
			A = sc.nextInt();
			B = sc.nextInt();
			//A와 B가 0이면 종료
			if(A==0 && B==0)
				break;
			sum.add(A+B);
		}
		
		for(int i=0; i<sum.size(); i++) {
			//벡터의 요소 출력
			System.out.println(sum.elementAt(i));
		}
		

	}

}
