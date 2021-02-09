package kr.or.bit;

public class Lotto_Run {
    public static void main(String[] args) {
        
        Lotto lotto = new Lotto();

        while (true) {
            switch (lotto.menuInput()) { // 메뉴 출력 및 사용자 입력 값 에러 체크 후 메뉴번호 리턴
            case 1:
                lotto.assignArray(); // 랜덤 번호를 생성하고 중복 체크 진행 후 배열에 할당
                System.out.println("로또 번호 6개 생성 완료!");
                System.out.println();
                break;
            case 2:
                if (lotto.getNumbers()[0] == 0) { // 로또 번호 생성 여부 체크
                    System.out.println("생성된 로또 번호가 없습니다! 생성부터 진행 해주세요!");
                    System.out.println();
                } else {
                    lotto.sortArray(); // 배열에 할당된 랜덤 번호들 정렬 기능
                    System.out.println("로또 번호 정렬 완료!");
                    System.out.println();
                }
                break;
            case 3:
                if (lotto.getNumbers()[0] == 0) { // 로또 번호 생성 여부 체크
                    System.out.println("생성된 로또 번호가 없습니다! 생성부터 진행 해주세요!");
                    System.out.println();
                } else {
                    lotto.arrayPrint(lotto.getNumbers()); // 배열 출력 기능
                    System.out.printf("평균 : [%.1f]\n", lotto.averageNumber()); // 배열 평균 값 출력
                }
                break;
            case 4:
                System.out.println("프로그램을 종료합니다. 이용해 주셔서 감사합니다!");
                System.exit(0); // 프로그램 종료
            }
        }
            
    }
}