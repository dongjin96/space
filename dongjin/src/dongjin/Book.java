package dongjin;

public class Book { private String b_ISBN;
private String b_name;
private boolean b_rental;
private String m_id;

public Book(String b_ISBN, String b_name, boolean b_rental, String m_id) {
   super();
   this.b_ISBN = b_ISBN;
   this.b_name = b_name;
   this.b_rental = b_rental;
   this.m_id = m_id;
}

public Book() {
}

// 3. 도서목록 메소드
public void book_list() {
   System.out.println("=============도서목록==========");
   System.out.println("도서코드\t도서명\t대여여부\t대여회원");
   for (int i = 0; i < BookAplication.book.length; i++) {
      if (BookAplication.book[i] == null) { // return;
         Book book = BookAplication.book[i];
         System.out.println(
               book.getB_ISBN() + "\t" + book.getB_name() + "\t" + book.isB_rental() + "\t" + book.m_id);// 이렇게
                                                                                    // 출력

      }
      return;
   }
}

// 도서등록
public boolean book_add() {
   System.out.println("============도서등록======");
   System.out.println("도서코드입력 :");
   String b_ISBN = BookAplication.scanner.next();
   boolean b_ISBNcheck = bookcheck(b_ISBN);
   if (b_ISBNcheck) {
      System.out.println("동일한 도서가존재합니다");
      return false;
   }
   System.out.println("도서명  :");
   String b_name = BookAplication.scanner.next();
   Book book = new Book(b_ISBN, b_name, true, null);
   for (int i = 0; i < BookAplication.book.length; i++) {
      if (BookAplication.book[i] == null) {
    	  BookAplication.book[i] = book;
         return true;
      }
   }
   return false;
}

public boolean bookcheck(String b_ISBN2) {

   return false;
}
// 6. ISBN 체크 메소드

// 대여
public boolean book_rental(String loginid) {// 로그인아이디를 가지고 책을빌리겠다고함
   System.out.println("========책대여페이지==========");
   System.out.println("도서코드입력 :");
   String b_ISBN = BookAplication.scanner.next();

   boolean check = bookcheck(b_ISBN);
   if (check) {

      for (int i = 0; i < BookAplication.book.length; i++) {
         if (BookAplication.book[i] != null && BookAplication.book[i].getB_ISBN().equals(b_ISBN)) { // 같은 도서코드
                                                                                 // 확인
            // 대여여부 확인
            if (BookAplication.book[i].isB_rental()) {// ?????값이안들어가있는게 원래true 로 시작하는지,,
               System.out.println(" 현재 도서 대여 가능 ");

               BookAplication.book[i].setB_rental(false); // false이면 왜성공인지

               BookAplication.book[i].setM_id(loginid);// 빌릴떄 아이디를가져감

               return true;
            } else {
               System.out.println("  대여불가");
               return false;
            }
         }
      }
   } else {
      System.out.println("도서가 존재하지않습니다");
      return false; // b_ISBN 을 가지고 결과값을준다 비어있거나 등록된 번호가같으면 맞음 만약에
   }
   return false;
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
               BookAplication.book[i].setB_rental(true);
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
