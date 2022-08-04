package test.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainClass18 {
	public static void main(String[] args) {
		File memoFile = new File("c:/acorn202206/myFolder/memo.txt");
		
		JTextField jf= null;
		JTextArea ja= null;
		
		try {
		jf=new JTextField(memoFile);
		ja=new JTextArea(jf);
		while (true) {
			String ilne = ja.read("append", ja);
			if (line == null) {
				break;
			}
			System.out.println(line);
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
