import java.io.IOException;

import kr.or.bit.MyClass;

public class Ex04_ExClass {
	public static void main(String[] args) {
		try{
			MyClass my = new MyClass("C:\\Temp");
		} catch (NullPointerException | IOException e) { 
			//요약 문법이고 원래는 catch 2개 쓰고 (catch(NullPointerException e) , catch(IOException e)
			e.printStackTrace();
		} 
		
		
		
	}

}
