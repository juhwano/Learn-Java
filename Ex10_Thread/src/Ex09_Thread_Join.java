//Thread : 상태정보 (state) 동작 , 쉬고있어 , 멈춤
//state 강제로 변환 : stop() ,,,(x) 하지 마세요 (소멸)
//써도 큰 문제없어 : sleep() , join() , wait()

//join() 
//복잡한 계산을 여러개의 쓰레드로 나누어서 ...
//각각의 스레드에 만든 결과를 취합 할때 ...

class Thread_join extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i < 3000 ; i++) {
			System.out.println("---------------");
		}
	}
}

class Thread_join2 extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i < 3000 ; i++) {
			System.out.println("||||||||||||||");
		}
	}
}
public class Ex09_Thread_Join {

	public static void main(String[] args) {
		//main  Thread  최종결과를 만드는 스레드
		//main 
		//Thread_join , Thread_join2  >> join()

		Thread_join th = new Thread_join();
		Thread_join2 th2 = new Thread_join2();
		
		th.start();
		th2.start();
		
		long starttime = System.currentTimeMillis();
		
		try {
			th.join();  //main 기다리겠다
			th2.join(); //main 기다리겠다
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		for(int i = 0 ; i < 3000 ; i++) {
			System.out.println("^^^^^^^^^^");
		}
		
		//3개의 스레드가 실행한 결과 (총 걸린 시간)
		System.out.println("3개의 스레드 총 작업 시간");
		System.out.println(System.currentTimeMillis());
		System.out.println(starttime);
		System.out.println(System.currentTimeMillis() - starttime);
		System.out.println("Main END");
		
	}

}
