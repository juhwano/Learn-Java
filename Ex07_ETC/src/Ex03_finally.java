import java.io.FileDescriptor;
import java.io.IOException;

/*
 >> 게임 CD를 PC에 설치
 >> 1. 설치파일 > C:\Temp 내용복사
 >> 2. 복사한 파일 >> 게임설치
 >> 3. 정상설치 >> C:\Temp 복사본 삭제
 >> 4. 비정상 문제 발생(강제 종료) >> 복사본 삭제
 
 복사한 파일 삭제 ( 강제 ) 하고 싶으면??...
 
*/
public class Ex03_finally {
	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelet() {
		System.out.println("FILE DELETE");
	}

	public static void main(String[] args) {
		// 3개 함수 정상 처리
		// 예외를 사용자가 필요에 따라서 강제할 수 있다.
		// 실제로는 예외가 아니지만, 어떠한 상황에 대해서 개발자가 강제로 예외로 지정 가능
		// 1이면 정상 2면 강제로 예외를 발생시켜서 catch ...
		// throw new IOException()
		
		
		try {
			copyFiles();
			startInstall();
			throw new IOException("install 도중 문제가 발생 ..."); //개발자가 임의로 발생시킴
		}catch (Exception e) {
			System.out.println("예외 메시지 출력 : " + e.getMessage());
			//fileDelet(); //예외가 발생하지 않았을 경우에는 파일을 지우지 않음
		}finally { //예외 상관없이 무조건 실행 블럭
			fileDelet();
			//파이널리는 생략이 가능하지만
			//함수를 강제종료 (ruturn)하는 함수에서 쓰게 된다면
			//ruturn에 의해 종료되기 전에 호출한다. 파이널리가 강력하다. 마지막까지 살아남아서 실행시킨다.
		}
		System.out.println("main end");
		
		
		

	}

}
