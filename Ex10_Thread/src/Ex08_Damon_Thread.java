/*
데몬 : 보조 thread

주 thread >> 주 thread가 생명을 다하면 보조 thread도 운명을 같이할 수 있게

한글 >> 글쓰기 >> 3초마다 저장 옵션이 돌도록
글쓰기 작업 종료 >> 3초마다 저장(보조 옵션) 종료
*/
public class Ex08_Damon_Thread implements Runnable {
	static boolean autosave = false;
	public static void main(String[] args) {
		Thread demonthread = new Thread(new Ex08_Damon_Thread());
		
		//demonthread 보조 (Damon)
		//main 함수 thread의 보조가 된다.
		//보조로 묶이면 메인함수 스레드와 위아더원이다.
		//나(demonthread)는 메인(Main)과 생명을 같이 하겠다.
		demonthread.setDaemon(true);
		demonthread.start();
		
		//주작업(한글 쓰기)
		for(int i = 0; i <= 30; i++) {
			try {
				Thread.sleep(1000); //1초간격
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Main 한글 쓰기 작업" + i);
			//자동 저장 시점
			if(i==5) {
				System.out.println("i: " + i);
				autosave = true;
				
			}
		}
		
	}
	
	public void autoSave() {
		System.out.println("한글 작업이 3초 간격으로 자동 저장");
	}

	@Override
	public void run() {
		while(true) {
			//try문을 안 쓰면 sleep을 못 씀
			try {
				Thread.sleep(3000);  //3초간 재움
			} catch (Exception e) {
				// TODO: handle exception
			}
			if(autosave) { // static boolean autosave = false;
				//3초 쉬었다가 갔을때 autosave가 true면 저장작업을 하겠다
				autoSave(); //호출
			}
			
			
		}
		
	}

}
