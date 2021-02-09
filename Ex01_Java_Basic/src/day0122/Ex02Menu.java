package day0122;
// 무한 루프를 사용한 메뉴 만들기.
import java.util.Scanner;
public class Ex02Menu {
//     입력 옵션값
    static final int OPTION_INSERT = 1;
//     출력 옵션값
    static final int OPTION_PRINT = 2;
//     종료 옵션값
    static final int OPTION_END = 3;
    public static void manin(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        변수선언은 while문 바깥에 해야 저장됨

        while(true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            
            int userChoice = scanner.nextInt();
        
            if(userChoice == OPTION_INSERT) {
//                입력하는 코드 구현
            }else if(userChoice == OPTION_PRINT) {
//                출력하는 코드 구현
            }else if(userChoice== OPTION_END) {
                System.out.println("사용해주셔서 감사합니다. ");
                break;
            }
            
        }
        
        
        
    }

}
