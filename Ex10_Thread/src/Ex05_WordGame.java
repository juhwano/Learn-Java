import javax.swing.JOptionPane;

//단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게 하고 싶어요
//hint) 공유자원

class WordInputProcess extends Thread{
	@Override
	public void run() {
		String dan="2";
		String inputdata = JOptionPane.showInputDialog(dan + "단 값을 입력");
		if(inputdata != null && !inputdata.equals("")) { //뭔가 하나라도 입력을 하면
			Ex05_WordGame.inputcheck=true; //값을 변경
			//System.out.println(Ex05_WordGame.inputcheck);
		}
		System.out.println("입력한 값은 : " + inputdata);
	}
}

class WordTimeOut extends Thread{
	@Override
	public void run() {
		for(int i = 10 ; i > 0 ; i--) {
			
			if(Ex05_WordGame.inputcheck)return; //run함수 빠져나가는 것은 stack 종료
			System.out.println("남은 시간 :" + i);
			try {
				Thread.sleep(1000);//대기실에서 1초간 쉬었다가 다시 일하기
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex05_WordGame {
	static boolean inputcheck =false; //공유
	public static void main(String[] args) {
		//공유자원
		
		WordInputProcess word = new WordInputProcess();
		WordTimeOut time = new WordTimeOut();
		
		word.start();
		time.start();
		
		try {
			  //join : 다르 스레드의 종료를 기다림(휴게실)
			  //       join 요청한 스레드가 종료되면 그때 동작 ...
			   word.join(); //main 에게 word 끝날때까지 기다려 줄래
			   time.join(); //main 에게 time 끝날때까지 기다려 줄래
			   
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("Main END");

	}

}
