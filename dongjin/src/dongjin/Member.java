package dongjin;

public class Member {

	private String m_name;
	private String m_id;
	private String m_pw;
	private String m_ph;

	public Member() {
	}

	public Member(String m_name, String m_id, String m_pw, String m_ph) {
		super();
		this.m_name = m_name;
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_ph = m_ph;
	}

	// ȸ������
	public static boolean signup() {
		System.out.println("=============ȸ������ ������============");
		System.out.println("id�Է��ϱ� :");
		String m_id = BookAplication.scanner.next();

		boolean check = idcheck(m_id); // m_id������ check���־ üũ�Ѵ�
		if (check) {
			System.out.println("�˼����������Դϴ�");
			return false;

		}

		System.out.println("pw�Է��ϱ� :");
		String m_pw = BookAplication.scanner.next();
		System.out.println("�̸��Է��ϱ� :");
		String m_name = BookAplication.scanner.next();
		System.out.println("�̸����Է��ϱ� :");
		String m_email = BookAplication.scanner.next();

		Member member = new Member(m_id, m_pw, m_name, m_email); // ��ü����

		for (int i = 0; i < BookAplication.members.length; i++) {
			if (BookAplication.members[i] == null) {
				BookAplication.members[i] = member;
				return true;

			}
		}
		return false;

	}

	// ���̵� �ߺ� �޼ҵ�
	public static boolean idcheck(String m_id) {
		for (int i = 0; i < BookAplication.members.length; i++) {
			if (BookAplication.members[i] != null && BookAplication.members[i].getM_id().equals(m_id)) {
				return true;
			}

		}
		return false;
	}

	// �α���
	public static String login() {
		System.out.println("=================�α���������=========");
		System.out.println("id �Է� :");
		String m_id = BookAplication.scanner.next();
		System.out.println("pw �Է� :");
		String m_pw = BookAplication.scanner.next();

		for (int i = 0; i < BookAplication.members.length; i++) {
			if (BookAplication.members[i] != null && BookAplication.members[i].equals(m_id)
					&& BookAplication.members[i].equals(m_pw)) {

				return m_id;
			}

		}
		return null;

	}

	// ���̵�ã��
	public static String findid() {
		System.out.println("=========���̵�ã��=======");
		System.out.println("�̸��Է��ϱ� :");
		String m_name = BookAplication.scanner.next();
		System.out.println("�̸����Է��ϱ� :");
		String m_email = BookAplication.scanner.next();

		for (int i = 0; i < BookAplication.members.length; i++) {
			if (BookAplication.members[i] != null && BookAplication.members[i].getM_id().equals(m_email)) {
				return BookAplication.members[i].getM_id();
			}
		}
		return null;
	}

	// ��й�ȣã��
	public static String findpw() {
		System.out.println("=========��й�ȣã��=======");
		System.out.println("id�Է��ϱ� :");
		String m_id = BookAplication.scanner.next();
		System.out.println("�̸����Է��ϱ� :");
		String m_email = BookAplication.scanner.next();

		for (int i = 0; i < BookAplication.members.length; i++) {
			if (BookAplication.members[i] != null && BookAplication.members[i].getM_id().equals(m_email)) {
				return BookAplication.members[i].getM_pw();
			}
		}
		return null;

	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_ph() {
		return m_ph;
	}

	public void setM_ph(String m_ph) {
		this.m_ph = m_ph;
	}

}

	 