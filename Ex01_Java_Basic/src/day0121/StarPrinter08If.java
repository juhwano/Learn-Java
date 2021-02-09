package day0121;

//사용자 숫자 입력
import java.util.Scanner;

public class StarPrinter08If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****별찍기 8번****");
        System.out.print("출력할 줄 수를 입력해주세요 : ");
        int userNumber = scanner.nextInt();

        /*
         * 7번에서는 위와 아래로 나눠놨음 위는 유저넘버 -1. 6이라고 입력하면 5번을 돔
         * 
         * 아래부분 5라고 입력하면 5번 돌고, 6이라고 입력하면 6번 돌고
         * 
         * 위부분 + 아래부분 = 토탈 돌아가는 횟수(2 userNumer - 1) 그래서 커다란 1for 문이 만들어짐. if else 구조문을
         * 사용해서 위와 아래를 나눠보자.
         */

        for (int i = 1; i <= 2 * userNumber - 1; i++) { // start ->1 end -> 2 * userNumber - 1번 반복
            String stars = new String();
            if (i <= userNumber - 1) { // 윗부분
                // 공백을 담당하는 j for 문
                for (int j = 1; j <= userNumber - i; j++) { // 1번쨰줄 4개, 2번쨰줄 3개 3번째줄 4개 4번째줄 3개
                    stars += " ";
                }
                // 별을 담당하는 j for 문
                for (int j = 1; j <= i; j++) { // 줄 수만큼. 1번쨰줄 1, 2번쨰줄 2, 3번쨰줄 4
                    stars += "*";
                }
            } else { // 아래부분 5,6,7,8,9 기준 7번에서는 1,2,3,4,5 기준
                // 아래부분
                int lowerI = i - userNumber + 1; // 아래에서 쓸 변수 //변수설정 굳이 안한다면 i - userNumber로 조건식에 적어주자
                // 공백을 담당하는 j for문
                for (int j = 1; j <= lowerI - 1; j++) { // 4번과 똑같음 조건식
                    stars += " ";
                }
                // 별을 담당하는 j for문
                for (int j = lowerI; j <= userNumber; j++) {
                    stars += "*";
                }
               
            }
            System.out.println(stars);
            
        }
        scanner.close();
        
    }
}
//뭔가 잘못 적어서 2번으로 보삼~