import java.io.*;

/*
대상 read , write (File)  >> 1.txt  , 메모.txt 같은 물리적 파일

>>FileInputStream(read)
>>FileoutputStream(write)

물리적 경로 필요
1. C드라이브에 Temp 폴더 생성

2. a라는 텍스트파일 생성 후 안에 "hello"입력 후 저장

이것만 알아도 먹고사는데 지장 없다.
*/
public class Ex02_Point_FileStream {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        FileInputStream fs = null;
        FileOutputStream fos = null;
        String path = "C:\\Temp\\a.txt";
//        자바API가 생성자에 throws 해놨음
        try {
            fs = new FileInputStream(path);   //빨대를 path에 꽂음
            fos = new FileOutputStream("C:\\Temp\\new.txt");  //출력할 대상 .. 계속 실행하면 덮어버림 ..
//            FileOutputStream
//            1. write하는 파일이 존재하지 않으면 >> 파일을 생성
//            new FileOutputStream("C:\\Temp\\new.txt" , false)
//            false = overwrite하라는 의미
            
//            Option : append >> true
//            fos = new FileOutputStream("C:\\Temp\\new.txt" , true); 라고 적으면 계속 실행하면 새로운 값을 추가한다.
//            ex) hellohellohellohellohello >> 5번 실행
            
            
            
//            공식같은 로직
            int data=0;
            while((data= fs.read()) != -1) {
                System.out.println("정수 : " + data);   //얘가 읽은건 아스키코드에 있는 10진수를 정수로 반환시켜 읽음. char 문자를 정수로 변환해서 읽음
//                문자값을 원하면? casting
                System.out.println("문자 : " + (char)data);  //영어가 아닌 한글 넣으면 꽊꼬ㅒ꼬ㅒㄲ까쩌쨰ㅃ 나온다!
                
//                new.txt 파일에 read한 data 값을 write하겠다.
//                write파일은 write 대상파일이 없으면 파일 생성도 한다. (생성 기능)
                fos.write(data);
            }
            
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
//        	정상 , 비정상 코드 수행 (강제적 실행) : return 있어도 실행
//        	자원해제
//        	명시적인 자원 해제(객체) >> gabage collector가 관리
//        	관리하지 못하는 자원 >> 네트워크 관련(I/O , Network ... 자원 개발자가 명시적으로 직접 자원 해제)
//        	ex) 엑셀파일 작업 중 다른 곳에서 실행하면 ..? 읽기 전용 .. 수정 없어요 ..
//        	생성자 <-> 소멸자 호출
        	try {
				fs.close();
				fos.close();
				
//				혼자 하면 문제(x) 멀티쓰레드로 가면 문제(o)
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	
        }
        
        
    }

}
