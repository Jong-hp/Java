package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		//1. MemberDto 객체를 담을수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 지역변수에 담아 보세요.
		List<MemberDto> members=new ArrayList<>();
		//2. 3명의 회원정보를 MemberDto 객체에 각각 담아 보세요. (MemberDto 객체가 3개 생성되어야 함)
		MemberDto dto1=new MemberDto();
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		
		MemberDto dto2=new MemberDto(2, "해골", "행신동");
		MemberDto dto3=new MemberDto(3, "박종혁", "송파동");
		//3. 위에서 생성된 MemberDto 객체의 참조값을 ArrayList 객체에 모두 담아 보세요.
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		/*
		 *  4. ArrayList 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로
		 *  반복문 돌면서 출력해 보세요.
		 *  
		 *  번호: 1,이름: 김구라, 주소: 노량진
		 *  번호: 2,이름: 해골, 주소: 행신동
		 */
		for(MemberDto tmp:members) {
			System.out.println("번호:"+tmp.getNum()+", 이름:"+tmp.getName()+", 주소:"+tmp.getAddr());
		}
	}
}
