/*
String >> 클래스 >> new 통해서 사용 가능 >> ?? >> 일반적인 값 타입 처럼 사용하는 것 권장(컴파일러가 일부는 알아서)
String이 가지고 있는 수 많은 함수가 있다. 일상생활의정보들은 문자열이 많다 .. 조작하는 것이 필요(합치고 자르고 붙이고)
String이 가지는 다양한 함수 활용 // static 함수(new안해도) + 일반 함수(new를 해야 쓸 수 있음)
최소 15개 ~ 20개 함수 암기 >> 삶이 편해



*/
public class Ex05_String_Class {
	public static void main(String[] args) {
		String str = "";
		System.out.println(">" + str + "<");
		
//		String str2 = null; //스트링이 클래스(메모리는 heap에 가짐)
		//사용방법 : int , double 와 같이 사용
		
		String[] strarr = {"aaa", "bbb", "ccc"};
		for(String s : strarr) {
			System.out.println(s);
		}
		//////////////////////////////////////////
		String str2 = "홍길동";
		System.out.println(str2.length());
		System.out.println(str2.toString());  //toString() 재정의했다 >> 주소값 대신 문자값 나왔다.
		System.out.println(str2); //toString() 생략
		
		String str3 = new String("김유신");
		
		//1. String name = "가나다라마";
		//String 클래스의 내부적으로 저장되는 자료구조 char[] >> [가][나][다][라][마]
		//class Tring extends Object {char[] value ... toString() .. length()}
		
		String str4 = "AAA";
		String str5 = "AAA";
		System.out.println(str4);
		System.out.println(str5.toString());
		System.out.println(str4 == str5);
		//==연산자 : 값을 비교 str4 (주소값) , str5(주소값)
		//같은 주소
		//주소가 아니라 가지고 값을 비교(문자열)
		//String 비교 == 바보 .. why
		System.out.println(str4.equals(str5));
		
		
		String str6 = new String("BBB");
		String str7 = new String("BBB");
		System.out.println(str6 == str7); //위에건 true, 이건 false
		//String 만들 때 new 사용하면 강제적으로 메모리할당
		System.out.println(str6.equals(str7)); //************************
		//실제 메모리에 있는 주소값
		
		//*문자열 비교는 equals 사용 ...
		//스트링은 new로 만든 것과 아닌 것의 차이점
		
		//넌센스
		String s = "A";
		s += "B";
		s += "C";
		System.out.println(s);
		//동적배열이 아니라서 .. (캐릭터는 정적배열) .. 새로 계속 만듬
		
		s = "A"; // <-방은 또 안 만들고 재활용한다.
		
		//질문(성능)
		//String 1000개의 문자를 누적해라 ?
		//누적데이터는 아래 것을 쓴다.
		//StringBuilder
		//StringBuffer
		
	

		
		
		
	}

}
