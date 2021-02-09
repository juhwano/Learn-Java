package day0121;

import java.util.Scanner;

public class StarPrinter08If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 사용자 숫자 입력
        System.out.println("*****별 찍기 8번*****");
        System.out.print("출력할 줄 수를 입력해주세요 > ");
        int userNumber = scanner.nextInt();
        
        //전체 큰 틀을 잡아준다. 입력값에 따라 출력할 줄 수를 입력해준다.
        for (int i = 1; i <= 2 * userNumber - 1; i++) { // 수식을 넣어주면 for(int i =1 ; 1<= 9; i++)이 된다. 1부터 9까지 차례대로 출력
            String stars = new String(); //사용할 변수 설정
            if (i <= userNumber - 1) { //윗부분으로 나눈다. 입력값이 5이므로 i값이 4이하일떄(1,2,3,4번째 줄)
                // 공백을 담당하는 j for 문 ( 공백은 순서대로 4 3 2 1이 필요하다. 따라서 안의 (int j = 1; 1 <=5-i; j++)로 하면 4 3 2 1이 출력
                for (int j = 1; j <= userNumber - i; j++) {
                    stars += " ";
                }

                // 별을 담당하는 j for 문 (별은 1 2 3 4가 순서대로 필요하다, 따라서 int j =1; 1 <= i; j++ 하면 1번 2번 3번 4번 출력
                for (int j = 1; j <= i; j++) {
                    stars += "*";
                }

            } else { //입력값이 5이므로 i값이 5이상일때(5,6,7,8,9번째 줄)
                // 아랫부분
                int lowerI = i - userNumber + 1; //새로운 변수 설정   lowerI = i - 5 + 1;   i값이 5부터 들어오므로 1 2 3 4 5로 변한다.

                // 공백을 담당하는 j for 문
                for (int j = 1; j <= lowerI - 1; j++) {  //int j = 1; 1 <= lowerI -1; j++)  값이 0 1 2 3 4가 된다. 
                    stars += " ";
                }

                // 별을 담당하는 j for 문
                for (int j = lowerI; j <= userNumber; j++) { //int j = lowerI; 1,2,3,4,5 <=5     5 4 3 2 1 
                    stars += "*";
                }

            }

            System.out.println(stars);
        }

        scanner.close();
    }// 메인함수 종료
}// 클래스 종료
