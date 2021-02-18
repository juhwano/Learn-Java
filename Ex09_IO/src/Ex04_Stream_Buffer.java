import java.io.*;

/*
File 처리
가장 느린 작업 >> (Disk) 처리

원칙 : 한 Byte씩 read and write
해결법 : 모아 모아서 한번에 read , write (버스대절  >>  20명 타)
버스 : buffer
1. I/O 성능(횟수) 개선
2. Line 단위(엔터 기반) 처리 가능 . 한 묶음

보조 스트림 : BufferedInputStream (주 클래스 의존)
개발자들이 의무적으로 사용 >> 외우자


*/
public class Ex04_Stream_Buffer {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;  //보조스트림
		
		try {
			fos = new FileOutputStream("data.txt");
			bos = new BufferedOutputStream(fos);   //default 생성자 안 만듬 -> 의무적으로 만들게 하려고.. (주 스트림)
			
			for(int i = 0; i < 10; i++) {
				bos.write('A');
			}
			bos.flush(); //버퍼는 다 타야 출발하는데, 가즈아 해야하는 명령어가 필요. 그게 buffer다.
//			JAVA Buffer 크기 : 8kbyte : 8192byte
//			1. buffer 안에 내용이 채워지면 스스로 출발(비운다) : flush 후~
//			2. buffer 강제로 비우기(명시적으로 flush 호출) flush()
//			3. bos.close() 자원해제 >> 자동으로 flush()
			
			
		}catch (Exception e){
			
		}finally {
			try {
				bos.close();   //flsuh()동반 .. 클로즈를 해야 써진다.
				fos.close();
			}catch(Exception e2) {
				System.out.println(e2.getMessage());
			}
				
		}
		
		
		
		
		
		
	}

}
