package ����9_���������;

import java.util.Scanner;

public class �����̱� {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean check = true; // ���� ���࿩�� Ȯ��
		boolean check2 = true; // �������� ����
		
		boolean ���Ȯ�� = false;
		boolean ������ = false;
		while(true) {
			System.out.println("============�����̱�=======");
			System.out.println("1.���ֱ� 2.���ֱ� 3.���̱� 4. :"); 
				int ch = scanner.nextInt();
				if(ch==4) {
					����.�޼ҵ�();
				}
				if (ch==1) {
					System.out.println("����� �غ��մϴ�");
					���Ȯ�� = true;
					
				}
				if (ch==2) {
					
					System.out.println("���� �غ��մϴ�");
					Runnable runnable =new Runnable() {
						@Override
						public void run() {
							
							for (int i = 0; i < 3; i++) {
								System.out.println(i+1+"������");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									
									e.printStackTrace();
								}
							}
							
						}
					};
					Thread thread = new Thread(runnable);
					thread.start();
					try {
						thread.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("���̵���ֽ��ϴ�");
					������=true;
				}
				if (ch==3) {
					if(���Ȯ��&&������) {
						System.out.println("�����̱⸦ �����մϴ�");
					���ֱ�.���ֱ�().run();
					try {
						���ֱ�.���ֱ�().join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("d��");
						���Ȯ��=false;
						������=false;
					}
						
					
				}
			
			
			
			
		}
		
	}

	}



