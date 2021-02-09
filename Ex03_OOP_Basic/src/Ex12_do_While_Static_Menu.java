import java.util.Scanner;
//자동 정렬 > 전체 블럭 설정 > ctrl + shift + F
//멤버(필드)와 함수(메소드)를 static으로 바꿔보자

public class Ex12_do_While_Static_Menu {
	// 상단 ... 일반 ... 변수 (고유, 상태 , 부품(참조:클래스))
	static Scanner sc = new Scanner(System.in); // 부품(참조:클래스) Scanner라는 타입을 갖고 있는 멤버 필드

	// 기능
	static void inputRecord() {
		System.out.println("성적데이터 입력 :");
	}

	static void deleteRecord() {
		System.out.println("성적데이터 삭제 :");
	}

	static void sortRecord() {
		System.out.println("성적데이터 정렬 :");
	}

	static int displayMenu() {
		System.out.println("***************");
		System.out.println("****성적 관리****");
		System.out.println("1. 학생성적 입력하기");
		System.out.println();
		System.out.println("2. 학생성적 삭제하기");
		System.out.println();
		System.out.println("3. 학생성적 이름순 정렬하기");
		System.out.println();
		System.out.println("4. 프로그램 종료");
		System.out.println();

		int menu = 0;
		do { // do while 한번은 무조건 실행
			try {
				menu = Integer.parseInt(sc.nextLine());
				if (menu >= 1 && menu <= 4) {
					break; // while 탈출 (1<= menu <=4)
				} else {
					// 1보다 작거나 4보다 큰 값값 .. 프로그램적인 오류 (x)
					// 나는 오류 보겠다 (오류 사용자 강제)
					// System.out.println("잘못 입력 하셨습니다");
					throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("메뉴 선택 문제 발생");
				System.out.println("메뉴 1~4번까지 입력");
			}
		} while (true);
		// 실행 : 사용자가 1 ~ 4까지 번호중에서 하나를 선택
		return menu;
	}

	public static void main(String[] args) {
//	Ex12_do_While_Static_Menu ex02 = new Ex12_do_While_Static_Menu();
//	static으로 다 바꾸면 

		while (true) {
			switch (Ex12_do_While_Static_Menu.displayMenu()) {
			case 1:
				Ex12_do_While_Static_Menu.inputRecord();
				break;
			case 2:
				Ex12_do_While_Static_Menu.deleteRecord();
				break;
			case 3:
				Ex12_do_While_Static_Menu.sortRecord();
				break;
			case 4:
				System.out.println("프로그램 종료");
				// return; //main 종료
				System.exit(0); // 프로그램 강제 종료 (kill)
			}
		}
	}

}