package day0120;
/*숙제2: 사용자로부터  점수를 입력받아 
 *       90점이상:A
 *       80점대:  B
 *       70점대:  C
 *       60점대:  D
 *       그 외:   F
 * 를 출력하는 프로그램을 작성하세요.
 * 단, 잘못된 점수가 입력되면 올바른 점수가 입력될떄까지 다시 입력을 받으세요.
 */

import java.util.Scanner;
public class Hw02 {
	static final int MINIMUM = 0;
	static final int MAXIMUM = 100;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		
		//잘못된 조건식을 집어넣어서 계속 입력받자.
		while(score < MINIMUM || score > MAXIMUM) {
			System.out.print("잘못된 점수입니다. ");
			System.out.print("점수를 다시 입력하세요 : ");
			score = scanner.nextInt();
		}
		//제대로 됐으면 넘어가자
		
		if(score >= 90) {
			System.out.printf("사용자의 점수 : %3d  등급 : A\n", score);		
		}else if(score >= 80) {
			System.out.printf("사용자의 점수 : %3d  등급 : B\n", score);
		}else if(score >= 70) {
			System.out.printf("사용자의 점수 : %3d  등급 : C\n", score);
		}else if(score >= 60) {
			System.out.printf("사용자의 점수 : %3d  등급 : D\n", score);
		}else {
			System.out.printf("사용자의 점수 : %3d  등급 : F\n", score);
		}
			
		scanner.close();
	}

}
