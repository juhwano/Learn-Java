package day0120;
import java.util.Scanner;
public class Hw03juhwanreview {    
	static final int MIN_SCORE_LIMIT = 0;
    static final int MAX_SCORE_LIMIT = 100;
    static final int NUMBER_OF_SUBJECT = 3;

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("번호를 입력하세요: ");
    int number = scanner.nextInt();

    System.out.print("이름을 입력하세요: ");
    scanner.nextLine();
    String name = scanner.nextLine();

    System.out.print("국어 점수를 입력하세요: ");
    int korean = scanner.nextInt();

    while (korean < MIN_SCORE_LIMIT || korean > MAX_SCORE_LIMIT) {
        System.out.print("잘못된 점수입니다. ");
        System.out.print("점수를 다시 입력해주세요 :");
        korean = scanner.nextInt();
    }
    System.out.print("영어 점수를 입력하세요: ");
    int english = scanner.nextInt();

    while (english < MIN_SCORE_LIMIT || english > MAX_SCORE_LIMIT) {
        System.out.print("잘못된 점수입니다. ");
        System.out.print("점수를 다시 입력해주세요 :");
        english = scanner.nextInt();
    }
    System.out.print("수학 점수를 입력하세요: ");
    int math = scanner.nextInt();
    while (math < MIN_SCORE_LIMIT || math > MAX_SCORE_LIMIT) {
        System.out.print("잘못된 점수입니다. ");
        System.out.print("점수를 다시 입력해주세요 :");
        math = scanner.nextInt();
    }
    int sum = korean + english + math;
    double average = sum / (double) NUMBER_OF_SUBJECT;

    System.out.printf("번호 : [%d]번  이름 : [%s]\n", number, name);
    System.out.printf("국어 : [%d]점  영어 : [%d]점  수학 : [%d]점\n", korean, english, math);
    System.out.printf("총점 : [%d]점  평균 : [%.2f]점\n", sum, average);

    scanner.close();
}

}
	
	