//Static   변수 >> 모든 객체마다 같은 값을 가지게 할거야
//instance 변수 >> 모든 객체마다 다른 값을 가지게 할거야

class InitTest{
	static int cv = 10;
	static int cv2;
	int iv = 11;
	
	
	//초기화 블럭 왜 필요? 초기화 > 조건절이나 변형된 값을 쓰기 위해서
	
	static { //static 블럭(static "초기자" 설정 블럭) //static member field가 메모리에 올라온 직후 호출
		cv = 10;  //member field 초기화 vs 여기서 초기화 차이점?
	    cv2 = cv+222;  //변형된 값 제공
	}
	
	{   //instance variable 초기화 블럭 > iv가 메모리에 올라간 직후
		//new를 통해 객체가 생성되고 int iv 변수가 메모리에 올라가자마자 바로 호출 >> { }
		//호출안됨 . New해야 호출 가능
		System.out.println("초기자 블럭");
		if(iv > 10) iv = 100;   //if문 한줄로 쓰기
	}
	
}

public class Ex08_Static_Init {

	public static void main(String[] args) {
		//객체를 안 만들엇을 때는 클래스이름으로 접근. 클래스이름.
		System.out.println(InitTest.cv);
		System.out.println(InitTest.cv2);
		
		//일반자원
		InitTest inittest = new InitTest();
		System.out.println(inittest.iv);

	}

}