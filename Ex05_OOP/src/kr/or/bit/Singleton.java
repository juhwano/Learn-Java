package kr.or.bit;
//디자인 패턴(생성 패턴) >> new (객체)
//객체 하나를 만들어서 공유하겠다 ...
//의도 : 하나의 객체를 공유하겠다.

//활용
//공유프린터 
//공유 와이파이

public class Singleton {
   private static Singleton p;
   private Singleton() { // private은 다른 폴더에서 공유가 안된다
        //즉 직접 객체 생성 불가 ...new (x) ...heap 객체 생성 불가(생서자를 통해서)
   }
   public static Singleton getInstance() {
      if(p == null) {
         p= new Singleton(); //생성자 호출 객체 만든것 
      }
      return p;
   }

}

