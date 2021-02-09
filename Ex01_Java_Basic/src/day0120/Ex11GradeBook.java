package day0120;
/* 사용자로부터  
 * 국어 영어 수학 점수를 입력 받아서
 * 모든 점수가 60점 이상이고
 * 평균이 70점 이상이면 합격 -> 모든 조건이 만족해야함
 * 그 외에는 불합격이 뜨는 프로그램을 작성
 */

/* 하드코딩이란?
 * "경직된" 코딩이란 의미로 변경이 어려운 형태의 코딩
 *  장점 : 빠르다. 쉽다
 *  단점 : 유지보수가 어렵다.
   
 *  소프트코딩이란?
 *  "유연한" 코딩이란 의미로 변경이 쉬운 형태의 코딩
 *  장점 : 유지보수가 쉽다.
 *  단점 : 쉬운 난이도의 프로그래밍에서는 오히려 코딩의 난이도를 높인다.
 */

/* 하드코딩과 소프트코딩의 가장 큰 차이점:
 * 상수 혹은 변수를 적극적으로 사용했나 안했나이다. 
 */
import java.util.Scanner;
public class Ex11GradeBook {
    static final int MIN_SCORE_LIMIT = 60;  //점수를 상수화시킨다. ->점수가 70점으로 바껴도 상수만 바꿔주면 됨
    static final int MIN_SUM_LIMIT = 210; //평균을 상수화시킨다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("국어 : ");
        int korean = scanner.nextInt();
        System.out.print("영어 : ");
        int english = scanner.nextInt();
        System.out.print("수학 : ");
        int math = scanner.nextInt();
        
        //sum 변수 추가
        int sum = korean + english + math;
        
        if(korean >= MIN_SCORE_LIMIT && english >= MIN_SCORE_LIMIT && math >=MIN_SCORE_LIMIT && sum >= MIN_SUM_LIMIT) {   
            //조건이 바뀌면 코드를 여러 번 바꿔야함.
            //소프트 코딩의 필요성
            System.out.println("합격입니다.");
        }else {
            System.out.println("불합격입니다.");
        }
        scanner.close();
           
    }

}
