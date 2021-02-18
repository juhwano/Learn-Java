import java.io.*;

public class Ex06_Reader_Writer_Buffer {

	public static void main(String[] args) throws Exception {
		
//		Lotto에 파일을 기록하고 싶으면
		FileWriter fw = new FileWriter("Lotto.txt", true);  
		BufferedWriter bw = new BufferedWriter(fw);
		
//		예외처리 하라나오는데 안하고 메인함수 뒤에 변칙 throws Exception { ,tryCatch하기싫어서
		bw.write("로또");
		bw.newLine();
		bw.write("1,3,6,8,9");
		bw.newLine();
		bw.flush();
		
//		String은 파일 생성하거나 다루는 애들이 아님
		
		/*
		FileReader fr = null;  //null <- try, catch하려고
		BufferedReader br = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");  //2byte씩 하나씩..
			br = new BufferedReader(fr);   //보조스트림으로 한번에 태운다.
			
//			line(줄 단위) 처리가 가능하다
			String line ="";
			for(int i = 0; (line = br.readLine()) != null ; i++) {           //readLine 버퍼기때문에 한줄씩 읽는다.
//				System.out.println(line);
//				라인에 원하는 단어만 뽑는 기능 추가
				
//				indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며
//				만약 찾지 못했을 경우 "-1"을 반환합니다.
				
				if(line.indexOf(";") != -1) {   // ;이 있다면
					System.out.println(line);
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		*/
		
	
	}
}
