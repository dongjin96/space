package day13_����2;
public class Movie extends Thread {
	/*
	 * ������� �Ѱ��� ���μ��������� �۾��� �����ϴ� �������������ִ� �ΰ� �̻��̸� ��Ƽ���������Ѵ�
	 * ���μ��� : ���α׷� 
	 */
	static boolean stop = true; //�ٸ��������� ��밡���ϱ�����static ���
	
	public static void moviestop( boolean sw ) { // sw ������� Ȯ��
		
		stop = sw;
		if( stop ) {System.out.println("---��ȭ ����");} 
		else { System.out.println("---��ȭ ����");}
		
	}
	
	@Override
	public void run() {
		while(stop) { // stop �� true�� ��쿡�� ���� 
			System.out.println(" ��ȭ������~~~ ");
			try { Thread.sleep(1000); }// 1000�̸� 1��
			catch (Exception e) {}
		}	
	}

}
