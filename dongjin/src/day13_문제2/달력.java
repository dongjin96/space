package day13_문제2;

import java.util.Calendar;
import java.util.Scanner;

public class 달력 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도입력해주세요 :");int years = scanner.nextInt();
		System.out.println("월 입력해주세요");int month = scanner.nextInt();
		
		달력(years,month);
		
		
		
		
	}//me
	
		public static void 달력(int years, int month) {
			
			Calendar calendar = Calendar.getInstance();
			calendar.set(years, month-1,1); // 영부터시작해서 -1 깍고시작함
			
			int sweek = calendar.get(calendar.DAY_OF_WEEK); // 해당 월의 1 요일찾기 **
			int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH); //해당월의마지막 일찾기**
			
			System.out.println("===================="+years+"년"+month+"월=================================");
			System.out.println("일\t월\t화\t수\t목\t금\t토\t");
			// 4. 현재 월 1일의 위치앞을 공백으로 채우기
			for (int i = 1; i < sweek; i++) {
				System.out.print("  \t");
			}
			//5. 1일부터 마지막 날까지 출력하기
			for (int i = 0; i < eday; i++) {
				System.out.print(i+" \t");
				if(sweek%7==0)System.out.println();sweek++;
			}
		}
	
}//ce
