package ����10_day13_����2;

public class Movie extends Thread {

	static boolean stop = true; // stop =true;��� �����ĸ��� Ŭ���� ������ ����ϱ����ظ���

	public static void moviestart(Boolean ��ȭ���) { // �μ��� ��ȭ���

		stop = ��ȭ���;
		if (stop) {
			System.out.println("��ȭ������մϴ�");
		} else {
			System.out.println("��ȭ�������մϴ�");
		}
	}

	@Override
	public void run() {// ��ӹ޾Ƽ� ������Ŵ
		while (stop) {
			System.out.println("=====��ȭ������մϴ�====");

			try {
				sleep(1000);// ����ó�� �ʼ� ���ڴ� �ð��ǹ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
