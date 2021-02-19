import java.io.DataInputStream;
import java.io.FileInputStream;

//이거 쓰기 싫으면 100, 60, 80, 이렇게 규칙을 가진 문자열로 스플릿해서 배열에 집어넣고 연산

public class Ex14_DataInputStream {

	public static void main(String[] args) {
		int sum = 0;
		int score=0;
		
//		혼자는 못 쓰인다 !!!
		FileInputStream fis=null;
		DataInputStream dis=null;
		
		try {
			fis = new FileInputStream("score.txt");   //프로젝트 폴더 밑 스코어텍스를 리드할건데 보조로 데이터의 도움을 받을거다
			dis = new DataInputStream(fis);
			while(true) {
				score = dis.readInt();  //아까 쓸떄 writeInt()로 했으니 읽을 때 readInt()로 해야함
				System.out.println("score   int    데이터 : " + score);
				sum+=score;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
//			dis.readInt();  읽을 게 없으면 예외가 여기서 터짐 >> 출력창에 null
			System.out.println("sum 결과 : " + sum);
			
			
			
		}finally {
			try {
				dis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}
}
