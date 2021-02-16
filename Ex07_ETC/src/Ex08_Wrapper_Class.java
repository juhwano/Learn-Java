import java.util.ArrayList;

/*
자바가 가지는 8가지 기본 타입(값 타입) : JAVA API 제공

8가지 기본 타입에 대해서 설게도를 생성 >> 8가지 기본 타입도 객체 형태로 사용 가능 >> wrapper class

값 타입 대신에 객체 형태 타입 >> generic (참조 형태 parameter만)

1. 매개변수 객체 타입이 요구될 때
2. 기본형 값이 아닌 객체 형태로 저장
3. 객체간 값 비교
4. 타입 변환 시 비교

*/
public class Ex08_Wrapper_Class {

	public static void main(String[] args) {
		int i = 100;
		
		Integer n = new Integer(500);  //정수값 만들지 말라   -> is deprecated 지원 안함. 추후 버전에서 사라짐 ..
		System.out.println(n); //n 주소값이 출력되야함. 근데 값이 나오네? (toString() 재정의)
		System.out.println(n.MAX_VALUE);
		System.out.println(n.MIN_VALUE);
		
//		POINT
//		Integer   >> Wrapper Class가 함수의 parameter로 사용
//		특히 generic에서 .. 이렇게 하면 정수 값만 받을 수 있다.
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(100);
//		li.add("A"); 
		for(int value : li) {
			System.out.println(value);
		}
//		char -> Character
//		int -> Interger
//		나머지는 앞글자만 대문자
		
//		제너릭은 값타입을 바로 쓸 수 없게 되있고 참조타입만 올 수 있어서 값타입을 사용하기 위해 래퍼 클래스로 설정해둿다
		
	}

}
