package day0127;

public class Ex02test2review {
	public static void main(String[] args) {
		int jumsu = ((int)(Math.random()* 10) + 1)*100;
		
		System.out.println("추첨번호 : " + jumsu);
		  String msg="";//초기화
		  msg+= "고객님의 점수는 :" + jumsu + " 이고 상품은 : ";
		  switch(jumsu) {
		  	case 1000:msg+="Tv";
		  	case 900:msg+="NoteBook ";
		  	case 800:msg+="냉장고 ";
		  	case 700:msg+="한우 ";
		  	case 600:msg+="휴지 ";
		  	     break;
		  	default:msg+="칫솔";     
		  }
		  System.out.println(msg);
		
	}

}
