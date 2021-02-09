package day0125;

//숙제
//가위바위보 게임을 만드세요
//가위: int 1
//바위: int 2
//보: int 3

//예시: 
//가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)
//> 5
//잘못입력하셨습니다.
//가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)
//> 2
//사용자: 바위
//컴퓨터: 가위
//사용자 승!!!
//현재 전적: 1승 3무 2패
//1. 플레이 2. 현재 전적 보기 3. 종료
//> 2
//현재 전적은 1승 3무 2패입니다. 승률은 16.6667퍼센트 입니다.
//1. 플레이 2. 현재 전적 보기 3. 종료
//> 3
//사용해주셔서 감사합니다.

import java.util.Scanner; //사용자 입력값
import java.util.Random;
public class Hw01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//승, 무,패를 저장할 int 변수
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		//메뉴
		while(true) {
			System.out.println("1. 플레이  2. 최고기록 보기  3. 종료");
			int userChoice = scanner.nextInt();
			if(userChoice == 1) {
                //플레이 코드 구현
				//가위: int 1
				//바위: int 2
				//보: int 3
				System.out.print("가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3):  ");
				int userNumber = scanner.nextInt();
				//random을 사용하여 1~3 사이의 난수 생성(0~2인데 +1해줌)
				int computerNumber = random.nextInt(3) + 1;
				
				while(userNumber < 1 || userNumber > 3) {
					//사용자에게 숫자를 다시 입력받아야함.
					System.out.println("잘못입력하셨습니다. ");
					System.out.print("가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3):  ");
					userNumber = scanner.nextInt();
					
				}
				//제대로 입력을 했다.
				if(userNumber > computerNumber) {
					if(userNumber == 3 && computerNumber == 2) {
						System.out.println("승리!!!");
						win++;
					}else {
						System.out.println("패배!!!");
						lose++;
					}
				}else if(userNumber < computerNumber) {
					if(userNumber == 1 && computerNumber == 3) {
						System.out.println("승리!!!");
						win++;
					}else {
						System.out.println("패배!!!");
						lose++;
					}
				}else {
					System.out.println("무승부!!!");
					draw++;
				}
				
				
				
				
				
				
			}else if(userChoice == 2) {
				//승률 계산 
				// 승리+패배= 총전적           335+270=605
				//승리/총전적*100=승률     335/605*100=55.37%
				
				int total = win+lose;
				int winningRate = win / total * 100; 
				
				if(win == 0 && draw == 0 && lose == 0) {
					//아직 플레이 기록이 없으므로 경고 메시지 출력
					System.out.println("아직 플레이 기록이 없습니다.");
					
					
					
				}else {
					System.out.printf("현재 전적은 %d승 %d무 %d패입니다. : \n",win , draw, lose);
					System.out.println("승률은 " +winningRate+ "입니다 .");
					
				}
				
				
				
				
			}else if(userChoice == 3) {
				System.out.println("플레이해주셔서 감사합니다.");
				break;
				
				
				
			}
			
			
		}
		
		
		
		scanner.close();
	}
}