package ����_2;

public class Tire {// Ŭ������
	public int max_rotation; // �ִ� ����
	public int accumulated_rotation; // �������� ���ư��¼�
	public String location;  // Ÿ�̾��� ��ġ
	
	
	
	
	
	
	
	public Tire(int max_rotation, String location) { // �ܺ� �� ���ΰ� ���Ҽ��ְ� 
		super();
		this.max_rotation = max_rotation;
		this.location = location;
	}







	







	public boolean roll() { // �󸶳� ����Ҽ��ִ��� �Ǵ�.
		++accumulated_rotation;
		if (accumulated_rotation<max_rotation) {
			System.out.println("Ÿ�̾� ���� ������ :" + (max_rotation-accumulated_rotation));// Ÿ�̾���  ���� �������� = �ִ��밡���Ѽ� - �������� 
			return true; //������� true��
		}else {
			System.out.println("****"+location+"****"+" Tire ��ũ *** ");  // ��� �ʹ��� �� ��ũ�����˷���
		}
		
		
		return false; // ������� false��
	}
	
	
	
}