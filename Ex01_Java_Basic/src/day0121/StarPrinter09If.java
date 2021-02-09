package day0121;
import java.util.Scanner;
public class StarPrinter09If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 9번*****");
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int userNumber = scanner.nextInt();
        
        for (int i = 1; i <= 2 * userNumber - 1; i++) { //총 돌아가는 횟수 여기서ㅏ if else 로 둡 ㅜ분으로 나눈다.
            String stars = new String(); //사용할 변수설정
            if (i <= userNumber - 1) { // 윗부분
                // 공백을 담당하는 j for 문
                for (int j = 1; j <= userNumber - i; j++) { // 1번쨰줄 4개, 2번쨰줄 3개 3번째줄 4개 4번째줄 3개
                    stars += " ";
                }
                // 별을 담당하는 j for 문
                for (int j = 1; j <= 2 * i - 1; j++) { // 줄 수만큼. 1번째줄 1 2번쨰줄 3 3번쨰줄 5 2x-1
                    stars += "*";
                }
            } else { // 아래부분 5,6,7,8,9 을 5 4 3 2 1로 바꿔야함. user가 5일떄 x2하면 10나옴  
                // 5 6 7 8 9
                // 5 4 3 2 1
                //더하면 10   10 - 1, 10 - 2, 10 -3
                // 아래부분
                // 공백을 담당하는 j for문
                for (int j = 1; j <= i - userNumber; j++) { // i가 5,6,7,8,이렇게 커집니다.   공백은 0 1 2 3 4 5 커져야하고, j값 
                    stars += " ";
                }
                // 별을 담당하는 j for문     
                for(int j = 1; j <= -2* i + 19; j++ ) {   
                    stars += "*";
                }
               // 공백이 0 1 2 3 4 이렇게 필요하다. i는 5 6 7 8 9 가 들어온다.
            }
            System.out.println(stars);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        scanner.close();
    }

}
