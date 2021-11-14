package 과제_1;

import dongjin.BookAplication;

public class Book {

	
	
	
	private String b_ISBN;
	private String b_name;
	private boolean b_rental;
	private String m_id;
	
	public Book() {}

	public Book(String b_ISBN, String b_name, boolean b_rental, String m_id) {
		super();
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rental = b_rental;
		this.m_id = m_id;
	}

	
	
	// 책등록하기
	public static boolean book_add() {
		
		System.out.println("책고유번호 입력 :");String b_ISBN = BookAplication.scanner.next();
		boolean check=bookcheck(b_ISBN);
		if (check) {
			System.out.println("동일한 도서가 존재합니다");
		}
		System.out.println("책이름 입력 :");String b_name =BookAplication.scanner.next();
		
		Book book = new Book(b_ISBN, b_name, true, null);
		for (int i = 0; i < BookAplication.book.length; i++) {
			if (BookAplication.book[i]==null) {
				//BookAplication.book[i]=book;  /// 이부분 이 오류
				return true;
			}
		}
		
		
		
		return false;
	}
	public static boolean bookcheck(String b_ISBN) {
		for (int i = 0; i < BookAplication.book.length; i++) {
			if (BookAplication.book[i]!=null&&BookAplication.book[i].getB_ISBN().equals(b_ISBN)) {
				return true;
				
			}
			
		}
		return false;
	}
	//도서목록
	public static void book_list() {
		System.out.println("============도서 목록===============");
				System.out.println("도서이름 도서번호 대여여부 대서회원");
				for (int i = 0; i < BookAplication.book.length; i++) {
					if (BookAplication.book[i]==null) {
						System.out.println(BookAplication.book[i].getB_name()+BookAplication.book[i].isB_rental()+BookAplication.book[i].getM_id());
						
					}
					 return;
				}
	}
	
	
	// 대여
	public boolean book_rental(String loginid) {// 로그인아이디를 가지고 책을빌리겠다고함
	   System.out.println("========책대여페이지==========");
	   System.out.println("도서코드입력 :");
	   String b_ISBN = BookAplication.scanner.next();

	   boolean check = bookcheck(b_ISBN);
	   if (check) {
		   for (int i = 0; i < BookAplication.book.length; i++) {
			if (BookAplication.book[i]!=null&& BookAplication.book[i].getB_ISBN().equals(b_ISBN)) {
				// 비어있지 않고 책이있고 빌릴려는 책과 도서코드 가맞음녀
				if (BookAplication.book[i].isB_rental()) {
					System.out.println(" 현재도서대출가능");// 위에가 true니깐~!!!
					
					 BookAplication.book[i].setB_rental(false); // 빌려갔다고표시함
		               BookAplication.book[i].setM_id(loginid); // 로그인 아이디 두고감

		               return true;
					
				}else {
					System.out.println("대여불가");
					return false;
				}
			}
		}
		   
	   }return false;
	}
	
	public boolean book_return(String loginid) {

		   System.out.println("============도서 반납 페이지 =================");
		   System.out.println(" 반납책코드 : ");
		   String b_ISBN = BookAplication.scanner.next(); // 책대여와마찬가지로 도서 코드입력

		   for (int i = 0; i < BookAplication.book.length; i++) {
		      if (BookAplication.book[i] != null && !BookAplication.book[i].isB_rental()) {// 렌탈 여부 확인

		         if (BookAplication.book[i].getB_ISBN().equals(b_ISBN)) {// 입력한 책이 존재한다면
		            // 3.로그인된 회원 == 대여회원
		            if (BookAplication.book[i].getM_id().equals(loginid)) {// 리스트에존재하는 아이디와같다면
		               System.out.println(" [[ 알림 ]] : 도서 반납 성공 !!! "); // 반납성공
		               BookAplication.book[i].setM_id(null); /// 반납하고 다시 공백으로 설정
		               BookAplication.book[i].setB_rental(true);  // 대여가능 하게 설정
		               return true;
		            }
		         }
		      }
		   }
		   System.out.println("  아이디를 다시확인해주세요");
		   return true;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getB_ISBN() {
		return b_ISBN;
	}

	public void setB_ISBN(String b_ISBN) {
		this.b_ISBN = b_ISBN;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public boolean isB_rental() {
		return b_rental;
	}

	public void setB_rental(boolean b_rental) {
		this.b_rental = b_rental;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}



	
	
}
