/*
UML 출현 배경?

회사의 인재상?
협업할 수 있는 인재

인도 중국 한국
언어를 하나 만들자
누가 설계하든간에 

UML = 모델을 만드는 표준 언어

그림을 그려서 모델을 만드는 언어ㅓ

클래스 다이어그램

필수 다이어그램

1.클래스

2.유스 케이스

3.시퀀스

프로젝트 목적 : 설계시나리오를 가지고 1,2 번 ㄱㄴ



그림은 시나리오를 

멤버필드 
- 접근자      -는 프라이빗 +는 퍼브릭
: 오른쪽이 리턴타입

비주얼 패러다임 툴

현존하는 기술은 메소드를 못 채움

회사에서 좋아함
클래스다이어그램 그릴 수 잇어?
메소드 채울 숭 ㅣ썽?

read only = 상수

밑줄이 가면 static

cos(파라미터) 더블타입 스태틱 퍼블릭


Dependency(의존)
클래스의 자원x 함수의 자원
유저는 스케쥴에 의존한다
유저클래스는 함수란 말이 들어가야함
의존 펑션

함수내부에서 스ㅔㅋ쥴 만들어서 리턴
함수 내부에서 스케쥴을 파라미터로 받는다거나

참조의 형태
메소드 내에서 대상 클래스의 객체생성,객체 사용,메소드 호출,객체 리턴,매개변수로 해당객체를 받는것

유저는 스케쥴에 의존합니다.
(생성할 수 있습니다.)
(로컬 변수로 가질 수 있습니다.)
(파라미터로 가질 수 있습니다.)

전제조건 : 함수에서


연관 - 둘 다 의존관계
별표는 정규표현 한개~여러개

어그레이션 = 부분집합
* 
---------------------------------------  
 * 
User 사용자    : Provider 제공자

class A{}
class B{}

관계) A는 B를 사용합니다.

사용방법
1. 상속   A extends B
2. 포함   A 라는 클래스는 B를 member field로 가질 수 있다. class A {B b;}
   2-1    부분집합 라이프사이클이 다름
   2-2    전체집합 라이프사이클이 같음
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
2-1. 부분집합 aggrigation
ex)학생과 학교의 관계 >> 라이프사이클 다름

class B{}
class A{
   int i;
   B b;   //A는 B를 포함관계로 사용합니다.
   A(){
       
   }
   A(B b){
   this.b = b;
   } 
}

>>void main()
  A a = new A();
  B b = new B();
  A a2 = new A(b);
  
  A,B 같은 공동체 아님
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
2-2.전체집합 composition
ex)차와 엔진의 관계 >> 라이프사이클 같음

class B{}
class A{
   int i;
   B b;   //A는 B를 포함관계로 사용합니다.
   A(){
       b = new B();
   } 
}

>> B라는 클래스는 독자적인 생성을 하지 않는다. >> A라는 객체가 만들어져야 B도 생성
>> A a = new A(); >> A객체 생성 + B객체도 생성
>> 같은 생명(생명주기 같아요)   >> composition 전체집합
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 
공통점 : 참조변수를 만든다

A가 B를 사용. 클래스 안에서 멤버필드로

밖에서 들어오면 부분집합
안에서 생성되면 전체집합
 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
class B{}
class A{
   int i;
   B b;   //A는 B를 포함관계로 사용합니다.
   A(){
       
   } 
   void m(B b){  //A는 B에 의존합니다(함수) ,B타입의 멤버 필드 없어요
         b객체를 가지고 작업
   }      
}
 
void main()
B b = new B();
A a = new A();
어떤 상황에는 B객체 필요
a.b(b);
 
*/

class B{
	
}
class A{
	void method(B b) {
		
	}
}
/*
main 에서
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~**********************************중요함***********************************~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
현대적인 프로그래밍 기법 : 인터페이스 활용
인터페이스는 부모타입이다 > 전자제품에서 Buy 함수에 Product를 넣은 거랑 같은 타입인가?
*/
interface Icallable{
	void m();
}

class D implements Icallable{

	@Override
	public void m() {
		System.out.println("D Icallable 인터페이스의 m() 재정의 ");
		
	}
	
}

class F implements Icallable{

	@Override
	public void m() {
		System.out.println("F Icallable 인터페이스의 m() 재정의 ");
		
	}
	
}
// interface POINT >> Decupling하게 유연하게 짜느냐 >> 확장성을 좋게 하느냐
class User{
	
	void method(Icallable ic) {
		
	}
	
	/*
	void method(D d) {
		d.m();
	}
	void method(F f) {
		f.m();
	}
	*/
}

 
 
public class Ex05_User_Provider {

	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		a.method(b); //B 타입의 객체 주소가 와야함 >> B객체를 생성하지 않으면 method 사용 불가 B만 넣어줘야함. C,D,F 객체는??
		
		D d = new D();
		F f = new F();
		User user = new User();
		user.method(f);
		

	}

}