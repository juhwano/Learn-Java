
public class Ex02_Exception {

	public static void main(String[] args) {
		int num = 100; //로컬 변수는 무조건 초기화다
		int result = 0;
		System.out.println("main Start");
		
		try {
			for(int i = 0; i < 10; i++) {
				result = num / (int)(Math.random()*10); // 0~9까지 정수값
				System.out.println("result : " + result + " i : " + i);
			}
		} catch (ArithmeticException e) { //하위(구체화된) 예외 쓰는게 좋다(가독성)
			System.out.println("문제가 발생 로그 기록 .. 관리자에게 메일 발송");
			System.out.println("원인 : " + e.getMessage());
			
		} catch (NullPointerException e) { //규칙상 하위 예외를 먼저 선언 후, 그 다음 상위 예외를 쓴다.
			
		} catch (Exception e) { //부모 타입은 나중에 사용
			
		}
	
		
		System.out.println("main end");

	}

}
