/*
this : 객체 자신을 가르키는 this (this.empno , this.ename)
this : 생성자를 호출하는 this ( this(100,"red") )

상속

부모
자식 (this)

super : 상속 관계에서 현재 자식이 부모의 접근 주소값을 가짐.
        자식의 입장에서 super는 부모 객체의 주소
        부모 객체를 나타내는 키워드
        *나를 가르키는 키워드가 this였다면 부모를 가르키는 키워드는 super구나.*
        super() <- 부모의 생성자
        
        
Tip)
c# : base()
java : super()        

super
1. 상속관계에서 자식이 부모에게 접근
2. 상속관계에서 부모의 생성자를 호출(명시적으로)
*/

class Base{
   String basename;
   Base() {
      System.out.println("Base 기본 생성자 함수");
   }
   Base(String basename) {
      this.basename = basename;
      System.out.println("basename: " + this.basename);
   }
   
   void method() {
      System.out.println("나 부모 메소드");
   }
}

class Derived extends Base{
   
   String dname;
   Derived() {
      System.out.println("Derived 기본 생성자 함수");
   }
   Derived(String dname) {
//    파라미터를 가지고 부모 생성자 호출. 부모가 먼저 실행되지만 super가 있으면 컴파일러가 어떤 생성자를 쓸지 지정해줌 
      super(dname); // 부모의 생성자를 호출 (상속관계에서 부모의 this)
      this.dname = dname;
      System.out.println("dname: " + this.dname);
   }
   @Override
   void method() {
      
      //super.method();
      System.out.println("부모함수 재정의");
   }
   
   // 어느날 부모님의 모습이 그리워요
   // 유일한 방법 super
        void parent_method() {
           super.method();
        }
   
}


public class Ex06_Inherit_Super {

   public static void main(String[] args) {
      //Derived d = new Derived();
      Derived d = new Derived("홍길동");
      d.method(); //부모의 함수
      d.parent_method();
   }
}