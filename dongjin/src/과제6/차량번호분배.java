package ����6;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ������ȣ�й� {
	
		public static void main(String[] args) {
			
			Scanner scanner =new Scanner(System.in);
			String[] carnumbers = new String[10]; // ������ ���� �ε���������
			String[] carnumbers_odd = new String[10];	// 10 ¦�� ���� ¦����ȣ
			String[] carnubers_even = new String[10];		// 10 Ȧ����ȣ
			
			Random random = new Random();		// ���� ������
			
			while(true) {
					System.out.println("1. ���� ���� :");
					int ch = scanner.nextInt();
					if(ch==1) {
						int intnum = random.nextInt(10000);//999����
						String strnum = String.format("%04d", intnum);  // string.format : ���ڿ��� ��ȯ���ش�
						
						for (int i = 0; i < carnumbers.length; i++) { // �迭 ��������
							if (carnumbers[i]==null) {		// ������������
								carnumbers[i]=strnum;		// �ش� �ε����������Ѵ�
								
								if (Integer.parseInt(strnum)%2==0) {
									for (int j = 0; j < carnubers_even.length; j++) {// �迭 ��������
										if(carnubers_even[i]==null) {// ������������
											carnubers_even[i]=strnum; break;// �ش� �ε����������Ѵ�
										}
									}
								}else {for (int j = 0; j < carnumbers_odd.length; j++) {// �迭 ��������
										if (carnumbers_odd[i]==null) {// ������������
											carnumbers_odd[i]=strnum; break;// �ش� �ε����������Ѵ�
										}
									
								}
									
								}break;
							}
							
						}
						
						///////////////////////////////////////////////////////////////////////////////////////////
						System.out.println("===========����������������================");
							
							for(String num:carnumbers) {
								if (num!=null) {System.out.println(num); // if (num!=null)���� null���̸�  ���� ��nulll�� ���
									
								}
							}//for e
						System.out.println("============���� �������� ¦�� ����===========");
							for(String num :carnubers_even ) {
								if(num!=null) {System.out.println(num);	// ¦������
									
								}
							}
							System.out.println("===========���� �������� Ȧ�� ����=================");
							for(String num : carnumbers_odd) {
								if(num!=null) {System.out.println(num);// Ȧ������
								
							}
						
						
					}//ch==1
			}
	}//me
	
	

	
		
		}
	}//ce



