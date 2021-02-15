package kr.or.bit;
//Stack 자료구조 설계
//저장 공간 : Array : Object[] sarray 모든값을 다 받아야하니..
//MyStack my = new MyStack(); //메인함수에서 이렇게 치면 배열이 생성되야함. 크기 설정 가능하게 해라
//위치를 가르키는 포인터가 필요
//하나 넣으면 다음 번지 가르키고 그 위치값 조정
//내가 어디에 있는지 파악하는 게 가장 중요하다.
//위치정보 : 저장되는 값이 있는 위치정보(position, index)
//기능 : push(Object), Object pop, boolean isEmpty, Full
//여러분만의 stack을 만들어보자
//hint 1. 저장공간부터 만들자
import java.util.ArrayList;
//아무것도 없다 = -1 로 준다.
public class MyStack {
    private Object[] stackarr; //저장 공간
    private int maxsize; //최대크기
    private int top; //배열의 index(위치정보)

    public MyStack(int maxsize){
        this.maxsize = maxsize;
        stackarr = new Object[maxsize];
        top = -1;
    }
    public boolean isEmpty1() {
        return (top == -1);  //true, false
    }
    public boolean isFull1() {
        return (top == maxsize -1);
    }
    public void push(Object i) {
        if(isFull1()) {
            System.out.println("stack full....");
            //고급스러운 사람 throw new 해버림
        }else {
            stackarr[++top] = i; //-1 >> 0
        }
    }
    public Object pop() {
        Object value = null;
        if(isEmpty1()) {
            System.out.println("stack empty");
//            throw new 예외객체
        }else {
            value = stackarr[top];
            top--;
        }
        return value;
        
    }
    
    
}
