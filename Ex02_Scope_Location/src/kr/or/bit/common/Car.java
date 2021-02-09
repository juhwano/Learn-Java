package kr.or.bit.common;

public class Car {
	int door; //default 같은 패키지내에서만 접근,사용 가능
	public int window; //다른 폴더에서 사용 가능
	private int handle; //다 막겠다(쓰지말라). 캡슐화 >> setter, getter 함수 / 직접할당을 막고 간접할당으로만 사용하려는구나

}
//Ex01main에서 door값 변경 가능?? (x) 카는 퍼블릭 클래스지만 접근자 default라서 불가능
//Car >> program에서 사용 가능 (o)