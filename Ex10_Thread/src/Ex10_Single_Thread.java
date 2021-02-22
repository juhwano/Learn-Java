/*
프로그램 >> 실행 >> 프로세스 >>최소 하나의 스레드(stack) >> JVM 하나의 main thread(stack) 생성
지금까지 : 싱글 프로세스 >> 싱글 스레드(stack 1개) >> main 함수가 올라가서 실행

JVM > call stack > main 함수 동작

stack : 한번에 1개의 함수만 실행 가능 (10개 함수가 있더라도 동시에 실행이 아니라 순차적으로 1개씩)

***************************************
*지금까지 하나의 stack memory만 사용했다.
***************************************
*
*/
public class Ex10_Single_Thread {

	public static void main(String[] args) {
		
		System.out.println("나 main 함수 일꾼이야");
		
		worker();
		worker2();

		System.out.println("main 종료");
	}
	static void worker() {
		System.out.println("나 1번 일꾼");
	}
	static void worker2() {
		System.out.println("나 2번 일꾼");
	}
	
	
	
}
