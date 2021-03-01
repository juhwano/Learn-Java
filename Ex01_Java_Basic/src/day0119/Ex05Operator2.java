package day0119;
/* 할당연산자(대입연산자)
 * 할당연산자는 오른쪽 값을 연산해서
 * 왼쪽 공간에 넣는 역할을 맡는다.
 * 
 * =, +=, -=, *=, /=, %=, ++, --
 */
public class Ex05Operator2 {
	public static void main(String[] args) {
		int number;
		// 1. = 은 오른쪽 값을 왼쪽 공간에 할당한다.
		number = 5;
		System.out.println("1. number = 5 결과값: "+number);
		
		// 2. += 은 왼쪽 공간의 현재 값에 오른쪽 값을 더한 결과값을
		//    왼쪽 공간에 다시 할당한다.
		//    +=은 String에도 사용가능하다.
		
		number += 4;
		System.out.println("2. number += 4 결과값: "+number);
		
		String str = new String("123");
		str += 45;
		System.out.println("2. str += 45 결과값 : "+str);
		
		// 3. -= 은 왼쪽 공간의 현재 값에 오른쪽 값을 뺀 결과값을
		//    왼쪽 공간에 다시 할당한다.
		number -= 2;
		System.out.println("3. number -= 2 결과값: "+number);
		
		// 4. *= 은 왼쪽 공간의 현재 값에 오른쪽 값을 곱한 결과값을
		//    왼쪽 공간에 다시 할당한다.
		number *= 4;
		System.out.println("4. number *= 4 결과값: "+number);
		
		// 5. /= 은 왼쪽 공간의 현재 값에 오른쪽 값을 나눈 결과값을
		//    왼쪽 공간에 다시 할당한다.
		number /= 3;
		System.out.println("5. number /= 3 결과값: "+number);
		
		// 6. %= 은 왼쪽 공간의 현재 값에 오른쪽 값을 나눈 결과값을
		//    왼쪽 공간에 다시 할당한다.
		number %= 7;
		System.out.println("6. number %= 7 결과값: "+number);
		
		// 증감 연산자 
		// ++ 와 -- 은 해당 공간의 값을 1씩 변화시키는데
		// 변수의 앞에 붙냐 뒤에 붙냐에 따라 실행시점이 달라지게 된다.

		//i++ : 값이 참조된 후에 증가
		//해당 코드가 실행되는 순간에는 i 값이 변경되지 않는다. 다만 i++ 문장이 실행된 이후에 i값이 증가하게 된다.
		//++i : 값이 참조되기 전에 증가
		//이와는 반대로 i++ 대신 ++i라고 사용하게 되면 i 값이 먼저 증가된 후에 해당 코드가 실행된다.
		
		System.out.println(++number);
		// ++ 혹은 -- 가 변수의 앞에 붙어있을 경우,
		// 해당 줄에서 가장 먼저 실행된다.
		// 위의 코드의 경우, 먼저 ++number가 실행되어 number의 현재 값이 1 증가된다.
		// 그리고 System.out.println()이 실행되어 1증가된 number의 현재 값이 화면에 출력된다.
		System.out.println("number의 현재값 : "+number);
		
		System.out.println(number++);
		// 반대로 ++ 혹은 --가 뒤에 붙으면 그 줄에서 가장 마지막에 실행이 된다.
		// 1.System.out.println(number) 실행
		// 2.number++ 실행
		
		System.out.println("number의 현재값 : "+number);
		
	}

}
