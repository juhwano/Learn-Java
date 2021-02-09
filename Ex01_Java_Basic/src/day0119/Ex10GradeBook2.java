package day0119;
//사용자로부터
//나이 이름
//국어 영어 수학
//순으로 입력 받아서
//나이,이름,국어,영어,수학,총점, 평균
//이 출력되는 프로그램을 작성하시오.

import java.util.Scanner;
public class Ex10GradeBook2 {
	public static void main(String[] args) {
		final double MAGIC = 3.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요: ");
		int age = scanner.nextInt();
		
		System.out.println("이름을 입력하세요: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.println("국어점수를 입력하세요: ");
		int korean = scanner.nextInt();
		
		System.out.println("영어점수를 입력하세요: ");
		int english = scanner.nextInt();
		
		System.out.println("수학점수를 입력하세요: ");
		int math = scanner.nextInt();
		
		int sum = korean + english + math;
		double average = sum / MAGIC;
		
		
		System.out.println("나이: "+age);
		System.out.println("이름: "+name);
		System.out.println("국어: "+korean);
		System.out.println("영어: "+english);
		System.out.println("수학: "+math);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+average);
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
		
		
		
	}

}
