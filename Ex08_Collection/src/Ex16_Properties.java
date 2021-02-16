import java.util.Properties;

/*

Map 인터페이스를 구현한 클래스
특징 : <String, String> (key, value) 강제 세팅되있다.
사용 목적 : App 전체에 사용되는 자원 관리
-DB연결정보 (id=kglim , pw=1004)
-환경 변수
-프로그램 버전
-공통 파일 경로(고정)
-공통 변수

*/
public class Ex16_Properties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("admin", "bit@bit.co.kr"); //이메일만 바뀌면 이 한줄만 바꾸면 된다.
		prop.setProperty("version", "1.x.x.x");
		prop.setProperty("path", "C:\\Temp\\images");
		
//		각각의 개발 페이지 - DB연결정보, 환경세팅정보(version)
//		key값 get
		System.out.println(prop.getProperty("admin"));
		System.out.println(prop.getProperty("version"));
		
		
		
		
	}

}
