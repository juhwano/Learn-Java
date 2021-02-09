package day0126;
/* 사용자로부터 로또 번호를 입력받는 프로그램
 * 
 * 단, 해당 번호가 중복이거나 1~45를 벗어나는 값이면
 * 다시 입력을 받도록 만드시오.
 * (로또 번호 6개)
 */

//+정렬하는 코드 추가
import java.util.Scanner;
import java.util.Random;
public class Ex02LottoNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //크기가 6인 배열 생성 (0~5)
        int[] intArray = new int[6];
        //사용자로부터 6개의 숫자 입력받기
        for(int i = 0; i < intArray.length; i++) {
            System.out.print(i+1+"번째 번호를 입력해주세요: ");
            int userInput = scanner.nextInt();
            //1~45 넘어가는 값 cut!
            while(userInput < 1 || userInput > 45) {
                System.out.println("잘못 입력하셨습니다. ");
                System.out.print("숫자를 다시 입력해주세요 : ");
                userInput = scanner.nextInt();
            }
            //중복값 cut!
            for(int j = 0; j < intArray.length; j++) {
                if(userInput == intArray[j]) {
                    System.out.println("중복된 값입니다.");
                    System.out.print(i+1+"번째 값: ");
                    userInput = scanner.nextInt();
                    j = -1;
                }
            }
            //사용자가 중복과 범위 안 넘기고 잘 입력했다. 
            //유저가 입력한 값을 intArray[0]~[5]까지 차례대로 저장한 변수
            intArray[i] = userInput;
        }
        //무사히 끝났다 -> 중복된 값이 x -> 출력
        for(int i = 0; i < intArray.length; i++) {
            System.out.print("사용자의 로또 번호 : ");
            System.out.println(intArray[i]);
        }
        System.out.printf("-------------------\n");
        for(int rotto = 0; rotto < 6; rotto++) {
            System.out.print("컴퓨터의 로또 번호 : ");
            System.out.println(random.nextInt(46));
        }
        
        //값을 비교해보자
        
        scanner.close();
    }

}
