package day0121;
import java.util.Scanner;
public class StarPrinter10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******별 찍기 10번 *********");
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {   //i가 0 1 2 3 4까지 5번 반복
            String stars = new String();
            for (int j = 1; j <= number - i; j++) { //j가 1부터 시작  1<=5-1;
                stars += "*";
            }
            for (int j = 1; j <= i; j++) {
                stars += " ";
            }
            for (int j = 1; j < i; j++) {
                stars += " ";
            }
            for (int j = 1; j < number - i; j++) {
                stars += "*";
            }
            if (i != 0) {
                stars += "*";
            }
            System.out.println(stars);
        }
        for (int i = number - 1; i >= 1; i--) {   //i가 4 3 2 1 4번 반복
            String stars = new String();
            for (int j = 0; j <= number - i; j++) {
                stars += "*";
            }
            for (int j = i; j > 1; j--) {
                stars += " ";
            }
            for (int j = i - 1; j > 1; j--) {
                stars += " ";
            }
            for (int j = 1; j <= number - i; j++) {
                stars += "*";
            }
            if (i != 1) {
                stars += "*";
            }
            System.out.println(stars);
        }
        scanner.close();
    }

}