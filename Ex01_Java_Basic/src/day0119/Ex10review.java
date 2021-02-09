package day0119;
import java.util.Scanner;
public class Ex10review {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//나이 입력
		System.out.println("나이: ");
		int age = scanner.nextInt();
		
		//이름 입력
		System.out.println("이름: ");
		scanner.nextLine();
		//버그 방지
		String name = scanner.nextLine();
		
		//국어 입력
		System.out.println("국어: ");
		int korean = scanner.nextInt();
		
		//영어 입력
		System.out.println("영어: ");
		int english = scanner.nextInt();
				
		//수학 입력
		System.out.println("수학: ");
		int math = scanner.nextInt();
		
		System.out.println("나이: "+age);
		System.out.println("이름: "+name);
		System.out.println("국어: "+korean);
		System.out.println("영어: "+english);
		System.out.println("수학: "+math);
		int sum = korean + english + math;
		System.out.println("총점: "+sum);
		double average = sum / 3.0;
		System.out.println("평균: "+average);
		
		
		//입력값이 옆으로 나란히 나오게 하려면 어떻게 해야하냐??
		//다음 클래스를 봅시다.
		
		
		
		scanner.close();
		
		
	}

}
