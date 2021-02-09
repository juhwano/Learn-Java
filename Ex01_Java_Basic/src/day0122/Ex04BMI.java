package day0122;
//BMI계산기에 메뉴를 적용시켜 프로그램을 완성시키시오.

//숫자형은 0으로 초기화
//참조형 변수 초기화 String stars = new String();
//스캐너는 입력을 받아야한다. 입력받을 위치 지정
//Scanner scanner = new Scanner(System.in);
//그거 가져오세요. 그거가 뭔지. XXX씨 가져오세요. 어떤거요?
//"system.in이라는 곳에서 입력을 받아." 라는 뜻
//시작 후 바로 2 누르면 비만 뜸. 0 / 0 / 0 = 무한대(비만)

import java.util.Scanner;
public class Ex04BMI {
//  입력 옵션값
    static final int OPTION_INSERT = 1;
//  출력 옵션값
    static final int OPTION_PRINT = 2;
//  종료 옵션값
    static final int OPTION_END = 3;
//  사용자의 최대 키 값
    static final double MAX_HEIGHT = 2.72;
//  사용자의 최대 몸무게 값
    static final double MAX_WEIGHT = 465;
//  저체중 BMI 값
    static final double LOW_WEIGHT_BMI = 18;
//  정상체중 BMI 값
    static final double NORMAL_WEIGHT_BMI = 23;
//  과체중 BMI 값
    static final double OVER_WEIGHT_BMI = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = 0;
        double weight = 0;
        // 한번이라도 실행or입력하면 0이라는 값이 남아있을 수 없다.

        while (true) {
            System.out.println("1.입력 2.출력 3.종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            if (userChoice == OPTION_INSERT) {
                System.out.print("키(m)를 입력해주세요 : ");
                height = scanner.nextDouble();

                while (height < 0 || height > MAX_HEIGHT) {
                    System.out.println("키를 잘못 입력하셨습니다. 다시 입력해주세요.");
                    System.out.print("키를 입력해주세요: ");
                    height = scanner.nextDouble();
                }
                System.out.print("몸무게(kg)를 입력해주세요 : ");
                weight = scanner.nextDouble();

                while (weight < 0 || weight > MAX_WEIGHT) {
                    System.out.println("몸무게를 잘못 입력하셨습니다. 다시 입력해주세요.");
                    System.out.print("몸무게를 입력해주세요: ");
                    weight = scanner.nextDouble();
                }

            } else if (userChoice == OPTION_PRINT) {
                if (weight == 0) {
                    // 아직 입력된 값이 없다라는 의미이므로 경고메시지만 출력
                    System.out.println("아직 입력된 값이 없습니다.");
                } else {
                    double bmi = weight / height / height;
                    if (bmi < LOW_WEIGHT_BMI) {
                        System.out.printf("사용자의 키 : %.2fm 몸무게 : %.1fkg\n", height, weight);
                        System.out.printf("사용자의 BMI : %.1f\n", bmi);
                        System.out.println("저체중입니다.");
                    } else if (bmi < NORMAL_WEIGHT_BMI) {
                        System.out.printf("사용자의 키 : %.2fm 몸무게 : %.1fkg\n", height, weight);
                        System.out.printf("사용자의 BMI : %.1f\n", bmi);
                        System.out.println("정상체중입니다.");
                    } else if (bmi < OVER_WEIGHT_BMI) {
                        System.out.printf("사용자의 키 : %.2fm 몸무게 : %.1fkg\n", height, weight);
                        System.out.printf("사용자의 BMI : %.1f\n", bmi);
                        System.out.println("과체중입니다.");
                    } else {
                        System.out.printf("사용자의 키 : %.2fm 몸무게 : %.1fkg\n", height, weight);
                        System.out.printf("사용자의 BMI : %.1f\n", bmi);
                        System.out.println("비만입니다.");
                    }
                }

            } else if (userChoice == OPTION_END) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }

        scanner.close();
    }

}
