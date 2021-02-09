package day0119;
/* 비교연산자
 * 비교연산자는 2개의 값을 비교한다
 * >, >=, <, <=, ==, !=
 * 
 * 비교 연산자는 결과값이 네/아니오, 즉 true/false의
 * boolean 값으로 나오게 된다.
 */
public class Ex06Operator3 {
	public static void main(String[] args) {
		int number = 5;
		System.out.println("number > 3: " + (number > 3));
		System.out.println("number > 30: " + (number > 30));
		
		System.out.println("number < 10: " + (number < 10));
		System.out.println("number < 0: " + (number < 0));
		
		System.out.println("number < 5: " + (number < 5));
		System.out.println("number <= 5: " + (number <= 5));
		
		// ==은 2개의 값이 같은지를 비교한다.
		// !=은 2개의 값이 다른지를 비교한다.
		
		System.out.println("number == 5: "+(number == 5));
		System.out.println("number == 3: "+(number == 3));
		
		System.out.println("number != 5: "+(number != 5));
		System.out.println("number != 3: "+(number != 3));
		
		System.out.println("---------------------------------");
		
		// 같냐 다르냐를 비교하는 ==, != 연산자는 한가지 단점이 있다.
		// 바로 참조형 변수에 대해서는 올바르지 않은 결과값을 연산할 수 있다.
		
		String str = new String("abc");
		String str2 = "abc";
		String str3 = str2;
		//str3는 str2의 주소값을 가져와버림
		
		// str, str2, str3의 값을 출력해보자.
		System.out.println("str: ["+str+"]");
		System.out.println("str2: ["+str2+"]");
		System.out.println("str3: ["+str3+"]");
		
		// == 으로 비교하는 경우
		System.out.println("str == str2: " + (str == str2));
		System.out.println("str == str3: " + (str == str3));
		System.out.println("str2 == str3: " + (str2 == str3));
		
		//안타깝게도 글자들을 비교하는게 아니고 주소값을 비교해줌!!
		//비교연산자의 경우 참조형 변수의 실제 값이 아닌 
		//주소값을 비교하기 때문에 정확한 결과를 받아볼 수 없다.
		//따라서, 참조형 변수를 비교할 때에는 클래스형 변수의 경우,
		//해당 변수의 equals()메소드를 호출하여 비교해야한다.
		System.out.println("str.equals(str2): "+str.equals(str2));
		System.out.println("str.equals(str3): "+str.equals(str3));
		System.out.println("str2.equals(str2): "+str2.equals(str3));
		
	}

}
