import java.io.*;

/*
파일과 폴더 다루는 클래스

JAVA : 파일 , 폴더를 하나의 클래스가 역할 : File
>> a.txt 파일 생성,삭제, 정보 read
>> Temp 폴더 생성, 삭제, 정보 read

c# : File 클래스, Directory 클래스

절대경로(드라이브 중심) : C:\\ , D:\\ 
-시작점 드라이브
ex) C:\\Temp\\a.txt

상대경로(파일 중심) : 
-현재 위치에 따라 폴더를 나가냐, 폴더를 들어가냐 달라짐
 ex) C:\\Test >> ../Temp/
*/
public class Ex07_File {
	
	public static void main(String[] args) {
//		경로 설정
		String path = "C:\\Temp\\file.txt";
//		String path = "Lotto.txt";  <-이거로 바꾸면 이해가 쉬움
//		File 클래스 사용 : file에 대한 다양한 정보
		File f = new File(path);
		
//		File명 - 전체 경로 중 마지막 file이름만 뽑아줌
		System.out.println("파일명 : " + f.getName());
//		File 경로
		System.out.println("전체 경로 : " + f.getPath());
//		File 절대경로
		System.out.println("절대 경로 : " + f.getAbsolutePath());
//		폴더?
		System.out.println("너 폴더니 : " + f.isDirectory());
//		파일?
		System.out.println("너 파일이니 : " + f.isFile());
//		파일크기
		System.out.println("파일 크기 : " + f.length() + " byte");
//		바로 상위(부모) 경로가 뭐니?
		System.out.println("부모 경로 : " + f.getParent());
//		파일/폴더 실제 존재 여부
		System.out.println("파일/폴더 실제 존재 여부 : " + f.exists());
		
//		게시판 파일 업로드 할 때 쓰인다. 
		
//		f.createNewFile()   파일생성
//		f.delete()  삭제
//		f.canRead();  //누가 작업하고 있으면 못 읽으니 읽어도 될까?? 묻는 것
	}

}
