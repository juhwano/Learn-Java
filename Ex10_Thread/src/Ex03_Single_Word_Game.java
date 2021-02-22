import javax.swing.JOptionPane;

/*

단어 맞추기 게임
구구단 게임

문제가 나오고 시간이 흘러 ... 일정 시간이 지나면 종료

JOptionPane = Scanner

*/
public class Ex03_Single_Word_Game {

	public static void main(String[] args) {
		
		String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
//		System.out.println(inputdata);
		timer();
		
	}
	static void timer() {
		for(int i = 10; i > 0; i--) {
			try {
				System.out.println("남은 시간 : " + i);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}
	
	
	
	
	
	
	

}
