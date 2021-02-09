package day0119;
//숙제1.  
//사용자로부터 키와 몸무게를 입력받아서
//BMI 수치를 어느정도 형식에 맞추어 출력하시오
//BMI 계산 방법은 몸무게 / 키 / 키입니다.
//키는 m 단위로 입력받아야합니다.


import java.util.Scanner;
public class Hw01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("키(m) 입력:  ");
        double height = scanner.nextDouble();
        System.out.print("몸무게(kg) 입력:  ");
        double weight = scanner.nextDouble();
        
        double bmi = (weight / (height*height));



        System.out.printf("키 : %.2f  몸무게 : %.1f\n", height, weight);
		System.out.printf("BMI : %.1f\n", bmi);		
		
		
		scanner.close();
		
	}

}
