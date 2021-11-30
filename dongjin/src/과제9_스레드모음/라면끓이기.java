package 과제9_스레드모음;

import java.util.Scanner;

public class 라면끓이기 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean check = true; // 현재 진행여부 확인
		boolean check2 = true; // 현재진행 상태
		
		boolean 라면확인 = false;
		boolean 물상태 = false;
		while(true) {
			System.out.println("============라면끓이기=======");
			System.out.println("1.라면넣기 2.물넣기 3.끓이기 4. :"); 
				int ch = scanner.nextInt();
				if(ch==4) {
					동진.메소드();
				}
				if (ch==1) {
					System.out.println("라면을 준비합니다");
					라면확인 = true;
					
				}
				if (ch==2) {
					
					System.out.println("물을 준비합니다");
					Runnable runnable =new Runnable() {
						@Override
						public void run() {
							
							for (int i = 0; i < 3; i++) {
								System.out.println(i+1+"물한컵");
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
					System.out.println("물이들어있습니다");
					물상태=true;
				}
				if (ch==3) {
					if(라면확인&&물상태) {
						System.out.println("물끓이기를 시작합니다");
					물넣기.물넣기().run();
					try {
						물넣기.물넣기().join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("d다");
						라면확인=false;
						물상태=false;
					}
						
					
				}
			
			
			
			
		}
		
	}

	}



