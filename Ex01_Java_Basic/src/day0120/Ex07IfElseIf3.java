package day0120;

/* 사용자로부터 나이를 입력받아서
 * ~5:영아
 * ~13:어린이
 * ~18:청소년
 * 19~:성인
 * 이 출력되는 프로그램
 */
import java.util.Scanner;

public class Ex07IfElseIf3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력해주세요: ");
		int age = scanner.nextInt();

		if (age <= 5) {
			System.out.println("영아입니다.");
			// 6이상인 경우 아래로
		} else if (age <= 13) {
			System.out.println("어린이입니다.");
			// 5이하 13이하, 두 코드 다 false가 나옴. 그럼 14이상이 남음
		} else if (age <= 18) {
			System.out.println("청소년입니다.");
		} else { // 19이상일 경우 여기 도착
			System.out.println("성인입니다.");
		}

		scanner.close();
	}
}
