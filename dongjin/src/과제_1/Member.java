package ����_1;

public class Member {
	
	public String m_id;
	public String m_password;
	public String m_name;
	public String m_phone;

	
	
	public Member() {}



	public Member(String m_id, String m_password, String m_name, String m_phone) {
		super();
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}

//ȸ������
	public static boolean signup() {
		
		System.out.println("===============ȸ������==============");
		System.out.println("id �Է��ϱ� :"); String m_id = BookAplication.scanner.next();
		boolean check = idcheck(m_id);
		if (check) {
			System.out.println("�˼����� �����Դϴ�");
			return false;
		}
		
		
		System.out.println("pw �Է��ϱ�  :");String m_pw = BookAplication.scanner.next();
		System.out.println("�̸� �Է��ϱ�  :");String m_name = BookAplication.scanner.next();
		System.out.println("��ȭ��ȣ �Է��ϱ�  :");String m_phone = BookAplication.scanner.next();
		
		Member member = new Member(m_id, m_pw, m_name, m_phone);
		
		for (int i = 0; i < BookAplication.member.length; i++) {
			if (BookAplication.member[i]==null) {
				BookAplication.member[i]= member;
				return true;
			}
		}return false;
		

		
		
	
		
	}
	
	//���̵��ߺ�
	
	public static boolean idcheck(String m_id) {
		for (int i = 0; i < BookAplication.member.length; i++) {
			if (BookAplication.member[i]!=null&& BookAplication.member[i].getM_id().equals(m_id)) {
				 System.out.println("�ߺ��Ⱦ��̵��Դϴ�");
				 return true;
			}
		}
		return false;
	}
	
	
	



//�α���
	public static String login() {
		System.out.println("====================�α���������===================");
		System.out.println("id�Է��ϱ� :");  String m_id = BookAplication.scanner.next();
		System.out.println("pw �Է��ϱ�  :"); String m_pw = BookAplication.scanner.next();
		
		for (int i = 0; i < BookAplication.member.length; i++) {
			if (BookAplication.member[i]!=null&& BookAplication.member[i].getM_id().equals(m_id)&&
			BookAplication.member[i].getM_password().equals(m_pw)){
				System.out.println(" �α��� ����");
				return m_id;
				
			}
		}return null;
	}
	
	
	

// ���̵�ã��
	public static String findid() {
		System.out.println("======================���̵�ã��============");
		System.out.println("�̸� �Է��ϱ�  :");String m_name = BookAplication.scanner.next();
		System.out.println("��ȭ��ȣ �Է��ϱ�  :");String m_phone = BookAplication.scanner.next();
		for (int i = 0; i < BookAplication.member.length; i++) {
			if (BookAplication.member[i]!=null&&BookAplication.member.equals(m_phone)) {
				System.out.println("���̵�ã�� ���� :");
				return BookAplication.member[i].getM_id();
			}
		}System.out.println("ã�����");
		return null;
	}
	
	
	
	
	
	
//��й�ȣã��	
	public static String findpw() {
		System.out.println("======================���̵�ã��============");
		System.out.println("�̸� �Է��ϱ�  :");String m_name = BookAplication.scanner.next();
		System.out.println("��ȭ��ȣ �Է��ϱ�  :");String m_phone = BookAplication.scanner.next();
		for (int i = 0; i < BookAplication.member.length; i++) {
			if (BookAplication.member[i]!=null&&BookAplication.member.equals(m_phone)) {
				System.out.println("��й�ȣã�� ���� :");
				return BookAplication.member[i].getM_password();
			}
		}System.out.println("ã�����");
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public String getM_id() {
		return m_id;
	}



	public void setM_id(String m_id) {
		this.m_id = m_id;
	}



	public String getM_password() {
		return m_password;
	}



	public void setM_password(String m_password) {
		this.m_password = m_password;
	}



	public String getM_name() {
		return m_name;
	}



	public void setM_name(String m_name) {
		this.m_name = m_name;
	}



	public String getM_phone() {
		return m_phone;
	}



	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	
	
}
