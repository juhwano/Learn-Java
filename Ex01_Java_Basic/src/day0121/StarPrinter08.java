package day0121;

/* 별찍기 8번
 * 위부분을 짧게 잡아보자
 */
import java.util.Scanner;

public class StarPrinter08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*****별찍기 8번*****");
		System.out.print("출력할 줄 수를 입력하세요 : ");
		int userNumber = scanner.nextInt();

		for (int i = 1; i <= userNumber - 1; i++) { // 줄의 숫자는 i가 담당한다. ex) 1번째줄은 i가 1일때
			String stars = new String();
			// 공백을 담당하는 j for 문
			for (int j = 1; j <= userNumber - i; j++) { // userNumber - i = 5 - 1 , 5 - 2 , 5 - 3
				stars += " ";
			}
			// 별을 담당하는 j for 문
			for (int j = 1; j <= i; j++) {
				stars += "*";
			}
			System.out.println(stars);

		}

		for (int i = 1; i <= userNumber; i++) {
			String stars = new String();

			// 공백을 담당하는 j for 문
			for (int j = 1; j <= i - 1; j++) {
				stars += " ";
			}
			// 별을 담당하는 j for 문
			for (int j = i; j <= userNumber; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}

		scanner.close();
	}

}
