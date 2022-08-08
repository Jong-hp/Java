package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		int num = 11;
		String name = "햄버거";
		String addr = "햄버거";

		/*
		 * 위의 회원 정보를 MemberDao 객체를 이용해서 DB 에 추가하고 성공이면 "회원정보를 수정 했습니다" 실패면 "수정 실패!" 를
		 * 콘솔창에 출력하는 code 를 작성해 보세요.
		 */
		
		MemberDto dto = new MemberDto(num, name, addr);

		MemberDao dao = new MemberDao();
		boolean isSuccess = dao.update(dto);

		if (isSuccess) {
			System.out.println("회원 정보를 수정 했습니다.");
		} else {
			System.out.println("수정 실패!");
		}
	}
}
