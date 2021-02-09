package day0119;
//사용자로부터 
// 번호 이름 국어 영어 수학 점수를 차례대로 입력 받아
// 다음처럼 출력될 수 있게 프로그램을 작성하시오.

//예시)
//번호: 002번 이름: 조재영
//국어: 004점 영어: 002점 수학: 001점
//총점: 007점 평균: 02.33점

import java.util.Scanner;
public class Ex13GradeBook3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double MAGIC = 3.0;
		//번호
		System.out.print("번호를 입력하세요: ");
		int number = scanner.nextInt();		
		//이름
		System.out.print("이름을 입력하세요: ");
		scanner.nextLine();
		String name = scanner.nextLine();		
		//국어
		System.out.print("국어점수를 입력하세요: ");
		int korean = scanner.nextInt();		
		//영어
		System.out.print("영어점수를 입력하세요: ");
		int english = scanner.nextInt();		
		//수학
		System.out.print("수학점수를 입력하세요: ");
		int math = scanner.nextInt();
		
		int sum = korean + english + math;
		double average = sum / MAGIC;
		
		
		System.out.printf("번호 : %03d번  이름 : %s\n", number, name);
		System.out.printf("국어 : %03d점  영어 : %03d점  수학 : %03d점\n", korean, english, math);
		System.out.printf("총점 : %03d점  평균 : %05.2f\n", sum, average);
		
		
		
		
		
		
		scanner.close();
		
		
//		숙제1. 사용자로부터 키와 몸무게를 입력받아서 BMI 수치를 어느 정도 형식에 맞추어 출력
//		bmi 계산 ' 몸무게 / 키 / 키
//		
//		
//		숙제 2. 사용자로부터 숫자 2개를 입력받아서 산술연산한 결과값을 출력하는 프로그램을 자것ㅇ하세요
		
//		숙제3. 사용자로부터 생년,생월,생일을 따로따로 입력 받아서
//		형식에 맞추어 출력해보도록 합니다.
		
//      심화과정 : 사용자가 생년,생월,생일을 따로따로 입력하면 주민등록번호의 앞자리처럼 처리를 해봅시다.
		//도전해볼만하면 도전해봐라
		//낼 3명 랜덤하게 뽑앗서 코드리뷰하고 한다
		
	}

}
