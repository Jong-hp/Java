package test.main;

import test.Mypac.HandPhone;
import test.Mypac.Phone;
/*
 *  java 의 다형성(Polymorphism)
 *  
 *  - 객체는 type 이 여러가지일수도있다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 참조값을 HandPhone type 변수에 담기
		HandPhone p1=new HandPhone();
		
		//HandPhone 객체를 생성해서 참조값을 Phone type 변수에 담기
		Phone p2=new HandPhone();
		
		//HandPhone 객체를 생성해서 참조값을 Object type 변수에 담기
		Object p3=new HandPhone();
		
	}
}
