import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=1, B=1;
		//VectorŬ���� ���
		Vector<Integer> sum = new Vector<Integer>(5);
		while(true) {
			//A�� B�Է¹ޱ�
			A = sc.nextInt();
			B = sc.nextInt();
			//A�� B�� 0�̸� ����
			if(A==0 && B==0)
				break;
			sum.add(A+B);
		}
		
		for(int i=0; i<sum.size(); i++) {
			//������ ��� ���
			System.out.println(sum.elementAt(i));
		}
		

	}

}
