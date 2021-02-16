//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제

//main 함수 Scanner 사용 주민번호 입력받고

//앞:6자리 뒷:7자리

//입력값 : 123456-1234567 

//1. 자리수 체크 (기능)함수 (14 ok) return true , false   

//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수 return true, false

//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수 void 출력

//3개의 함수 static 
import java.util.Scanner;

public class Ex07_Group_Task {
	
	static boolean positionCheck(String str) {
		if(str.length() == 14) {
			return true;
		}else {
			System.out.println("14자리를 입력해주세요: ");
			return false; 
		}
	}
	static boolean fourNumberCheck(String str) {
		int fourNumber = Integer.parseInt(str.substring(7, 8));
		if(fourNumber >0 && fourNumber <5) {
			return true;
		}else {
			return false; 
		}
	}
	static void genderCheck(String str) {
		char chr = str.replace("-", "").charAt(6);
		switch(chr) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '4':
		case '2':
			System.out.println("여자입니다.");
			break;
		}
	}
	public static void main(String[] args) {
		String userNumber = "";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("주민번호를 입력해주세요:");
			System.out.println("예)123456-1234567");
			System.out.print("> ");
			userNumber = scanner.nextLine();
			
		} while (positionCheck(userNumber) == false|| fourNumberCheck(userNumber) == false);
		
		genderCheck(userNumber);
}
}
