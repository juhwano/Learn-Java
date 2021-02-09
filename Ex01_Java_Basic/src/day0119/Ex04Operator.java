package day0119;
/* 연산자(Operator)
 * 연산자란 특정 수학 기호에 프로그래밍 기능을 정의해놓은 것이다.
 * 
 * 연산자에는 크게
 * 산술
 * 할당
 * 비교
 * 논리
 * 비트
 * 5가지 연산자의 종류가 있다.(논산할비비)
 * 
 * 산술 연산자
 * 산술 연산자는 2개의 값에 대한 산술(간단한 산수)를 실행한다.
 * 
 * + : 2개의 값을 더한다.
 * - : 앞의 값에서 뒤의 값을 뺀다.
 * * : 2개의 값을 곱한다.
 * / : 앞의 값에서 뒤의 값을 나눈 "몫"을 구한다.
 * % : 앞의 값에서 뒤의 값을 나눈 "나머지"를 구한다.
 * 
 * 산술연산자의 경우 서로 다른 데이터타입을 연산시키면
 * 더 큰 데이터타입이 결과값이 된다.
 * 만약, byte 와 int를 연산시키면 결과값은 int가 된다.
 * 만약, 실수형 데이터타입과 정수형 데이터타입을 연산시키면, 결과값은 실수형 데이터타입이 된다.
 * 
 */
public class Ex04Operator {
	public static void main(String[] args) {
		int number1 = 4;
		int number2 = 7;
		
		System.out.println("number1 + number2: ");
		System.out.println(number1 + number2);
		
		System.out.println("number1 - number2: ");
		System.out.println(number1 - number2);
		
		System.out.println("number1 * number2: ");
		System.out.println(number1 * number2);
		
		System.out.println("number1 / number2: ");
		System.out.println(number1 / number2);
		//정수형 데이터타입끼리의 나눗셈은 무조건 몫만 구한다.
		
		System.out.println("number1 % number2: ");
		System.out.println(number1 % number2);
		//두 수의 나눗셈의 나머지를 구한다.
		
		System.out.println("===============================");
		
		double d = 7.0;
		
		System.out.println("number1 + d: ");
		System.out.println(number1 + d);
		
		System.out.println("number1 - d: ");
		System.out.println(number1 - d);
		
		System.out.println("number1 * d: ");
		System.out.println(number1 * d);
		
		System.out.println("number1 / d: ");
		System.out.println(number1 / d);
		
		System.out.println("number1 % d: ");
		System.out.println(number1 % d);
		
		//정수와 실수를 연산시키면 결과값은 실수가 나온다.
		
	}

}
