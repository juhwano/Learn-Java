package day0119;
//숙제3. 사용자로부터 생년,생월,생일을 따로따로 입력 받아서 
//형식에 맞추어 출력해보도록 합니다.

//심화과정 : 사용자가 생년,생월,생일을 따로따로 입력하면 주민등록번호의 앞자리처럼 처리를 해봅시다.

import java.util.Scanner;
public class Hw03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("생년을 입력해주세요: ");
		int year = scanner.nextInt();
		
		System.out.println("생월을 입력해주세요: ");
		int month = scanner.nextInt();
		
		
		System.out.println("생일을 입력해주세요: ");
		int day = scanner.nextInt();
		
		
		System.out.printf("사용자의 생년: %4d년 생월:%2d월 생일: %2d일\n",year ,month, day);
		
		System.out.printf("사용자의 주민등록번호 앞자리 : %d%02d%d", year % 100,month,day);
		// 1999 / 100 => 19
		// 1999 % 100 => 99
		
		
		scanner.close();
		
		
	}

}
