package day0120;
import java.util.Scanner;
public class Hw02juhyunreview {
    static final int SCORE_LIMIT_MAX = 100;
    static final int SCORE_LIMIT_A = 90;
    static final int SCORE_LIMIT_B = 80;
    static final int SCORE_LIMIT_C = 70;
    static final int SCORE_LIMIT_D = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력해주세요: ");
        int score = scanner.nextInt();

        while (score < 0 || score > SCORE_LIMIT_MAX) {
            System.out.println("잘못된 점수입니다. 다시 입력해주세요.");
            System.out.print("점수를 입력해주세요: ");
            score = scanner.nextInt();
        }

        if (score >= SCORE_LIMIT_A) {
            System.out.println("A");
        } else if (score >= SCORE_LIMIT_B) {
            System.out.println("B");
        } else if (score >= SCORE_LIMIT_C) {
            System.out.println("C");
        } else if (score >= SCORE_LIMIT_D) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        scanner.close();
    }
}