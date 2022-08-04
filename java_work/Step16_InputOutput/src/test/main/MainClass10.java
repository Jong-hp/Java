package test.main;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

public class MainClass10 {
	public static void main(String[] args) {
		File f1 = new File("c:/acorn202206/myFolder/forder1");
		// 폴더 만들기
		f1.mkdir();
		/*
		 * 위의 코드를 참고해서 c:/acorn202206/myFolder 폴더안에 폴더 1000개를 만들어 보세요. 폴더명은 forder1
		 * forder2 forder3 - forder1000
		 */
		for (int i = 0; i < 1000; i++) {
			File tmp = new File("c:/acorn202206/myFolder/forder" + (i + 1));

			if (tmp.exists()) {
				tmp.delete();
				System.out.println("파일을 삭제하였습니다");

			} else {
				tmp.mkdir();
			}
			System.out.println("파일을 생성하였습니다.");
		}
	}
}
