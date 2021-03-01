package day0120;
//1.사용자로부터 숫자를 입력 받아서 홀수이면 홀수입니다가 출력되게 작성해보시오.

//2.나이를 입력받아서 20살 이상이면 성인입니다가 출력되게 작성해보세요.

//3.아이디랑 비밀번호를 입력받아서 아이디가 admin 비밀번호가 12345면 '로그인 성공'이라는 메시지가 출력되도록 작성해보세요.
import java.util.Scanner;
public class Ex02If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //1.사용자로부터 숫자를 입력 받아서 홀수이면 홀수입니다가 출력
        System.out.print("숫자를 입력해주세요: ");
        int number = scanner.nextInt();
        
        if(number %2 ==1) {
            System.out.print("홀수입니다.");
        }
        
        //2.나이를 입력받아서 20살 이상이면 성인입니다가 출력
        System.out.print("나이를 입력해주세요: ");
        int age = scanner.nextInt();
        
        if(age > 19) {
            System.out.println("성인입니다.");
        }
        
        //3.아이디랑 비밀번호를 입력받아서 아이디가 admin 비밀번호가 12345면 '로그인 성공'이라는 메시지가 출력
        System.out.print("아이디를 입력해주세요: ");
        scanner.nextLine(); //버그 방지로 미리 실행
        String id = scanner.nextLine();
        
        System.out.print("비밀번호를 입력해주세요: ");
        String password = scanner.nextLine();
        if(id.equals("admin") && password.equals("12345")) {
            System.out.println("로그인 성공");
        }
            
        
        
        
        scanner.close();
        
        
        
    }    
}

