import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/*
출력형식의 정의
prinf , String.fatmat
출력물에 대한 형식 정의(레포팅) >> txt >> 이쁘게
현업 : 레포팅 툴 >> 오즈 , 크리스탈 레포트 sw
PrintWriter 그림

출력을 dos창이 아닌 내가 원하는 file에 하겠다.
*/
public class Ex11_PrintWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			/*
			PrintWriter pw = new PrintWriter("C:\\Temp\\homework.txt");  //생성 기능도 포함되어있다.
			pw.println("********************************************");
			pw.println("***************HOMEWORK*********************");
			pw.println("********************************************");
			pw.printf("%3s : %5d  %5d  %5d  %5.1f", "아무개", 100, 90,50 , (float)((100+90+50)/3));  // casting해서 소수부분 가져가기
			pw.println();
			pw.close();
			
			
			line 단위로 기록되고 있다.
			line 단위로 기록하면 좋을거 같다.  read
			*/
			FileReader fr = new FileReader("C:\\Temp\\homework.txt");
			//한번에 버스 태워서 가겟다 -> 버퍼 만들어야겟구나
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			br.close();
			fr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
