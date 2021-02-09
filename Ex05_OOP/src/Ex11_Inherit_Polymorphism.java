class Pbase{                 //     부모 Pbase
    int p = 100;
}

class Cbase extends Pbase{  //상속! 부모 Pbase
    int c = 200;
}

class Dbase extends Pbase{  //상속! 부모 Pbase
    
}


public class Ex11_Inherit_Polymorphism {
    public static void main(String[] args) {
        
        Cbase cbase = new Cbase();
        System.out.println(cbase.toString());
        
        //다형성
        Pbase p = cbase;
        //부모타입의 변수가 자식타입의 주소값을 가질 수 있다.
        System.out.println(p); //Cbase 주소
        
        
        Dbase dbase = new Dbase();
        
        p = dbase;   //다형성
        System.out.println(p);  //Dbase 주소
        
        //자바에서 다형성이란 상속관계에서 부모타입의 참조변수가 여러 개의 자식 타입 객체의 주소를 가질 수 있는 것이다.
        //부모 > a,b,c 객체의 주소가 가능
        
        //Cbase c = p;  부모가 상위. 자식으로 Down (x)
        
        //자식타입으로 내려주어 상속관계에서 자식은 모든 자원 접근 가능
        Cbase c = (Cbase)p; //부모가 객체의 주소를 다시 자식에게 줄 때는 자식타입 casting
        
        
        
        
        
        
        
    }

}
