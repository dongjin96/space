package day13_����2;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Member {

	private String id;
	private String password;
	private String name;
	private String phone;
	
	
	public Member() {}
	
	public Member(String id, String password, String name, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	public void signup() {
		Scanner scanner = Memberfile.scanner;
		
		System.out.println("==============ȸ������ ������==============");
		System.out.println("���̵� :"); String id = scanner.next();
		System.out.println("��й�ȣ :"); String  password = scanner.next();
		System.out.println("�̸� :"); String name = scanner.next();
		System.out.println("�ڵ��� ��ȣ :"); String  phone = scanner.next();
		Member member = new Member(id,password,name,phone);
		
		for (int i = 0; i < Memberfile.members.length; i++) {
			if(Memberfile.members[i]==null) {
				Memberfile.members[i]= member; break;
			}
			
		}
		try {
			FileOutputStream  fileOutputStream= new FileOutputStream("C:\Users\������\Desktop\space2\dongjin\src\day13_����2.txt", true );// true ������ ��������ؼ��̴�
			String outString = member.id+","+member.password+","+member.name+","+member.phone+"\n";
			fileOutputStream.write(outString.getBytes());
			
		} catch (Exception e) {
			// TODO: handle exception
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
