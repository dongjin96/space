package day13_����2;

public class Music extends Thread {// Thread�� ��ӹ޴´�
	/*
	 * ������� �Ѱ��� ���μ��������� �۾��� �����ϴ� �������������ִ� �ΰ� �̻��̸� ��Ƽ���������Ѵ�
	 * ���μ��� : ���α׷� 
	 */
	static boolean stop = true; // static ����������� �ٸ� ������ �� ����Ҽ��ְ�/ stop�̶� �Ǵ� �ϸ� =true
	public static void musicstop(boolean sw) {//sw ������� Ȯ��
		
		stop=sw;
		if(stop) {System.out.println("====���ǽ���");}
		else {System.out.println("=====��������");
			
		}
	}
	@Override// ��ӹ޾Ƽ� overrride �����ؾ���
	public void run() {
		while(stop) {// stop�� true�ΰ�쿡�� ����
			System.out.println("���ǽ�����~~~~~");
			try {Thread.sleep(1000);  // 1000�̸� 1��
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
