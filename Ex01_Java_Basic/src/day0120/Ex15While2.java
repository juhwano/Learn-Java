package day0120;
/* 사용자로부터 "자연수"만 입력받는 프로그램
 * 만약 사용자가 자연수가 아닌 숫자를 입력하면?
 * 자연수를 입력할 때까지 다시 입력받는다.
 */
import java.util.Scanner;
public class Ex15While2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("자연수를 입력해주세요: ");
        int number = scanner.nextInt();
        
        while(number < 0) {
            //false가 나오는 조건식으로 적는다. false가 나오면 프로그램 종료
            //ture가 나오면 계속 입력을 받는다.
            System.out.println("자연수가 아닙니다. 다시 입력해주세요.");
            System.out.print("자연수를 입력해주세요: ");
            number = scanner.nextInt();
               
        }
        
        
        System.out.println("사용자가 입력한 자연수: "+number);
        scanner.close();
    }

}

// 숙제1:bmi계산기를 만들어서 사용자의 bmi 수치와 현재 체중 상태를 출력하는 프로그램을 작성
//       단, 사용자가 잘못된 키나 몸무게를 입력하면 올바른 값을 입력할 떄까지 다시 입력을 받으세요

// 숙제2: 사용자로부터  점수를 입력받아 A,B,C,D,F를 출력하는 프로그램을 작성하세요.
//        단, 잘못된 점수가 입력되면 올바른 점수가 입력될떄까지 다시 입력을 받으세요.


// 숙제3: 사용자가 번호,이름 ,국어,영어,수학 점수를 입력하면 예쁘게 출력하는 프로그램을 작성하세요.
//        단, 사용자가 잘못된 형태의 점수를 입력하면 올바른 형태의 점수를 입력할 떄까지 다시 입력을 받는 프로그램을 만드세요.

// 심화 : 모든 숙제에 대해 하드코딩이 아닌 소프트코딩을 적용하세요