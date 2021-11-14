package 과제_1;

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

//회원가입
	public static boolean signup() {
		
		System.out.println("===============회원가입==============");
		System.out.println("id 입력하기 :"); String m_id = BookAplication.scanner.next();
		boolean check = idcheck(m_id);
		if (check) {
			System.out.println("알수없는 정보입니다");
			return false;
		}
		
		
		System.out.println("pw 입력하기  :");String m_pw = BookAplication.scanner.next();
		System.out.println("이름 입력하기  :");String m_name = BookAplication.scanner.next();
		System.out.println("전화번호 입력하기  :");String m_phone = BookAplication.scanner.next();
		
		Member member = new Member(m_id, m_pw, m_name, m_phone);
		
		for (int i = 0; i < BookAplication.member.length; i++) {
			if (BookAplication.member[i]==null) {
				BookAplication.member[i]= member;
				return true;
			}
		}return false;
		

		
		
	
		
	}
	
	//아이디중복
	
	public static boolean idcheck(String m_id) {
		for (int i = 0; i < BookAplication.member.length; i++) {
			if (BookAplication.member[i]!=null&& BookAplication.member[i].getM_id().equals(m_id)) {
				 System.out.println("중복된아이디입니다");
				 return true;
			}
		}
		return false;
	}
	
	
	



//로그인
	public static String login() {
		System.out.println("====================로그인페이지===================");
		System.out.println("id입력하기 :");  String m_id = BookAplication.scanner.next();
		System.out.println("pw 입력하기  :"); String m_pw = BookAplication.scanner.next();
		
		for (int i = 0; i < BookAplication.member.length; i++) {
			if (BookAplication.member[i]!=null&& BookAplication.member[i].getM_id().equals(m_id)&&
			BookAplication.member[i].getM_password().equals(m_pw)){
				System.out.println(" 로그인 성공");
				return m_id;
				
			}
		}return null;
	}
	
	
	

// 아이디찾기
	public static String findid() {
		System.out.println("======================아이디찾기============");
		System.out.println("이름 입력하기  :");String m_name = BookAplication.scanner.next();
		System.out.println("전화번호 입력하기  :");String m_phone = BookAplication.scanner.next();
		for (int i = 0; i < BookAplication.member.length; i++) {
			if (BookAplication.member[i]!=null&&BookAplication.member.equals(m_phone)) {
				System.out.println("아이디찾기 성공 :");
				return BookAplication.member[i].getM_id();
			}
		}System.out.println("찾기싪패");
		return null;
	}
	
	
	
	
	
	
//비밀번호찾기	
	public static String findpw() {
		System.out.println("======================아이디찾기============");
		System.out.println("이름 입력하기  :");String m_name = BookAplication.scanner.next();
		System.out.println("전화번호 입력하기  :");String m_phone = BookAplication.scanner.next();
		for (int i = 0; i < BookAplication.member.length; i++) {
			if (BookAplication.member[i]!=null&&BookAplication.member.equals(m_phone)) {
				System.out.println("비밀번호찾기 성공 :");
				return BookAplication.member[i].getM_password();
			}
		}System.out.println("찾기싪패");
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
