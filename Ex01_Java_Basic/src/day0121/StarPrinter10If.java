package day0121;

import java.util.Scanner;

public class StarPrinter10If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 10번*****");
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int userNumber = scanner.nextInt();
        for (int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = new String();
            if (i == 1) {
                for (int j = 1; j <= 2 * userNumber - 1; j++) {
                    stars += "*";
                }
            } else if (i <= userNumber - 1) { // i값 2 3 4번째 줄까지
                // 별
                for (int j = 1; j <= -1 * i + 6; j++) {
                    stars += "*";
                }
                // 공백
                for (int j = 1; j <= 2 * i - 3; j++) {
                    stars += " ";
                }
                // 별
                for (int j = 1; j <= -1 * i + 6; j++) {
                    stars += "*";
                }
            } else if (i < 2 * userNumber - 1) { // i값 5 6 7 8번째 줄까지
                // 별 1 2 3 4가 필요함. 5a+b=1 6a+b=2 a=1 b=-4
                for (int j = 1; j <= i - 4; j++) {
                    stars += "*";
                }
                // 공백
                for (int j = 1; j <= -2 * i + 17; j++) {
                    stars += " ";
                }
                // 별
                for (int j = 1; j <= i - 4; j++) {
                    stars += "*";
                }
            } else {
                for (int j = 1; j <= 2 * userNumber - 1; j++) {
                    stars += "*";
                }
            }
            System.out.println(stars);
        }
        scanner.close();
    }

}
//문제점 : 5에만 맞춰서 ㅋㅋ 다른 거는 안 나온다.