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

import java.util.Random;
import java.util.Scanner;

public class Hw01review {
    static final int INT_SCISSOR = 1;
    static final int INT_ROCK = 2;
    static final int INT_PAPER = 3;

    // 종종 101, 102, 103으로 자릿수를 구분해주기도 한다.
    static final int INT_WIN = 1;
    static final int INT_DRAW = 2;
    static final int INT_LOSE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // 전적용 변수 설정
        int userWin = 0;
        int userDraw = 0;
        int userLose = 0;

        // 무한루프(메뉴)
        while (true) {
            System.out.println("1. 플레이  2. 전적보기  3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            // 플레이 코드 구현
            if (userChoice == 1) {
                // 사용자에게 1~3값 입력받기
                System.out.println("가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)");
                System.out.print("> ");
                int userSelect = scanner.nextInt();
                // 사용자가 1~3값이 아닌 값 입력 막기(데이터 검증)
                while (userSelect < INT_SCISSOR || userSelect > INT_PAPER) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)");
                    System.out.print("> ");
                    userSelect = scanner.nextInt();
                }
                // while이 끝낫으면 사용자가 1이상 3이하의 값을 입력을 했다.
                // 컴퓨터에게 1~3사이 랜덤 숫자 구현
                int computerSelect = random.nextInt(INT_PAPER) + 1;
                // INT_PAPER : 0~2까지 나오니까 +1을 해준다.

                // 3가지 결과 가능(승, 무, 패)
                // 이기는 경우의 수, 비기는 경우의 수, 그 외의 수 -> 저장 후 처리
                // 결과용 변수 설정
                int result = 0;
                // 무승부
                if (userSelect == computerSelect) {
                    result = INT_DRAW;
                    // result는 draw값으로 초기화하라.
                    // 승패가 나옴, 여러 개의 경우의 수를 다 적어도 되지만 이기는 경우or지는 경우 3가지 빼고 else로 중첩해서 처리
                    // 여기선 지는 경우 입력
                } else {
                    if ((userSelect == INT_ROCK && computerSelect == INT_PAPER)
                            || (userSelect == INT_SCISSOR && computerSelect == INT_ROCK)
                            || (userSelect == INT_PAPER && computerSelect == INT_SCISSOR)) {
                        result = INT_LOSE;
                    } else {
                        result = INT_WIN;
                    }

                    // 사용자:바위
                    // 컴퓨터:가위
                    // 사용자 승!!
                    // 현재 전적 : 1승 3무 2패
                    // 을 출력하기 위해 string 설정이 필요
                    // while문 전에 승무패를 저장해야 출력 가능

                }

                String userSelectWord = new String();
                String computerSelectWord = new String();

                if (userSelect == INT_ROCK) {
                    userSelectWord = "바위";
                } else if (userSelect == INT_PAPER) {
                    userSelectWord = "보";
                } else {
                    userSelectWord = "가위";
                }

                if (computerSelect == INT_ROCK) {
                    computerSelectWord = "바위";
                } else if (computerSelect == INT_PAPER) {
                    computerSelectWord = "보";
                } else {
                    computerSelectWord = "가위";
                }

                System.out.println("사용자: " + userSelectWord);
                System.out.println("컴퓨터: " + computerSelectWord);

                // result 출력 -> 승,무,패 값 + 1

                if (result == INT_WIN) {
                    System.out.println("사용자 승!!!");
                    userWin++;
                } else if (result == INT_DRAW) {
                    System.out.println("사용자 무!!!");
                    userDraw++;
                } else if (result == INT_LOSE) {
                    System.out.println("사용자 패!!!");
                    userLose++;
                }

            } else if (userChoice == 2) {
                // 전적 보여주는 코드 구현
                // 승률을 구하려면 총 전적이 필요하다
                // 전적용 변수 설정
                int sum = userWin + userDraw + userLose;
                if (sum == 0) {
                    System.out.println("아직 플레이 기록이 없습니다.");
                } else {
                    double winRate = (double) userWin / sum * 100;
                    // userWin,sum은 int니까 int/int니까 결과값이 int가 됨. double이 필요하니 double로 형변환(타입캐스팅)해서
                    // 나누자.
                    // 명시적 형변환을 통해 더블/인트 = 실수가 되었다.
                    System.out.printf("현재 전적은 %d승 %d무 %d패입니다. 승률은 %.4f퍼센트 입니다.\n", userWin, userDraw, userLose,
                            winRate);
                }

            } else if (userChoice == 3) {
                // 종료 코드 구현
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }

        scanner.close();
    }

}
