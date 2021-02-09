/*

Tip) 
C# 다형성 >> overloading, override >> 넓은 범위
java 다형성 >> [상속관계]에서 [하나의 참조변수]가 [여러개의 타입]을 가질 수 있다.
[하나의 참조변수] >> 부모타입

부모타입이 여러 개의 자식을 가질 수 있다??

ex)한국타이어 미쉐린타이어 금호타이어 

부모클래스 타입의 참조변수가 여러 개의 자식클래스 객체를 담을 수 있다.
*/
class Tv2{
//    속성(field)
    boolean power;
    int ch;
//    기능(method)
    void power() {
        this.power =! this.power;
    }
    void chUp() {
        this.ch++;
    }
    void chDown() {
        this.ch--;
    }
    
}
//자막기능이 있는 Tv
class CapTv extends Tv2{
    //특수화, 구체화된 자원 >> 자막 기능
    String text;
    
    String captionText() {
        return this.text = "현재 자막 처리 중 . . . .";
    }
}



public class Ex10_Inherit_Polymorphism {
    public static void main(String[] args) {
        CapTv captv = new CapTv();
        captv.power();
        System.out.println("전원 :  " + captv.power);
        
        captv.chUp();
        System.out.println("채널 : " + captv.ch);
        System.out.println(captv.captionText());
        //기존 배운 내용
        
        //Car c = new Car();
        //Car c2 = c;              >>  같은 타입끼리 주소를 주고 받을 수 있다.
        
        
        //상속관계에서 부모타입의 부모는 자식타입의 주소를 가질 수 있다.(다형성)
        //전제조건 : 단, 부모는 자신의 자원만 접근할 수 있다.
        //           단, 재정의 제외
        //현실세계는 부모가 자식한테 다 주지만, 프로그램세계에서 자식이 부모한테 조건없이 다 줌
        Tv2 tv2 = captv;
        
        //같은 주소지만 상속관계 자식은 부모것까지 볼 수 있고, 부모타입은 자신의 것만 본다.
        System.out.println(tv2.toString()); //CapTv@18e8568
        System.out.println(captv.toString()); //CapTv@18e8568
        
        //자식의 것은 접근 불가
        //tv2.captionText();
        
        //자신의 것은 접근 가능
        tv2.power();
        
        //자바에서 다형성이라는것은 상속 관계에서 부모 타입은 자식 타입의 주소를 가질 수 있다.
        //바꿔말하면, 첫째 둘째 셋째 넷쨰를 한 부모가 주소를 가질 수 있다.
        
    }

}
