package kr.or.bit;

import java.util.Scanner;
import java.util.Random;

/*
1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
(int)(Math.random()*45 + 1)
lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요 (중복값 검증 :별찍기 비슷)
3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요 (정렬 : 자리바꿈)
4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)
*/
//기능 >> method >> 함수 하나당 기능 하나
//public >> 참조변수
//private >> 내부 사용 (공통)
//실번호 추출해 주세요
//중복값 나오면 안되요
//낮은 순으로 정렬해 주세요
//화면에 출력해 주세요
//메뉴 기능을 만들어 주세요
import java.util.Scanner;
import java.util.Random;
class Lotto {
    private int[] numbers;  //초기화 
    private Scanner scanner;
    private Random random;
    
    public Lotto() { 
        this.numbers = new int[6]; 
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }
    
    public int[] getNumbers() {
        return this.numbers;
    }
    
    ///////////////////////////////////////////////////////////

    // 메뉴 출력 및 사용자 입력 값 에러 체크 후 메뉴번호 리턴
    public int menuInput() {
        int userInput = 0;
        System.out.println("********** 로또 프로그램 **********");
        System.out.println("1. 로또 번호 생성 | 2. 로또 번호 정렬");
        System.out.println("3. 로또 번호 출력 | 4. 로또 프로그램 종료");
        System.out.println();
        do {
            try {
                System.out.print("메뉴 번호 입력 : ");
                userInput = Integer.parseInt(scanner.nextLine());
                if (userInput >= 1 && userInput <= 4) {
                    break;
                } else {
                    throw new Exception("메뉴 번호를 잘못 입력하셨습니다.");
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("1 ~ 4 사이의 숫자를 입력해주세요.");
            }
        } while (true);
        return userInput;
    }
    
    ///////////////////////////////////////////////////////////
    
    // 중복 체크 기능
    private boolean overlapCheck(int randomInt, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == randomInt) {
                return true;
            }
        }
        return false;
    }
   
    // 랜덤 번호를 생성하고 중복 체크 진행 후 배열에 할당 기능
    public void assignArray() {
        int[] numbers = new int[this.numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            int randNum = (random.nextInt(45)+1);

            if (overlapCheck(randNum, numbers)) {
                i--;
                continue;
            }
            numbers[i] = randNum;
        }
        this.numbers = numbers;
    }

    ///////////////////////////////////////////////////////////
    
    // 배열에 할당된 랜덤 번호들 정렬 기능
    public void sortArray() {
        for (int i = 0; i < this.numbers.length-1; i++) {
            if (this.numbers[i] > this.numbers[i+1]) {
                int temp = this.numbers[i];
                this.numbers[i] = this.numbers[i+1];
                this.numbers[i+1] = temp;
                i = -1;
            }
        }
    }
    
    ///////////////////////////////////////////////////////////
    
    // 배열 평균 값 구하고 리턴하는 기능
    public double averageNumber() {
        double sum = 0;
        
        for (int i : this.numbers) {
            sum += (double)i;
        }
        sum = sum / (double)this.numbers.length;
        return sum;
    }
    
    ///////////////////////////////////////////////////////////
    
    // 배열 출력 기능
    public void arrayPrint(int[] numbers) {
        for(int i : numbers) {
            System.out.printf("[%02d]", i);
        }
        System.out.println();
    }
    
}