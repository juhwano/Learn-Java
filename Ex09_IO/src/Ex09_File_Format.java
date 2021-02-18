import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_File_Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("C:\\Temp");
		File[] files = dir.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			File file = files[i];
			String name = file.getName(); //파일명, 폴더명
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH-mma-zzz");
			String attribute = "";  //숨김,읽기전용 >> 속성
			String size = "";
			if(files[i].isDirectory()){
				attribute = "<DIR>";
			}else { //다 파일
				size = file.length() + "byte";
				attribute = file.canRead() ? "R" : "";
				attribute += file.canWrite() ? "W" : "";
				attribute += file.isHidden() ? "H" : "";
				
			}
			
			System.out.printf("%s   %3s   %10s   %s  \n",
					          dt.format(new Date(file.lastModified())),
					          attribute,
					          size,
					          name
					);
		}
		

	}

}
