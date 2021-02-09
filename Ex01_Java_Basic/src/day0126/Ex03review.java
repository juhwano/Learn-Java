package day0126;
/* 로또번호 제작기 최종
 * 컴퓨터가 뽑은 숫자 6개 vs 내가 뽑은 숫자 6개
 * 1등 : 번호 6개
 * 2등 : 번호 5개
 * 3등 : 번호 4개
 * 4등 : 번호 3개
 * 5등 : 번호 2개
  
 * 컴퓨터가 뽑은 숫자 6개 중에서 내가 뽑은 숫자가 몇개가 일치하는지 확인하고 등수를 표시합니다.
 * 예시:
 * 컴퓨터의 숫자 : [2, 4, 27, 33, 41, 45]
 * 내 숫자 : [1, 2, 3, 4, 5, 6]
 * 내 등수 : 5등
 */

// 크게 3개의 코드로 분류
import java.util.Scanner;
import java.util.Random;

public class Ex03review {
    static final int SIZE = 6;
    static final int MAX = 45;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // 사용자와 컴퓨터의 숫자를 저장할 2개의 int 배열 생성
        int[] computerArray = new int[SIZE];
        int[] userArray = new int[SIZE];

        // 1.컴퓨터의 번호 입력과 정렬을 하는 코드
        for (int i = 0; i < computerArray.length; i++) {
            // 0부터 44범위 -> 1부터 45범위
            int randomNumber = random.nextInt(MAX) + 1;
            // randomNumber가 중복인지 확인하여
            // 중복이면 다시 만들고 다시 검사하는 j for문
            for (int j = 0; j < computerArray.length; j++) {
                if (randomNumber == computerArray[j]) {
                    randomNumber = random.nextInt(MAX) + 1; // 다시 뽑고
                    j = -1; // 앞에서부터 다시 검사
                }
            }
            // j for문이 종료되었다 = j for 문을 반복하는 동안
            // randomeNumber와 같은 숫자가 computerArray에 없다.
            // 라는 뜻이 되므로 i번째를 randomNumber로 초기화해준다.
            computerArray[i] = randomNumber;
        }
        // 배열,중복체크 다 완료
        // 정렬만 하면 됨
        for (int i = 0; i < computerArray.length - 1; i++) {
            if (computerArray[i] > computerArray[i + 1]) {
                int temp = computerArray[i];
                computerArray[i] = computerArray[i + 1];
                computerArray[i + 1] = temp;
                i = -1;
            }
        }
        // 출력
        for (int i = 0; i < computerArray.length; i++) {
            System.out.println(computerArray[i]);
        }
        // ->중복x, 정렬ok

        // 2.사용자의 번호 입력과 정렬을 하는 코드
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("1부터 45 사이의 숫자를 입력해주세요");
            System.out.print("> ");
            int userNumber = scanner.nextInt();
            while (userNumber < 1 || userNumber > MAX) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("1부터 45 사이의 숫자를 입력해주세요");
                System.out.print("> ");
                userNumber = scanner.nextInt();
            }
            // 중복체크
            for (int j = 0; j < userArray.length - 1; j++) {
                if (userArray[j] == userNumber) {
                    System.out.println("중복된 숫자입니다.");
                    System.out.println("1부터 45 사이의 숫자를 입력해주세요");
                    System.out.print("> ");
                    userNumber = scanner.nextInt();
                    // 다시 입력받을때 숫자 오입력 방지
                    while (userNumber < 1 || userNumber > MAX) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("1부터 45 사이의 숫자를 입력해주세요");
                        System.out.print("> ");
                        userNumber = scanner.nextInt();
                    }
                    j = -1;

                }

            }

            userArray[i] = userNumber;
            // 오름차순 배열한다.

        }
        for (int i = 0; i < userArray.length - 1; i++) {
            if (userArray[i] > userArray[i + 1]) {
                int temp = userArray[i];
                userArray[i] = userArray[i + 1];
                userArray[i + 1] = temp;
                i = -1;
            }
        }

        // 출력
        // %d 갯수와 배열 갯수 체크
        System.out.printf("컴퓨터: [%d, %d, %d, %d, %d, %d]\n", computerArray[0], computerArray[1], computerArray[2],
                computerArray[3], computerArray[4], computerArray[5]);

        System.out.printf("사용자: [%d, %d, %d, %d, %d, %d]\n", userArray[0], userArray[1], userArray[2], userArray[3],
                userArray[4], userArray[5]);

        // 3.사용자의 번호와 컴퓨터의 번호를 비교해서 등수를 결정하는 코드
        int score = 0;
        // 2개 다 i번째끼리 비교하면 안됨
        // 1 2 3 4 5 6
        // 2 3 4 5 6 7
        // i번째끼리 비교한다하면 안 맞음.

        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < computerArray.length; j++) {
                if (userArray[i] == computerArray[j]) {
                    score++;

                }
            }
        }

        switch (score) {
        case 6:
            System.out.println("1등");
            break;
        case 5:
            System.out.println("2등");
            break;
        case 4:
            System.out.println("3등");
            break;
        case 3:
            System.out.println("4등");
            break;
        case 2:
            System.out.println("5등");
            break;
        default:
            System.out.println("꽝");
            break;
        }

        scanner.close();
    }
}
