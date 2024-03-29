package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  JDBC ( Java DataBase Connectivity )
 *  
 *  DataBase 에 연결해서 SELECT, INSERT, UPDATE, DELETE 작업하기
 *  
 *  Oracle 에 연결하기 위해서는 드라이버 클래스가 들어있는 ojdbc6.jar 파일을
 *  사용할수 있도록 설정해야 한다.
 */
public class MainClass03 {
	public static void main(String[] args) {
		// 3 번 회원의 주소를 동물원으로 수정하고자 한다.
		int num = 3;
		String addr = "동물원";

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
		try {
			// 실행할 미완성의 sql 문
			String sql = "UPDATE member" + " SET addr=?" + " WHERE num=?";
			// PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// sql 문 완성하기
			pstmt.setString(1, addr);
			pstmt.setInt(2, num);

			// sql 문 실행하기
			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정 했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main 메소드가 종료 됩니다.");

	}
}