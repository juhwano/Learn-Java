package day0121;
/* 1. i for문 2개(위,아래)
 *    위를 짧게 잡냐? 아래를 짧게 잡냐?
 *    위를 짧게 잡아보자
 * 2. 커다란 i for문 -> if , else 콘트롤
 */

import java.util.Scanner;

public class StarPrinter07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*****별찍기 7번*****");
		System.out.print("출력할 줄 수를 입력하세요 : ");
		int userNumber = scanner.nextInt();
		// 윗 부분을 담당하는 i for 문
		// 7 -> 6
		// userNumber - 1 까지가 윗줄.
		for (int i = 1; i <= userNumber - 1; i++) {
			String stars = new String();

			for (int j = 1; j <= i; j++) {
				stars += "*";
			}
			// j for문이 끝날때마다 stars 출력
			System.out.println(stars);

		}

		// 아래 부분을 담당하는 i for 문
		for (int i = 1; i <= userNumber; i++) {
			String stars = new String();

			for (int j = i; j <= userNumber; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}

		scanner.close();
	}

}
