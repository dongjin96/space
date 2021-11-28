package 과제6;

import java.io.IOException;
import java.util.Iterator;

public class 도서검색프로그램1 {
	
			public static void main(String[] args) throws IOException {
				
				String[] 도서목록 = {	"된다! 네이버 블로그&포스트","스프링 부트 실전 활용 마스터","Tucker의 Go 언어 프로그래밍","혼자 공부하는 C 언어"};
				
				while(true) {
					System.out.println("=====도서 검색 프로그램====");
					System.out.println("1.도서검색2.도서수정 >>:");
					byte[] bs = new byte[100]; // 백개를 입력받아서 bs에 저장
					int count = System.in.read(bs); // 무조건 예외뜨는곳  // 바이트를 읽어서 count에 저장 
					
					
					String ch = new String(bs,0,count-2);
					
					if (ch.equals("1")) {
						 System.out.println("=======도서 검색======");
						 System.out.println("책검색:");
						 
						 count = System.in.read(bs);
						 String book = new String(bs,0,count-2); //문자열로 바꾸기
						
						 for (int i = 0; i < 도서목록.length; i++) {
							if (도서목록[i].equals(book)) { // 도서 목록 i가 입력받은 값과같으면
									System.out.println(도서목록[i]);
										
							}
							if (도서목록[i].contains(book)) { // 인덱스안에 있는 데이터와 입력한 데이터가 곂치면
									System.out.println(도서목록[i]); // 동일한 정보 를출력
							}
						}
					}//if(ch==1)끝
					
					if (ch.equals("2")) {
							System.out.println("========도서수정========");
							System.out.println("도서 검색하기:");
							
							for (int i = 0; i < 도서목록.length; i++) {
								System.out.println(i+"     "+도서목록[i]);
								
							}// for 문끝
							
							System.out.println("도서 선택하기:"); // 한번봄 // 선택하기임
							int count1= System.in.read(bs);
							String book = new String(bs,0,count1-2);
							
							System.out.println("도서 수정 명:");
							int count2 = System.in.read(bs);
							String newbook = new String(bs,0,count2-2);
							
							
							for (int i = 0; i < 도서목록.length; i++) {
								if (i==count1) {
									도서목록[count1]=도서목록[count1].replace(도서목록[count1], newbook);
									System.out.println("수정된 책명입니다 :"+도서목록[count1]);
									break;// 브레이크
								}
								
							}
						
						
					}
					
				}//we
				
				
				
				
				
				
				
				
				
			}//me

}