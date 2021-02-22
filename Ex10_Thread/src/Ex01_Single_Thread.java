/*
프로그램 >> 실행 >> 프로세스 >>최소 하나의 스레드(stack) >> JVM 하나의 main thread(stack) 생성
지금까지 : 싱글 프로세스 >> 싱글 스레드(stack 1개) >> main 함수가 올라가서 실행

JVM > call stack > main 함수 동작

stack : 한번에 1개의 함수만 실행 가능 (10개 함수가 있더라도 동시에 실행이 아니라 순차적으로 1개씩)

***************************************
*지금까지 하나의 stack memory만 사용했다.
***************************************

가장 작은 실행 단위 = 쓰레드
쓰레드 일꾼
공장 프로세스

싱글 쓰레드 프로세스
= 자원+쓰레드

멀티 쓰레드 프로세스
= 자원+쓰레드+쓰레드+쓰레드

멀티프로세스 vs 멀티쓰레드

"하나의 새로운 프로레스보다

하나의 새로운 쓰레드를 생성하는 것이 더 적은 비용이 든다.

멀티 쓰레드가 장점만 잇는 것은 아니다

장점 : 효율적 사용, 응답성 향성, 코드 간결
좋은 건 단점도 크다.
단점 : 동기화(synchronization)에 주의, 교착상태(dead-lock) 발생 주의, 
쓰레드가 효율적으로 고르게 실행될 수 있게

교착 상태 -> 멱살잡이, 작업관리자 강제종료(kill)

*/
public class Ex01_Single_Thread {

	public static void main(String[] args) {
//		메인 함수 -> w1 함수 -> w2 함수 -> 메인함수 종료
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
