package day0120;
/* 제어문(Control Statement)
 * 제어문은 코드의 실행 혹은 반복을 제어하는 특수한 코드이다.
 * 제어문에는 코드의 실행여부를 결정하는 "조건문"과
 * 코드의 반복을 제어하는 "반복문"이 있다.
 * 
 * 조건문(if,switch)
 * 조건문이란 어떠한 조건식 혹은 코드의 실행여부를 결정시키는 조건이 있고
 * 그 조건식이 true가 나오면 코드 블락을 실행시킨다.
 * 만약 조건식이 false가 나오면 해당 코드 블락은 실행되지 않는다.
 * 조건문에는 크게 if 조건문, switch 조건문 2가지가 있다.
 * 
 * 코드 블락이란 한개의 중괄호 안의 모든 코드들을 한 개의 코드블락이라고 한다.
 * 코드 블락 안에는 다른 코드 블락이 들어올 수도 있다.
 * 코드 블락은 제어문의 실행 여부 , 반복 여부에 따라 실행될 코드가 코드 블락에 있냐 없냐로
 * 결정이 되기 때문이다.
 * 또한 변수의 유효범위도 코드 블락과 밀접한 연관이 있다.
 * 
 * 변수의 유효범위란 해당 변수가 어디서부터 어디까지 호출 가능한지를 결정하는 범위이다.
 * 만약 변수의 유효범위를 벗어나면 더 이상 그 변수는 존재하지 않는것이 되어서 호출할 수 없다.
 * 어떤 변수가 유효한 범위 안에서는 똑같은 이름의 변수는 선언할 수 없다.
 * 변수의 유효범위는 해당 변수가 선언 된 이후부터 그 변수가 속해있는 코드블락이 종료될때까지다.
 * 
 * 조건문 01 -if 문
 * if 문이란 true/false가 나오는 조건식이 있고, 그 조건식이 true가 나오면 if문에 속하는 
 * 코드 블락이 실행되는 구조다.
 * 
 * if문은 다음과 같은 구조르 ㄹ가진다.
 * if(조건식) {
 *    실행할 코드들
 * }
 * 
 */
public class Ex01If {
    public static void main(String[] args) {
        int number = 20;
        
        if(number < 5) {
            System.out.println("number는 5보다 작습니다.");
            String name = "조재영";
        }
        String name = "김철수";
        System.out.println(name);  //유효범위 밖에 없으면 똑같이 따로 만들어줘야함
        System.out.println("프로그램 종료");
        
        //코드를 한 줄만 쓰더라도 중괄호를 써서 명확하게 적어주자.
        
    }

}
