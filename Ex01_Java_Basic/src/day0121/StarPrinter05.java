package day0121;

/* 2ax+b 일차방정식
 * 2a+b=1
 * a+b=3
 * a=2
 * b=-1
 * 별의 갯수는 x값 대신 i ->  2*i-1 이 별의 갯수
 * 이걸 왜 설명했느냐??
 * 별을 구할때 함수의 개념으로 생각하면 식을 구하기 편하다.
 * 
 * 
 */

import java.util.Scanner;
public class StarPrinter05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*****별찍기 5번*****");
		System.out.print("출력할 줄 수를 입력하세요 : ");
		int userNumber = scanner.nextInt();
		
		for(int i = 1; i <= userNumber; i++) {
			String stars = new String();
			
			//공백을 담당하는 j for 문
			for(int j = 1; j <= userNumber - i; j++) {
				stars += " ";
			}
			//별을 담당하는  j for 문
			for(int j = 1; j <= 2 * i - 1; j++ ) {
				stars += "*";
			}
			System.out.println(stars);
		}
			
		scanner.close();
	}
}