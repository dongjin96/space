package ����5;

import java.io.IOException; 


public class ������ {

	
	public static void main(String[] args) throws IOException { // ����ó��
		String[] ������� = {	"�ȴ�! ���̹� ��α�&����Ʈ","������ ��Ʈ ���� Ȱ�� ������","Tucker�� Go ��� ���α׷���","ȥ�� �����ϴ� C ���"};// ����� �ۼ�
	
		
		while(true) {
			
			System.out.println("=====================�����˻����α׷�================");
			System.out.println("1. å�˻� 2. å����>>>>>:"); 
			byte[] be = new byte[100]; // 100 �� ����Ҽ��ְ� �ε��� ����
			int count = System.in.read(be);  // �Է¹��� be�� count�� ����
			
			String ch = new String(be,0,count-2);	//be�迭�� 0 �������� -2��  -2��  ����,\t �� ���� �ϱ����ؼ�
			
			if (ch.equals("1")) { // ���ð��� 1�� �����ϸ�
				System.out.println("=============�����˻�============");
				System.out.println("å�˻� :");
				
				count= System.in.read(be);  // �о�������� count�� ����
				String book = new String(be,0,count-2); //be�迭�� 0 �������� -2�� ���ڷ� ��ȯ
				
				for (int i = 0; i < �������.length; i++) { // for�������� �˻����� �������[i]�� ����� å�̸��̰����麸���� 
					if (�������[i].equals(book)) {
						System.out.println(�������[i]);
					}
					
					if (�������[i].contains(book)) { //���� �Ǿ��־ �����ش�
						System.out.println(�������[i]);
					}
				}
				
			}
			if(ch.equals("2")){
				System.out.println("=============������ ����==================");
				System.out.println("������ �˻��ϱ� :");
				for (int i = 0; i < �������.length; i++) {
					System.out.println(i+"  "+�������[i]); // i�� ����Ͽ� �տ�  ��ȣ�� �ű��
				}
				
				System.out.println("�������� :"); 
				int count2=System.in.read(be);
				String book= new String(be,0,count2-2);
				
				System.out.println("���� ������ :");
				int count3=System.in.read(be);
				String newbook= new String(be,0,count3-2); // ���� ������ �������� new book���� �����Ѵ�
				
				for (int i = 0; i < �������.length; i++) {
					if (i==count2) {	// for���������� ������� i��° �ε����� ������ ���� �� ������
						�������[count2]=�������[count2].replace(�������[count2], newbook); // replace(�� ���� , �ٲ𵵼���)
						System.out.println("������ å���Դϴ�  : "+�������[count2]); // ���� �������[count2]�� �����߱� ������  �ٲ�����Ȯ�ΰ����ϴ�
						break;
					}
				}
					
				}
				
				
			}
		}
		
		
	
}
