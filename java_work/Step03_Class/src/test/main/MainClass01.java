package test.main;


//1. 객체를 생성하는데 필요한 클래스 import(수입)
import test.mypac.Calculator;

public class MainClass01 {
	public static void main(String[] args) { //void (빈공간) 리턴이 필요없을때 사용
		/*
		 * 만일 프로그래밍의 목적이 '계산' 이라면 ?
		 * 
		 * - 계산기능을 수행 할 수 있는 객체가 필요하다.
		 * - 계산기능을 수행 할 수 있는 객체를 생성해서 heap 영역에 올려놓고
		 * - 참조값을 이용해서 계산을 해야한다.
		 * 
		 */
		
		//2. 객체를 생성한다. (new) Class명은 즉 type이 된다.
		Calculator cal=new Calculator();
		//Calculator 객체의 exec() 메소드 호출하기
		cal.exec();
		cal.exec();
		cal.exec();
		
		//Calculator 객체의 brand 필드 참조하기
		String a=cal.brand; // 참조된 값을 변수에 대입하기
		
	}
}
