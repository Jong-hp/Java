package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		// 삭제할 회원의 번호(primary key)
		int num = 10;

		/*
		 * 위의 회원 정보를 MemberDao 객체를 이용해서 DB 에 추가하고 성공이면 "회원정보를 삭제 했습니다" 실패면 "삭제 실패!" 를
		 * 콘솔창에 출력하는 code 를 작성해 보세요.
		 */

		boolean isSuccess = new MemberDao().delete(num);

		if (isSuccess) {
			System.out.println("회원 정보를 삭제 했습니다.");
		} else {
			System.out.println("삭제 실패!");
		}
	}
}