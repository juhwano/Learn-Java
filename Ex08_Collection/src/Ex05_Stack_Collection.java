

import java.util.Stack;

import kr.or.bit.MyStack;

public class Ex05_Stack_Collection {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack s = new Stack();   //JAVA API
        s.push("A");  //넣기
        s.push("B");
        System.out.println(s.pop());  //LIFO  빼기
        System.out.println(s.pop());
//      System.out.println(s.pop()); //데이터 없어서 터진다
        System.out.println(s.isEmpty());  //true

        System.out.println("ㅡㅡㅡㅡㅡ");
        
        //Queue queue = new LinkedList();
        
        MyStack my = new MyStack(5);
        System.out.println(my.isEmpty1());
        System.out.println(my.isFull1());
        my.push("A");
        my.push("B");
        my.push("C");
        my.push("D");
        my.push("E");
//      my.push("F");

        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
    }

}
