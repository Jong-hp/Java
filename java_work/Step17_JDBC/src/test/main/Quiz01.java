package test.main;
/*
 *  1. 
 *  콘솔창에
 *  emp 테이블에 근무하는 사원의
 *  사원번호,사원이름,부서번호,급여를 급여에 대해서 내림 차순으로 정렬해서 출력해 보세요.
 */  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

public class Quiz01 {
	public static void main(String[] args) {
		// DB 연결객체를 담을 지역 변수 만들기
		Connection conn = null;

		try {
			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "tiger");
			// 예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 실행할 sql 문
			String sql = "SELECT empno,ename,deptno,sal FROM emp" + " ORDER BY sal DESC";
			// PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			// PreparedStatement 객체를 이용해서 query 문 수행하고 결과를
			// ResultSet 객체로 받아오기
			/*
			 * ResultSet 객체의 .next() 메소드는 cursor 밑에 row 가 존재하는지 확인해서 만일 존재하면 true 를 리턴하고
			 * cursor 가 한칸 밑으로 이동한다. 만일 존재하지 않으면 false 를 리턴한다.
			 */
			while (rs.next()) {
				int empno = rs.getInt("empno");
				int deptno = rs.getInt("deptno");
				int sal = rs.getInt("sal");
				String ename = rs.getNString("ename");
				System.out.println(empno + " | " + ename + " | " + deptno + " | " + sal);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main 메소드가 종료 됩니다.");
	}
}
