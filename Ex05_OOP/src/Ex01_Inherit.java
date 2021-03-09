/*
객체 지향 프로그래밍(Object-oriented programming) 특징
1. 상속
2. 캡슐화
3. 다형성

1.상속
java : child extends Base
c#   : child : Base


2.특징
2-1.다중 상속은 불가
2-2.단일 상속만 가능(계층적 상속 : 여러개의 클래스 상속)
2-3.다중 상속을 지원( 단, interface만)


3.상속
3-1. 진정한 의미 : 재사용성
3-2. 단점 : 초기 설계 비용 (하지만 시간이 흐를수록 절약된다)
3-3. 재사용성 >> 설계 >> 비용 (공통 분모, 추상화)

4.상속관계
GrandFather >>  Father >>  Child 상속 관계
할아버지가 없으면 나도 없는겨~
할아버지 > 아버지 > 나
부모부터 heap에 올라간다 ...
Child child = new Child()




연습용 Class라서 위에 만듬
상속관계 중 Base(최상위) 클래스가 Object 상속받고있음
extends Object가 안 보이는 이유? 컴파일러가 알아서 처리
*/
class GrandFather {
	public GrandFather() {
		System.out.println("GrandFather");
	}
	public int gmoney = 5000;
	private int pmoney = 1111; //접근자 private (객체 , 상속관계 접근 불가) 
	
//	public void call() { //클래스 내부에서 private 의미 x, 우회출력하는 방법
//		System.out.println(pmoney);
//	}
	
}
class Father extends GrandFather{
	public Father() {
		System.out.println("Father");
	}
	public int fmoney = 3000;
}
class Child extends Father{
	public Child() {
		System.out.println("Child");
	}
	public int cmoney = 1000;
}


//default
//사용자가 만드는 모든 클래스는 생략된 부분이 있다. 컴파일러가 extends Object가 있다고 가정하고 넣는다.
//class Car (extends Object) {
class Car{
	
}

//사용자가 만드는 모든 클래스는 default Object(최상위,단군) 클래스 상속
//Object 가장 추상화되고 가장 일반화된 클래스
//가지는 자원 : 모든 클래스가 공통 사용하는 것들 ... 주소확인 , 공통함수


public class Ex01_Inherit {

	public static void main(String[] args) {
		//상속관계 파악 후 heap메모리에 할아버지->아빠->아들
		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
		
//		child.pmoney >> private ... 접근x
		
		
		Car car = new Car();
		

	}

}

