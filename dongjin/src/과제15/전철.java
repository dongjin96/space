package ����15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ��ö {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<String>������ = new LinkedList<String>();
		Queue<String>��꿪 = new LinkedList<String>();
		Queue<String>���￪ = new LinkedList<String>();
		Queue<String>���ο� = new LinkedList<String>();
		
		������.offer("1����ö");
		������.offer("2����ö");
		������.offer("3����ö");
		
		 	while(true) {
		 		System.out.println(������);
		 		System.out.println(��꿪);
		 		System.out.println(���￪);
		 		System.out.println(���ο�);
		 		System.out.println("1.���� 2.��� 3.���� 4.���� :");
		 		int ch = scanner.nextInt();
		 		if (ch==1) {
					System.out.println(������);
					if (!������.isEmpty()) {
						Thread.sleep(2000);
						System.out.println("��� :"+������.peek());
						��꿪.offer(������.poll());
					}
				}
		 		if (ch==2) {
					System.out.println(��꿪);
					if (!��꿪.isEmpty()) {
						Thread.sleep(2000);
						System.out.println("��� :"+��꿪.peek());
						���￪.offer(��꿪.poll());
					}
				}
		 		if (ch==3) {
					System.out.println(���￪);
					if (!���￪.isEmpty()) {
						Thread.sleep(2000);
						System.out.println("��� :"+���￪.peek());
						���￪.offer(��꿪.poll());
					}
				}
		 		if (ch==4) {
					System.out.println(���ο�);
					if (!���ο�.isEmpty()) {
						Thread.sleep(2000);
						System.out.println("��� :"+���ο�.peek());
						���ο�.offer(���ο�.poll());
					}
				}
		 	}
	}
	
}
