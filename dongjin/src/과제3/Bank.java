package ����3;

public class Bank implements ATM {
	//1.�ʵ�
	String ���¹�ȣ;
	int ���ݾ�;
	//�޼ҵ� ����а�
	@Override
	public void ���µ��() {
		System.out.println("---���µ�� �մϴ� ---");
	}
	@Override
	public void ����() {
		System.out.println("---���¿��� �մϴ� ---");
	}
	@Override
	public void ���() {
		System.out.println("---������� �մϴ� ---");
	}
	@Override
	public void �ܰ�() {
		System.out.println("---�����ܰ� Ȯ�� �մϴ� ---");
	}

	
	
}