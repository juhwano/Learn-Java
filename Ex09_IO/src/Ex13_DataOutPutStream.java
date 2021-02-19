import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
보조 
DataOutputSream , DataInputStream

한 쌍으로 같이 돌아야한다. Output하면 Input도 같은 타입 .. 

장점 : JAVA 8가지 기본타입 형식으로 Write 또는 Read하고 싶다.
단, 지들끼리만 놀아야한다.
ex) txt 기록했는데 이걸 가져와서 합산하고 싶다? >> 규칙적인 방법을 사용해야 한다. 
>>801002265 못읽음 >>스플릿할 수 있는 기준(난 스페이스로 할거야 등등) >> 배열넣기 >> 정수 >> 연산

하지만 ..

얘를 사용하면 저렇게 안해도 됨!
단, 지들끼리만 사용해야한다.
*/
public class Ex13_DataOutPutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score = {100,60,55,94,23};
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("score.txt");
			dos = new DataOutputStream(fos);
			for(int i = 0; i < score.length; i++) {
				dos.writeInt(score[i]);  //텍스트가 아니라 배열의 값을 write할것, 단, 무조건 read는 DataInputStream
//				dos.writeUTF(null); 한글이든 영문이든 2 byte 또는 3 byte 기준으로 사용하는 것
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				dos.close();
				fos.close(); //나중에 연 거 먼저 닫으면 돼
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

}
