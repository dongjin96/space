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
	         System.out.println("=============�α���������=========");
	         System.out.println("1.ȸ������|2.�α���|3.idã��|4.pwã��|>>>>: ");// scanner ����ȵǼ� ����public static
	         int ch = scanner.nextInt();

	         if (ch == 1) {
	            Boolean singnup = Member.signup();
	            if (true) {
	               System.out.println("ȸ�����Լ����߽��ϴ�");

	            } else {
	               System.out.println("ȸ�����Խ����߽��ϴ�");
	            }

	         }
	         if (ch == 2) {
	            String loginid = Member.login();

	            // 1. �α��� ����
	            if (loginid == null) {
	               System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");
	            }

	            else if (loginid.equals("admin")) {
	               admin_menu();
	            } // ���� �����ϸ鼭 ��
	            // 3. �Ϲ�ȸ���޴�
	            else {
	               member_menu(loginid);
	            }
	         }
	         if (ch == 3) {
	            String findid = Member.findid();// findid==null��������
	            if (findid == null) {
	               System.out.println("���̵� ã�����߽��ϴ�");

	            } else {
	               System.out.println("id��ã�ҽ��ϴ�" + findid);

	            }
	         }
	         if (ch == 4) {
	            String findpw = Member.findpw();// findid==null��������
	            if (findpw == null) {
	               System.out.println("��й�ȣ�� ã�����߽��ϴ�");

	            } else {
	               System.out.println("pw��ã�ҽ��ϴ�" + findpw);

	            }

	         }

	      }

	   }

	   private static void member_menu(String loginid) {
	      Book book = new Book();
	      while (true) {
	         System.out.println("==========ȸ����������=========");
	         System.out.println(" 1.������� | 2.�뿩 | 3.�ݳ� | 4.�α׾ƿ� ");
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
	            System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� ");
	            return;
	         }
	      }
	   }

	   private static void admin_menu() {
	      Book book = new Book(); // Book �ӽð�ü : �޼ҵ� ȣ���
	      while (true) {
	         System.out.println(" ---------- Admin Menu ----------");
	         System.out.println(" 1.������� | 2.������� | 3.�α׾ƿ� ");
	         System.out.print("���� : ");
	         int ch = scanner.nextInt();
	         if (ch == 1) {
	            book.book_add();
	         }
	         if (ch == 2) {
	            book.book_list();
	         }
	         if (ch == 3) {
	            System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� ");
	            return;
	         }
	      }
	   }
}
