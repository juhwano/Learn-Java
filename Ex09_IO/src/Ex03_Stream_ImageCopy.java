import java.io.*;

public class Ex03_Stream_ImageCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String orfile = "C:\\Temp\\1.jpg";
		String tarfile = "copy.jpg";
//		default 경로 : 프로젝트 폴더
//		C:\Users\ddffa\git\Learn-Java\Ex09_IO
		
		
		FileInputStream fs = null;
		FileOutputStream fo = null;
		
		try {
			fs = new FileInputStream(orfile);
			fo = new FileOutputStream(tarfile,false); //파일이 없으면 생성 + write
			
			int data = 0;
			
			while( (data = fs.read()) != -1) {
				fo.write(data);   //copy.jpg에서 byte값을 write
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fs.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
