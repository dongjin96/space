package 과제도서검색프로그램;

import java.io.IOException;

public class Day11_5도서검색program {
		
	
	
	public static void main(String[] args) throws IOException {// 문자열로 바뀔떄 무조건 생기는 문제를 던져버린다
		String[]도서목록 = {	"된다! 네이버 블로그&포스트","스프링 부트 실전 활용 마스터","Tucker의 Go 언어 프로그래밍","혼자 공부하는 C 언어"};
				//책저장하는 목록 인덱스


	
	while(true) {
		System.out.println("===============도서검색프로그램===============");
		System.out.println("1.도서검색2.도서명수정 >>>:");
		byte[] bs = new byte[100];		// 100개를 받을수있게 만듬  영어 100자 한국어 50자
		int count = System.in.read(bs);		// 입력받은걸 count 로 저장
		
		String ch = new String(bs , 0 , count-2 ); // 문자열로 반환

		if (ch.equals("1")) {
			System.out.println("===============도서검색==========");
			System.out.println("도서 검색 :");
			count = System.in.read(bs);
			String book = new String(bs , 0 , count-2);
			for (int i = 0; i < 도서목록.length; i++) {
				if (도서목록[i].equals(book)) {   // 입력받은 것을 같게 하고
					System.out.println(도서목록[i]);
	
				}
				if(도서목록[i].contains(book))  // 입력받은 게 도서목록에있는거에 포함되면
					System.out.println(도서목록[i]);			// 책보여줌
			}

		}
		if (ch.equals("2")) {
			System.out.println("===========도서수정=======");
			System.out.println("도서선택:");			//도서를 선택함
			count = System.in.read(bs);
			String book = new String(bs,0,count-2);		// 변환
			
		
			for (int i = 0; i < 도서목록.length; i++) {			// 배열을돌려서
				if(도서목록[i].equals(book)) {			//입력한거와같으면
					book=book.replace("언어", "안어");		// 조건을 걸어서  입력한값으로 바꿈
					System.out.println(book);				// 나타냄
							
					
					
				}
					
			}
				
					
				
		
					
				}
			
			}
			
		
		
		
		
		
		
		
		
		
	
	

}
}