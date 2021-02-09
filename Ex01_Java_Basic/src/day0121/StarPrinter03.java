package day0121;
/* 별찍기 3번
 * 공백 4개 별 1개  5-1개  ... 공백이 -> if ? j for문 2개가 쉽다
 * 공백 3개 별 2개  5-2개
 * 공백 2개 별 3개  5-3개
 * 공백 1개 별 4개
 */
import java.util.Scanner;
public class StarPrinter03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*****별찍기 3번*****");
		System.out.print("출력할 줄 수 를 입력하세요 : ");
		int userNumber = scanner.nextInt();
		
		for(int i = 1; i <= userNumber; i++) { //줄의 숫자는 i가 담당한다. ex) 1번째줄은 i가 1일때
			//for 문 안에 초기화하는 이유 -> 저장
			String stars = new String();
			
			//공백을 담당하는 j for 문
			for(int j = 1; j <= userNumber - i; j++) {  //userNumber - i  = 5 - 1 , 5 - 2 , 5 - 3
				stars += " ";
			}
			//별을 담당하는 j for 문
			for(int j = 1; j <= i; j++) {
				stars += "*";
			}
			System.out.println(stars);

		}
		scanner.close();
	}
}
