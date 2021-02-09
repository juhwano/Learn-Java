package kr.or.bit;
/*
클래스 구성요소 (필드 + 함수)
*기능(행위) 만드는 방법
*함수(function, method)
*method : 행위 또는 기능을 정의(최소 단위) : 하나의 함수는 하나의 기능만 구현
          ex)먹는다, 잔다, 걷는다
*함수는 호출에 의해서만 동작 (누군가 그의 이름을 불러주었을때,print(부른다))

  JAVA)함수의 종류
  1. void, parameter(o)                                   >> void print(String str) { 실행코드 }
  void : 동전을 넣고 게임하고 끝나면 끝. 돌려줄 게 없다.
  parameter(0) : 받을거야 줘봐. 매개값, 인자
  
  2. void, parameter(x)                                   >> void print() { 실행코드 }
  동전을 넣지 않아도 게임이 돌아감
  
  3. return type , parameter(o)                           >> int print(int data) {return data + 10}
  4. return type , parameter(x)                           >> int print() {return 100;}
  
  void : 돌려주는 것이 없다 >> return value 가 없다. 
  return type    >>8가지 기본 타입(byte, int, short, long, char, float, double, boolean), 배열(Array), 클래스(class), 컬렉션(collection), 인터페이스(Interface)
  parameter type >>8가지 기본 타입(byte, int, short, long, char, float, double, boolean), 배열(Array), 클래스(class), 컬렉션(collection), 인터페이스(Interface)
  
  parameter 개수는 제한이 없다.
  void print(int a, int b, int c, int d){}
  >>정상 print(10,20,30)(x) -> print(10,20,30,40)(o)
  //동작하기 위해선 필요한 정수값 4개를 다 넣어야한다.
  
  ex)
  boolean print(boolean b) {return true};   //파라미터가 boolean 이니까 return 값은 ture/false 2가지
  print(false);
  
  관용적 표현 : (선배... 써 보았더니 좋아...)
  함수의 이름
  void a(){} ...
  의미 있는 단어의 조합
  getChannelNumber() //트렌드 : 길게 쓰기
  getEmpListByEmpno()
*/
public class Fclass {
	public int data;
	
	//만약 접근자 생략하면 default void m() >>  같은 폴더 내에서만 사용 가능
	public void m() {
		System.out.println("일반함수 : void parameter(x)");
	}
	
	public void m2(int i) {
		System.out.println("일반함수 : void parameter(o)");
		System.out.println("parameter value : " + i); //i함수는 m2함수와 함께 생성되고 사라진다.
	}
	
	public int m3() {
		return 100; //return type이 존재하면 반드시, return 키워드를 사용해서 값을 돌려줘야한다. 실행할때 값을 처리해줘야한다.
	}
	
	public int m4(int data) {
		return 100+data; //파라미터o 리턴값도 파라미터 써준다
	}
		
	
	
	//4가지 기본 유형 끝
	
	//확장
	public int sum(int i, int j, int k) {
		return i + j + k;
	}
	
	//함수 (접근자 거의 public)
	//함수 접근자가 private인 경우
	//설계자의 의도 : 외부에서는 사용x >> 내부에서만 사용 >> "다른 함수를 도와주는 역할"
	//내부에서 사용되는 "공통함수"
	private int subSum(int i) {
		return i +100;
	}
	
	public void callSubSum() {
		int result = subSum(100);
		System.out.println("call result : "+ result);
	}
	
	private int operationMethod(int data) { //공통 함수
		return data * 200;
	}
	
	public boolean opSum(int data) {
		//연산 다른 함수에게 위임
		//본인은 논리만 판단
		boolean bo; 
		int result = operationMethod(data);
		if(result > 0) {
			bo = true;
		}else {
			bo = false;
		}
		return bo;
	}
	
	
	/* Quiz
	 * a와 b 둘 중에 큰 값을 return 하는 함수를 만들자
	 * ex) max(300,100) return 값은 300
	 * public int max(int a, int b) {}
	 * 논리만 만들자.
	 */
	//return 은 최소화 하는게 좋다.
	//30점 
    public int max(int a, int b) {
		if(a >= b) {
			return a;
		}else {
			return b;
		}
	}
    /*60점
    public int max(int a, int b) {
    	int result = 0;
    	if ( a > b) {
    		result = a;
    	}else {
    		result = b;
    	}
    	return result;
    }
    /*90점
    int max = (a > b) ? a : b;
    return max;
    */
    /*100점
    public int max(int a, int b) {
    	return ( a > b) ? a : b;
    }

    *
    *
    *
    */

//  >>출발
//  static void main() {
//  	Fclass fclass = new Fclass();
//  	Tv tv =fclass.tCall(); //Tv타입을 가지는 주소값을 받는다.
//  	System.out.println("tv : " + tv);
//  }
    
    //함수의 return type  또는  parameter >> Array, class(사용자 정의 타입)
    public Tv tCall() { //Tv 타입을 갖는 주소값(같은 타입을 갖는 주소값)을 ruturn]
//    	return null; //난 Tv 타입의 객체가 없어 (o), 주소값이 없다. null

    	Tv t = new Tv(); //t라는 변수는 Tv 타입 객체가 주소를 가지고 있다. new> 주소값 만들기 
    	t.brandname = "LG";
    	System.out.println("t : " + t);
    	return t;
//    	위 코드는 개발자가 어떤 생각을 가지고?? 객체에 어떤 값들을 세팅해서 보낼때
    	
    	
//    	return new Tv(); //Tv라는 객체의 주소값을 바로 리턴
//    	어떠한 초기화도 없이 주소만 던지는 경우
//    	받아다가 해
    	//사용자 정의 class 타입 >> Tv 
    }
    //파라미터로 Tv를 받음.
    //Tv 타입을 갖는 주소값을 파라미터로
    public void tCall2(Tv t) {
    	System.out.println("t 주소 값: " + t);
    }
    
    //새로운 집을 짓는 방법은 new밖에 없다.
    
    
    
}
