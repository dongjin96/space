package day13_����2;

import java.util.Calendar;
import java.util.Scanner;

public class �޷� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����Է����ּ��� :");int years = scanner.nextInt();
		System.out.println("�� �Է����ּ���");int month = scanner.nextInt();
		
		�޷�(years,month);
		
		
		
		
	}//me
	
		public static void �޷�(int years, int month) {
			
			Calendar calendar = Calendar.getInstance();
			calendar.set(years, month-1,1); // �����ͽ����ؼ� -1 ��������
			
			int sweek = calendar.get(calendar.DAY_OF_WEEK); // �ش� ���� 1 ����ã�� **
			int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH); //�ش���Ǹ����� ��ã��**
			
			System.out.println("===================="+years+"��"+month+"��=================================");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��\t");
			// 4. ���� �� 1���� ��ġ���� �������� ä���
			for (int i = 1; i < sweek; i++) {
				System.out.print("  \t");
			}
			//5. 1�Ϻ��� ������ ������ ����ϱ�
			for (int i = 0; i < eday; i++) {
				System.out.print(i+" \t");
				if(sweek%7==0)System.out.println();sweek++;
			}
		}
	
}//ce
