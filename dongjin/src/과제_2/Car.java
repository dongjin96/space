package ����_2;


public class Car {
	
	// �տ���Ÿ�̾� (int�� ��ȸ�����ɼ� ,��ġ);
	// �տ�����Ÿ�̾� (int�� ��ȸ�����ɼ� ,��ġ);
	// �ڿ���Ÿ�̾� (int�� ��ȸ�����ɼ� ,��ġ);
	// �� ������Ÿ�̾� (int�� ��ȸ�����ɼ� ,��ġ);
	
	Tire frontlefttire = new Tire(8,"�տ���"); // Tire �� frontlefttire(Ÿ�̾���ġ��)�� ��ü�� �����Ѵ�  (int ,"")Ÿ�̾� ��� ���ɼ� ��int�εΰ� ""�� ��ġ�˷��ش�
	Tire frontrighttire= new Tire(10,"�տ�����");
	Tire backlefttire = new Tire(4,"�ڿ���");
	Tire backrighttire = new Tire(5,"�ڿ�����");
	
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�");
		if (frontlefttire.roll()==false) {stop(); return 1;}// �ڵ����� �տ��ʹ����� �޸������ϸ�  return ���� 1�κ�����
		if ( frontrighttire.roll()==false) {stop(); return 2;}// �ڵ����� �տ����ʹ����� �޸������ϸ�  return ���� 1�κ�����
		if ( backlefttire.roll()==false) {stop(); return 3;}// �ڵ����� �ڿ��ʹ����� �޸������ϸ�  return ���� 1�κ�����
		if (backrighttire.roll()==false) {stop(); return 4;}// �ڵ����� �ڿ����ʹ����� �޸������ϸ�  return ���� 1�κ�����
		return 0;
	}


	private void stop() {// stop�޼ҵ� �������� ���� stop��밡��
		System.out.println("�ڵ����� ����ϴ�");
		
		
	}
		
	}
	
	
	
	
	
	
	
	
