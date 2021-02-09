import kr.or.bit.Fclass;
import kr.or.bit.Tv;

public class Ex02_MethodCall {

	public static void main(String[] args) {
		Fclass fclass = new Fclass();
		
		fclass.m(); //함수,호출 // m함수에 할당영역이 생기고 실행하면 다시 사라짐. 게임하다가 전화올 때, 전화끝나면 게임화면으로 넘어감.last in first out
		System.out.println();
		
		fclass.m2(100);
		//파라미터가 갖고있는 값or주소를 넣어야함
		//프로그램 종료 -> 메인 함수 종료

		int result = fclass.m3();
		System.out.println(result);
		
		result = fclass.m4(200);
		System.out.println(result);
		
		result = fclass.sum(10,20,30);
		System.out.println(result);
		
	    fclass.callSubSum();  //마우스로 클릭 후  F3하면 추적 쌉가능
		
	    boolean bo = fclass.opSum(-1);
	    System.out.println(bo);
	    
	    result = fclass.max(300, 540);
	    System.out.println(result);
	    
	    
	    Tv tv = fclass.tCall(); //Tv 타입을 가지는 주소값을 받을 수 있다.
	    System.out.println("tv : "+ tv.brandname);
	    
	    
	    
	    //Tv객체
	    Tv tv2 = new Tv();
	    System.out.println("tv2 :" + tv2);
	    fclass.tCall2(tv2); //주소값 전달
	    
	    
	    

	}

}
