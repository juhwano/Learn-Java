//설계도가 여러 개일 때

class Tv{
	boolean power; //false
	int ch;
	
	void power() {
		this.power = !this.power; //토글링(전원)
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}

class Vcr{ //비디오 플레이어. Tv 없으면 못 봄
	boolean power; //비디오 플레이어는 전원을 가지고 있다.
	void power() { //전원을 끄고 킬 수있다.
		this.power = !this.power; 
	}
	void play() { //플레이 기능이 있다,/
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정지하기");
	}
	void rew() { //되감기
		
	}
	void ff() { //빨리감기
	
	}	
}
/*
Tv 설계도
Vcr 설계도

TvVcr 이라는 제품을 만들어달라!
1. class TvVcr extends Tv, Vcr >> 다중상속(x)
2. class Tv extends Vcr .... TvVcr extends Tv  >> 자원이름 충돌!!

[해결] 
>>class TvVct extends Tv  { Vcr vcr }
>>하나는 상속. 하나는 포함.

>>class TvVcr { Tv v; Vcr v;}

>> class TvVcr extends Tv { Vcr vcr }
>> class TvVcr extends Vcr { Tv tv }

Q. 언 놈을 상속? 
A. 메인기능을 상속하는 게 맞다.
*/

class TvVcr extends Tv {
	   Vcr vcr;
	   TvVcr() {
	      vcr = new Vcr();
	   }
	}

public class Ex03_Inherit {
	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println("전원 : "+ t.power);
		t.chUp();
		System.out.println("채널 :  "+ t.ch);
		
		//비디오
		t.vcr.power();
		System.out.println("비디오 전원 : " + t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		
		t.vcr.power();
		t.power();
		System.out.println("전원 : " + t.power);
		System.out.println("qleldh 전원 : " + t.vcr.power);
		
		
	}

}
