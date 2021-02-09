package kr.or.bit;
//class == 설계도  == Type(사용자 정의 타입)
//클래스를 프로그래밍적 언어로 표현하자면 어떠한 객체의 변수(valiable) , 
//메소드(method) 의 집합이다 표현할수있으며 
//현실세계에 빗대어 말하자면 동일한  속성과 행위를 수행하는 객체의 집합이다.


//사원이라는 설계도
//사원을 표현 (사번, 이름 , 직종 .....)
public class Emp {
  
  //정보를 담을 수 있는 변수
  //사원은 사번을 가지고 있다 (사번 숫자)
  //변수 > 정보 (고유, 상태 , 부품) 담을 수 있는 공간의 이름 >> instance variable >> member field
  
  //변수의 종류(scope : 유효범위) : 선언되는 위치 
  //1.   local variable (지역변수 : 함수) 
//	class Person{ 
//	public void run(){ 
//	int speed; 
//	}
//	}
  //1.1  함수안에 if블럭 , for 블럭안에 변수 (block)
  //2.   instance variable  
//	class Person{ 
//	public int age; 
//	}
  //3.   static variable : 공유자원(객체간)
  
  //클래스의 종류
  //1. class Test{ } >> 독자적인 실행이 불가능 >> 다름 클래스 도와주는 클래스(타입) >> lib
  //2. class Test{public static void main(String[] args){}} >> 독자적인 실행이 가능한 클래스
  //2.1 >> 함수의 이름(main) >> 약속 >> 시작점(진입점) 
  //Tip) c# >> Main()
  
  //private 캡슐화 : 자원을 보호 하겠다
  //직접할당을 막고 간접할당을 통해서 데이터 제어
  
  private int empno;
  private String ename;
  private String job;

  public String getEname() { //getter 함수
      return ename +"님";
  }
  public void setEname(String ename) { //setter 함수
      this.ename = ename;
  }

  private int num;
  //함수 (최소의 기능(행위) 단위)
  //간접(누군가를 통해서 전달 , 누군가를 통해서 받겠다)
  public void setNum(int n) { //setter 기능함수(write 함수)
      if(n > 0) {
          num = n;    
      }else {
          num = 0;
      }
      
  }
  public int getNum() { // getter 기능함수(read 함수)
      return num;
  }
  
  
  public int number;
  
  public void print() {
      int number = 0;
      System.out.println(number);
      //int i=0;
      for(int i = 0 ; i < 10 ; i++) {
          
      }
      //System.out.println(i);
  }
  
  
  
}

