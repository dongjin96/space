package ����5;

import java.util.Calendar;
import java.util.Scanner;

public class �޷� {
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�⵵ >>:"); int year = scanner.nextInt(); // �⵵ �� �Է¹޽��ϴ�
		System.out.println("��>>>>:"); int month = scanner.nextInt(); // ���� �Է� �޽��ϴ�
		
		�޷º���(year,month); // �޷º��� �޼ҵ�� �̵��մϴ� (�μ�)
	}// me
		
		public static void �޷º��� (int year,int month) {// e�޷º��� �޼ҵ� (�μ�)
		
			
			Calendar calendar = Calendar.getInstance();
			/*new() �� getinstance()����
			 * new() ��ü�� ��Ӱ�� ������ִ�
			 * getiinstance()[�̱�������] �ϳ��� �ν��Ͻ��� ������ Ŭ���� ������ �����ؼ� ����Ѵ�
			 *  Ŭ������ �Ź� ���ο� ��ü�� �����ϴ°ͺ��� get insttace�� ���� �ٸ� Ŭ����������  ������ ��ü������Ҽ��ְ� �Ѵ�
			 * 
			 * 
			 */
			
			
			
			calendar.set(year, month-1,1); // ����ڰ� �����ҋ��� -1�� ����ؼ� �����Ѵ� ������ �����ً��� 0���ͽ����ϱ⶧���� +1���ϰ����شٰ��Ѵ� ----------�����1
			
			int sweek = calendar.get(Calendar.DAY_OF_WEEK);  // �ش���� 1����ã�´� 
			int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // getActualMaximum �ش�����ִ밪
			
			System.out.println(" ******************* "+year+"�� "+month+"�� ********************");
			System.out.println(" ��\t��\tȭ\t��\t��\t��\t��");  // ����
			//1. ����� 1���� ��ġ�տ� ����ü���
			for (int i = 1; i < sweek; i++) { //int i�� �ϰ����� 0�� �޷¿������ϱ� 7���ٴ������� 1�������Ѵ�
				System.out.print(" \t");
				/*print println����
				 * print �� ���� �״�� ���ȴ�
				*println�� �ڵ����� enter������ �׷��� ���⼷ ����ϸ� ���η� ��� ������
				 * */
			}//2. 1���� ������ ������ ���
			for (int i = 1; i <=eday; i++) { //eday�� �ִ� month���� ���������
				System.out.print(i+"\t");
				if (sweek%7==0) System.out.println();sweek++; // ��������
					//7�ϸ��� �ٹٲ��� ���ش� 
				
			}
			
		}
		
	}//ce


