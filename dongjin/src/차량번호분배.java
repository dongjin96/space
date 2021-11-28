package 과제6;


import java.util.Random;
import java.util.Scanner;

public class 차량번호분배 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] carnumbers= new String[10];
		String[] carnubers_odd=new String[10];//홀수차량 10개저장
		String[] carnubers_even=new String[10];// 짝수차량 10개저장
		Random random = new Random(); // 랜덤 객체 생성
		
		while(true) {
			System.out.println("1.차량 출입 :");
			int ch = scanner.nextInt();
			if (ch==1) {
				
				int intnum = random.nextInt(10000);//-1을 한 9999 수랜덤으로 출력
				
				String strnum = String.format("%04d", intnum);
				/*
				 * 정수를 4자리수 문자열로 변환시킨다 여기에서string.format:("형식",데이터) : 문자열 형식 메소드가된다 "%4d":로사용하면
				 * 4자리수 로나오게된다 %04d: 이면 앞자리가 공백이나오면 0으로 대체한다
				 */
				for (int i = 0; i < carnumbers.length; i++) { // 차량 번호를 저장
					if (carnumbers[i] == null) { // 만약에 carnumber[i]가 비어있다면
						carnumbers[i] = strnum; // carnumber[i]에 위에 정한문자열로 반환한 strnum을저장 한다

						// 홀짝 구분
						/*
						 * integer 은 문자열을 숫자로 변환시켜준다
						 */
						if (Integer.parseInt(strnum) % 2 == 0) {// %2했을때 나머지가 0으로 딱떨어지면 짝수이다
							for (int j = 0; j < carnubers_even.length; j++) { // 짝수를 배열에 저장
								if (carnubers_even[i] == null) { // 비어있다면 인덱스에 저장
									carnubers_even[j] = strnum;
									break;
								}
							}

						} else {
							for (int j = 0; j < carnubers_odd.length; j++) { // 홀수를 배열사용해서 저장
								if (carnubers_odd[j] == null) {// 인덱스가 비어있다면 저장한다
									carnubers_odd[j] = strnum;
									break;
								}
							}

						} break;// else끝
					}
					 // 31 if 문끝
				} // 30 for문 끝

			

			System.out.println("***********현재주차중***************");
			for (String num : carnumbers) { // 인덱스 번호가 없지만 for문으로 반복이돌아간다
				// for(자료형 변수:배열명)
				if (num != null)
					System.out.println(num); //  주차된차량이 홀수짝수없이 보여지는곳임
			}
			System.out.println("===========현재 짝수번호차량=======");
			for (String num1 : carnubers_even) { // 짝수 배열을 num1이라는 변수에저장
				if (num1 != null) // 공백이아니라면
					System.out.println(num1);// 주차차량중 짝수만 보여지는곳
				
			}
			System.out.println("==========현재 주차중인 홀수번호차량========");
			for (String num2 : carnubers_odd) {// 홀수 배열을 num2이라는 변수에저장
				if (num2 != null) //공백이아니라면
					System.out.println(num2);
				
			}
			}  // if (ch==1)끝

		} // while 끝나는곳

	}
		
		
		
		
		
		
	}



