package day0119;
/* 논리연산자
 * 논리연산자는 boolena 값에 대한 연산을 한다.
 * 
 * 1. AND 연산자 ( && )  <- 쉬프트 77 
 *    2개의 boolean 값이 모두 true일 때에만 결과가 true가 나온다.
 *    
 * 2. OR 연산자 ( || )
 *    2개의 boolean 값 중 하나라도 true 이면 결과가 true가 나온다.
 *    
 * 3. NOT 연산자 ( ! )
 *    true는 false로 false는 true로 변환해준다.
 *    물론 실제 값이 바뀌지는 않는다.   
 */
public class Ex07Operator4 {
	public static void main(String[] args) {
		// 1. AND 연산자
		System.out.println("true && true: " + (true && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("false && true: " + (false && true));
		System.out.println("false && false: " + (false && false));
		//AND 연산의 경우 앞의 boolean 값이 false일 경우
	    //굳이 뒤를 확인 안해도 결과값은 무조건 false이기 때문에
		//false && true 혹은 false && false라고 적으면 뒤의 true와 false에 "경고"가 뜬다.
		//앞이 false면 뒤에것은 체크 x, 이미 확정
		
		// 2. OR 연산자
		System.out.println("true || true: " + (true || true));
		System.out.println("true || false: " + (true || false));
		System.out.println("false || true: " + (false || true));
		System.out.println("false || false: " + (false || false));
		
		// 2. NOT 연산자
		boolean b = true;		
		System.out.println("b의 현재값: " +b);
		System.out.println("!b: "+!b);
		System.out.println("b의 현재값: " +b);
		
//		조건문
//		부울 연산은 보통 다음처럼 조건문의 판단 기준으로 많이 사용된다.

		int base = 180;
		int height = 185;
		boolean isTall = height > base;

		if (isTall) {
		    System.out.println("키가 큽니다.");
		}
//		하나의 예를 더 보자.

		int i = 3;
		boolean isOdd = i % 2 == 1;
		if (isOdd) {
			System.out.println("맞습니다.");
		}
//		i % 2 == 1은 i를 2로 나누었을 때 나머지가 1인지를 묻는 조건문이다. 
//		i는 3이므로 3을 2로 나눈 나머지는 1이 되어 참이 된다. 따라서 isOdd 는 true 값을 갖게 될것이다.
		
		
		
		
		
		
	}

}
