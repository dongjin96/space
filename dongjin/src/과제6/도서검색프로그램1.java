package ����6;

import java.io.IOException;
import java.util.Iterator;

public class �����˻����α׷�1 {
	
			public static void main(String[] args) throws IOException {
				
				String[] ������� = {	"�ȴ�! ���̹� ��α�&����Ʈ","������ ��Ʈ ���� Ȱ�� ������","Tucker�� Go ��� ���α׷���","ȥ�� �����ϴ� C ���"};
				
				while(true) {
					System.out.println("=====���� �˻� ���α׷�====");
					System.out.println("1.�����˻�2.�������� >>:");
					byte[] bs = new byte[100]; // �鰳�� �Է¹޾Ƽ� bs�� ����
					int count = System.in.read(bs); // ������ ���ܶߴ°�  // ����Ʈ�� �о count�� ���� 
					
					
					String ch = new String(bs,0,count-2);
					
					if (ch.equals("1")) {
						 System.out.println("=======���� �˻�======");
						 System.out.println("å�˻�:");
						 
						 count = System.in.read(bs);
						 String book = new String(bs,0,count-2); //���ڿ��� �ٲٱ�
						
						 for (int i = 0; i < �������.length; i++) {
							if (�������[i].equals(book)) { // ���� ��� i�� �Է¹��� ����������
									System.out.println(�������[i]);
										
							}
							if (�������[i].contains(book)) { // �ε����ȿ� �ִ� �����Ϳ� �Է��� �����Ͱ� ��ġ��
									System.out.println(�������[i]); // ������ ���� �����
							}
						}
					}//if(ch==1)��
					
					if (ch.equals("2")) {
							System.out.println("========��������========");
							System.out.println("���� �˻��ϱ�:");
							
							for (int i = 0; i < �������.length; i++) {
								System.out.println(i+"     "+�������[i]);
								
							}// for ����
							
							System.out.println("���� �����ϱ�:"); // �ѹ��� // �����ϱ���
							int count1= System.in.read(bs);
							String book = new String(bs,0,count1-2);
							
							System.out.println("���� ���� ��:");
							int count2 = System.in.read(bs);
							String newbook = new String(bs,0,count2-2);
							
							
							for (int i = 0; i < �������.length; i++) {
								if (i==count1) {
									�������[count1]=�������[count1].replace(�������[count1], newbook);
									System.out.println("������ å���Դϴ� :"+�������[count1]);
									break;// �극��ũ
								}
								
							}
						
						
					}
					
				}//we
				
				
				
				
				
				
				
				
				
			}//me

}