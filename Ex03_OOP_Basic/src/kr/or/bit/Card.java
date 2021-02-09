package kr.or.bit;

/*
카드를 설계한다.

모든 소프트웨어는 변화한다.
변화에 대응하지 못하는 소프트웨어는 소멸한다.

[모든 카드의 높이와 너비는 동일] (동일해요)
??? 카드의 크기를 나중에 변경해 달라고 하면 ????

설계도를 다시 변경하지 않고 53장 카드의 크기를 변경할 수 없을까?
 */
public class Card {   //class = 설계도
	//번호
	public int number; //default
	//모양
	public String kind;
	//크기(높이,너비) 고정 <- 변경해야함
//	public int h = 50; //고정-> 초기화    //객체마다 가지는 값
//	public int w = 20;
	public static int h = 50;  //모든 객체가 공유하는 값
	public static int w = 30;

	
	//카드 정보
	public void cardInfo() {
		System.out.printf("번호:%d  , 모양:%s , h:%d , w:%d \n", number , kind , h, w);
	}
	
	

}