package day0121;
import java.util.Scanner;
public class StarPrinter09If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 9번*****");
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int userNumber = scanner.nextInt();
        
        for (int i = 1; i <= 2 * userNumber - 1; i++) { //총 돌아가는 횟수 여기서ㅏ if else 로 두 부분으로 나눈다.
            String stars = new String(); //사용할 변수설정
            if (i <= userNumber - 1) { // 윗부분(1,2,3,4번째 줄)
                // 공백을 담당하는 j for 문
                for (int j = 1; j <= userNumber - i; j++) { //4 3 2 1이 필요하다. int j=1; 1<= 5- i 
                    stars += " ";
                }
                // 별을 담당하는 j for 문
                for (int j = 1; j <= 2 * i - 1; j++) { // 1 3 5 7이 필요하다. int j =1; 1<=2 * i - 1 홀수
                    stars += "*";
                }
            } else { // 아래부분(5번째줄~9번째줄)  
                // 5 6 7 8 9
                // 5 4 3 2 1
                //더하면 10이 나오는데   10 - 1, 10 - 2, 10 -3 공백갯수 필요한거 4 3 2 1이 필요하다.

                //5번코드에서는 i가 12345로 들어가는데, 6번코드에서는 i가 54321요렇게// 들어가게 만듬<-뭔 말?
                //i 가 5 6 7 8 9 
                //lowerI자체가 5 4 3 2 1로 변해야한다.
                
                //공백을 담당하는 j for문
                int lowerI = 2 * userNumber - i;   //10 - i  i는 5부터 들어감. 5 4 3 2 1
                for (int j = 1; j <= userNumber - lowerI; j++) { 
                    //i는 5,6,7,8,9들어오고,    공백은 0 1 2 3 4 5로 커져야하고, j값
                    //int j = 1; 1 <= 5 - 10 - i; j++)
                    
                    stars += " ";
                }
                // 별을 담당하는 j for문     
                for(int j = 1; j <= 2* lowerI - 1; j++ ) {   
                    stars += "*";
                }
                 
            }
            System.out.println(stars);
        }
        
        
        scanner.close();
    }

}