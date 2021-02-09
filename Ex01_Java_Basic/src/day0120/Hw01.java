package day0120;
//숙제1:bmi계산기를 만들어서 사용자의 bmi 수치와 현재 체중 상태를 출력하는 프로그램을 작성 
//단, 사용자가 잘못된 키나 몸무게를 입력하면 올바른 값을 입력할 떄까지 다시 입력을 받으세요


//김현진 코드 리뷰

import java.util.Scanner;
public class Hw01 {
	static final int MINIMUM = 0;
	static final double MAXIMUM_HEIGHT = 2.72;
	static final double MAXIMUM_WEIGHT = 465;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//사용자에게 키와 몸무게를 받는다. ->scanner
		
		System.out.print("키(m)를 입력해주세요 : ");
		double height = scanner.nextDouble();
		
		//잘못된 키와 몸무게 입력 시 올바른 값을 입력받는다. -> while 조건문(올바른 값이 나올 때까지 계속 입력받는다.)
	    //잘못된 거 입력하면 반복 -> 잘된 거 입력되면 다음 단계로 이동
		
		
		while(height < MINIMUM || height > MAXIMUM_HEIGHT) {
			//조건이 참이면 반복될 코드
			//여기다가 잘못 입력된 수를 넣는다.
			System.out.println("키를 잘못 입력하셨습니다. 다시 입력해주세요.");
            System.out.print("키를 입력해주세요: ");
            height = scanner.nextDouble();
		}
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = scanner.nextDouble();
		
		while(weight < MINIMUM || weight > MAXIMUM_WEIGHT ) {
			//조건이 참이면 반복될 코드
			//여기다가 잘못 입력된 수를 넣는다.
			System.out.println("몸무게를 잘못 입력하셨습니다. 다시 입력해주세요.");
            System.out.print("몸무게를 입력해주세요: ");
			weight = scanner.nextDouble();
		}
		
		//올바른 값이니 사용자의 bmi를 계산한다.(bmi 계산법 : 몸무게 / 키 /키)
		double bmi = weight / height / height;
		
		//bmi와 체중 상태를 알려준다.
		if(bmi < 18.5) {
            System.out.printf("사용자의 BMI : %.1f\n" , bmi);
			System.out.println("저체중입니다.");
        }else if(bmi < 23) {
        	System.out.printf("사용자의 BMI : %.1f\n" , bmi);
            System.out.println("정상체중입니다.");
        }else if(bmi < 25) {
        	System.out.printf("사용자의 BMI : %.1f\n" , bmi);
            System.out.println("과체중입니다.");
        }else {
        	System.out.printf("사용자의 BMI : %.1f\n" , bmi);
            System.out.println("비만입니다.");
        }		
		
		scanner.close();		
	}

}
