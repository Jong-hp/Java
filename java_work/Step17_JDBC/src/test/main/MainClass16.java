package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("검색할 회원의 번호 입력(종료:q)");
			String str = scan.nextLine();
			if (str.equals("q")) {
				break;
			}
			// 입력한 문자열을 정수로 바꾼다.
			int num = Integer.parseInt(str);
			System.out.println(num + " 번 회원의 정보 조회중 ...");
			/*
			 * MemberDto 객체를 이용해서 입력한 번호에 해당하는 회원 정보를 얻어와서 
			 * 회원 정보가 있으면 아래와 같은 형식으로 회원 정보를 콘솔창에 출력하고
			 * 
			 * 이름 => 김구라, 주소 => 노량진
			 * 
			 * 회원 정보가 없으면
			 * 
			 * x 번 회원은 존재 하지 않습니다.
			 * 
			 * 를 출력하도록 해 보세요.
			 */
			
			MemberDto dto=new MemberDao().getData(num);

			if (dto != null) {
				System.out.println("이름 =>"+ dto.getName()+"주소 =>" + dto.getAddr());
			} else {
				System.out.println(num+" 번 회원은 존재 하지 않습니다.");
			}
		}
		System.out.println("app 이 종료 됩니다.");
	}
}
