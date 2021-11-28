package 과제5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class file {

	
	
	
	//메모리 [주기억장치=ram] :변수 배열 객체 등등 프로그램 종류시 다초기화
		//주기억장치 현재 실행중인 프로그램 [명령어집합] 기억
			//전기x 저장x => 휘발성 메모리
			//보조기억장치 [c,usb,파일,db]
			//전기x 저장  비휘발성 메모리
		//파일 <-------------------------------스트림------------->java프로그램
		
		
		public static void main(String[] args) throws IOException {
		
			FileOutputStream fileOutputStream =
					/*fileoutputstream : 파일 출력 스트림 [해당파일이 없으면 파일 생성한다] 경로명적기*/
					new FileOutputStream("C:\\Users\\iz200317\\git\\space\\dongjin\\src\\과제5/test.txt");
			 			// 무조건 예외처리 발생
			String 문자열 ="이크립스에서 작성된 문서입니다";// 한글 14*2=>28+2(sp)=>30
			fileOutputStream.write( 문자열.getBytes() ); //write(바이트형 ): 해당 파일에 쓰기
			
			
			//fileINput stream: 파일 입력 스트림
			// FileInputStream 객체명 = new FileInputStream("파일경로/파일명.확장자");
			FileInputStream fileInputStream=
					new FileInputStream("C:\\Users\\iz200317\\git\\space\\dongjin\\src\\과제5/test.txt");
			byte[]바이트배열 = new byte[1024];
			
			fileInputStream.read(바이트배열); //read(바이트 배열) ; 해당 파일을 바이트 배열에 읽기
			String strread = new String(바이트배열); // 파일을 읽어오는 
			System.out.println("현재 파일의 내용은 :"+strread);
			
			
			Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.println("메모장에 입력할 데이터: ");
				String outstr = scanner.next();
				outstr = outstr +"\n";
				fileOutputStream.write(outstr.getBytes());
				
			}
			
		}
		//me
		
}
