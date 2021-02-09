/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다.
A라는 전자제품 매장이 오픈되면
[클라이언트 요구사항]
가전제품은 제품의 가격, 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다.
ex)
각각의 전자제품은 이름을 가지고 있다.(ex: Tv, Audio, Computer)
각각의 전자제품은 다른 가격을 가지고 있다.(Tv:5000, Audio:6000 ... )
제품의 포인트는 가격의 10% 적용한다.

시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다.
ex) 10만원, 포인트 0
구매자는 제품을 구매할 수 있다. 구매행위를 하게되면 가지고 있는 돈은 감소하고 포인트는 올라간다.
구매자는 처음 초기 금액을 가질 수 있다.

공통사항 : 가격 ,포인트 정보
-------------------------------------------------------------------------------------------------------------------
1차 코드 (물건이 3개 . . . 구매할 수 있는 함수) 완성!

1차 오픈
-하와이 휴가 ...

공식 오픈
매장에 1000개의 다른 종류의 제품 입점 (마우스, 토스트기 등) 제품등록 (자동화 > 1000개의 class) 
매장에 1000개의 제품 전시
고객 >> 불만 >> 3개의 제품만 살 수 있다 .. >> 997개의 제품 판매 불가

전화 >> 친구 >> 욕 >> PC방 >> 국내 전산망 >> 개발 서버 접속 >> 남은 휴가 3일 >> 997개의 함수를 만들었습니다.(END)
-------------------------------------------------------------------------------------------------------------------
Problem  >> 변화에 대응하는 코드를 만들지 못했다.
Solution >> 

*/
class Product {
    int price;
    int bonusPoint;
    // 오버로딩으로 간다.
    Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (this.price / 10.0);
    }
}

class KtTv extends Product {
//    가격정보는 부모가 가지고 있다.
    KtTv() {
        super(500);
    }
    @Override
    public String toString() {
        return "KtTv";
    }
}
class Audio extends Product {
//  가격정보는 부모가 가지고 있다.
    Audio() {
        super(100);
    }
    @Override
    public String toString() {
        return "Audio";
    }
}

class NoteBook extends Product {
//  가격정보는 부모가 가지고 있다.
    NoteBook() {
        super(150);
    }
    @Override
    public String toString() {
        return "NoteBook";
    }
}

//구매자
class Buyer {
    int money = 1000;
    int bonusPoint;

    /* 구매자는 구매 행위를 할 수 있다. (기능)
     구매행위(잔액 - 제품의 가격 , 포인트 정보 갱신(증가)
     *****구매자는 매장에 있는 모든 물건을 구매할 수 있다.*****

    void KttvBuy(KtTv n) { // 구매자가 어떤 물건의 정보를 알아야( 그 물건의 가격정보 얻어올 수 있다.)
        if (this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
            return; // 함수의 종료 ^^(구매 행위 종료) 나가
        }
        // if를 타지 않으면 많은 돈을 가지고 있음. 실 구매 행위
        this.money -= n.price; // 잔액
        this.bonusPoint += n.bonusPoint; // 누적
        System.out.println("구매한 물건은 : " + n.toString());

    }

    void KttvBuy(Audio n) { // 구매자가 어떤 물건의 정보를 알아야( 그 물건의 가격정보 얻어올 수 있다.)
        if (this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
            return; // 함수의 종료 ^^(구매 행위 종료) 나가
        }
        // if를 타지 않으면 많은 돈을 가지고 있음. 실 구매 행위
        this.money -= n.price; // 잔액
        this.bonusPoint += n.bonusPoint; // 누적
        System.out.println("구매한 물건은 : " + n.toString());

    }

    void KttvBuy(NoteBook n) { // 구매자가 어떤 물건의 정보를 알아야( 그 물건의 가격정보 얻어올 수 있다.)
        if (this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
            return; // 함수의 종료 ^^(구매 행위 종료) 나가
        }
        // if를 타지 않으면 많은 돈을 가지고 있음. 실 구매 행위
        this.money -= n.price; // 잔액
        this.bonusPoint += n.bonusPoint; // 누적
        System.out.println("구매한 물건은 : " + n.toString());
    }
    */
    //2차 개선
    //1. Overloading : 하나의 이름으로 여러 가지 기능
    //2. 다형성      : 반복되는 코드 줄이기 ... 모든 제품은 Product를 상속 ... 모든 제품의 부모는 Product
    //Product p;
    //KtTv t = new KtTv();
    //p = t;
    
    
  //Product 부모타입의 참조변수는 부모것만 접근 가능.toString이 찍히는 이유는. 부모가 재정의x했지만 밑에서 오버라이드. 
  //자식객체를 heap에 올리면 부모객체도 같이 올라간다. //자식들의 주소를 받을 수 있는것.매개변수로 Product타입 
    
    void Buy(Product n) { 
        if (this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
            return; 
        }
        this.money -= n.price; // 잔액
        this.bonusPoint += n.bonusPoint; // 누적
        System.out.println("구매한 물건은 : " + n.toString());

    }

    
    
    
    
}

public class Ex12_Inherit_KeyPoint {
    public static void main(String[] args) {
        KtTv kttv = new KtTv();
        Audio audio = new Audio();
        NoteBook notebook = new NoteBook();

        Buyer buyer = new Buyer();
        buyer.Buy(kttv);
        buyer.Buy(audio);
        buyer.Buy(notebook);
        buyer.Buy(kttv);

    }

}

//만약 자식클래스에서 오버라이딩된 toString()을 재정의되기 전 원래 기능으로 쓰려면 super.toString()으로 써야하나요?