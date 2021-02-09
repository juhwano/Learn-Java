package day0122;
/* 무한 루프
 * 무한 루프란?
 * 강제로 종료시키기 전까지 영원히 돌아가는 반복문
 *
 * 무한루프를 만드는 방법은 매우 다양함
 * for 반복문, while 반복문 둘 다 가능하며
 * 각각의 반복문을 이용하여 무한 루프를 만들어보자.
 */

public class Ex01InfiniteLoop {
    public static void main(String[] args) {
        System.out.println("======1번======");
//        1. for 반복문에서 만약 조건식이 항상 참이 나오는 조건식이라면?
//        for (int i = 1; 1 >= 0; i++) {
//            System.out.println("무한루프 1번");
//            break;
//        }
//        2. for 반복문에서 만약 변화식이 없으면?
//        for(int i = 1; i <= 3;) {
//            System.out.println("무한루프 2번");
//        }
//        3. for 반복문 안에 아무것도 넣지 않는다면?
//        for(;;) {
//            System.out.println("무한루프 3번");
//        }
//        4. while  반복문 조건식 안의 변수에 변화가 없으면?
//        int number = 0;
//        while(number == 0) {
//            System.out.println("무한루프 4번");
//        }
//        5. while 반복문의 조건식이 항상 참이 나오면?
//        while(1 >= 0) {
//            System.out.println("무한루프 5번");
//        }
//        6. while(true)
          while (true) {
              System.out.println("무한루프 6번");
          }
//        무한 루프는 항상 나쁜 것이 아니다.
//        무한 루프가 나쁜 경우 : 의도하지 않은 상태에서 무한 루프에 들어갔을 때
//          
//        의도하고 무한 루프를 사용하는 경우가 있다.
//        대표적으로 메뉴 보여주는 코드가 무한 루프를 의도적으로 사용하는 경우다.

//        System.out.println("===============");
    }

}
