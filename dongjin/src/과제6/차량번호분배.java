package ����6;


import java.util.Random;
import java.util.Scanner;

public class ������ȣ�й� {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] carnumbers= new String[10];
		String[] carnubers_odd=new String[10];//Ȧ������ 10������
		String[] carnubers_even=new String[10];// ¦������ 10������
		Random random = new Random(); // ���� ��ü ����
		
		while(true) {
			System.out.println("1.���� ���� :");
			int ch = scanner.nextInt();
			if (ch==1) {
				
				int intnum = random.nextInt(10000);//-1�� �� 9999 ���������� ���
				
				String strnum = String.format("%04d", intnum);
				/*
				 * ������ 4�ڸ��� ���ڿ��� ��ȯ��Ų�� ���⿡��string.format:("����",������) : ���ڿ� ���� �޼ҵ尡�ȴ� "%4d":�λ���ϸ�
				 * 4�ڸ��� �γ����Եȴ� %04d: �̸� ���ڸ��� �����̳����� 0���� ��ü�Ѵ�
				 */
				for (int i = 0; i < carnumbers.length; i++) { // ���� ��ȣ�� ����
					if (carnumbers[i] == null) { // ���࿡ carnumber[i]�� ����ִٸ�
						carnumbers[i] = strnum; // carnumber[i]�� ���� ���ѹ��ڿ��� ��ȯ�� strnum������ �Ѵ�

						// Ȧ¦ ����
						/*
						 * integer �� ���ڿ��� ���ڷ� ��ȯ�����ش�
						 */
						if (Integer.parseInt(strnum) % 2 == 0) {// %2������ �������� 0���� ���������� ¦���̴�
							for (int j = 0; j < carnubers_even.length; j++) { // ¦���� �迭�� ����
								if (carnubers_even[i] == null) { // ����ִٸ� �ε����� ����
									carnubers_even[j] = strnum;
									break;
								}
							}

						} else {
							for (int j = 0; j < carnubers_odd.length; j++) { // Ȧ���� �迭����ؼ� ����
								if (carnubers_odd[j] == null) {// �ε����� ����ִٸ� �����Ѵ�
									carnubers_odd[j] = strnum;
									break;
								}
							}

						} break;// else��
					}
					 // 31 if ����
				} // 30 for�� ��

			

			System.out.println("***********����������***************");
			for (String num : carnumbers) { // �ε��� ��ȣ�� ������ for������ �ݺ��̵��ư���
				// for(�ڷ��� ����:�迭��)
				if (num != null)
					System.out.println(num); //  ������������ Ȧ��¦������ �������°���
			}
			System.out.println("===========���� ¦����ȣ����=======");
			for (String num1 : carnubers_even) { // ¦�� �迭�� num1�̶�� ����������
				if (num1 != null) // �����̾ƴ϶��
					System.out.println(num1);// ���������� ¦���� �������°�
				
			}
			System.out.println("==========���� �������� Ȧ����ȣ����========");
			for (String num2 : carnubers_odd) {// Ȧ�� �迭�� num2�̶�� ����������
				if (num2 != null) //�����̾ƴ϶��
					System.out.println(num2);
				
			}
			}  // if (ch==1)��

		} // while �����°�

	}
		
		
		
		
		
		
	}



