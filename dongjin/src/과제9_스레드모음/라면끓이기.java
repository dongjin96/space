package ����9_���������;

import java.util.Scanner;

public class �����̱� {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü �ֱ�
	
		
		boolean ���Ȯ�� = false; // ��� ���� =false;����
		boolean ������ = false;
		while(true) {
			System.out.println("============�����̱�=======");
			System.out.println("1.���ֱ� 2.���ֱ� 3.���̱� :"); 
				int ch = scanner.nextInt();
				
				
				if (ch==1) {
					System.out.println("����� �غ��մϴ�");
					���Ȯ�� = true; // ��� ���¸� true�� �ٲ�
					
				}
				if (ch==2) {
					
					System.out.println("���� �غ��մϴ�");
					Runnable runnable =new Runnable() {  // Runnable�� ����ϸ� ���� �ٸ� Ŭ������ ������� �ʾƵ� Thread��밡��
						@Override
						public void run() {
							
							for (int i = 0; i < 3; i++) { // for �ݺ����� ������ ����Ƚ���� �Ǵ�
								System.out.println(i+1+"������");	//
								try {
									Thread.sleep(1000); // �ð� �����ִ°� // ����ó�� �ʼ�
								} catch (InterruptedException e) {
									
									
								}
							}
							
						}
					};
					Thread thread = new Thread(runnable); // runnable�� ������� �ٲ��ش�
					thread.start(); //�����带 �����Ų��
					try {
						thread.join(); 								//join();�� ���� ������ System.out.println("���� ����� ����ֽ��ϴ�"); ���� ���� ��µȴ�
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("���� ����� ����ֽ��ϴ�");
					������=true; // �����¸� fals ���� true�ιٲ�
				}
				if (ch==3) {
					if(���Ȯ��&&������) { // ��� Ȯ�� �����°� true���߸� �������ϼ��ִ� ���� �ϳ��� ������ �������ϸ� ������Ѵ�
						System.out.println("�����̱⸦ �����մϴ�");
					Thread thread = new ���̱�(); // ���̱� Ŭ���� ����� �޾Ƽ� �ٷ� ���̱�(); �����ϴ�
					thread.start(); // ���������
					try {
						thread.join(); // join�� ����ؼ� �������� ����� �ϼ��Ǿ����ϴ� �� �����־���
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("����� �ϼ��Ǿ����ϴ�");
						���Ȯ��=false;// �ٽ� ���������� �������ѳ��´�
						������=false;
					}
						
					
				}
			
			
			
			
		}
		
	}

	}



