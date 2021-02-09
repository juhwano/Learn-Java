
/*
 * OOP (객체 지향 프로그래밍) >> 설계도 만들기
 * 1.상속(재사용성)
 * 2.캡슐화(은닉화) : private (직접할당, 간접할당) >> getter, setter
 * 3.다형성 : 하나의 타입으로 여러개의 객체 주소를 가지는 것
  
 * >> method overloading
 * >> 하나의 이름으로 여러가지 기능을 하는 함수
 * 오버로드 = 수송기 = 밖에서는 뭐를 태운지 모름 = 어떨 땐 질럿, 어떨 땐 질럿+히드라
 * 한 놈이 여러 가지 기능을 한다. 어떨 때는 아무것도 안 태우고, 믿거나 말거나
 * println = 똑같은 놈인데 10가지를 쓸 수 있다..
  
 * System.out.println() >> println() 이름을 1개 기능은 여러개
 * 1. 성능향상과는 상관 없다.
 * 2. 설계자가 개발자의 편리성을 위해서 제공
 * 
 * 문법) 
 * 1. 함수의 이름은 같아야 한다.
 * 2. parameter 갯수 또는 타입은 달라야한다.
 * 3. return type은 오버로딩의 판단 기준이 아니다.
 * 4. parameter 순서가 다름을 인정
  
class out{  
1. 이게 더 편하다
   public void println(){}
   public void println(int i){}
   public void println(String s){}
   
2.   
   public void println(){}
   public void printlnint(int i){}
   public void printlnString(String s){}
 * 
 * 
 * 
 * 
 * 
 * 오버라이딩과 차이점?
 * 
 * 
 */

class Human2{
	String name;
	int age;
	
}
class OverTest{
	int add(int i) {
		return 100+i;
	}
	//오버로딩o
	int add(int i , int j) {
		return i+j;
	}
//	오버로딩x , return type은 판단 기준x
//	String add(int j) { 
//		return "";
	
	//오버로딩o
	String add(String s) {
		return "hello" + s;
	}
	String add(String s, int j) {
		return null;
	}
	String add(int i, String j) {
		return null;
	}
	void add(Human2 human) {
		human.name = "홍길동";
		human.age = 100;
		System.out.println(human.name + " , " + human.age);
	}
}



public class Ex14_Method_Overloading {

	public static void main(String[] args) {
		
		OverTest ot = new OverTest();
		ot.add(100);
		ot.add(100,200);
		
		ot.add(new Human2()); //Human2라는 객체의 주소값
		
		String result = ot.add("방가방가");
		System.out.println(result);
		
		
		
		
		

	}

}
