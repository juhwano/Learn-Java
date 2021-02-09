/*
1. static member field(객체간 공유자원)

2. static method : 자주 쓰이니까 >> 편하게 사용하게 해야지 >> 코드를 줄여줄까(객체 생성 없이도 해줘야지) >> static
   Q : why not Math.random()  >> Math m = new Math();  , m.random() ??? 
   A : Often used.

//클래스를 만들 때 많이 사용되는 함수가 있다면 new 없이 사용하게 해주고싶어 > static
//final 상속 못함 > 다른 클래스 부모 x

// System도 클래스다.
// 첫시간에 배운 것들
// static, main, String[], System클래스
   import java.lang.*; default (생략)
*/

class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {
//		일반함수(메소드)에서 cv값을 가지고 놀 수 있다.
//		cv 값을 가지고 놀 수 있다.
//		순서 . . .
//		static 자원은 일반자원보다 항상 메모리에 우선순위로 먼저 올라감
//		메모리에 올라감 > 가지고 놀 수 있다.
		cv = 1000;
		StaticClass.cv = 1000;
//		둘 다 맞는 표현이지만 식구라서 위의 표현으로 쓴다.
	}
	
	static void sm() {
		//static 함수에서 
		//일반 자원인 위에 있는 iv를 가지고 놀 수 있다? 없다 > static이 메모리방에 들어왔는데 일반 자원이 없다. > 생성 시점
		//iv = 100;
		//error가 없게 하려면( static 끼리 놀아라 )
		cv = 2222;
	}
	
	
	
}

public class Ex09_Static_Method {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		
		System.out.println(StaticClass.cv);
		StaticClass.sm();
		System.out.println(StaticClass.cv);
		
		//일반자원 (객체, 생성) > 모든 Static 자원에 접근 가능
		StaticClass sc = new StaticClass();
		sc.m();
		sc.sm();
		System.out.println(sc.iv);
		System.out.println(sc.cv);
		
		
		
	}

}