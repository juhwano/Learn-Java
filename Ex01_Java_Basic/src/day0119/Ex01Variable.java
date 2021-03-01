package day0119;
/* 변수(Variable)
 * 변수란? 우리가 stack 메모리 영역에 등록하는 하나의 공간으로써
 * 우리가 해당 변수를 선언할 때 지정한 데이터타입과 맞는 값이면
 * 언제든 그 공간의 내용을 바꿔줄 수 있다.
 * 즉 내용이 '변'할 수 있기 떄문에 변수이다.
 * 
 * 다음 예와 같은 a, b를 변수(variable)라고 한다.
 * int a;
 * String b;
 * 
 * 변수를 우리가 사용하기 위해서는
 * '선언'과 '초기화'의 단계를 거쳐야 사용가능하다.
 * 선언 : 해당 변수의 데이터타입과 이름을 지정
 * 초기화 : 변수는 우리가 사용하기 위해서는 무조건 한번은 값을 할당해주어야 한다.
 * 
 * 변수의 선언방법
 * 데이터타입 이름;
 * 
 * 변수의 초기화방법
 * 이름 = 값;
 * 
 * 데이터타입 이름 = 값;
 * 
 * 
 * 단, 변수의 이름을 지을 때는 다음과 같이 지켜야 할 몇가지 규칙이 있다.
 *
 * 변수명은 숫자로 시작할 수 없다.
 * _(underscore) 와 $ 문자 이외의 특수문자는 사용할 수 없다.
 * 자바의 키워드는 변수명으로 사용할 수 없다. (예: int, class, return 등)
 * 
 */

public class Ex01Variable {
	public static void main(String[] args) {
		// int 변수 number를 선언해보자
		// number에 아무 값이 안 들어가잇다. 스레기값이 들어잇다.
		int number;
		
		number = 20;
		System.out.println("number의 현재값 : "+number);
		
	    number = 45;
		System.out.println("number의 현재값 : "+number);
		
		//만약 우리가 지정한 변수의 데이터타입과 다른 값을 넣어주면 에러 발생
		number = 'A';

		System.out.println("number의 현재값 : "+number);
		
		//실수형 변수를 만들어보자
		double d = 3.141592;
		System.out.println("d의 현재값 : "+d);
		
		//정수형 공간에 실수값을 넣을 수는 없지만
		//실수형 공간에는 정수값을 넣을 수 있다.
		
		d = 3;
		//문자형 변수를 만들어보자
		char c = 'b'-32;
		System.out.println("c의 현재값: "+c);
        //ASCII 테이블에서 b는 98 
        //98-32:66
        //66에 해당하는 값은 대문자 B
		
		//논리형 변수를 만들어보자
		boolean b = true;
		System.out.println("b의 현재값: "+b);
	
	
}

}
