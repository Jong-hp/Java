package test.main;
/*
 * 	java 에서 기본 데이터 type 8 개를 제외한 나머지는 모두 참조 데이터 type 이다.
 * 
 * 	참조 데이터 type 객체는 heap영역(사물함영역) 에 만들어 진다.
 * 
 * 	모든 객체는 저장소(필드) 와 기능(메소드) 로 구성되어 있을수 있다.
 * 	어떤 저장소와 어떤 기능을 가지게 될지는 해당 type 객체가 어떻게 설계되었냐에 따라 다르다.
 *  
 *  참조값에 . 을 찍으면 저장소를 참조 하거나 기능을 사용할수 있다.
 *  참조값에 . 을 찍으면 필드를 참조 하거나 메소드를 호출할수 있다.
 *  메소드 호출은 javascript 에서 함수 호출과 유사하다.
 */
public class MainClass08 {
	public static void main(String[] args) {
		String str="abcde12345";
		 int result=str.length();
		 char result2=str.charAt(5);
	}

}
		/* 
		 * 연습용 프로젝트 만들기(프로젝트 만드는 연습)
		 * 만든 프로젝트의 src 에 페키지 만들기(test,main등등)
		 * 만든 페키지에 클래스 만드는 연습 ( 클래스명의 첫글자는 반드시 대문자로 시작)
		 * 만든 클래스에 main() 메소드 만드는 연습
		 * main() 메소드 안에서 콘솔창에 원하는 문자열 출려가는연습
		 * main() 메소드 안에서 다양한 type의 지역변수 만드는연습
		 * 만든 지역 변수에 값이 잘 들어가는지 확인하는 디버깅 연습.
		 */