package test.main;

import java.util.ArrayList;
import java.util.Scanner;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		//1. Car type 을 저장할 수 있는 ArrayList 객체를 생성해서
		//참조값을 List 인터페이스 type 지역변수 cars 에 담아 보세요.
		ArrayList<Car> cars=new ArrayList<Car>();
		
		//2.Car 객체(3개)를 생성해서 List 객체에 저장해 보세요.
		Car car1=new Car("현대");
		cars.add(car1);
		cars.add(new Car("기아"));
		cars.add(new Car("포르쉐"));
		
		//3. 반복문 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를
		//순서대로 호출해 보세요.
		for(Car tmp:cars) {
			tmp.drive();
		}
	}
}
