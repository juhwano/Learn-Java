import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
Stream 중간 매개체(데이터 통로) default : Byte

JAVA API
[추상 클래스]
InputStream , OutPutStream

입출력 [대상] 두개의 추상클래스 상속 재정의 사용해라

1. Memory : ByteArrayInputStream , ByteArrayOutputStream 
2. File : FileInputStream, FileOutputStream  >> 실제 가장 많이 사용
*/
public class Ex01_Stream {

    public static void main(String[] args) {
        //byte(-128~127) 정수값을 저장하는 데이터 타입
        //연속적으로 쭉 먹기위해 Byte배열을 사용
        //배열은 객체다.
        byte[] inSrc = {0,1,2,3,4,5,6,7,8};
        byte[] outSrc = null;  //현재 메모리를 가지고 있지 않다.(초기화x)
        
        //데이터를 read하거나 write하는 작업 ... 대상 : Memory(휘발성)
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;
        
        //빨대 생성 후 배열에 쏙 꽂음
        input = new ByteArrayInputStream(inSrc);  //inScr 배열(메모리) >> read하겠다.
        output = new ByteArrayOutputStream(); //write
        
        System.out.println("outSrc before : " + Arrays.toString(outSrc));   //toString >> 배열을 문자열로 리턴
        
        //공식같은 로직
        int data = 0;
        while( (data = input.read()) != -1) { //배열에 더 이상 read data 값이 없으면 -1 return ..
            System.out.println("data : " + data);
//            System.out.println(input.read()); //read() 함수는 내부적으로 next() 기능을 가지고 있다.
//            read한 데이터를 다른 메모리에 write >> output 필요
            output.write(data);
//            write 대상이 data가 아니라
//            ByteArrayOutputStream 자신의 통로에 data 가짐. 자기 자신에게 write
        }

        System.out.println(output.toByteArray()); //갖고있는 주소값 할당
        
        outSrc = output.toByteArray();
        
        System.out.println("outSrc after : " + Arrays.toString(outSrc));
                
        
    }

}