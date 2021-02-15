package stack;

import java.util.Stack;

/*
스택(stack)

​

자료 구조의 하나로, 자료의 삽입과 삭제가 끝에서만 일어나는 선형 목록. 밑이 막힌 통을 세워 놓은 것으로 생각하면 된다. 자료의 삽입, 삭제가 일어나는 곳을 스택의 톱(top)이라고 하며 자료를 스택에 넣는 것을 푸시(push), 스택에서 자료를 꺼내는 것을 팝(pop)이라고 한다. 스택에서는 나중에 들어간 자료가 먼저 꺼내지는 후입 선출(LIFO) 방식을 사용한다. 스택은 주로 어떤 내용을 기억시켰다가 다시 신속히 이용하고자 할 때 사용되며, 컴퓨터 알고리듬에서 자주 쓰이는 중요한 자료 구조이다.

​스택 예제

​

코드 설명)

​

동전케이스를 스택 클래스로 구현한다.

동전케이스는 위에만 오픈되어있는 스택 구조를 가지고있다.

먼저 넣은 동전은 제일 밑에 깔리고 나중에 넣은 동전이 위에 쌓이기 때문에 스택에서 동전을 빼면 마지막에 넣은 동전이 먼저 나온다.

100원, 50원, 500원, 10원 순서로 넣음

-> 10원, 500원, 50원, 100원 순서로 다시 나온다. 

​

​

실생활에서 스택의 예) 

​

- 쌓아놓은 물건은 아래서부터 뺄수없다.

- 인터넷을 하다가 뒤로가기를 누르면 방문한 순서대로 뒤로 간다. 

- 한글문서를 작성하다가 되돌리기를 누르면 방금전에 수행한 동작을 원래대로 되돌린다.

​




*/
public class StackEx {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Stack<Coin> coinBox = new Stack<Coin>();

        // 동전케이스에 동전을 끼움

        // 100원, 50원, 500원, 10원 순서로 넣는다.

        coinBox.push(new Coin(100));

        coinBox.push(new Coin(50));

        coinBox.push(new Coin(500));

        coinBox.push(new Coin(10));

        while (!coinBox.isEmpty()) {

            Coin coin = coinBox.pop();

            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");

        }

    }

}
