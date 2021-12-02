package 과제10_day13_문제2;

import java.util.HashMap;
import java.util.Map;

public class 제네릭을사용하는이유 {

	
	// 제네릭을 사용하는이유 <>
	// 오류를 많이 줄일수있다
	/*
	 Map<K, V> map = new HashMap<>(); 
	  map.put("사과",1);
	  map.put("단감",2);
	  
	  int rank= (Integer)map.get("사과");
	 
	  * 이러면 내가원하는 값을 받을라하면 문자나 숫자 자료형을 사용해야한다
	  *
	  *하지만
	  */
	/*
	 Map<String, Integer> map = new HashMap<>();  <>사이에 필요한 타입을 미리 다정해놓으면
	  map.put("사과",1);
	  map.put("단감",2);
	  
	  int rank= map.get("사과"); // 굳이 받을떄 자료형을 추가안해두된다(String)(Integer)=XXX
	  
	  코드의 재사용성이 좋아지고~
	  코드가 간단해져서 좋다~
	  
	  
	 */
	
	
	
	
}
