package 과제9_스레드모음;

import java.util.Scanner;

public class 라면끓이기 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 입력객체 넣기
	
		
		boolean 라면확인 = false; // 라면 상태 =false;시작
		boolean 물상태 = false;
		while(true) {
			System.out.println("============라면끓이기=======");
			System.out.println("1.라면넣기 2.물넣기 3.끓이기 :"); 
				int ch = scanner.nextInt();
				
				
				if (ch==1) {
					System.out.println("라면을 준비합니다");
					라면확인 = true; // 라면 상태를 true로 바꿈
					
				}
				if (ch==2) {
					
					System.out.println("물을 준비합니다");
					Runnable runnable =new Runnable() {  // Runnable을 사용하면 굳이 다른 클래스를 사용하지 않아도 Thread사용가능
						@Override
						public void run() {
							
							for (int i = 0; i < 3; i++) { // for 반복문을 돌려서 제한횟수를 건다
								System.out.println(i+1+"물한컵");	//
								try {
									Thread.sleep(1000); // 시간 정해주는거 // 예외처리 필수
								} catch (InterruptedException e) {
									
									
								}
							}
							
						}
					};
					Thread thread = new Thread(runnable); // runnable을 스래드로 바꿔준다
					thread.start(); //스래드를 실행시킨다
					try {
						thread.join(); 								//join();을 넣지 않으면 System.out.println("물이 충분히 들어있습니다"); 제일 먼저 출력된다
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("물이 충분히 들어있습니다");
					물상태=true; // 물상태를 fals 에서 true로바꿈
				}
				if (ch==3) {
					if(라면확인&&물상태) { // 라면 확인 물상태가 true여야만 물을끓일수있다 둘중 하나의 조건을 만족못하면 못사용한다
						System.out.println("물끓이기를 시작합니다");
					Thread thread = new 끓이기(); // 끓이기 클래스 상속을 받아서 바로 끓이기(); 가능하다
					thread.start(); // 스래드시작
					try {
						thread.join(); // join을 사용해서 마지막에 라면이 완성되었습니다 를 띄울수있었다
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("라면이 완성되었습니다");
						라면확인=false;// 다시 조리전으로 복구시켜놓는다
						물상태=false;
					}
						
					
				}
			
			
			
			
		}
		
	}

	}



