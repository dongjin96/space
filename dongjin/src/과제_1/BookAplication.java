package ����_1;

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
				  System.out.println("================�α���==============");
				  System.out.println("1.�α���|2.ȸ������|3.���̵�ã��|4.��й�ȣã�� :");int ch = scanner.nextInt();
				  
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
						System.out.println("ȸ�����Լ���");
					}else {
						System.out.println("ȸ�����Խ���");
					}
					  
					
				}
				  if (ch==3) {
					  String findid = Member.findid();
					  if (findid==null) {System.out.println("���̵� ã�����");
					  
						
					}else {
						System.out.println("���̵�ã�⼺��"+findid);
					}
					
				}
				  if (ch==4) {
					  String findpw = Member.findpw();
					  if (findpw==null) {System.out.println("��й�ȣ ã�����");
					  
						
					}else {
						System.out.println("ã�⼺��"+findpw);
					}
					
				}
			  }
		  }
		  
		  private static void member_menu(String loginid) {
		      Book book = new Book();
		      while (true) {
		         System.out.println("==========ȸ����������=========");
		         System.out.println(" 1.������� 2.�뿩 3.�ݳ�  4.�α׾ƿ� ");
		         System.out.print("���� : ");
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
		            System.out.println(" [ �˸� ] : �α׾ƿ� �Ǿ����ϴ� ");
		            return;
		         }
		      }
		   }
		  
		  
		  
		  public static void  admin_menu() {
			  System.out.println("========adminmenu=======");
			  System.out.println("1.å����ϱ� 2. ���Ȯ��3.�α׾ƿ� :");int ch = scanner.nextInt();
			  
			  if (ch == 1) {
		         ����_1.Book.book_add();
		         }
		         if (ch == 2) {
		            ����_1.Book.book_list();
		         }
		         if (ch == 3) {
		            System.out.println(" [ �˸� ] : �α׾ƿ� �Ǿ����ϴ� ");
		            return;
		         }
		      }
		  
		 
		  
		  
		  
	
	
}
