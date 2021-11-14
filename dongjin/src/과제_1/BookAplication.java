package 과제_1;

import java.util.Scanner;




public class BookAplication {

		public static Member[] member = new Member[100];
		public static Book[] book = new Book[100];
		public static Scanner scanner =new Scanner(System.in);
		
		public static void main(String[] args) {
			 main_menu();
		}
		  public static void main_menu() {
			  
			  
			  while(true) {
				  System.out.println("================로그인==============");
				  System.out.println("1.로그인|2.회원가입|3.아이디찾기|4.비밀번호찾기 :");int ch = scanner.nextInt();
				  
				  if (ch==1) {
					 String loginid= Member.login();
					  if (loginid.equals("admin")) {
						  admin_menu();
					}else {
						 member_menu(loginid);
					}
					
				}
				  if (ch==2) {
					  boolean check = Member.signup();
					  if (check) {
						System.out.println("회원가입성공");
					}else {
						System.out.println("회원가입실패");
					}
					  
					
				}
				  if (ch==3) {
					  String findid = Member.findid();
					  if (findid==null) {System.out.println("아이디 찾기실패");
					  
						
					}else {
						System.out.println("아이디찾기성공"+findid);
					}
					
				}
				  if (ch==4) {
					  String findpw = Member.findpw();
					  if (findpw==null) {System.out.println("비밀번호 찾기실패");
					  
						
					}else {
						System.out.println("찾기성공"+findpw);
					}
					
				}
			  }
		  }
		  
		  private static void member_menu(String loginid) {
		      Book book = new Book();
		      while (true) {
		         System.out.println("==========회원제페이지=========");
		         System.out.println(" 1.도서목록 2.대여 3.반납  4.로그아웃 ");
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
		            System.out.println(" [ 알림 ] : 로그아웃 되었습니다 ");
		            return;
		         }
		      }
		   }
		  
		  
		  
		  public static void  admin_menu() {
			  System.out.println("========adminmenu=======");
			  System.out.println("1.책등록하기 2. 등록확인3.로그아웃 :");int ch = scanner.nextInt();
			  
			  if (ch == 1) {
		         과제_1.Book.book_add();
		         }
		         if (ch == 2) {
		            과제_1.Book.book_list();
		         }
		         if (ch == 3) {
		            System.out.println(" [ 알림 ] : 로그아웃 되었습니다 ");
		            return;
		         }
		      }
		  
		 
		  
		  
		  
	
	
}
