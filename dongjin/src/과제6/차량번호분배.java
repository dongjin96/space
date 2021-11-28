package 과제6;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class 차량번호분배 {
	
		public static void main(String[] args) {
			
			Scanner scanner =new Scanner(System.in);
			String[] carnumbers = new String[10]; // 열대의 차를 인덱스에저장
			String[] carnumbers_odd = new String[10];	// 10 짝수 차의 짝수번호
			String[] carnubers_even = new String[10];		// 10 홀수번호
			
			Random random = new Random();		// 난수 생성기
			
			while(true) {
					System.out.println("1. 차량 출입 :");
					int ch = scanner.nextInt();
					if(ch==1) {
						int intnum = random.nextInt(10000);//999까지
						String strnum = String.format("%04d", intnum);  // string.format : 문자열로 변환해준다
						
						for (int i = 0; i < carnumbers.length; i++) { // 배열 을돌린다
							if (carnumbers[i]==null) {		// 공백이있으면
								carnumbers[i]=strnum;		// 해당 인덱스에저장한다
								
								if (Integer.parseInt(strnum)%2==0) {
									for (int j = 0; j < carnubers_even.length; j++) {// 배열 을돌린다
										if(carnubers_even[i]==null) {// 공백이있으면
											carnubers_even[i]=strnum; break;// 해당 인덱스에저장한다
										}
									}
								}else {for (int j = 0; j < carnumbers_odd.length; j++) {// 배열 을돌린다
										if (carnumbers_odd[i]==null) {// 공백이있으면
											carnumbers_odd[i]=strnum; break;// 해당 인덱스에저장한다
										}
									
								}
									
								}break;
							}
							
						}
						
						///////////////////////////////////////////////////////////////////////////////////////////
						System.out.println("===========현재주차중인차량================");
							
							for(String num:carnumbers) {
								if (num!=null) {System.out.println(num); // if (num!=null)만약 null값이면  값이 다nulll로 뜬다
									
								}
							}//for e
						System.out.println("============현재 주차중인 짝수 차량===========");
							for(String num :carnubers_even ) {
								if(num!=null) {System.out.println(num);	// 짝수차량
									
								}
							}
							System.out.println("===========현재 주차중인 홀수 차량=================");
							for(String num : carnumbers_odd) {
								if(num!=null) {System.out.println(num);// 홀수차량
								
							}
						
						
					}//ch==1
			}
	}//me
	
	

	
		
		}
	}//ce



