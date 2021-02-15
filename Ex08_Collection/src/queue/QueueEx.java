package queue;

import java.util.LinkedList;

import java.util.Queue;
/*
 * 큐(queue)

​
리스트의 한쪽 끝에서만 삽입과 삭제가 일어나는 스택과는 달리 리스트의 한쪽 끝에서는 원소들이 삭제되고 반대쪽 끝에서는 원소들의 삽입만 가능하게 만든 순서화된 리스트. 가장 먼저 리스트에 삽입된 원소가 가장 먼저 삭제되므로 선입 선출(先入先出)인 FIFO(first in first out) 리스트라고 한다.

​큐 예제

​

코드 설명)

메세지 큐를 구현한다.

먼저 넣은 메세지가 반대쪽으로 먼저 나오기 때문에 넣은 순서대로 메세지가 처리된다. 
 * 
 * 
 * 
//홍길동, 홍길서, 홍길남 순서로 메세지를 보냄

-> 홍길동, 홍길서, 홍길남 순서로 메세지 받음... 

​

​

실생활에서 큐의 예)

- 버스정류장에서 사람들이 줄을 선대로 버스에 탄다.

- 음식점에서 주문한 순서대로 음식을 받는다. 
*/

public class QueueEx {

    public static void main(String[] args) {

        Queue<Message> messageQueue = new LinkedList<Message>();

// 메세지를 보낸다.

// 홍길동, 홍길서, 홍길남에게 순서대로 보낸다.

        messageQueue.offer(new Message("sendMail", "홍길동"));

        messageQueue.offer(new Message("sendSMS", "홍길서"));

        messageQueue.offer(new Message("sendKakaotalk", "홍길남"));

        while (!messageQueue.isEmpty()) {

            Message message = messageQueue.poll();

            switch (message.command) {

            case "sendMail":

                System.out.println(message.to + "님에게 메일을 보냅니다.");

                break;

            case "sendSMS":

                System.out.println(message.to + "님에게 SMS을 보냅니다.");

                break;

            case "sendKakaotalk":

                System.out.println(message.to + "님에게 카톡을 보냅니다.");

                break;

            }

        }

    }

}
