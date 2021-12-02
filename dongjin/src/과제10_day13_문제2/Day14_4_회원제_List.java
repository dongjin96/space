package 과제10_day13_문제2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4_회원제_List {

	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<User> users = new ArrayList<>(); //회원들의 정보를저장한다 한가지만 저장가능 하지만 user하위클래스 는가능
/*ArrayList:타입설정가능
 * 0부터시작 
 * 용량을 정할수있음
 * size로받음
		
		*/
		
			
		
		try {  // 경로에있는 파일 가져오기
			FileInputStream fileInputStream = //   FileInputStream(경로)
				new FileInputStream("C:/Users/505/git/space/dongjin/src/과제10_day13_문제2userlist.txt");
			
				byte[] bytes = new byte[1024]; // byte수를 정해놓는다 한글 2 영어 1 사용되는데 1024 바이트 를 설정해 최대 글자수를 지정해두었다
				
				fileInputStream.read( bytes );  // 바이트를 읽어온다
				
				String inString = new String(bytes); //바이트를 문자열로 바꾼다 그리고 instring에 저장
				
				//2. 회원구분하기
				String[] usernum =  inString.split("\n"); // split을 사용해서 배열을 구분한다 그리고 string[]인덱스usernum 에저장
				//필드를 구분한다
				for( String temp : usernum ) { //for 자료향 변수 : 배열) usernum에있는 회원수만큼 배열을 돌린다
					String[] userdata =  temp.split(","); //split(",");으로 temp 를나눈다 그리고String[] userdata에 저장
					if( userdata.length == 1 ) break;
					// 리스트속 회원 일이되면 멈춘다
				
					 User user = new User( userdata[0] , userdata[1] , userdata[2] ); //객체생성해서user에담는다그리고
			
					users.add( user); //user을 ArrayList에있는 users 추가한다
				}
		}
		catch (Exception e) { // 트라이 캐취 ~! 예외처리해서 
			System.out.println(" [[ 파일 불러오기 실패 ]]"); // 문제발생시 syso("경고문구")나오게한다
		}
		
	 
		while(true) { // 무한
			
			System.out.println("1.회원가입 2.로그인 ");//메뉴판
			int ch = scanner.nextInt();  // 숫자로받기
			if( ch == 1 ) {
				 
				System.out.println(" 아이디 : ");		String id = scanner.next();
				System.out.println(" 비밀번호 : ");	String password = scanner.next();
				System.out.println(" 성명 : ");		String name = scanner.next();
				
			
				User user = new User(id,password,name);  // id password name 을  user에저장한다
				
					
					boolean idcheck = true;  // 아이디중복체크
					for( User temp : users ) {// ArrayList에있는 users에있는 회원정보만큼 temp라는 변수사용해서 돌린다
						if( temp.getId().equals(id) ) { // 입력한아이디와  ArrayList에있는 usersd에있는 아이디 와같으면
							System.out.println(" [[ 중복된 아이디 입니다 ]]");// 문구가 나오게한다
							idcheck=false; break;// false값으로 바꾼다	 break;필수 아니면 계속돈다;;
						}
					}
			
				if( idcheck ) {users.add( user ); System.out.println(" [[ 회원가입 성공 ]]"); //idcheck 가 true이고입력한정보가 저장된 user가 users배열에들거가면 회원가입성공
					
						try {	
							FileOutputStream fileOutputStream =  // 바로 파일 처리해서 경로에 통한장소로 txt파일만들어서저장
								new FileOutputStream("C:/Users/505/git/space/dongjin/src/과제10_day13_문제2userlist.txt" , true );
							
						
							String outstring = user.getId()+","+user.getPassword()+","+user.getName()+"\n";
							// 회원에저장된 아이디 ","비밀번호","이름을 순서 맞춰저장한다 문자로 저장
						
							fileOutputStream.write( outstring.getBytes() );//문자를 바이트화해서 내보낸다
						
							System.out.println(" [[ 파일 처리 성공 ]]");
					
						}
						catch (Exception e) {
							System.out.println(" [[ 파일 처리 실패 ]]");
						}
				}
			}
			else if( ch == 2  ) {
			
				System.out.println(" 아이디 : ");		String id = scanner.next();
				System.out.println(" 비밀번호 : ");	String password = scanner.next();
				
				
				boolean logincheck = true; //로그인이 확인 true 값으로 설정
				for( User temp : users ) { //ArrayList에있는 users 배열 클래스 변수 : 배열명
					if( temp.getId().equals(id) && temp.getPassword().equals(password) ) {//입력한 아이디 와 비밀번호를 ArrayList에있는 회원정보외같다면
						System.out.println(" [[ 로그인 성공 ]]"); //성공~!
						logincheck = false; // 바꿔놓기~!

					
						while(true) {// 회원 메뉴
							System.out.println("1.회원정보 2.회원수정 3.회원탈퇴 4.로그아웃 ");
							int ch2 = scanner.nextInt();
							
							if( ch2 == 1) { // 회원정보에있는 
								System.out.println(" 아이디 : " + temp.getId() );
								System.out.println(" 성명 : " + temp.getName() );
							}
							else if( ch2 == 2) {
							
								System.out.println(" 수정할 성명 : " ); String newname = scanner.next();
																							//새로운 이름 받음
								temp.setName(newname); // newname 을 temp에 설정한다
							
								try {
								
									FileOutputStream fileOutputStream =  // 경로에 파일화 해서 보낸다
											new FileOutputStream("C:/Users/505/git/space/dongjin/src/과제10_day13_문제2userlist.txt");
									
									// 1. 리스트내 모든 회원 저장 [ 업데이트 ]
									String outString = "";  // 모든 회원의 정보를 담을 문자열
									for( User temp2 : users ) { 
										
										String outtemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
										// 수정된 정보를 
										outString += outtemp;//원래 기존 회원정보와 합친다
									}
								
									fileOutputStream.write( outString.getBytes() );// 문자화해서 내보낸다
									
								}catch (Exception e) {
								
								}
										
							}
							else if( ch2 == 3 ) {
								
								users.remove(temp);  // 회원리스트에서 삭제해버린다
								System.out.println(" [[ 회원탈퇴 : 로그아웃 ]]");
							
								try {
									
									FileOutputStream fileOutputStream =  // 경로로 파일화 해서 내보내기
											new FileOutputStream("C:/Users/505/git/space/dongjin/src/과제10_day13_문제2userlist.txt");
									
									// 1. 리스트내 모든 회원 저장 [ 업데이트 ]
									String outString = "";  //모든 회원의 정보를 담을 문자열 
									for( User temp2 : users ) { 
										
										String outtemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
									 // 새로운 정보와  기존정보를 합친다 = 업데이트
										outString += outtemp;
									}
						
									fileOutputStream.write( outString.getBytes() );
										// 문자화해서 다시 적는다 ==업데이트
								}catch (Exception e) {
									// TODO: handle exception
								}
								
								break;
							}
							else if( ch2 == 4) { System.out.println(" [[ 로그아웃 ]] "); break;}
						}
						
						break;
					}
				}
				if( logincheck ) { System.out.println(" [[ 동일한 회원정보가 없습니다 ]]  "); }
			}	
		}
	}
}

