//은행 계좌를 하나 가지고 있다
//은행 계좌를 통해 입금 출금 할 수 있다

//친구 3명 똑같은 카드 3 복제
//동시에 출금 (같은 계좌)

//통장 1000
//ATM 기기 출금

//Sync 없으면 잔액이 - 난다.
//ATM이 전산망에 접근하는 순간에 다른 카드로도 돈을 뺸다. 1000 + 1000 ㅗㅜㅑ;
class Account {
	int balance = 1000; //잔액
	//누군가 한명이라도 먼저 withDraw 들어오면  작업이 끝날때까지 LOCK 걸어두기 
	synchronized void withDraw(int money) {
		System.out.println("고객 : " + Thread.currentThread().getName());
		System.out.println("현재잔액 : " + this.balance);
		
		if(this.balance >= money) {
			try {
				 Thread.sleep(1000); //인출 (사용자 인증 , 비번 ... 시간이 걸린다)
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			this.balance -= money;
		}
		System.out.println("인출금액 : " + money);
		System.out.println("인출 후 잔액 : " + this.balance);
	}
}

class Bank implements Runnable{
	Account acc = new Account();
	@Override
	public void run() {
		while(acc.balance > 0) {
			int money = ((int)(Math.random()*3) + 1) *100;
			acc.withDraw(money);
		}		
	}
	
}

public class Ex11_Sync_Thread {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread th = new Thread(bank,"park");
		Thread th2 = new Thread(bank,"kim");
		Thread th3 = new Thread(bank,"lee");
		
		th.start();
		th2.start();
		th3.start();
		
	}

}



