import java.io.FileReader;
import java.io.FileWriter;

/*
문자기반의 데이터 처리가 가능한 형태 (String 데이터 >> char[] 관리)
기본적으로 캐릭터로 관리한다.

한자1자 , 한글 1자 , 영문자 1자  >> 모두 2byte 처리하겠다.
Stream 이 안 붙어있으면 문자처리
Reader , Writer 
한글 문자권이라 다 이거 쓴다... 이미지 있는 파일 빼고
대상 : File..  >>  FileReader

*/
public class Ex05_Reader_Writer {
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");  //이 파일을 read할거다.
			fw = new FileWriter("copy_Stream.txt");   //파일을 생성하고 그 파일에 write까지
			
			int data = 0;
			while( (data = fr.read()) != -1 ) {   //-1이 아니면 계속 돌겠다.
//				System.out.println((char)data); //확인용
				
//				배포 파일(압축 : 엔터, 공백, 스페이스가 없는 파일)
//				\r, \n 둘다 개행문자(줄바꿈문자), 같이 써봐서 여러개를 조합하면 좋다
				if(data != '\n' && data != '\r' && data != '\t' && data != ' ') {
					fw.write(data);
				}
//				엔터 공백 스페이스가 있으면 write하지 말아라~
				
				
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fw.close();
				fr.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}

}
