package day0126;
/* 로또번호 제작기 최종
 * 컴퓨터가 뽑은 숫자 6개 vs 내가 뽑은 숫자 6개
 * 1등 : 번호 6개
 * 2등 : 번호 5개
 * 3등 : 번호 4개
 * 4등 : 번호 3개
 * 5등 : 번호 2개
 * 
 * 컴퓨터가 뽑은 숫자 6개 중에서 내가 뽑은 숫자가 몇개가 일치하는지 확인하고 등수를 표시합니다.
 * 예시:
 * 컴퓨터의 숫자 : [2, 4, 27, 33, 41, 45]
 * 내 숫자 : [1, 2, 3, 4, 5, 6]
 * 내 등수 : 5등
 *
 */
import java.util.Scanner;
import java.util.Random;
public class Ex03LottoNumbers02 {
    static final int SIZE = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 번호를 저장할 배열 생성
        int[] lottoNumbers = new int[SIZE];
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.print(i + "번째 숫자를 입력해주세요: ");
            int userNumber = scanner.nextInt();
            while (userNumber < 1 || userNumber > 45) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.print(i + "번째 숫자를 입력해주세요: ");
                userNumber = scanner.nextInt();
            }
            for (int j = 0; j < lottoNumbers.length; j++) {
                if (lottoNumbers[j] == userNumber) {
                    System.out.println("중복된 숫자입니다.");
                    System.out.print(i + "번째 숫자를 입력해주세요: ");
                    userNumber = scanner.nextInt();

                    while (userNumber < 1 || userNumber > 45) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.print(i + "번째 숫자를 입력해주세요: ");
                        userNumber = scanner.nextInt();
                    }
                    j = -1;
                }
            }
            lottoNumbers[i] = userNumber; 
            
        }
        
//        사용자가 6자리 숫자 입력 완료
        
        
        
        // 사용자가 뽑은 번호를 배열하는 코드
        
        for(int i = 0; i < lottoNumbers.length - 1; i++) {
            if(lottoNumbers[i] > lottoNumbers[i+1] ) {
                int temp = lottoNumbers[i]; 
                //i를 temp에 넣고  i+1이 앞으로 이동, 22가 잇던 자리 temp값 넣어줌
                //i를 -1로 더 이상 실행시킬 코드 x
                lottoNumbers[i] = lottoNumbers[i + 1];
                lottoNumbers[i + 1] = temp;
                i = -1;
            }
            
        }
        //사용자 코드 6자리 출력
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.printf("나의 숫자 : [%d] \n", lottoNumbers[i]);
            
        }
        System.out.println("-------------------");
        //컴퓨터가 뽑은 6자리를 크기가 6인 배열에 넣음+
        int[] computerNumbers = new int[SIZE];
        for(int i = 0; i < computerNumbers.length; i++) {
            computerNumbers[i] = random.nextInt(45) + 1;
            
            //출력
            
            //컴퓨터의 숫자 : [2, 4, 27, 33, 41, 45]
            
            System.out.printf("컴퓨터의 숫자 : [%d] \n", computerNumbers[i]);
        }
        //컴퓨터가 뽑은 거 배열
        for(int i = 0; i < computerNumbers.length - 1; i++) {
            if(computerNumbers[i] > computerNumbers[i+1] ) {
                int temp2 = computerNumbers[i]; 
                computerNumbers[i] = computerNumbers[i + 1];
                computerNumbers[i + 1] = temp2;
                i = -1;
            }
        }
        //두 개의 값을 비교해야함
        
        //int[] lottoNumbers = { 사용자가 뽑은 값 }
        //int[] computerNumbers = { 컴퓨터가 뽑은 값 }
        int score = 0;

        for(int i = 0; i < lottoNumbers.length ; i++) {
            for(int j = 0; j< computerNumbers.length; j++) {
                if(lottoNumbers[i] == computerNumbers[j]) {
                    System.out.println("일치");
                    score++;
               }
        }
        }
        
        if(score == 2) {
            System.out.println("5등");
        }else if(score == 3) {
            System.out.println("4등");
        }else if(score == 4) {
            System.out.println("3등");
        }else if(score == 5) {
            System.out.println("2등");
        }else if(score == 6) {
            System.out.println("1등!!!");
        }else {
            System.out.println("당첨되지 않았습니다.");
        }
        
        scanner.close();
    }
}
