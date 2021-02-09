package day0120;
//숙제3: 사용자가 번호, 이름 , 국어, 영어, 수학 점수를 입력하면 예쁘게 출력하는 프로그램을 작성하세요.
//단, 사용자가 잘못된 형태의 점수를 입력하면 올바른 형태의 점수를 입력할 떄까지 다시 입력을 받는 프로그램을 만드세요.

//프로그래밍에서 상수(static final)로 선언하지 않은 숫자를 매직 넘버, 문자열을 매직 리터럴이라 한다.
//이를 정적(static)이고 변경 불가능(final)한 상수로 선언하여 사용하자.

//코드에서 상수로 선언되어 있지 않은 숫자, 문자열은 무엇을 의미하는지 확신할 수 없다.

import java.util.Scanner;
public class Hw03 {
	static final int MIN_SCORE_LIMIT = 0;
	static final int MAX_SCORE_LIMIT = 100;
	//*3.0이라고 안하고 어차피 과목수는 int니까 int로 바꾸고 (double)로 형변환
	static final double NUMBER_OF_SUBJECT = 3.0;
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("번호를 입력하세요: ");
		int number = scanner.nextInt();
		
		System.out.print("이름을 입력하세요: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.print("국어 점수를 입력하세요: ");
		int korean = scanner.nextInt();
		
		while(korean < MIN_SCORE_LIMIT || korean > MAX_SCORE_LIMIT) {
			System.out.print("잘못된 점수입니다. ");
			System.out.print("점수를 다시 입력해주세요 :");
			korean = scanner.nextInt();
		}
		System.out.print("영어 점수를 입력하세요: ");
		int english = scanner.nextInt();
		
		while(english < MIN_SCORE_LIMIT || english > MAX_SCORE_LIMIT) {
			System.out.print("잘못된 점수입니다. ");
			System.out.print("점수를 다시 입력해주세요 :");
			english = scanner.nextInt();
		}
		System.out.print("수학 점수를 입력하세요: ");
		int math = scanner.nextInt();
		while(math < MIN_SCORE_LIMIT || math > MAX_SCORE_LIMIT) {
			System.out.print("잘못된 점수입니다. ");
			System.out.print("점수를 다시 입력해주세요 :");
			math = scanner.nextInt();
		}
		int sum = korean + english + math;
		double average = sum / NUMBER_OF_SUBJECT;
		//*double average = sum / (double)NUMBER_OF_SUBJECT;
		//*명시적 형변환을 안해주면 int / int 가 되어서 실수 부분이 사라진다.
		//*double average = (double)sum / NUMBER_OF_SUBJECT;
		
		
		System.out.printf("번호 : [%d]번  이름 : [%s]\n", number, name);
		System.out.printf("국어 : [%d]점  영어 : [%d]점  수학 : [%d]점\n", korean, english, math);
		System.out.printf("총점 : [%d]점  평균 : [%.2f]점\n", sum, average);
		
		
		
		
		
		
		
		scanner.close();
		}
		
	}
