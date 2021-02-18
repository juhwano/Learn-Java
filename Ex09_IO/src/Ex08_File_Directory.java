import java.io.*;

public class Ex08_File_Directory {
	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);

//		C:\Users\ddffa\git\Learn-Java\Ex09_IO\bin>java Ex08_File_Directory hello world gogo
//		한 칸 띄울 때마다 x번째 방으로 입력값이 들어감

		if (args.length != 1) {
			System.out.println("사용법 : java 파일명 [디렉토리명]");
			System.exit(0); // <-프로그램 강제종료
		}
		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) { // 존재하지 않는 파일이거나 또는 디렉토리가 아니라면
			System.out.println("유효하지 않은 경로");
			System.exit(0);
		}
		
//		실제 존재하는 경로의 폴더라면 .. 같은 타입이 여러개 >> 배열로 받는다.
		File[] files = f.listFiles();
//		C:\\Temp >> 안에 파일도 있고 폴더도 있다.
//		Temp 안에 a.txt  , 참새 폴더가 있다. 각각의 파일 객체 2개가 있다.
//		listFile은 각각을 File클래스로 봐서, 배열로 받아서 집어넣는다.
//		files[0] >> a.txt
//		files[1] >> 참새폴더
		
//		cmd -> dir 치면 나오는 폴더 목록을 띄울 수 있다.
		for(int i = 0; i < files.length; i++) {
			String name = files[i].getName();   //getName은 파일 또는 폴더의 이름을 return
			System.out.println(files[i].isDirectory()? "[DIR]"+name : name);
		}
		
	}
}
