package day0119;
//숙제 2. 사용자로부터 숫자 2개를 입력받아서 산술연산한 결과값을 출력하는 프로그램을 작성하세요

//변수 이름 적을 때, 클래스 이름 다 써주고 대소문자로 클래스인지 변수인지 구분해주는게 trend

import java.util.Scanner;
public class Hw02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("연산하고싶은 2개의 숫자를 입력주세요 : ");
		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		
		System.out.printf("사용자가 입력한 첫번째 숫자 %f 두번째 숫자 %f\n", number1, number2);
		
		
		
		System.out.println("number1 + number2: ");
		System.out.println(number1 + number2);
		
		System.out.println("number1 - number2: ");
		System.out.println(number1 - number2);
		
		System.out.println("number1 * number2: ");
		System.out.println(number1 * number2);
		
		System.out.println("number1 / number2: ");
		System.out.println(number1 / number2);
		
		System.out.println("number1 % number2: ");
		System.out.println(number1 % number2);
		
		
		
		
		
		
		scanner.close();
		
	}

}
