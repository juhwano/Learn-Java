package day0120;
/* if 조건문3 
 * if - else if 구조
 * 만약 어떤 조건식이 false가 나오면
 * 다시 다른 조건을 체크해서 실행 여부를 결정해야한다면
 * 우리는 if - else if 구조를 사용하게 된다.
 * 우리가 배웠던 if - else 구조처럼
 * if - else if 구조도 조건식이 true가 나오는 맨 처음 코드 블락만 실행된다.
 * 또, 우리가 필요한 만큼의 else if를 넣어줄 수 있고
 * 제일 마지막에는 모든 if, else if의 조건식이 false가 나왔을 때를 대비해서
 * else를 만들어 줄 수 있다.
 * 
 */
public class Ex05IfElseIf {
    public static void main(String[] args) {
        int number = -10;
        
        if(number > 0) {
            System.out.println("양의 정수입니다.");
            
        }else if(number == 0){
            System.out.println("0입니다.");
        
        }else {
            System.out.println("음의 정수입니다.");
        }
        
        
        
        
        
    }

}
