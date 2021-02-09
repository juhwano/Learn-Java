/*
추상클래스 : 인터페이스 (interface)

인터페이스 : 표준 , 약속 , 규약 , 규칙 을 만드는 행위

[추상 클래스 : 인터페이스 비교]
1.공통점 : 스스로 객체 생성 불가능 (new 연산자를 통한 객체 생성 불가)
1-1. 차이점 : 추상 클래스(완성 + 미완성) , 인터페이스 (모든 것이 미완성, 모든 것이 추상적)

2. 사용
추상클래스 extends (확장 개념)
인터페이스 -> 반드시 구현해라 implements 사용
class Car extends abclass{}
class Car implements Ia{}  //Ia가 갖고있는 모든 자원을 구현하라. 인터페이스가 가진 추상자원을 재정의해라.

추상클래스 인터페이스 비교2

인터페이스
1. 다중 상속(구현) 가능 >> 약속(작은 단위로 여러개) >> 여러개의 작은 약속들을 모아서 큰 약속을 만들 수 있다.
class Test extends Object implements Ia , Ib , Ic >> 인터페이스는 다중 상속(구현)이 가능하다.
인터페이스끼리 상속 가능함(wow)

약속을 크게 만들면 >> 사용성 떨어진다 >> 한정 >> 조개어서 ...
1줄 요약 : 인터페이스는 객체지향 중 유일하게 다중 상속(구현)이 가능하다.

2. 추상클래스는 단일 상속 원칙(여러 개를 하고 싶으면 계층적 상속)

3. 추상클래스 ( 완성 + 미완성 )

4. 인터페이스
: "상수"를 제외한 나머지는 "미완성(추상) 자원" >> JDK 업데이트 (default 값, static 값을 가질 수 있다라고 나와있긴 하지만 거의 안 씀)


인터페이스는 sw 설계 최상위 단계
(경험 ...)
어떤 프로젝트 진행 (표준을 만들고 다른 사람들에게 구현하게 하는것 정말 어려움)


++개발자(초급)++
1. 인터페이스는 [다형성]입장으로 생각하라 (인터페이스는 부모 타입)

2. 서로 연관성이 없는 클래스를 하나로 묶어주는 기능 (인터페이스를 구현함으로써 같은 부모를 가지게) 
ex)친구 부모님 돌아가심. > 친구한테 우리집에서 같이 살자.  > 친구를 부모님 호적에 올림. > 가족이 됨
같은 부모를 가짐(?)

3. JAVA API 사용할만한 수많은 Interface를 만들어놈 (가져다 쓰는 것만 해도 어느 정도는 할 수 있다)

4. 인터페이스 (관용적 표현) :
>> ~able로 끝나고 첫 글자 대문자 
>> 수리할 수 있는, 날 수 있는,
>> Cloneable 

5. 객체간 연결 고리(객체간 소통) >> 다형성 >> 같은 부모

*/

/*
interface Iable{
    String print();   //상수와 추상자원   
    //description 해줘야함... 출력할 때 print 함수 사용 ... 리턴은 문자열
    
}

class Test implements Iable{

    @Override
    public String print() {
        
        return null;
    }
    
}
*/

//설계의 표준 >> 구현 강제 >> 재정의

/*

1. 인터페이스는 실제 구현부를 가지고 있지 않다 > 함수인데 실행 블럭이 없다.  추상함수를 가지고 있음
ex) void run();

ex2) 게임 설계할 때 이동 move을 전부 인터페이스로 만든다.
move(int x, int y) >> 인터페이스 >> 탱크, 마린 >> move 강제 구현

*추상 클래스는 완전 강제는 아닌데 인터페이스는 강제다.

>>JAVA API : Collection(동적배열:자료구조) >> Vector , [ ArrayList ] , HashSet , [ HashMap ]
Vector , [ ArrayList ] , HashSet , [ HashMap ] 넘들은 수많은 interface 구현

* ArrayList, HashMap을 쓸 수 있으면 첫번째 프로젝트에서 원하는 작업을 할 수 있다.
* 밥 먹듯이 씀

2. 생성방법 (interface 자원)
2-1. public static final int VERSION = 1;  >>  int VERSION = 1 작성 >> 컴파일러가 "public static final" 알아서 붙임

2-2. public abstract void/return run();  >> "public abstract" 생략 가능 >> void/return run();만 써도 된다.
--정석(컴파일러가 바라보는 코드)--

interface Iable{
   public static final int VERSION = 1;
   public abstract void/return run();

}
--실제 사용--

interface Iable{
   int VERSION = 1;
   void/return run();
   String move(int x, int y);

}

interface Iable { }
interface Bable {int Num = 0}
interface Cable {void run(); void move();}

class Test extends Object implement Iable , Bable , Cable

*/

interface Humanable{
//    int AGE; //public static final 앞에 생략되있음. final은 초기값 없으면 에러
    int AGE = 100;
    String GENDER = "남";
    
    String print();
    void message(String str);
}

interface Iable{
    int AGE = 10;
    void info();
    String val(String s);
}

//계층적 상속 없이 한방에 갖다 쓸 수 있다.

class Test extends Object implements Humanable , Iable{

    @Override
    public void info() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String val(String s) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String print() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void message(String str) {
        // TODO Auto-generated method stub
        
    }
    
}








public class Ex03_Interface {

    public static void main(String[] args) {
        
        Test t = new Test();
        Humanable h = t; //부모는 자식 객체의 주소를 가질 수 있다(다형성)
        System.out.println(h.AGE);
        
        Iable ia = t;
        System.out.println(ia.AGE);
        
        
        

    }

}
