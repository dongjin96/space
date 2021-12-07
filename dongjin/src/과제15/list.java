package 과제15;

import java.util.ArrayList;

public class list {

	
	
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		
		
		list.add(10);
		list.add(3);
		list.add(32);
		list.add(4);
		list.add(31);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	/*ArrayList 클래스는 내부적으로 배열을 이용하여 요소를 저장한다또한  배열을 이용하기 때문에 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있습니다.
		하지만 배열은 크기를 변경할 수 없는 인스턴스이므로, 크기를 늘리기 위해서는 새로운 배열을 생성해야한다*/
}
