/*
Thread : 프로세스에서 하나의 최소 실행 단위(흐름) >> method
>> stack >> 여러개 만들어서 >> 함수들을 동작하게 하겠다.

Thread 생성 방법
1. Thread 클래스를 상속 >> class Test extends Thread >> 새로운 stack 에서 놀거야
일반 클래스에서 스레드를 상속하게 하면 준비 끝
>> run() 함수 >> 새로운 stack에서 가장 먼저 실행되는 함수
>> Thread 클래스 >> 일반 클래스 >> Thread 스스로 객체 생성 가능

2. Runnable 인터페이스 구현 why?
>> 다중 상속이 안되기 때문
class Test extends Car implements Runnable >> run() 함수를 만들도록 강제

여기까지는 Test 클래스가 스레드가 아니다.

독자적으로 객체 생성 가능 
Thread thread = new Thread(new Test());


*/

class Thread_2 implements Runnable{   //run() 재정의 하도록 강제할 뿐 인터페이스다.

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i ++) {
			System.out.println("Thread_2 : " + i );  
		}
		System.out.println("Thread_2 run() END .......");
	}
	
}

class Thread_1 extends Thread{
	//강제하는게 없네? 추상자원은 아니다 . Override 강제 x . .일반 클래스다
	@Override
	public void run() { //이 함수는 main() 와 동일한 역할을 한다.
		                //새로운 stack이 만들어졌을때, 처음 올라가서 실행되는 함수
		for(int i = 0; i < 100; i ++) {
			System.out.println("Thread_1 : " + i + this.getName());  
			//getName = 시스템이 부여하는 내부에서 생성되는 이름.Thread가 생성되면 저절로 이름 생성
		}
		System.out.println("Thread_1 run() END .......");
		
	}
	
}


public class Ex02_Multi_Thread {

	public static void main(String[] args) {
		//1번
		Thread_1 th = new Thread_1();
		th.start();  
		//POINT  ... 
		//memory에 새로운 call stack을 생성!! 
		//함수가 올라가서 놀 수 있는 메모리를 만들고 그 위에 run()를 올려놓고 임무 종료
		
		for(int i = 0; i < 100 ; i++) {
			System.out.println("main : " + i);
		}
		System.out.println("Main END");

		//자동차 경주처럼 생각하자. 시분할 방식
		//동시에 -> 실행 대기하고 있다. 부릉부릉
		//뭐가 먼저 끝날지 모른다. thread로 경마게임 같은거 가능

		
		
		//2번
 		//Thread_2 th2 = new Thread_2();  //자체는 Thread가 아니다.
		//Thread thread = new Thread(th2);  //Runanble을 구현할 수 있는 객체를 파라미터로

		Thread thread = new Thread(new Thread_2());
		thread.start();
		
		
	}

}
