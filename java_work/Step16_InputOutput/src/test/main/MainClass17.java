package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* Quiz
 * 
 * Scanner객체를 이용해서 문자열 한줄을 입력 받은 다음
 * c:/acorn202206/myFolder/quiz.txt 파일을 만들어서
 * 해달 파일에 문자열을 저장해 보세요.
 * 
 * Quiz2
 * 
 * JTextField에 문자열을 입력하고 추가 버튼을 누르면
 * 입력한 문자열이 c:/acorn202206/myFolder/memo.txt 파일에 append 되도록 해보세요.
 * 
 * 불러오기 버튼을 누르면 c:/acorn202206/myFolder/memo.txt 파일에 있는 모든 문자열을
 * JTextArea에 출력하도록 해보세요.
 */

public class MainClass17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력란 : ");
		String line=sc.nextLine();
		
		
		File memoFile=new File("c:/acorn202206/myFolder/quiz.txt");
		
		try {
			if (!memoFile.exists()) {
				memoFile.createNewFile();
			}
			FileWriter fw=new FileWriter(memoFile, true);
			fw.write(line);
			fw.flush();
			fw.close();
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
