package dongjin;

import java.util.Scanner;

public class BookAplication {
	   public static Member[] members = new Member[100];
	   public static Book[] book = new Book[100];

	   public static Scanner scanner = new Scanner(System.in);

	   public static void main(String[] args) {
	      main_menu();
	   }

	   public static void main_menu() {

	      while (true) {
	         System.out.println("=============로그인페이지=========");
	         System.out.println("1.회원가입|2.로그인|3.id찾기|4.pw찾기|>>>>: ");// scanner 선언안되서 위에public static
	         int ch = scanner.nextInt();

	         if (ch == 1) {
	            Boolean singnup = Member.signup();
	            if (true) {
	               System.out.println("회원가입성공했습니다");

	            } else {
	               System.out.println("회원가입실패했습니다");
	            }

	         }
	         if (ch == 2) {
	            String loginid = Member.login();

	            // 1. 로그인 실패
	            if (loginid == null) {
	               System.out.println(" [[ 알림 ]] : 동일한 회원정보가 없습니다");
	            }

	            else if (loginid.equals("admin")) {
	               admin_menu();
	            } // 어드민 설정하면서 봄
	            // 3. 일반회원메뉴
	            else {
	               member_menu(loginid);
	            }
	         }
	         if (ch == 3) {
	            String findid = Member.findid();// findid==null떄문에봄
	            if (findid == null) {
	               System.out.println("아이디를 찾지못했습니다");

	            } else {
	               System.out.println("id를찾았습니다" + findid);

	            }
	         }
	         if (ch == 4) {
	            String findpw = Member.findpw();// findid==null떄문에봄
	            if (findpw == null) {
	               System.out.println("비밀번호를 찾지못했습니다");

	            } else {
	               System.out.println("pw를찾았습니다" + findpw);

	            }

	         }

	      }

	   }

	   private static void member_menu(String loginid) {
	      Book book = new Book();
	      while (true) {
	         System.out.println("==========회원제페이지=========");
	         System.out.println(" 1.도서목록 | 2.대여 | 3.반납 | 4.로그아웃 ");
	         System.out.print("선택 : ");
	         int ch = scanner.nextInt();
	         if (ch == 1) {
	            book.book_list();
	         }
	         if (ch == 2) {
	            book.book_rental(loginid);
	         }
	         if (ch == 3) {
	            book.book_return(loginid);
	         }
	         if (ch == 4) {
	            System.out.println(" [[ 알림 ]] : 로그아웃 되었습니다 ");
	            return;
	         }
	      }
	   }

	   private static void admin_menu() {
	      Book book = new Book(); // Book 임시객체 : 메소드 호출용
	      while (true) {
	         System.out.println(" ---------- Admin Menu ----------");
	         System.out.println(" 1.도서등록 | 2.도서목록 | 3.로그아웃 ");
	         System.out.print("선택 : ");
	         int ch = scanner.nextInt();
	         if (ch == 1) {
	            book.book_add();
	         }
	         if (ch == 2) {
	            book.book_list();
	         }
	         if (ch == 3) {
	            System.out.println(" [[ 알림 ]] : 로그아웃 되었습니다 ");
	            return;
	         }
	      }
	   }
}
