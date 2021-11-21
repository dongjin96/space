package 과제5;

import java.io.IOException; 


public class 도서관 {

	
	public static void main(String[] args) throws IOException { // 예외처리
		String[] 도서목록 = {	"된다! 네이버 블로그&포스트","스프링 부트 실전 활용 마스터","Tucker의 Go 언어 프로그래밍","혼자 공부하는 C 언어"};// 목록을 작성
	
		
		while(true) {
			
			System.out.println("=====================도서검색프로그램================");
			System.out.println("1. 책검색 2. 책수정>>>>>:"); 
			byte[] be = new byte[100]; // 100 자 사용할수있게 인덱스 설정
			int count = System.in.read(be);  // 입력받은 be를 count로 저장
			
			String ch = new String(be,0,count-2);	//be배열에 0 번쨰부터 -2함  -2는  개행,\t 값 삭제 하기위해서
			
			if (ch.equals("1")) { // 선택값이 1과 동일하면
				System.out.println("=============도서검색============");
				System.out.println("책검색 :");
				
				count= System.in.read(be);  // 읽어온정보를 count에 저장
				String book = new String(be,0,count-2); //be배열에 0 번쨰부터 -2함 문자로 전환
				
				for (int i = 0; i < 도서목록.length; i++) { // for문돌려서 검색값과 도서목록[i]에 저장된 책이름이같으면보여줌 
					if (도서목록[i].equals(book)) {
						System.out.println(도서목록[i]);
					}
					
					if (도서목록[i].contains(book)) { //포함 되어있어도 보여준다
						System.out.println(도서목록[i]);
					}
				}
				
			}
			if(ch.equals("2")){
				System.out.println("=============도서명 수정==================");
				System.out.println("도서명 검색하기 :");
				for (int i = 0; i < 도서목록.length; i++) {
					System.out.println(i+"  "+도서목록[i]); // i를 사용하여 앞에  번호를 매긴다
				}
				
				System.out.println("도서선택 :"); 
				int count2=System.in.read(be);
				String book= new String(be,0,count2-2);
				
				System.out.println("도서 수정명 :");
				int count3=System.in.read(be);
				String newbook= new String(be,0,count3-2); // 새로 수정한 도서명을 new book으로 저장한다
				
				for (int i = 0; i < 도서목록.length; i++) {
					if (i==count2) {	// for문을돌려서 도서목록 i번째 인덱스와 선택한 도서 가 같으면
						도서목록[count2]=도서목록[count2].replace(도서목록[count2], newbook); // replace(전 도서 , 바뀔도서명)
						System.out.println("수정된 책명입니다  : "+도서목록[count2]); // 위에 도서목록[count2]로 저장했기 떄문에  바뀐모습을확인가능하다
						break;
					}
				}
					
				}
				
				
			}
		}
		
		
	
}
