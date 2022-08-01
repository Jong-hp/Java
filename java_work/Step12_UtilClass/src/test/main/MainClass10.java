package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 *  회원정보는 숫자(int), 문자(String) 으로 구성 되어 있기 때문에
		 *  value 의 generic 은 Object로 지정해야한다.
		 */
		Map<String, Object> map=new HashMap<>();
		//value의 generic이 Object이기 때문에 어떤 type이든지 담을 수 있다.
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
		
		//Object type 으로 리턴되기 때문에 원래 type 으로 casting 해 주어야 한다.
		int num=(int)map.get("num");
		String name=(String)map.get("name");
		String addr=(String)map.get("addr");
		
	}
}
