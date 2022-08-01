package test.main;

import test.auto.CampingCar;
import test.auto.Engine;

public class MainClass08 {
	public static void main(String[] args) {
		
		CampingCar cam1=new CampingCar(new Engine());
		cam1.drive2();
	}
}
