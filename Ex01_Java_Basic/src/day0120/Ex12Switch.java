package day0120;
/* 조건문 02 - Switch
 * if 조건문은 우리가 true/false가 나올 수 있는 조건식을 만들어서
 * 해당 조건식이 true가 나올때 코드블락이 실행이 됐지만
 * 
 * switch 조건문은 우리가 조건식이 아닌 값이 변화하는 "변수"를 선택해서
 * 그 변수값에 대한 코드를 정의하는 형태의 조건문이다.
 * 
 * switch 조건문의 형태:
 * switch(변수) {
 * case 값:
 *    실행할 코드
 *    break;
 * case 값:
 *    실행할 코드
 *    break;
 * default:
 *    실행할 코드
 *    break;
 * }
 */
public class Ex12Switch {
    public static void main(String[] args) {
        int number = 2;
        
        switch(number) {
        case 1:     //case순서는 오름차순,내림차순 상관x
            System.out.println("1입니다.");
            break;
        case 3:
            System.out.println("3입니다.");
            break;  //berak 는 코드에 등장하는 순간 반복문을 종료시킴
        case 2:
            System.out.println("2입니다.");
            break;  //break를 모두 생략하면 ->해당하는 케이스까지 와서 출력 후 그 밑의 코드를 모두 실행시킨다.
        default:
            System.out.println("그 외입니다.");
            break;
            
        }
        //2.switch의 단점
        //(1)케이스가 너무 많으면 힘들다. 보통 범위로 잡지. 값을 일일히 잡지 않는다.
        //switch(number / 18) {
        //case : 0
        //      System.out.println("미성년자입니다.");
        //default:
        //      System.out.println("성인입니다.");
        //}
        //이 정도는 쉬워서 스위치로도 가능
        
        //(2)double 불가능.
        //명확한 정수가 아니면 사용할 수 없다.(Char,정수형,String)
        //doubld d = 3.14;
        //3.14는 케이스를 어떻게 나눌꺼냐? 3.1444 등등
        
        
    }

}
