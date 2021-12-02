package ����10_day13_����2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4_ȸ����_List {

	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<User> users = new ArrayList<>(); //ȸ������ �����������Ѵ� �Ѱ����� ���尡�� ������ user����Ŭ���� �°���
/*ArrayList:Ÿ�Լ�������
 * 0���ͽ��� 
 * �뷮�� ���Ҽ�����
 * size�ι���
		
		*/
		
			
		
		try {  // ��ο��ִ� ���� ��������
			FileInputStream fileInputStream = //   FileInputStream(���)
				new FileInputStream("C:/Users/505/git/space/dongjin/src/����10_day13_����2userlist.txt");
			
				byte[] bytes = new byte[1024]; // byte���� ���س��´� �ѱ� 2 ���� 1 ���Ǵµ� 1024 ����Ʈ �� ������ �ִ� ���ڼ��� �����صξ���
				
				fileInputStream.read( bytes );  // ����Ʈ�� �о�´�
				
				String inString = new String(bytes); //����Ʈ�� ���ڿ��� �ٲ۴� �׸��� instring�� ����
				
				//2. ȸ�������ϱ�
				String[] usernum =  inString.split("\n"); // split�� ����ؼ� �迭�� �����Ѵ� �׸��� string[]�ε���usernum ������
				//�ʵ带 �����Ѵ�
				for( String temp : usernum ) { //for �ڷ��� ���� : �迭) usernum���ִ� ȸ������ŭ �迭�� ������
					String[] userdata =  temp.split(","); //split(",");���� temp �������� �׸���String[] userdata�� ����
					if( userdata.length == 1 ) break;
					// ����Ʈ�� ȸ�� ���̵Ǹ� �����
				
					 User user = new User( userdata[0] , userdata[1] , userdata[2] ); //��ü�����ؼ�user����´ٱ׸���
			
					users.add( user); //user�� ArrayList���ִ� users �߰��Ѵ�
				}
		}
		catch (Exception e) { // Ʈ���� ĳ�� ~! ����ó���ؼ� 
			System.out.println(" [[ ���� �ҷ����� ���� ]]"); // �����߻��� syso("�����")�������Ѵ�
		}
		
	 
		while(true) { // ����
			
			System.out.println("1.ȸ������ 2.�α��� ");//�޴���
			int ch = scanner.nextInt();  // ���ڷιޱ�
			if( ch == 1 ) {
				 
				System.out.println(" ���̵� : ");		String id = scanner.next();
				System.out.println(" ��й�ȣ : ");	String password = scanner.next();
				System.out.println(" ���� : ");		String name = scanner.next();
				
			
				User user = new User(id,password,name);  // id password name ��  user�������Ѵ�
				
					
					boolean idcheck = true;  // ���̵��ߺ�üũ
					for( User temp : users ) {// ArrayList���ִ� users���ִ� ȸ��������ŭ temp��� ��������ؼ� ������
						if( temp.getId().equals(id) ) { // �Է��Ѿ��̵��  ArrayList���ִ� usersd���ִ� ���̵� �Ͱ�����
							System.out.println(" [[ �ߺ��� ���̵� �Դϴ� ]]");// ������ �������Ѵ�
							idcheck=false; break;// false������ �ٲ۴�	 break;�ʼ� �ƴϸ� ��ӵ���;;
						}
					}
			
				if( idcheck ) {users.add( user ); System.out.println(" [[ ȸ������ ���� ]]"); //idcheck �� true�̰��Է��������� ����� user�� users�迭����Ű��� ȸ�����Լ���
					
						try {	
							FileOutputStream fileOutputStream =  // �ٷ� ���� ó���ؼ� ��ο� ������ҷ� txt���ϸ�������
								new FileOutputStream("C:/Users/505/git/space/dongjin/src/����10_day13_����2userlist.txt" , true );
							
						
							String outstring = user.getId()+","+user.getPassword()+","+user.getName()+"\n";
							// ȸ��������� ���̵� ","��й�ȣ","�̸��� ���� ���������Ѵ� ���ڷ� ����
						
							fileOutputStream.write( outstring.getBytes() );//���ڸ� ����Ʈȭ�ؼ� ��������
						
							System.out.println(" [[ ���� ó�� ���� ]]");
					
						}
						catch (Exception e) {
							System.out.println(" [[ ���� ó�� ���� ]]");
						}
				}
			}
			else if( ch == 2  ) {
			
				System.out.println(" ���̵� : ");		String id = scanner.next();
				System.out.println(" ��й�ȣ : ");	String password = scanner.next();
				
				
				boolean logincheck = true; //�α����� Ȯ�� true ������ ����
				for( User temp : users ) { //ArrayList���ִ� users �迭 Ŭ���� ���� : �迭��
					if( temp.getId().equals(id) && temp.getPassword().equals(password) ) {//�Է��� ���̵� �� ��й�ȣ�� ArrayList���ִ� ȸ�������ܰ��ٸ�
						System.out.println(" [[ �α��� ���� ]]"); //����~!
						logincheck = false; // �ٲ����~!

					
						while(true) {// ȸ�� �޴�
							System.out.println("1.ȸ������ 2.ȸ������ 3.ȸ��Ż�� 4.�α׾ƿ� ");
							int ch2 = scanner.nextInt();
							
							if( ch2 == 1) { // ȸ���������ִ� 
								System.out.println(" ���̵� : " + temp.getId() );
								System.out.println(" ���� : " + temp.getName() );
							}
							else if( ch2 == 2) {
							
								System.out.println(" ������ ���� : " ); String newname = scanner.next();
																							//���ο� �̸� ����
								temp.setName(newname); // newname �� temp�� �����Ѵ�
							
								try {
								
									FileOutputStream fileOutputStream =  // ��ο� ����ȭ �ؼ� ������
											new FileOutputStream("C:/Users/505/git/space/dongjin/src/����10_day13_����2userlist.txt");
									
									// 1. ����Ʈ�� ��� ȸ�� ���� [ ������Ʈ ]
									String outString = "";  // ��� ȸ���� ������ ���� ���ڿ�
									for( User temp2 : users ) { 
										
										String outtemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
										// ������ ������ 
										outString += outtemp;//���� ���� ȸ�������� ��ģ��
									}
								
									fileOutputStream.write( outString.getBytes() );// ����ȭ�ؼ� ��������
									
								}catch (Exception e) {
								
								}
										
							}
							else if( ch2 == 3 ) {
								
								users.remove(temp);  // ȸ������Ʈ���� �����ع�����
								System.out.println(" [[ ȸ��Ż�� : �α׾ƿ� ]]");
							
								try {
									
									FileOutputStream fileOutputStream =  // ��η� ����ȭ �ؼ� ��������
											new FileOutputStream("C:/Users/505/git/space/dongjin/src/����10_day13_����2userlist.txt");
									
									// 1. ����Ʈ�� ��� ȸ�� ���� [ ������Ʈ ]
									String outString = "";  //��� ȸ���� ������ ���� ���ڿ� 
									for( User temp2 : users ) { 
										
										String outtemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
									 // ���ο� ������  ���������� ��ģ�� = ������Ʈ
										outString += outtemp;
									}
						
									fileOutputStream.write( outString.getBytes() );
										// ����ȭ�ؼ� �ٽ� ���´� ==������Ʈ
								}catch (Exception e) {
									// TODO: handle exception
								}
								
								break;
							}
							else if( ch2 == 4) { System.out.println(" [[ �α׾ƿ� ]] "); break;}
						}
						
						break;
					}
				}
				if( logincheck ) { System.out.println(" [[ ������ ȸ�������� �����ϴ� ]]  "); }
			}	
		}
	}
}

