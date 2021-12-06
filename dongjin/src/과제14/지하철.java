package ����14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ����ö {
	/*
	 * 
	 *  
	����3 :  ����ö ���� ( Queue )
		[����1] : �� 4�� ( ������ -> ��� -> ���� ->����-> ������ )
		[����2] : ��ö 3�� ��ü [ �������� 3�� ��ö ��� ]
		[����3] : ��� ��ȣ�� �޾Ƽ� �ش翪���� ����ؼ� �������� ���� 
		[����4] : �� �� �ҿ�ð� 2��
	
		��߽�ȣ �޴� 
		1. ���� 2.��� 3.���� 4.���� 
	
		[ ���� ] 1�� ���ý� �������� ���� ���� ��ö�� ���������� �̵� 
		[ ���� ] ���� �ش翪�� ��ö�� ������ ���� ��� 
	
		[��� �� ]
			----�� ��ö��  ��Ȳ -----
			������ :  ��ö3 , ��ö4
			��꿪 :  ��ö2
			���￪ :  ��ö1 
			���ο� :  
			---------- ��� ��ȣ --------
			1. ���� 2.��� 3.���� 4.���� 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		Queue<String> ������ = new LinkedList<String>();
		Queue<String> ��꿪 = new LinkedList<String>();
		Queue<String> ���￪ = new LinkedList<String>();
		Queue<String> ���ο� = new LinkedList<String>();
		/*Queue�� ���� ��ٸ��� ���� ���Ѵ� ������� ��� �������� ����������ٸ��� �������ϴµ�
		 * ��ó�� ť�� �����͸� ������ �������� �������� �ͳ��� �̶�� �����ϸ� �ɰŰ���
		 * �׸��� ť��LinkedList�� Ȱ���ؾ��Ѵ�*/
		������.offer("1����ö");
		������.offer("2����ö");
		������.offer("3����ö");
		
		while(true) { // ���ѵ�����
			System.out.println(������);
			System.out.println(��꿪);
			System.out.println(���￪);
			System.out.println(���ο�);
			System.out.println("1.���� 2.��� 3.���� 4.����"); //������
			int ch = scanner.nextInt();
			
			if(ch==1) { //�����������ϸ�
				System.out.println(������);
				if(!������.isEmpty()) { //������ �������������
					Thread.sleep(2000);	//2���ǽð����帥��
					System.out.println("��� : "+������.peek()); //peek �������� ��Ҹ� �о�´� ť�� ��������� �ΰ����ش� // stack ����������� ��ü�� ��ȯ�Ѵ�
					��꿪.offer( ������.poll() );
				}/*���⿡�� offer �� ���� ���Ϸ� ���°��̰�
				���⿡�� poll�� �����Ѱ��� �������� ���̴�*/
			}
			if(ch==2) {
				System.out.println(��꿪);
				if(!��꿪.isEmpty()) {//��꿪�� �������������
				Thread.sleep(2000);// ���ʵ��� ��ٷȴٰ�
				System.out.println("��� : "+��꿪.peek());  // ���� �����ִ� ��ü�� �����´�
				���￪.offer(��꿪.poll());
				}//���￪������ ���尪���ް� ��꿪�����º����� 
			}
			if(ch==3) {
				System.out.println(���￪);
				if(!���￪.isEmpty()) {
				Thread.sleep(2000);	
				System.out.println("��� : "+���￪.peek());	// ���￪ ���� �����ִ� ��ü�� �����´�
				���ο�.offer(���￪.poll());
				}//���ο��� ��ü�� ���޹ް� ���￪�� ��������
			}
			if(ch==4) {
				System.out.println(���ο�);
				if(!���ο�.isEmpty()) {
				Thread.sleep(2000);	
				System.out.println("��� : "+���ο�.peek());	// ���ο����� �����ִ� ��ü�� �����´�
				������.offer(���ο�.poll());
				}//���������¹ް� ���ο������� ��������
				/*���࿡ stack�̾����� PoP�̳������°��̰� push�� �����ϴ°��̴�*/
			}
		}
	}
}
