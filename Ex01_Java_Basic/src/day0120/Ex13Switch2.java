package day0120;
// 사용자로부터 월을 입력 받아서 해당 월의 가장 마지막 날을 출력하는 프로그램
import java.util.Scanner;
public class Ex13Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("월을 입력하세요 : ");
        int month = scanner.nextInt();
        
        switch(month){   //break가 없으면 무식하게 1~12월 다 입력할 수밖에 없다. 만족하는 케이스에 들어가서 break 전까지 실행된다.
        case 2:
            System.out.println("28일까지입니다.");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("30일까지입니다.");
            break;
        default:
            System.out.println("31일까지입니다.");
            break;
        }
//        if(Month == 2) {
//            System.out.println("28일");
//        }else i(month ==4 || month == 6 || month == 9 || month == 11){
//            System.out.println("30일");
//        }else {
//            System.out.println("31일");
//        }
//        //거의 모든 경우에는 if else가 쉽다.
        
        scanner.close();
    }

}
