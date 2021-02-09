
import kr.or.bit.common.Car;

/*
클래스 == 설계도 == 데이터 타입(사용자 정의)

public class Animal{
    Animal cat = new Animal();
}
cat은 객체
cat은 Animal의 인스턴스

객체는 설계도로 구현된 것, 인스턴스는 복제본 또는 일정한 과정을 거쳐 생성된 것
설계도에는 부품들이 어떤 기능을 갖고 있고 어떻게 작동되는지 표현되있다.

여기서 부품은 메소드이다. 메소드는 특정한 기능을 하도록 만들어진 것이다. 다른 프로그래밍 언어에서는 함수라고도 한다.

객체는 클래스의 인스턴스이다.
객체는 부품들을 조합해서 구현한 결과들이다.

클래스 구성 요소 : [필드(속성) + 함수(기능)] + 생성자 함수
*field >> 고유 데이터, 상태 데이터, 부품(참조) 데이터 >> 변수
*function >> 기능 행위 >> 최소 단위(1개의 기능)
*(추가) 
 생성자 함수 >> member field 초기화
 
 클래스, 필드, 생성자, 함수 : 어느 곳에 위치하느냐 (scope)영역 >> 접근자 , 한정자, 수정자
 
 >> public, private, default, protected ( 상속 )
 클래스 앞의
 퍼블릭은 다른 패키지에서도 사용 가능 
 디폴트는 같은 패키지에서만 접근 가능하고 다른 패키지에 있으면 서로 접근 불가하다. 같은 패키지 내 연습 목적
 프라이빗은 캡슐화(직접할당을 막고 간접할당으로 자원보호)
 
 클래스 안의 모든 멤버자원(멤버필드,멤버메소드) 접근자
 
 
 
 1. public class Car{}  >> kr.or.bit.common 폴더 아래 ... 
 2. class AirPlane{} >> default 생략 >> 컴파일러가 자동으로 default 있는 것처럼 관리
    >>default (같은 폴더)
    >>default 접근자는 [같은 패키지 접근 가능][다른 패키지에 있으면 서로 접근 불가]
    >>default 접근자 같은 패키지(package) 연습 목적
    >>program 같은 폴더 안에 있는 클래스는 사용가능
 3. 하나의 물리적인 자바파일은 여러개의 클래스를 가질 수 있다.(O)
 Ex01.main.java >> 여러개의 클래스 >> 단, Ex01_main 클래스(노출된 것)만 public을 가진다. >> 나머지 default   
    
*/
//여러개의 클래스 생성 가능(현업x, 연습 모드, 굳이 패키지 만드는것보다 편하니까)
class Test{ //default class Test 
	int data; //접근 제한자 : default
}
class Test2{ //default class2 Test
	int data2;
	public int data3; //문법적으로 오류x >> 바보
	private int data4; //getter, setter 함수 
	void setData4(int d) {
		data4 = d;
	}
	int getData4() {
		return data4;
	}
}

public class Ex01_main {
	public static void main(String[] args) {
		Car car = new Car();
		
//		AirPlane air = new AirPlane(); // class 앞의 public 없애면 접근x
//      같은 폴더 내에 test 존재 >> 이용 가능
		Test test = new Test();
		test.data = 100;
		System.out.println(test.data);
		
		Test2 test2 = new Test2();
		test2.data2=1;
		test2.data3=2;
		test2.setData4(3);
		System.out.println(test2.getData4());
	}

}
