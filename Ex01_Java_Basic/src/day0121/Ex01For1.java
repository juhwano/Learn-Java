package day0121;
/* for 반복문
 * for 반복문은 while 반복문에 비해 "비교적 반복 횟수가 명확하다."
 * for 반복문은 다음과 같은 형태를 가진다.
 * for(제어변수 선언과 초기화; 반복 조건식; 제어변수의 변화식){
 *     반복할 코드
 * }
 * for (초기치; 조건문; 증가치){
 *      
 */
public class Ex01For1 {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			System.out.printf("i의 현재값: %d\n", i);
		}
		// 1. int i = 1 
		// i의 유효범위는 for문이 끝날 때까지
		// 2. i <= 3   -> i의 현재값이 1이므로 true
		// 3. System.out.printf()
		// 4. i++  -> 2
		// 5. i <= 3   -> i의 현재값이 2이므로 true
		// 6. System.out.printf()
		// 7. i++  -> 3
		// 8. i <= 3   -> i의 현재값이 3이므로 true
		// 9. System.out.printf()
		//10. i++  -> 4
		//11. i <= 3   -> i의 현재값이 4이므로 false
		//12. for문이 종료된다. (3번 반복됨. i = 1,2,3)
		
		// for문의 팁들
		// 1. 제어 변수는 말 그대로 '변수'다.
		//    for문 코드블락 안에서는 변수처럼 사용된다.
		     
		// 2. 제어 변수의 초기화나 조건식에는 다른 변수가 사용가능하다.
		System.out.println("-------------2번-------------");
		int start = 3;
		int max = 6;
		for(int i = start; i <= max; i++) {
			System.out.println("i의 현재값: "+ i);
		}
		System.out.println("-----------------------------");
		
		// 3. "전통적으로" 제어변수는 i -> j -> k -> l 이런식이지만
		//    불편하다면 굳이 제어변수의 이름을 i 라고 안해줘도 된다.
		
		// 4. 조건식과 변화식은 주로 >=, <=, ++을 쓰지만
		//    true/false가 나오는 조건식과 제어변수의 값을 변화시킬 수 있는
		//    할당연산자면 뭐든 사용가능하다.

        for(int i = 100000; i > 0; i -= 100000) {
        	System.out.println("i의 현재값: "+i);
        }
		
        // 다른 제어문들도 해당되는 내용이지만
        // () 뒤에 ; 이 붙으면 안된다.
        // 의미가 조건이 맞으면 반복할 코드가 없다.
        for(int i = 1; i <= 1000; i++);{
        	System.out.println("몇번 반복될까?");
       
        }
		
		
		
	}

}
