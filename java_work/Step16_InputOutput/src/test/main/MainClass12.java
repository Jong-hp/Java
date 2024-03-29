package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		/*
		 * FileReader 객체를 활용해서
		 * 
		 * c:/acorn202206/myFolder/memo.txt 파일에 있는 모든 문자를
		 * 
		 * 콘솔창에 출력하는 코드를 작성해 보세요.
		 * 
		 * - hint 1. 반복문 돌면서 한글자 씩 읽어 내야 한다. 2. 반복문을 몇번 돌아야 하는지 확실치 않다. 3. 읽어낸 코드값을 char
		 * type 으로 casting 해야 문자 1개를 확인 할수 있다. 4. 개행하지 않고 콘솔에 출력하는 방법은
		 * System.out.print() 메소드를 활용하면 된다.
		 */

		// 문자열을 저장할 파일을 만들기 위한 File 객체
		File memoFile = new File("c:/acorn202206/myFolder/memo.txt");

		try {
			// 파일에서 문자열을 읽어들일수 있는 객체 생성
			FileReader fr = new FileReader(memoFile);
			// 반복문 돌면서
			while (true) {
				// 문자 code 하나씩 읽어낸다.
				int code = fr.read();
				// 만일 더이상 읽을 code 값이 없으면
				if (code == -1) {
					break;// 반복문 탈출
				}
				// 코드값을 문자로 변환해서
				char ch = (char) code;
				// 개행기호 없이 출력하기
				System.out.print(ch);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

