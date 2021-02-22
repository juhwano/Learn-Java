/*
면접 필수 질문 !!!!!!!!!!! 동기화(synchronization)
한강의 화장실을 짓는다

Collection (vector  , ArrayList )
벡터는 
동기화를 보장하느냐? 동기화를 보장하지 않느냐?
안정성 vs 성능


한강의 화장실(공유 자원) : 여러명의 사용자(Thread) 동시에 접근
화장실 1개 사람 10명(Thread) >> 동시에 사용

문제점 : LOCK 장치가 없다.
해결책 : LOCK 만들기 (함수 단위)
synchronized <- 동기화 보장(안전장치)

그러면 LOCK이 무조건 좋다?? NO

ArrayList는 동기화를 보장하지 않는다
Vector는 동기화를 보장한다.

비빔밥 축제 : 동시에 먹는 것이 효율적 .. 자원을 보호할 필요 없다 .. LOCK이 필요 없다.



*/
//화장실을 만들어서 문을 만든다. 거기에 사람을 받는다.
class Wroom{
	synchronized void openDoor(String name) {
		System.out.println(name + "님 화장실 입장^^");
		for(int i = 0; i < 100; i++) {
			System.out.println(name + " 사용 " + i);
			if(i == 10) {
				System.out.println(name + "님 끙 ~~");
			}
		}
		System.out.println("시원하시죠 ^^!");
	}
}
class User extends Thread{
	Wroom wr; //화장실 주소를 알아야함.
	String who;  //누구인지 정체
	User(String name, Wroom w){
		this.who  = name;
		this.wr = w;
	}
	@Override
	public void run() {
		wr.openDoor(this.who);
	}
}

public class Ex10_Sync_Thread {
	public static void main(String[] args) {
		//이곳은 한강 고수부지입니다.
		//화장실on
		Wroom w = new Wroom();
		
	
		//사람들(Thread) on
		User kim = new User("김씨", w);
		User park = new User("박씨", w);
		User lee = new User("이씨", w);
		
		//배가 아파요
		kim.start();
		park.start();
		lee.start();
		
		//헉 문을 안 잠궈서 동시에 사용한다. 자원을 보호해야한다.
		
		
		
		
		
		
		
		
	}

}
