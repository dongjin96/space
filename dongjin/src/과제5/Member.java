package ����5;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Member {


		private String id;
		private String password;
		private String name;
		private String phone;
							// private �μ����ؼ� Ŭ���� �ܺο��� ������ �����Ѵ�
		
		//2.������
			// ������� : �ٸ������� ����Ҽ��ֱ⋚��
		public Member() {}
			// ��� �ʵ带 �޴� ������ 
		public Member(String id, String password, String name, String phone) { // �μ��� �Է¹޾Ƽ� ����
			this.id = id;
			this.password = password;
			this.name = name;
			this.phone = phone;
		}
		
		//3.�޼ҵ� 
			// 1. private �ʵ� ���� get , set [ �ܺ� Ŭ������ ���� ]
			// 2. �α��� �޼ҵ� 
		public void login() {
			
		}
			// 3. ȸ������ �޼ҵ� 
		public void signup() {
			//0.�Է°�ü �������� 
			Scanner scanner = Memberfile.scanner;
		
			// 1. �Է�
			System.out.println(" *** ȸ������ ������ *** ");
			System.out.println(" ���̵� : ");		String id = scanner.next();
			System.out.println(" ��й�ȣ : ");	String password = scanner.next();
			System.out.println(" �̸� : ");		String name = scanner.next();
			System.out.println(" ����ó : ");		String phone = scanner.next();
				// ���⿡�� �Է¹��� ���� meber�� ����
			Member member = new Member(id, password, name, phone);
				
			
				for( int i = 0 ; i<Memberfile.members.length ; i++ ) {
					if( Memberfile.members[i] == null) {	// �ε����� ���������
						Memberfile.members[i] = member; break;	// ����
					}
				}
		
			try {
				
					FileOutputStream fileOutputStream = // FileOutputStream ���� ��� �ϴ� ��ü
							new FileOutputStream("C:\\Users\\������\\Desktop\\space\\dongjin\\src\\����5.txt" , true ); //******�߿�true �̾�� ��ξ���
					// 2. ��ü �������� [ �ʵ� ����  ( \n: ȸ������  , : �ʵ屸�� ]
						String outstring = member.id+","+member.password+","+member.name+","+member.phone+"\n"; //����� ����Ǿ��ִ� ȸ���� ������ �������� ����ó���Ѵ�
						fileOutputStream.write( outstring.getBytes() ); // ����Ʈ�� ��ȯ�� ���� 
			}
			catch (Exception e) {
				System.out.println(" [�˸�] : ȸ�� DB ���� ���� : " + e);
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

