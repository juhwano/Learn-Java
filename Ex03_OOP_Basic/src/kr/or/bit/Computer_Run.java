package kr.or.bit;

public class Computer_Run {

    public static void main(String[] args) {
      Computer computer1 = new Computer(1000000, "SAMSUNG","BIT0203","White",false);
      System.out.println("컴퓨터의 기능을 테스트합니다.");
      System.out.println("이 컴퓨터는 입력과 출력, 절전모드의 on/off, 사칙연산과 전원 on/off가 가능합니다.");
      // 전원 켬
      computer1.onPower();
      // 입력값을 받기전 출력 
      computer1.Output();
      // 입력
      computer1.Input();
      // 출력
      computer1.Output();
      // 절전모드 켬
      computer1.onSaveMode();
      // 절전모드 끔
      computer1.offSaveMode();
      // 더하기
      System.out.print("더하기 실행: ");
      System.out.println(computer1.add(1994, 1125));
      // 빼기
      System.out.print("빼기 실행: ");
      System.out.println(computer1.minus(1994, 1125));
      // 곱하기
      System.out.print("곱하기 실행: ");
      System.out.println(computer1.multiplication(1994, 1125));
      // 나누기
      System.out.print("나누기 실행: ");
      System.out.println(computer1.division(1994, 1125));
      // 전원 끔
      computer1.offPower();
    }
    
}