package test.main;

import test.Mypac.HandPhone;
import test.Mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1=new HandPhone();
		//엄마 ! 나도 SmartPhone 갖고 싶어 !!!
		SmartPhone p2=(SmartPhone)p1; // ClassCastException 발생!
		
		//진짜? 엄마 짱이다 ~~
		//나 이제 인터넷 한다.
		p2.doInternet();
	}
}
