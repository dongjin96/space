package ����3;

public class �������α׷� {
public static Bank[] banklist = new Bank[100]; // ���ฮ��Ʈ 100 �������
	
	public static void main(String[] args) {
		
		ATM atm;  // �������̽� ��������
		
		atm = new ��������(); //�������̽� Ŭ������ �������� Ŭ���� �ιٲ۴�??
		// �׷��� �̰Ŵ� atm ���ִ°� ��밡�� 
		atm.���µ��();
		atm.����();
		atm.���();
		atm.�ܰ�();
		
		//�������̽� Ŭ��������������Ŭ������ �ٲ۴� 
		atm = new ��������();
		atm.���µ��();
		
		//  
		Bank account1 = new Bank();	
		banklist[0] = account1;
		
		�������� account2 = new ��������();
		banklist[1] = account2;
		
		�������� account3 = new ��������();
		banklist[2] = account3;
		
	}
}

