package ����5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class file {

	
	
	
	//�޸� [�ֱ����ġ=ram] :���� �迭 ��ü ��� ���α׷� ������ ���ʱ�ȭ
		//�ֱ����ġ ���� �������� ���α׷� [��ɾ�����] ���
			//����x ����x => �ֹ߼� �޸�
			//���������ġ [c,usb,����,db]
			//����x ����  ���ֹ߼� �޸�
		//���� <-------------------------------��Ʈ��------------->java���α׷�
		
		
		public static void main(String[] args) throws IOException {
		
			FileOutputStream fileOutputStream =
					/*fileoutputstream : ���� ��� ��Ʈ�� [�ش������� ������ ���� �����Ѵ�] ��θ�����*/
					new FileOutputStream("C:\\Users\\iz200317\\git\\space\\dongjin\\src\\����5/test.txt");
			 			// ������ ����ó�� �߻�
			String ���ڿ� ="��ũ�������� �ۼ��� �����Դϴ�";// �ѱ� 14*2=>28+2(sp)=>30
			fileOutputStream.write( ���ڿ�.getBytes() ); //write(����Ʈ�� ): �ش� ���Ͽ� ����
			
			
			//fileINput stream: ���� �Է� ��Ʈ��
			// FileInputStream ��ü�� = new FileInputStream("���ϰ��/���ϸ�.Ȯ����");
			FileInputStream fileInputStream=
					new FileInputStream("C:\\Users\\iz200317\\git\\space\\dongjin\\src\\����5/test.txt");
			byte[]����Ʈ�迭 = new byte[1024];
			
			fileInputStream.read(����Ʈ�迭); //read(����Ʈ �迭) ; �ش� ������ ����Ʈ �迭�� �б�
			String strread = new String(����Ʈ�迭); // ������ �о���� 
			System.out.println("���� ������ ������ :"+strread);
			
			
			Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.println("�޸��忡 �Է��� ������: ");
				String outstr = scanner.next();
				outstr = outstr +"\n";
				fileOutputStream.write(outstr.getBytes());
				
			}
			
		}
		//me
		
}
