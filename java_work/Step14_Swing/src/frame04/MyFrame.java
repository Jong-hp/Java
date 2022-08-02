package frame04;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	//생성자
	public MyFrame(String title) {
		//부모생성자에 프레임의 제목 넘겨주기
		super(title);
		// setBounds(x, y, width, height)
		setBounds(100, 100, 500, 500);
		// 창을 닫았을떄 프로세스도 같이 종료 되도록 한다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//BorderLayout 객체 사용하기
		setLayout(new BorderLayout());
		
		JButton btn1=new JButton("버튼1");
		add(btn1, BorderLayout.NORTH); // 프레임에 btn1 추가 하기
		
		JButton btn2=new JButton("버튼2");
		add(btn2, BorderLayout.WEST); // 프레임에 btn2 추가하기
		
		JButton btn3=new JButton("버튼3");
		add(btn3, BorderLayout.EAST); // 프레임에 btn3 추가하기
		
		JButton btn4=new JButton("버튼3");
		add(btn4, BorderLayout.SOUTH); // 프레임에 btn3 추가하기
		
		//프레임이 화면상에 보이도록 한다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MyFrame("나의 프레임");
	}
}
