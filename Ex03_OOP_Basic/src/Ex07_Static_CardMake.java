import kr.or.bit.Card;

public class Ex07_Static_CardMake {
	public static void main(String[] args) {
		//Card 53장을 만들어야함
		//heap 메모리에 만들어짐(객체)
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		c.h = 80;
		c.w= 50;
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "heart";
		c2.cardInfo();
		
		
		//고객 .. 변심 .. 카드가 작아요
		//카드를 크게 해주세요
		//h=80 w50 요구사항(반영)
		
		//현실세계 > 53 다시 인쇄
		
		//프로그램 세계 >
		//1. 53장 카드 h, w 일일히 변경
		//2. 설계도 변경(다시 인쇄)
		//높이와 너비를 static 상수로 만들어서 바꿔준다?
		
		
	}

}