package ����14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class �ζ� {
	

//	����2: set �÷���
//	* �ζ� ���α׷�
//		
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);// �Է� ��ü����
		HashSet<Integer> set = new HashSet<>();
		/*HashSet�� TreeSet�� �ִµ� HashSet�� ��� ������ ������ �ʰ� 
		 * TreeSet�� ��� �ڵ������� ���شٴ� �������� �ִ�
		 * �� Set�� ���� ū ������ �ߺ��� �ڵ����� �������ش�*/
		
		while(true) {
			System.out.print(" 1~45 ���� ����(�ߺ��Ұ�) : ");
			int num = scanner.nextInt();
			
			if( num < 1 || num > 45 ) { // �Է��� ���� 0�����۰ų� �Ǵ� 45����ũ��
				System.out.println("**�����Ҽ� ���� ��ȣ");
			}
			else {
				// �ߺ�Ȯ�� 
				if( set.contains(num) ) {//�Է¹��� ���� ���ԵǸ� �ߺ�üũ�� �ɷ�������
					System.out.println("** �ߺ� ��ȣ �Դϴ�");
				}else {
					set.add(num); // �׷��������� ����ȴ�
					System.out.println(" Ȯ�� : "+ set );
				}
			}
			// ���ѷ��� ������ ���� : 6�� ��� �Է� �Ǿ�����
			if( set.size() == 6 ) break; // �迭�� �ִ� ���̸� 6���� �����ؼ� 6���� ��ü������ break�� �Ǵ�
		}
	}
}
