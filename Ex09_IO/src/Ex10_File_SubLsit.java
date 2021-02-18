import java.io.*;
import java.util.*;

public class Ex10_File_SubLsit {
	static int TOTAL_FILES = 0;
	static int TOTAL_DIRS = 0;

	public static void main(String[] args) {
		if (args.length != 1) { // 하나는 입력해라. 1과 같지 않다면
			System.out.println("사용법 : java [실행할 파일명] [경로명]");
			System.out.println("예시 : java Ex10_File_SubList C:\\Temp");
			System.exit(0);
		}
		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) { // 존재하지않고 디렉토리가 아니라면
			System.out.println("유효하지 않은 경로");
			System.exit(0);
		}
		// 정상적인 경로 , 폴더 확정
		// 정보를 뽑아보자
		printFileList(f);
		System.out.println("누적 총 파일 수 : " + TOTAL_FILES);
		System.out.println("누적 총 폴더 수 : " + TOTAL_DIRS);
		

	}

	static void printFileList(File dir) {
		System.out.println("[Full path : ]" + dir.getAbsolutePath());

		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();
		// [0] >> a.txt
		// [1] >> 1.jpg
		// [2] >> 2021 폴더 >> 폴더인 경우 안으로 더 들어갈 것
		// [3] >> 2022 폴더

		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName(); // 폴더명 or 파일명
			if (files[i].isDirectory()) { // 2021 or 2022폴더라면
				fileName = "<DIR> [" + fileName + "]";
//				POINT
				subdir.add(i); 
//			  폴더일 경우 ..  
//				list[0] >> 2
//				list[1] >> 3
				

			} else {
				fileName = fileName + " / " + files[i].length() + "Byte";
			}
			System.out.println("    " + fileName);
		}

//		for문 끝
		int dirNum = subdir.size();   //폴더의 개수
		int fileNum = files.length - dirNum;  //파일 개수
		
//		함수가 종료해도 가지고 있고 싶다
//		static 변수
		TOTAL_DIRS += dirNum; // 총 누적(하위폴더 개수)
		TOTAL_FILES += fileNum;
		
		System.out.println("[Current dirNum] : " + dirNum);
		System.out.println("[Current fileNum] : " + fileNum);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
//		POINT ( 폴더 안의 폴더(하위폴더)) 정보도 보고 싶어요
		for(int j = 0; j < subdir.size(); j++) {
			int index = subdir.get(j);
			
			//index -> 2  배열의 0번째방을 가지고 가겠다.
			//printFileList(C:\\Temp\\2021)
			
			//index -> 3
			//printFileList(C:\\Temp\\2022)
			
			//재귀호출 >> 내가 나를 다시 부름
			printFileList(files[index]);  
		}
		
		
	}

}
