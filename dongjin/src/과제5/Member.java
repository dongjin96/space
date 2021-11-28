package 과제5;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Member {


		private String id;
		private String password;
		private String name;
		private String phone;
							// private 로설정해서 클래스 외부에서 접근을 차단한다
		
		//2.생성자
			// 빈생성자 : 다른곳에서 사용할수있기떄문
		public Member() {}
			// 모든 필드를 받는 생성자 
		public Member(String id, String password, String name, String phone) { // 인수를 입력받아서 저장
			this.id = id;
			this.password = password;
			this.name = name;
			this.phone = phone;
		}
		
		//3.메소드 
			// 1. private 필드 사용시 get , set [ 외부 클래스가 접근 ]
			// 2. 로그인 메소드 
		public void login() {
			
		}
			// 3. 회원가입 메소드 
		public void signup() {
			//0.입력객체 가져오기 
			Scanner scanner = Memberfile.scanner;
		
			// 1. 입력
			System.out.println(" *** 회원가입 페이지 *** ");
			System.out.println(" 아이디 : ");		String id = scanner.next();
			System.out.println(" 비밀번호 : ");	String password = scanner.next();
			System.out.println(" 이름 : ");		String name = scanner.next();
			System.out.println(" 연락처 : ");		String phone = scanner.next();
				// 여기에서 입력받을 값을 meber에 저장
			Member member = new Member(id, password, name, phone);
				
			
				for( int i = 0 ; i<Memberfile.members.length ; i++ ) {
					if( Memberfile.members[i] == null) {	// 인덱스가 비어있으면
						Memberfile.members[i] = member; break;	// 저장
					}
				}
		
			try {
				
					FileOutputStream fileOutputStream = // FileOutputStream 파일 출력 하는 객체
							new FileOutputStream("C:\\Users\\오동진\\Desktop\\space\\dongjin\\src\\과제5.txt" , true ); //******중요true 이어쓰기 경로쓰기
					// 2. 객체 내보내기 [ 필드 구분  ( \n: 회원구분  , : 필드구분 ]
						String outstring = member.id+","+member.password+","+member.name+","+member.phone+"\n"; //멤버에 저장되어있는 회원의 정보를 내보내서 파일처리한다
						fileOutputStream.write( outstring.getBytes() ); // 바이트열 변환후 쓰기 
			}
			catch (Exception e) {
				System.out.println(" [알림] : 회원 DB 저장 실패 : " + e);
			}
			
		}
		
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
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}

	}

