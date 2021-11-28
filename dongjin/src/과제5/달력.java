package 과제5;

import java.util.Calendar;
import java.util.Scanner;

public class 달력 {
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도 >>:"); int year = scanner.nextInt(); // 년도 를 입력받습니다
		System.out.println("월>>>>:"); int month = scanner.nextInt(); // 월을 입력 받습니다
		
		달력보기(year,month); // 달력보기 메소드로 이동합니다 (인수)
	}// me
		
		public static void 달력보기 (int year,int month) {// e달력보기 메소드 (인수)
		
			
			Calendar calendar = Calendar.getInstance();
			/*new() 와 getinstance()차이
			 * new() 객체를 계속계속 만들수있다
			 * getiinstance()[싱글턴패턴] 하나의 인스턴스만 가지고 클래스 내에서 공유해서 사용한다
			 *  클래스에 매번 새로운 객체를 생성하는것보다 get insttace를 통해 다른 클래스에서도  동일한 객체를사용할수있게 한다
			 * 
			 * 
			 */
			
			
			
			calendar.set(year, month-1,1); // 사용자가 정의할떄는 -1을 사용해서 설정한다 하지만 보여줄떄는 0부터시작하기때문에 +1을하고보여준다고한다 ----------물어보기1
			
			int sweek = calendar.get(Calendar.DAY_OF_WEEK);  // 해당월의 1일을찾는다 
			int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // getActualMaximum 해당달의최대값
			
			System.out.println(" ******************* "+year+"년 "+month+"월 ********************");
			System.out.println(" 일\t월\t화\t수\t목\t금\t토");  // 설정
			//1. 현재월 1일의 위치앞에 공백체우기
			for (int i = 1; i < sweek; i++) { //int i는 일과같음 0은 달력에없으니깐 7보다는작은데 1씩증가한다
				System.out.print(" \t");
				/*print println차이
				 * print 는 문자 그대로 사용된다
				*println은 자동으로 enter가들어간다 그래서 여기섭 사용하면 세로로 길게 찍힌다
				 * */
			}//2. 1부터 마지막 날까지 출력
			for (int i = 1; i <=eday; i++) { //eday는 최대 month까지 저장되있음
				System.out.print(i+"\t");
				if (sweek%7==0) System.out.println();sweek++; // 요일증가
					//7일마다 줄바꿈을 해준다 
				
			}
			
		}
		
	}//ce


