package ����_2;

public class KumhoTire extends Tire { // Tire ���� ��� �ްڴ� ��¶�

	public KumhoTire(int max_rotation, String location) { // Ŭ���� ������ ����Ҽ��ְ�
		super(max_rotation, location); // �θ�Ŭ�������� ���� �κ��� �����´�
	}

	@Override // �ٸ� Ŭ�������� �޼ҵ� ���󾴰� �������ؼ� @override���
	public boolean roll() {
		++accumulated_rotation;
		if (accumulated_rotation < max_rotation) {
			System.out.println(location + " ��ȣŸ�̾� ��밡��Ƚ�� :" + (max_rotation - accumulated_rotation) + "ȸ");// ��밡�� ��
																											// ��ȣŸ�̾� +
																											// �ִ� ��� -
																											// ����Ƚ�� )+ȸ
			return true;
		} else {
			System.out.println("*** " + location + " " + "KumhotireTire ��ũ *** ");// �յ��¿� �����ؼ� �ѱ�Ÿ�̾� ��ũ
		}

		return false;
	}

}
