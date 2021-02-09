package day0119;
/* printf 사용법
 * printf는 우리가 형식에 맞춰 출력할 내용을
 * %문자를 사용하여 형식을 지정해줄 수 있다.
 */
public class Ex12Printf {
	public static void main(String[] args) {
		//1. 10진법 정수('d'ecimal)
		int number = 12345;
		//A. 10진법 정수를 그대로 출력
		System.out.printf("1-A. [%d]\n", number);
		
		//B. 10진법 정수를 10자리 오른쪽 정렬해서 출력
		System.out.printf("1-B. [%10d]\n", number);
		//앞에 원하는 자릿수를 적어준다.
		
		//C. 10진법 정수를 3자리 오른쪽 정렬해서 출력
		System.out.printf("1-C. [%3d]\n", number);
		//정답은 무시해버린다.
		//만약 출력해야할 내용이 지정할 자릿수보다 많으면
		//우리가 지정한 자릿수는 무시된다.
		
		//D. 10진법 정수를 10자리 왼쪽 정렬해서 출력
		System.out.printf("1-D. [%-10d]\n", number);
		//-를 써준다.
		
		//E. 10진법 정수를 10자리 오른쪽 정렬하고,
		//   왼쪽 빈 자리는 0으로 채워서 출력
		System.out.printf("1-E. [%010d]\n", number);
		//0을 앞에 적어준다.
		//*오른쪽을 0으로 채우면 x, 헷갈림*
		
		
		//2. 16진법 정수(he'x'adecimal)
		number = 95;
		//1011이  2자리인지 3자리인지 4자리인지 헷갈림
		//그래서 16진법은 10:A, 11:B, 12:C, 13:D, 14:E, 15:F 알파벳을 쓰도록 만들어짐
		//그래서 1011은 4자리지. 두자리면 AB 이렇게 적어줌
		
		//A. 16진법 정수를 그대로 출력하고, 알파벳이 있으면 소문자로 출력
		System.out.printf("2-A. [%x]\n", number);
		//x를 소문자
		
		//B. 16진법 정수를 그대로 출력하고, 알파벳이 있으면 대문자로 출력
		System.out.printf("2-B. [%X]\n", number);
		//x를 대문자
		
		//C. 16진법 정수를 8자리 왼쪽 정렬하고, 알파벳이 있으면 소문자로 출력
		System.out.printf("2-C. [%-8x]\n", number);
		//-왼쪽,소문자x
		
		//D. 16진법 정수를 8자리 오른쪽 정렬하고, 알파벳이 있으면 대문자로 출력
		System.out.printf("2-D. [%8X]\n", number);
		
		//E. 16진법 정수를 8자리 오른쪽 정렬하고, 알파벳이 있으면 대문자로 출력, 왼쪽 빈 자리는 0으로 채워라
		System.out.printf("2-E. [%08X]\n", number);
		
		System.out.println("------------------------");
		
		/* 3.실수('f'loat)
		 *   우리가 %f를 사용하지만 실제로는 double이 되든 float가 되든 상관없다.
		 */
		double d = 12.345;
		//A. 실수를 그대로 출력
		System.out.printf("3-A. [%f]\n", d);
		// . 도 자릿수 하나 차지한다.
		//컴퓨터에서 실수를 표현할 때, 정확도를 높여서 표현하는 방법
		//12.34544444  vs 12.340000000    
		//0.00044444   vs 0.000000000
		
		//B. 실수를 6자리로 출력
		System.out.printf("3-B. [%6f]\n", d);
		
		//C. 실수를 12자리로 출력
		System.out.printf("3-C. [%12f]\n", d);
		
		//D. 실수를 소숫점 2번째 자리까지 출력
		System.out.printf("3-D. [%.2f]\n", d);
		
		//E. 실수를 소숫점 2번째 자리까지 출력하고 총 6자리로 출력
		System.out.printf("3-D. [%6.2f]\n", d);
		//한 자리가 남네 왼쪽에 공백 넣어서 오른쪽 정렬로 맞춰줘야겠다.
		
		//4. 스트링('S'tring)
		String str = new String("abcDEF");
		//A. 스트링을 그대로 출력
		System.out.printf("4-A. [%s]\n", str);
		//B. 스트링을 모두 대문자로 출력
		System.out.printf("4-B. [%S]\n", str);
		//C. 스트링을 모두 대문자로 출력
		System.out.printf("4-C. [%S]\n", str);
		//왼쪽정렬,오른쪽정렬은 같다.
		//0을 채우라는 불가능
		//숫자체계에서 0은 NULL이지만, 스트링체계에서 0은 문자다.
		
		//printf를 사용할 때 알아두면 좋은 점
		//1.출력할 내용을 여러가지 %문자를 사용하여 조합할 수 있다.
		//회원가입할떄 가입일 나오게, %문자 섞어서 사용
		System.out.printf("이름: %s, 총 가입일수: %d\n" , "조재영", 1234);
		//2.존재하지 않는 %문자를 사용하면 에러가 난다.
		System.out.printf("%m\n", 1234);
		//3. %문자와 맞지 않는 값을 넘겨주면 에러가 난다.
		System.out.printf("%d\n", 12.34);
		//4. %문자의 갯수보다 넘겨주는 값의 갯수가 많으면 문제가 없다.
		System.out.printf("%d %d %d \n", 1, 2, 3, 4, 5);
		//5. %문자의 갯수보다 넘겨주는 값의 갯수가 적으면 에러가 난다.
		System.out.printf("%d %d %d \n", 1, 2, 3);
	}

}
