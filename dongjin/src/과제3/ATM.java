package ����3;

public interface ATM { //ATM  �������̽� �� ����Ǵ°Ÿ� ����Ѵ�  extend �ʹٸ��� �ߺ��̰����ϴ�
	
	//�߻�޼ҵ� �ȿ� ���� ��������
	public void ���µ��();
	public void ����();
	public void ���();
	public void �ܰ�();
	// default ���� ��Ű�� ��Ŭ���� ��밡���ϴ�
	default void ����() {System.out.println(" ATM ���� �մϴ� ");}
	
	
}
