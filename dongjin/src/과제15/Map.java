package 과제15;

import java.util.HashMap;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        map.put("soccer", "사람");

        System.out.println(map.get("people")); // get 을 입력하면 값을 얻을수있다  그래서  키 people에 같은값인 사람이 출력된다
        System.out.println(map.get("baseball")); //베이스 볼 을 입력하자 야구 가나오는걸알수있다
        System.out.println(map.containsKey("people")); // 사람을 입력하자 ture가뜸
        System.out.println(map.remove("people")); // people 이 사라졌으니 사람만 나온다
        System.out.println(map.size());// 하나가 삭제되었으므로 2개의 값만뜬다
    
    }
}	/*Map 컬렉션은 키와 값으로 구성된 객체를 저장하는 구조를 가지고 있다 
		 * 키는 중복으로 저장할수있다 키에 값이들어오면 기존값은 없어지고 새로운 값이 들어온다 하지만 값은중복저장을할수없다*/
		 