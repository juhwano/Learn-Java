package day0121;
/* 별찍기 1번
 * 1번째줄 1개 
 * 2번째줄 2개
 * 3번쨰줄 3개
 * i번째줄 i개
 * 각 줄수에 따라 별이 늘어난다.
 */

import java.util.Scanner;
public class StarPrinter01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*****별찍기 1번*****");
		System.out.print("출력할 줄 수 를 입력하세요 : ");
		int userNumber = scanner.nextInt();
		
		
		// i for문은 세로로 총 몇줄이 출력될지를 결정하게 된다.
		for(int i = 1; i <= userNumber; i++) {
			//해당 줄의 출력 내용(별)을 저장할 String 변수
			String stars = new String();
			// j for문은 해당 줄에 어떤 내용이 출력될지를 결정하게 된다. 1번째 줄일때 1번, 2번째줄일때 1번 3번째 줄일때 1번
			for(int j = 1; j <= i; j++) {
				stars += "*";
			}
			//별 출력
			System.out.println(stars);
		}
		scanner.close();
	}

}
