package day0125;

/* 컴퓨터가 만들어낸 1~100 사이의 랜덤한 숫자를
 * 사용자가 몇번만에 맞추는지 기록하는
 * 숫자맞추기 게임
 * 조건1. 무한루프를 사용해서
 *        사용자가 1을 누르면 게임 시작
 *        2를 누르면 최고점수 보기
 *        3을 누르면 게임종료가 될 수 있도록
 *        프로그램을 작성
 *        단, 최고 점수는 가장 적은 횟수로 컴퓨터의 숫자를 맞춘 횟수가 최고점수가 됩니다.
 *        횟수가 적게해야 최고점수
 * 힌트1. 최고점수는 어떻게 기록해야할까?
 *        최고점수는 맨 처음 플레이하면 어떤 게 최고점수가 될까?
 *        
 * 힌트2. random.nextInt(최대값) 을 입력하면  
 *        0부터 최대값-1 까지의 값이 랜덤하게 나온다.
 *        그렇다면 어떻게 해야 1~최대값의 범위가 나오도록
 *        만들어 줄 수 있을까???
 *        
 *        random.nextInt(10)을 입력하면 0~9
 *        그럼 어떻게 1~최대값의 범위가 나오도록
 *        nextInt값 뽑아낸거(최종값)에 +1을 해주면 된다.
 *        
 *        random.nextInt(10)     -> 0 1 2 3 4 5 6 7 8 9
 *        random.nextInt(10) + 1 -> 1 2 3 4 5 6 7 8 9 10
 */
import java.util.Random;
import java.util.Scanner;

public class Ex04GuessingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random(100);
		
		int score = 0;
		//무한 루프 메뉴
		while (true) {
	            System.out.println("1. 입력 2. 출력 3. 종료");
	            System.out.print("> ");
	            int userChoice = scanner.nextInt();
	            
	            if(userChoice == 1) {
	            	while(true) {
	            		System.out.println("게임을 시작합니다. ");
		            	System.out.print("숫자를 맞춰주세요 : ");
		            	int ChoiceNumber = scanner.nextInt();
		            	
		            	}
	            	}
	            	
	       
	            
	            
	      
		
		
		scanner.close();
	}
	

}
}