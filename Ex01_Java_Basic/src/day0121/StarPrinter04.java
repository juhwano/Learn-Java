package day0121;
/* 별찍기 4번
 * 공백 0 1 2 3 4   1-1 2-1 3-1 4-1 5-1개   
 * 별 5 4 3 2 1
 * 0+5
 * 1+4
 * 2+3
 * 3+4
 */
import java.util.Scanner;
public class StarPrinter04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*****별찍기 4번*****");
		System.out.print("출력할 줄 수를 입력하세요 : ");
		int userNumber = scanner.nextInt();
		for(int i = 1; i <= userNumber; i++) {
			String stars = new String();
			
			
			//공백을 담당하는 j for 문
			for(int j = 1; j <= i - 1; j++) {
				stars += " ";
			}
			//별을 담당하는  j for 문
			for(int j = i; j <= userNumber; j++ ) {
				stars += "*";
			}
			System.out.println(stars);
		}
			
		scanner.close();
	}
}
