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

// 3. ������� �޼ҵ�
public void book_list() {
   System.out.println("=============�������==========");
   System.out.println("�����ڵ�\t������\t�뿩����\t�뿩ȸ��");
   for (int i = 0; i < BookAplication.book.length; i++) {
      if (BookAplication.book[i] == null) { // return;
         Book book = BookAplication.book[i];
         System.out.println(
               book.getB_ISBN() + "\t" + book.getB_name() + "\t" + book.isB_rental() + "\t" + book.m_id);// �̷���
                                                                                    // ���

      }
      return;
   }
}

// �������
public boolean book_add() {
   System.out.println("============�������======");
   System.out.println("�����ڵ��Է� :");
   String b_ISBN = BookAplication.scanner.next();
   boolean b_ISBNcheck = bookcheck(b_ISBN);
   if (b_ISBNcheck) {
      System.out.println("������ �����������մϴ�");
      return false;
   }
   System.out.println("������  :");
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
// 6. ISBN üũ �޼ҵ�

// �뿩
public boolean book_rental(String loginid) {// �α��ξ��̵� ������ å�������ڴٰ���
   System.out.println("========å�뿩������==========");
   System.out.println("�����ڵ��Է� :");
   String b_ISBN = BookAplication.scanner.next();

   boolean check = bookcheck(b_ISBN);
   if (check) {

      for (int i = 0; i < BookAplication.book.length; i++) {
         if (BookAplication.book[i] != null && BookAplication.book[i].getB_ISBN().equals(b_ISBN)) { // ���� �����ڵ�
                                                                                 // Ȯ��
            // �뿩���� Ȯ��
            if (BookAplication.book[i].isB_rental()) {// ?????���̾ȵ��ִ°� ����true �� �����ϴ���,,
               System.out.println(" ���� ���� �뿩 ���� ");

               BookAplication.book[i].setB_rental(false); // false�̸� �ּ�������

               BookAplication.book[i].setM_id(loginid);// ������ ���̵𸦰�����

               return true;
            } else {
               System.out.println("  �뿩�Ұ�");
               return false;
            }
         }
      }
   } else {
      System.out.println("������ ���������ʽ��ϴ�");
      return false; // b_ISBN �� ������ ��������ش� ����ְų� ��ϵ� ��ȣ�������� ���� ���࿡
   }
   return false;
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
               BookAplication.book[i].setB_rental(true);
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
