package day0126;
/* 사용자로부터 로또 번호를 입력받는 프로그램
 * 
 * 단, 해당 번호가 중복이거나 1~45를 벗어나는 값이면
 * 다시 입력을 받도록 만드시오.
 * (로또 번호 6개)
 */

//+정렬하는 코드 추가 구현
import java.util.Scanner;
public class Ex02review_add_sort {
    static final int SIZE = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 6개 번호를 저장할 배열 생성
        int[] lottoNumbers = new int[SIZE];
        // 1. 사용자부터 6개 번호 입력받기
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.print(i + "번째 숫자를 입력해주세요: ");
            int userNumber = scanner.nextInt();
            // 중복, 범위 체크(데이터 검증)
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
                    //중복 후에도 필히 다시 범위 체크
                    while (userNumber < 1 || userNumber > 45) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.print(i + "번째 숫자를 입력해주세요: ");
                        userNumber = scanner.nextInt();
                    }
                    j = -1;
                }
            }
            //데이터 검증 끝난 값을 변수에 저장
            lottoNumbers[i] = userNumber; 
        }
        //배열 안의 입력값을 오름차순으로 정리(1->2->3->4)
        // -1해주는 이유가 i와 i+1을 비교하기 때문이다. 안해주면 범위를 넘어감
        for(int i = 0; i < lottoNumbers.length - 1; i++) {
            if(lottoNumbers[i] > lottoNumbers[i+1] ) {
                //새로운 변수 설정 후 기존의 i를 넣어준다.
                int temp = lottoNumbers[i]; 
                //i가 있던 자리에 i+1을 이동시킨다.
                lottoNumbers[i] = lottoNumbers[i + 1];
                //i+1이 있던 자리에 i를 이동시킨다.
                lottoNumbers[i + 1] = temp;
                //값 down -> 앞에서부터 다시 체크된다. 
                //i를 -1로 더 이상 실행시킬 코드 x
                i = -1;
            }
            
        }
        //2.최종 출력
        
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.println(lottoNumbers[i]);
            
        }
        scanner.close();
    }
}
