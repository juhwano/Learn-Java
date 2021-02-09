package kr.or.bit;
/*

새(공통사항 , 일반화 , 추상화) >> 새는 날 수 있다. 새는 빠르다.

*/
public class Bird {
    //공통기능
    public void fly() {
        System.out.println("flying");
    }
    
    //설계자
    //나를 상속하는 당신은 moveFast를 필요에 따라서 재정의했으면 좋겟어(80%) >> 상속관계
    protected void moveFast() {
        fly();
        
    }

}
