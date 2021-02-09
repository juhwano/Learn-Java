package day0119;

/* 삼항연산자는 if문과 비슷
 * 
 */
public class Ex07Operator5 {
	public static void main(String[] args) {
		//괄호 안 부분 수행
		int b1 = (5 > 4) ? 50 : 40;
	    //같습니까?  맞다면 50을 b1에 다르다면 40을 b1에
		System.out.println(b1);
		
		int b2 = (5 < 4) ? 50 : 40;
		System.out.println(b2);

		int b3 = 0;
		if(5 < 4) {
			b3 = 50;
		}else {
			b3 = 40;
		}
		System.out.println(b3);
	}

}
