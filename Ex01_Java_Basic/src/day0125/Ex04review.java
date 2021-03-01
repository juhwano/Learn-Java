package day0125;
import java.util.Scanner;
import java.util.Random;
public class Ex04review {
	static final int MAX = 100;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		Random random = new Random();
		
		//최고기록을 저장할 int 변수
		int bestScore = 0;
		
		//메뉴
		while(true) {
			System.out.println("1. 플레이  2. 최고기록 보기  3. 종료");
			int userChoice = scanner.nextInt();
			
			if(userChoice == 1) {
				//플레이 코드 구현
				
				//사용자의 이번 점수를 저장할 int 변수 선언
				int currentScore = 1;
				
				System.out.print("숫자를 입력하세요: ");
				int userNumber = scanner.nextInt();
				
				//random을 사용하여 1~100 사이의 난수 생성(0~99인데 +1해줌)
				int computerNumber = random.nextInt(MAX) + 1;
				
				//숫자가 다르면 계속 입력을 받아야함 > 몇번 입력을 받아야할지 횟수제한x > while
				while(userNumber != computerNumber) {
					if(userNumber > computerNumber) {
						System.out.println("DOWN");
					}else {
						System.out.println("UP");
					}
					
					//사용자에게 숫자를 다시 입력받아야함.
					System.out.print("숫자를 입력하세요: ");
					userNumber = scanner.nextInt();
					//사용자가 입력할때마다 스코어가 1씩 늘어나야함
					currentScore++;
				}
				
				System.out.println("정답!!!");
				System.out.println("이번 플레이의 점수는 "+currentScore+"입니다.");
				
				//맞췄다. 최고기록을 확인하여 필요하다면
				//현재 점수로 최고기록을 바꿔준다.
				
				// 최고기록을 현재기록으로 바꿔주는건 2가지 경우
				// 1. 처음 플레이했을 때(베스트스코어가 0일때)
				// 2. 최고기록이 현재기록보다 클 때
				
				if(bestScore == 0 || bestScore > currentScore) {
					bestScore = currentScore;
					System.out.println("신기록입니다.");
				}
				
				
				
			}else if(userChoice == 2) {
				//최고기록 보기 코드 구현
				//최고기록은 한번 정해지면 while이 반복되도 리셋이 되면 안됨. while 전에 저장
				if(bestScore == 0) {
					//아직 플레이 기록이 없으므로 경고 메시지 출력
					System.out.println("아직 플레이 기록이 없습니다.");
				}else {
					System.out.println("현재 최고 기록 : "+bestScore);
				}
				
			}else if(userChoice == 3) {
				System.out.println("플레이해주셔서 감사합니다.");
				break;
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		scanner.close();
	}

}
