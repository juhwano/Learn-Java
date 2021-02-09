package day0121;

/* 1. 1부터 10까지 출력되는 for문을 작성
 * 2. 8부터 3까지 출력되는 for문을 작성
 * 3. 사용자로부터 시작 숫자와 끝 숫자를 입력받아서
 *    그 숫자들을 차례대로 출력
 * 4. 사용자로부터 숫자를 하나 입력받아서
 *    1부터 그 수까지의 홀수들만 출력하시오.
 * 5. 사용자로부터 숫자를 하나 입력받아서
 *    1부터 그 수까지의 합을 구하시오
 * 6. 사용자로부터 숫자를 하나 입력받아서
 *    1부터 그 수까지의 곱을 구하시오
 *    
 * Hint : 5,6번은 변수의 선언 위치를 고민해보시오.
 */
import java.util.Scanner;

public class Ex02For2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1 .1부터 10까지 출력되는 for문을 작성
		System.out.println("---1번----");
		// int 변수를 만들어서 시작과 끝
		int start = 1;
		int end = 10;
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}

		System.out.println("----------");
		// 2. 8부터 3까지 출력되는 for문을 작성
		System.out.println("---2번----");
		start = 8;
		end = 3;
		for (int i = start; i >= end; i--) {
			System.out.println(i);
		}
		System.out.println("----------");
		// 3. 사용자로부터 시작 숫자와 끝 숫자를 입력받아서
		// 그 숫자들을 차례대로 출력
		System.out.println("---3번----");
		System.out.print("시작 지점: ");
		start = scanner.nextInt();
		// 이미 위에서 start, end 선언해서 int를 앞에 붙이면 중복 선언이 됨.
		// 그래서 그냥 초기화만 해주는것
		System.out.print("끝 지점: ");
		end = scanner.nextInt();
		if (start <= end) {
			for (int i = start; i <= end; i++) { // 작은 수 -> 큰 수
				System.out.println(i);
			}
		} else {
			for (int i = start; i >= end; i--) { // 큰 수 -> 작은 수
				System.out.println(i);
			}
		}
		System.out.println("----------");

		// 4. 사용자로부터 숫자를 하나 입력받아서
		// 1부터 그 수까지의 홀수들만 출력하시오.
		System.out.println("---4번----");
		start = 1;
		System.out.print("숫자를 입력해주세요: ");
		end = scanner.nextInt();
		for (int i = start; i <= end; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}

		}
		// 4-2
		// for(int i = start; i <= end; i+= 2)
		// i값은 1 3 5 7 9 반복된다.
		System.out.println("----------");

		// 5번 변수 설정 설명
		// int number = 0; 바깥에 놔둬야 반복할때마다 값이 저장이 된다.
		// start = 0;
		// for (int i = start; i <= end; i += 2) {
		// int number = 0; //얘는 number라는 친구에 반복할때마다 매번 맨 처음 0으로 초기화가 됨
		// number += i;
		// System.out.println(i);
		// }

		// 5. 사용자로부터 숫자를 하나 입력받아서
		// 1부터 그 수까지의 합을 구하시오
		System.out.println("---5번----");
		start = 1;
		System.out.print("숫자: ");
		end = scanner.nextInt();
		int sum = 0; // for문 이전에 반복되기 전에 선언+초기화를 해놔야 값이 저장이 된다.
		for (int i = start; i <= end; i++) {
			
			sum += i; // sum 현재값에 i를 더해서 sum에 넣을거임. sum은 현재 0이니까 0+1=1 이 sum에 들어감. 1+2=3 이 들어감. 3+3=6
			System.out.printf("1부터 %d 까지의 합: %d\n", end, sum);
			System.out.println("----------");
	    }
	    // 6. 사용자로부터 숫자를 하나 입력받아서
		// 1부터 그 수까지의 곱을 구하시오
		System.out.println("---6번----");
		start = 1;
		System.out.print("숫자: ");
		end = scanner.nextInt();
		int factorial = 1;
			if (end >= 13) {
				System.out.println("오버플로우가 발생하여 정확한 결과를 출력할 수 없습니다.");
			} else {
				for (int i = start; i <= end; i++) {
					factorial *= i;
				}
				System.out.printf("1부터 %d 까지의 곱: %d\n", end, factorial);
			}

			System.out.println("----------");
			scanner.close();

		}
	}
