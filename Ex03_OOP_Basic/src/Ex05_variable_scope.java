/*
class 내부에 : instance variable (member field) (default)
method 내부에 : local variable (default x . . . 반드시 초기화를 사용)
ex) main(String[] args) >> 함수 >> 안의 모든 변수는 사용시 초기화
static variable >> 공유자원(객체간) >> 객체 생성 이전에 memory에 올라가는 자원
(class area(0) 또는 method area)
 
 
 javac Ex05_variable_scope.java   (컴파일)
 java Ex05_variable_scope         (실행) <-실행하면!!
 
 Ex05_variable_scope 정보 >> method(class) area
 그때 클래스 안에 static 자원이 있다면 그 자원을 바로 memory에 road시킴.
 */

class Variable{
    int iv; //member field, instance variable. 설계도를 작성하려고
    
    void method() { //method 안의 변수는 무조건 초기화하자. 기능 제어
        int lv = 0; //local variable 반드시 초기화!!
        
        //for(int i = 0 ... //i는 block variable //for안 유효범위
    }
    
    static int cv;
    
//    1. class variable(클래스 변수), static variable(객체간 공유자원)
//    2. 목적 : 정보를 담는 것(생성되는 모든 객체가 공유하는 자원)
//    heap 영역에 생성된 [객체]들의 [공유자원]
//    3.특징 : 접근방법
//    3-1) class 이름.static  변수명 >> Variable.cv >> why? (객체가 생성되기 전에 접근 가능해야함)
//    3-2) Variable v = new Variable(); >> v.cv
//         Variable v2 = new Variable(); >> v2.cv
//         v.cv == v2.cv 같은 주소의 메모리
//    4. 생성시점 : Hello.java > javac Hello.java > Hello.class
//    >java.exe Hello 엔터 실행 . . .
//    >class loader System.에 의해서
//    클래스를 정보(metadata : 설명) class area(method area) 올림
//    --이 클래스 언제 만들었고 어떤 자원을 import 하고 있고 변수 몇개 ... 기술...
//    --이 클래스 안에 static variable 또는 static method 있으면
//    --이 녀석을 memory (class area) 에 올려 놓는ㄷ다.
}


public class Ex05_variable_scope { //class는 설계도. class는 new를 해야 실행.
    
    public static void main(String[] args) { //함수이름이 main이고 static이면 붙인 함수는 메모리에 미리 올라감. 그 함수의 이름이 main이면 바로 실행 가능한 형태
//        System.out.println(Variable.cv);
        Variable v = new Variable();
        Variable v2 = new Variable();
        System.out.println(v.cv);
        System.out.println(v2.cv);
        
        Variable.cv = 200;
        
        System.out.println(v.cv);
        System.out.println(v2.cv);
        
        
        
    }

}
