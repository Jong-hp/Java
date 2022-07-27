package test.main;

import test.mypac.Messenger;
import test.mypac.MyObject;
import test.mypac.Radio;

public class MainClass05 {
	public static void main(String[] args) {
		//Messenger 클래스의 sendMessage(), getMessge(), useRadio() 메소드를 호출해 보세요.
		Messenger.getMessage();
		Messenger.sendMessage("hi");
		Messenger.useRadio(new Radio());
	}
}
