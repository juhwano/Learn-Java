package day0119;
/* Scanner 클래스
 * Scanner 클래스의 변수는
 * 자바의 각종 입력을 처리한다.
 * 우리는 그 중에서 키보드 입력 처리를 배워보자.
 * 
 *  단,Scanner 클래스는 자바에서 제공해주지만 기본 라이브러리에는 포함되지 않으므로,
 *  사용하기 위해서 반드시 클래스에 "수입"해와야 한다.
 *  수입 방법은 import java.util.Scanner 라고 적어주어야 한다.
 */
import java.util.Scanner;
public class Ex09Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* 스캐너 원리
		 * 버퍼메모리라는 곳이 있다. 이 곳을 읽어와
		 * int를 읽어와. byte를 읽어와.
		 * System.in이라고 적었으니 키보드입력을 임시로 저장한다.
		 * NextInt() 메소드를 입력하면 사용자로부터 키보드 입력을 받되, Int의 형태일때만 저장하라.
		 * 
		 * 사용자가 123을 입력 -> 버퍼메모리에 저장
		 * 처음에는 String "123"으로 읽어온다. Int의 형태인지 아닌지 체크 가능? 된다
		 * Int ? 숫자로만 이루어짐 ->  "123"은 Int로 변환 가능
		 * 
		 * 1.키보드의 입력값은 String으로 읽어옴
		 * 2.읽어온 String값이 내가 호출한 메소드의 패턴과 일치하는지 체크
		 * 3.일치하면 내가 원하는 데이터타입으로 변환
		 * 4.일치하지 않으면 ? 에러
		 * 
		 * 범위의 경우 : byte, int, long이냐~ 몇 자리인지 체크도 가능. String에 있는 기능(메소드 사용)
		 */
		
		//1. int를 입력 받을 때에는 Scanner 변수의 nextInt() 메소드를 실행하면 된다.
		System.out.println("숫자를 입력해주세요.");
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 숫자: "+number);
		
		//2. double을 입력 받을 때에는 Scanner 변수의 nextDouble() 메소드를 실행하면 된다.
		System.out.println("실수를 입력해주세요.");
	    double d = scanner.nextDouble();
		System.out.println("사용자가 입력한 실수: "+d);
		
		//3. String을 입력 받을 때에는 Scanner 변수의 nextLine() 메소드를 실행하면 된다.
		
		//단, nextInt(), nextDouble()등의 숫자를 입력받는 메소드는
		//버퍼메모리에 엔터키(=개행문자)를 남겨두고		
		//그 다음에 실행되는 nextLine() 메소드는 남겨진 엔터키를 보고
		//사용자가 입력을 종료시켰다.라고 착각하게 된다.
		//이 착각때문에 우리는 아무런 String 입력을 할 수 없게 된다.
		
		//따라서 버퍼메모리 안의 엔터키를 없애주기 위해
		//진짜 스트링 입력을 위한 nextLine() 전에
		//비워주는 nextLine()을 한번 실행시켜주어야 한다!!!!!
		
		
		System.out.println("이름을 입력해주세요: ");
		scanner.nextLine();
		//한번 미리 실행
	    String name = scanner.nextLine();
	    //이제는 입력 가능
		System.out.println("사용자가 입력한 이름: "+name);
		
		//왜 nextLine 입력이 안되나??
		//34를 입력하면 스캐너가
		//34를 int 34로 바꿔서 number에 넣을 수 있다. 
		//number에 34 들어가고나면 버퍼메모리 안에서는 무슨 일이 일어나냐?
		//엔터키가 남아있다.
		
		//12.34 엔터를 입력했어
		//(엔터)12,34(엔터) 버퍼메모리 안에 이게 있음.
		//앞의 공백 문자(엔터)는 저절로 없어짐.
		//12.34를 double 12.34로 바꿔서 넣는다.
		//여전히 엔터가 남아있다. 엔터도 하나의 문자이다. ASCII 테이블 보면 SPACE도 있고 엔터는 END OF TEXT 혹은 VERTICAL TAB이 잡힌다.
		//String name = nextLine()
		//앞 뒤로 붙어 있는 공백문자를 없애면 " "(아무것도 없는) String이 되어버림. 그거를 name에 넣어버림. 역사가 깊은 스캐너 버그
		
		//해결 방법
		//한번 nextLine()을 실행시켜서 엔터키 비워주고 name=nextLine();을 실행시키면 정상적으로 " "(엔터)가 된다. 
		
		
		
		
		
		
		scanner.close();
			
		}
		
	}
