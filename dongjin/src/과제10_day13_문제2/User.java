package 과제10_day13_문제2;
/*먼저 로그인에 필요한 회원 정보를 미리정해놓는다
 * 
 * 
 * 
 * */
public class User {
	// 필드
	private String id;
	private String password;
	private String name;
	//생성자 
	public User() {}
	//생성자 
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	// 메소드 get , set
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}