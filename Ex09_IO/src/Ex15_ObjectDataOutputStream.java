import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.bit.UserInfo;

//java.io.FileOutputStream 으로 .txt 파일을 열어줌
//java.io.ObjectOutputStream으로 해당 파일에 직렬화 수행 (데이터 출력)

//외부의 파일을 하나 생성해서 Output Stream을 열고 해당 클래스를 통해 직렬화를 수행해 객체의 정보를 모두 파일로 출력해줍니다. 
//직렬화와 역직렬화의 사용법 자체는 아주 간단합니다. 생성된 파일을 열어보면 알 수 없는 요상한 내용이 써져있습니다. 

//생성자 : new ObjectOutputStream (FileOutputStream 인스턴스)
//직렬화 수행 : writeObject(직렬화할 인스턴스)


public class Ex15_ObjectDataOutputStream {

	public static void main(String[] args) {
		String filename="Userdata.txt"; //객체를 직렬화해서 write
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		ObjectOutputStream out=null;
		
		try {
			fos = new FileOutputStream(filename,true);//append
			bos = new BufferedOutputStream(fos);
			//직렬화 하고 싶으면
			out = new ObjectOutputStream(bos);
			
			//직렬화 대상(객체)
			UserInfo u1 = new UserInfo("홍길동", "super", 500); //완제품
			UserInfo u2 = new UserInfo("scott", "tiger", 50); //완제품
			
			//벽에 구멍을 만들고 보낼거예요 
			//직렬화 "Userdata.txt"
			out.writeObject(u1); //분해해서 Userdata.txt write
			out.writeObject(u2); //분해해서 Userdata.txt write
			
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}finally {
			try {
				 out.close();
				 bos.close();
				 fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		

	}

}



