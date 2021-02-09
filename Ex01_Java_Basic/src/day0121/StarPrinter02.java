package day0121;
/* 별찍기 2번
 * 1번째 줄 5개
 * 2번째 줄 4개
 * 3번째 줄 3개
 * 4번째 줄 2개
 * 5번째 줄 1개
 * 별의 갯수 반복
 * 1 ~ 5 5번 j가1로 5번 반복
 * 2 ~ 5 4번 j2로 초기화 j가 5보다 작거나 ㅂ같으면 4번 반복
 * 3 ~ 5 3번 3으로 초기화 5보다 작거나 같다. 3번 3,4,5
 * 4 ~ 5 4번 4 초기화 5보다 작거나 같다. 2번
 */
import java.util.Scanner;
public class StarPrinter02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*****별찍기 2번*****");
		System.out.print("출력할 줄 수 를 입력하세요 : ");
		int userNumber = scanner.nextInt();
		
		
		// i for문은 총 몇줄이 출력될지를 결정하게 된다.
		for(int i = 1; i <= userNumber; i++) {
			//해당 줄의 출력 내용(별)을 저장할 String 변수
			String stars = new String();
			
			
			// i가 1일때
			// j는 1로 초기화하고 5보다 작거나 같을동안 5번반복
			
			// i가 2일때
			// j 는 2로 초기화하고 5보다 작거나 같은동안 4번반복
			
			for(int j = i; j <= userNumber; j++) {
				stars += "*";
			}
			//별 출력
			System.out.println(stars);
			
			//j for문이 끝나면 첫번째 줄이 출력되고 i 포문 마지막 i가 2가 되고 
		}
		scanner.close();
	}

}
