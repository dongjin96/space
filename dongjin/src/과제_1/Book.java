package ����_1;

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

	
	
	// å����ϱ�
	public static boolean book_add() {
		
		System.out.println("å������ȣ �Է� :");String b_ISBN = BookAplication.scanner.next();
		boolean check=bookcheck(b_ISBN);
		if (check) {
			System.out.println("������ ������ �����մϴ�");
		}
		System.out.println("å�̸� �Է� :");String b_name =BookAplication.scanner.next();
		
		Book book = new Book(b_ISBN, b_name, true, null);
		for (int i = 0; i < BookAplication.book.length; i++) {
			if (BookAplication.book[i]==null) {
				//BookAplication.book[i]=book;  /// �̺κ� �� ����
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
	//�������
	public static void book_list() {
		System.out.println("============���� ���===============");
				System.out.println("�����̸� ������ȣ �뿩���� �뼭ȸ��");
				for (int i = 0; i < BookAplication.book.length; i++) {
					if (BookAplication.book[i]==null) {
						System.out.println(BookAplication.book[i].getB_name()+BookAplication.book[i].isB_rental()+BookAplication.book[i].getM_id());
						
					}
					 return;
				}
	}
	
	
	// �뿩
	public boolean book_rental(String loginid) {// �α��ξ��̵� ������ å�������ڴٰ���
	   System.out.println("========å�뿩������==========");
	   System.out.println("�����ڵ��Է� :");
	   String b_ISBN = BookAplication.scanner.next();

	   boolean check = bookcheck(b_ISBN);
	   if (check) {
		   for (int i = 0; i < BookAplication.book.length; i++) {
			if (BookAplication.book[i]!=null&& BookAplication.book[i].getB_ISBN().equals(b_ISBN)) {
				// ������� �ʰ� å���ְ� �������� å�� �����ڵ� ��������
				if (BookAplication.book[i].isB_rental()) {
					System.out.println(" ���絵�����Ⱑ��");// ������ true�ϱ�~!!!
					
					 BookAplication.book[i].setB_rental(false); // �������ٰ�ǥ����
		               BookAplication.book[i].setM_id(loginid); // �α��� ���̵� �ΰ�

		               return true;
					
				}else {
					System.out.println("�뿩�Ұ�");
					return false;
				}
			}
		}
		   
	   }return false;
	}
	
	public boolean book_return(String loginid) {

		   System.out.println("============���� �ݳ� ������ =================");
		   System.out.println(" �ݳ�å�ڵ� : ");
		   String b_ISBN = BookAplication.scanner.next(); // å�뿩�͸��������� ���� �ڵ��Է�

		   for (int i = 0; i < BookAplication.book.length; i++) {
		      if (BookAplication.book[i] != null && !BookAplication.book[i].isB_rental()) {// ��Ż ���� Ȯ��

		         if (BookAplication.book[i].getB_ISBN().equals(b_ISBN)) {// �Է��� å�� �����Ѵٸ�
		            // 3.�α��ε� ȸ�� == �뿩ȸ��
		            if (BookAplication.book[i].getM_id().equals(loginid)) {// ����Ʈ�������ϴ� ���̵�Ͱ��ٸ�
		               System.out.println(" [[ �˸� ]] : ���� �ݳ� ���� !!! "); // �ݳ�����
		               BookAplication.book[i].setM_id(null); /// �ݳ��ϰ� �ٽ� �������� ����
		               BookAplication.book[i].setB_rental(true);  // �뿩���� �ϰ� ����
		               return true;
		            }
		         }
		      }
		   }
		   System.out.println("  ���̵� �ٽ�Ȯ�����ּ���");
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
