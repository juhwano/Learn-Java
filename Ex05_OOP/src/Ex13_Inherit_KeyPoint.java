/*
문제 풀어 보세요 ^^
요구사항
카트 (Cart)
카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개  , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다

계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력

hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart  담는 것을 구현 )
hint) Buyer ..>> summary()  main 함수에서 계산할때

구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다
*/

class Product2{
	int price;
	int bonuspoint;
	//Product2() {}
	Product2(int price) {
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
	
}

class KtTv2 extends Product2{
	KtTv2(){
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv2";
	}
}

class Audio2 extends Product2{
	Audio2(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio2";
	}
}

class NoteBook2 extends Product2{
	NoteBook2(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook2";
	}
}

class Buyer2{ //구매자
	int money;
	int bonuspoint;

	///////////////
	//장바구니 생성 (모든 전자제품)
	Product2[] Cart;
	int index = 0;	
	///////////////
	
	Buyer2() {
		this(1000,0);
	}
	Buyer2(int money , int bonuspoint){
		 Cart = new Product2[10]; //카트 초기화
		 this.money = money;
		 this.bonuspoint = bonuspoint;
	}
	
	//구매기능안에 장바구니(cart) 넣는 기능 같이 포함하세요
	void Buy(Product2 product){
		
		if(this.money < product.price) {
			System.out.println("고객님 잔액이 부족합니다^^! " + this.money);
			return; //함수종료 > kttvBuy 탈출 (구매 행위 종료)
		}
		//Cart 범위 제한
		if(this.index >= 10) { //this.index >> 전역 ... >> 모든 함수에서 사용가능
			System.out.println("[ 고객님 그만 사세요 ^^]");
			return;
		}
		//장바구니 담기///////////////////////////////////////////////////
		Cart[index++] = product; //Cart[++index] >> 전치증가  	1번째 방 ...
		                         //Cart[index++] >> 전치증가  	0번째 방 ...
		///////////////////////////////////////////////////////////////
		//실 구매 행위
		this.money -= product.price; //잔액
		this.bonuspoint += product.bonuspoint; //누적
		System.out.println("구매한 물건은 : " + product.toString());
		System.out.println("잔액 : " + this.money);
		System.out.println("포인트 : " + this.bonuspoint);
	}
	
    //계산대 (장바구니)
	//장바구니에 담긴 물건을 계산
	//물건의 총액
	//물건의 목록  출력
	void Summary(){
		int totalprice = 0;
		int totalbonuspoint=0;
		String productlist ="";
		/*
		for(int i = 0 ; i < Cart.length ; i++) {
			//다행이도 10개 다사면 ...
			if(Cart[i] == null) break; //방어적인 코드 ...
			totalprice += Cart[i].price;
			totalbonuspoint += Cart[i].bonuspoint;
			productlist += Cart[i].toString() + " ";
		}
		*/
		for(int i = 0 ; i < index ; i++) {
			totalprice += Cart[i].price;
			totalbonuspoint += Cart[i].bonuspoint;
			productlist += Cart[i].toString() + " ";
		}
		System.out.println("**************************");
		System.out.println("구매한 물건 총액 : " + totalprice);
		System.out.println("포인트 총액 : " + totalbonuspoint);
		System.out.println("구매한 물건 목록: " + productlist);
	}	

}
public class Ex13_Inherit_KeyPoint {
	public static void main(String[] args) {
		KtTv2 kttv = new KtTv2();
		Audio2 auido = new Audio2();
		NoteBook2 notebook = new NoteBook2();
			
		Buyer2 buyer = new Buyer2(10000,0); //고객
		
		buyer.Buy(kttv);
		buyer.Buy(auido);
		buyer.Buy(kttv);
		buyer.Buy(kttv);
		buyer.Buy(notebook);
		buyer.Summary();

	}

}