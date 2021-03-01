package day0120;
/* 데이터 검증(validation)
 * 데이터 검증이란 사용자가 입력한 값이 올바른 값에 속하는지
 * 체크하는 과정을 데이터 검증이라고 한다.
 * 데이터 검증을 하는 방법은 다양하지만
 * 우리는 그 중 정확한 범위를 통한 검증과 값이 올바른지 선 검증 후 결과 실행이라는
 * 2가지 방법을 통해서 데이터 검증을 해볼것이다.
 */

/* 1.조건식에 정확한 범위 넣기
 *   if문의 조건식에 우리가 A의 정확한 범위, B의 정확한 범위...F의 정확한 범위까지
 *   모두 설정하고 그 외에는 잘못 입력하셨습니다. 라고 출력되게 만들어준다.
 */
  
/* 2.올바른 값에 속할때만 조건을 띄우고, 잘못된 값은 바로 오류


/* 사용자로부터 키와 몸무게 입력 받아서
 * BMI를 계산 하는 프로그램을 작성하시오
 
 * BMI 18.5 미만 : 저체중
 *     23   미만 : 정상체중
 *     25   미만 : 과체중
 *       그 외   : 비만
 
 * 기네스북에 따르면 세계에서 가장 키가 컸던 사람은 2.72m였습니다.
 * 기네스북에 따르면 세계에서 가장 무거웠던 사람은 465kg였습니다.
 * 2개의 정보를 사용해서 데이터 검증도 적용하세요.
 */
import java.util.Scanner;
public class Ex10Validation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("키를 입력하세요(m단위) : ");
        double height = scanner.nextDouble();
        if(height >= 0 && height <= 2.72) {            
            System.out.print("몸무게를 입력하세요(kg단위) : "); 
            double weight = scanner.nextDouble();
            if(weight >= 0 && weight <= 465){
                double bmi = height / weight * weight;
                if(bmi < 18.5) {                              
                    System.out.printf("키: %.2f  몸무게: %.1f\n" , height, weight);
                    System.out.printf("bmi 수치 " + "%.2f\n", bmi);
                    System.out.println("저체중입니다.");                    
                }else if(bmi < 23) {           
                    System.out.printf("키: %.2f  몸무게: %.1f\n" , height, weight);
                    System.out.printf("bmi 수치 " + "%.2f\n", bmi);
                    System.out.println("정상체중입니다.");                    
                }else if(bmi < 25) {                             
                    System.out.printf("키: %.2f  몸무게: %.1f\n" , height, weight);
                    System.out.printf("bmi 수치 " + "%.2f\n", bmi);
                    System.out.println("과체중입니다.");
                }else {                             
                    System.out.printf("키: %.2f  몸무게: %.1f\n" , height, weight);
                    System.out.printf("bmi 수치 " + "%.2f\n", bmi);
                    System.out.println("비만입니다.");
                }                
            }else {
                System.out.println("잘못된 입력입니다.");
            }          
        
        scanner.close(); 
           
    }else {
    	System.out.println("잘못된 입력입니다.");
    }

}
}