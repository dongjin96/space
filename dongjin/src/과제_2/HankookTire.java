package ����_2;


public class HankookTire  extends Tire{ // Tire�� ���
	
	public HankookTire (int max_rotation, String location) { 
		super(max_rotation, location);  // �ִ���¼���  ��ġ�� ���������� ����ؼ� ��ӹ���
	}

	@Override  // �ٸ� Ŭ���� �� �޼ҵ带 ����ϸ鼭  �ٽ� ����ϸ鼭 �������Ѵ� �׷��� @override���
	public boolean roll() {  // �۵��� �Ǵ�
		++accumulated_rotation; //���� ȸ���� ����  (�۵��ҋ�)
		if (accumulated_rotation < max_rotation) {// ���࿡ �ִ�ȸ�������� ������������ ������
			System.out.println(location + " �ѱ�Ÿ�̾� ��밡��Ƚ�� :" + (max_rotation - accumulated_rotation) + "ȸ");
																										// ��ġ��  �ִ���¼����� - ������������ ���鼭 ����Ƚ���� �˷��ش�
			return true; // ��ȯ�� true;
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ *** ");  // ��� Ÿ�̾� �� ��ũ�������˷��ش�
		}

		return false; // ��ȯ�� false
	}

}


