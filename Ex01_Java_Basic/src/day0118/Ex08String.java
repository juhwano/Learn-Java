package day0118;
/* String 이란?
 * String은 클래스로써
 * 여러개의 문자를 할당가능한 데이터타입이다.
 * 
 * String값은 " "안에 적힌 글자들이 값이 된다.
 * 우리가 코드상으로 만들어놓은 " "안의 값은
 * 힙 메모리 영역 안의 '스트링 풀'이라는 곳에 정의가 된다.
 * 
 * 문자열(String)이란 문장을 뜻한다. 예를 들어 다음과 같은 것들이 문자열이다.

 * "Happy Java"  
 * "a"  
 * "123"
 * 자바에서 문자열에 해당하는 자료형은 String 이다.

 * 즉 위 문자열을 자바에서 표현하려면 다음과 같이 사용해야 한다.

 * String a = "Happy Java";
 * String b = "a";
 * String c = "123";
 * 위의 예제는 다음과 같이 표현해도 된다. 

 * String a = new String("Happy Java");
 * String b = new String("a");
 * String c = new String("123");
 * new라는 키워드는 객체를 만들 때 사용한다.

 * "객체"에 대해서는 나중에 자세하게 알아볼 것이다. 
 * 앞으로도 "객체"라는 용어가 계속해서 나올텐데 그때까지는 "새로 생성된 자료형" 정도의 의미라고만 알고 있도록 하자.

 * 하지만 보통 문자열을 표현할 때는 가급적 첫번째 방식(literal 표기)을 사용하는 것이 좋다. 
 * 첫 번째 처럼 사용하면 가독성에 이점이 있고 컴파일 시 최적화에 도움을 주기 때문이다.
 * 
 * 이전에 살펴보았던 int, long, double, float, boolean, char 등을 자바는 primitive 자료형 이라고 부른다. 
 * 이런 primitive 자료형은 new 키워드로 생성할 수 없다.

 * primitive 자료형은 다음과 같이 리터럴(literal)로 값을 세팅할 수 있다. (※ 리터럴은 계산식 없이 소스코드에 표기하는 상수 값을 의미한다.)

 * boolean result = true;
 * char capitalC = 'C';
 * int i = 100000;
 * 여기서 잠깐, String 은 "Happy Java"와 같이 리터럴로 표기가 가능하지만 primitive 자료형은 아니다. 
 * (String은 리터럴 표현식을 사용할 수 있도록 자바에서 특별 대우 해 주는 자료형이다.)
 */ 
 
/* String 자료형에는 몇가지 유용한 메소드들이 있는데 자주사용되는 것만 몇가지 알아보도록 하자.

 * equals
 * equals는 두개의 문자열이 동일한 값을 가지고 있는지를 비교하여 결과값을 리턴한다.

 * 다음의 예를 보자.

 * String a = "hello";
 * String b = "java";
 * String c = "hello";
 * System.out.println(a.equals(b)); // false
 * System.out.println(a.equals(c)); // true
 
 * 문자열 a 와 문자열 b 는 "hello"와 "java"로 서로 같지 않다. 
 * 따라서 equals 메소드 호출 시 false 를 리턴한다. 
 * 문자열 a 와 문자열 c 는 "hello"와 "hello"로 서로 같다. 따라서 true 를 리턴한다.

 * 문자열의 값을 비교할때는 반드시 equals 를 사용해야 한다. == 연산자를 사용할 경우 다음과 같은 경우가 발생할 수 있다.

 * String a = "hello";
 * String b = new String("hello");
 
 * System.out.println(a.equals(b));
 * System.out.println(a==b);
 
 * 문자열 a와 b는 모두 "hello"로 같은 값이지만 equals 를 호출했을 때는 true 를 == 연산자를 이용했을 때는 false를 리턴한다. 
 * a와 b는 값은 같지만 서로 다른 객체이다. 
 * == 은 두개의 자료형이 동일한 객체인지를 판별할 때 사용하는 연산자이기 때문에 false를 리턴하게 되는 것이다.
 */

/* indexOf
 * indexOf는 문자열에서 특정 문자가 시작되는 인덱스를 리턴한다.

 * 다음과 같은 문자열을 보자.

 * String a = "Hello Java";
 * 위와 같은 a라는 문자열에서 "Java"라는 문자열이 시작되는 위치를 알고 싶은 경우에 indexOf를 다음과 같이 사용할 수 있다.

 * System.out.println(a.indexOf("Java"));
 * 결과값은 다음과 같을 것이다.
 * 6

 * "Hello Java" 라는 문자열에서 "Java"라는 문자열은 7번째 문자('J')부터 시작이다. 
 * 결과값이 6으로 나온 이유는 자바는 숫자를 0부터 세기 때문이다.
 */

/* replaceAll
 * replaceAll은 문자열 중 특정 문자를 다른 문자로 바꾸고 싶을 경우에 사용한다.

 * String a = "Hello Java";
 * System.out.println(a.replaceAll("Java", "World"));

 * 결과값은 다음과 같다.
 * Hello World
 * "Hello Java" 라는 문자열에서 "Java"라는 문자열이 "World"라는 문자열로 바뀌었다.
 */

/* substring
 * substring은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다.

 *다음의 예를 보자.

 * String a = "Hello Java";
 * System.out.println(a.substring(0, 4));
 * 결과값은 다음과 같다.
 * Hell
 * 위처럼 substring(시작위치, 끝위치)와 같이 사용하면 문자열의 시작위치에서 끝위치까지의 문자를 뽑아내게 된다. 
 
 * 단 끝위치는 포함이 안된다는 점에 주의하자. 이것은 다음과 같은 수학의 식과 비슷하다.
 * 시작위치 <= a < 끝위치
 */

/* toUpperCase
 * toUpperCase는 문자열을 모두 대문자로 변경하고자 할 때 사용한다. (모두 소문자로 변경할때는 toLowerCase를 사용하면 된다.)

 * String a = "Hello Java";
 * System.out.println(a.toUpperCase());

 * 결과값은 다음과 같다.
 * HELLO JAVA
 */

//String a = "happy java" 와 String a = new String("happy java")는 같은 값을 갖게 되지만 완전히 동일하지는 않다. 

//첫번째 방식은 literal String이라고 불리우는데 "happy java" 라는 문자열을 intern pool 이라는 곳에 저장하고 
//다음에 다시 동일한 문자열이 선언될때는 cache 된 문자열을 리턴한다. 

//두번째 방식은 항상 새로운 String 객체를 만든다. ↩
 
public class Ex08String {
	public static void main(String[] args) {
		//String 변수를 선언해보자
		String string = new String("abc");
		/*1줄로 써놨지만
		 * String string;
		 * string = new String("abc");
		 * 2줄의 코드를 합친 것
		 */
		
		//Stack공간 안에 String 공간이 잡힘(잡혔는데 값이 0x00FF 식으로 잡힘.) 
		//heap공간의 0x00FF로 가서 "abc"가 들어가있는 상태로 만들어주고, String 메소드들이 등록됨)
		
		//예시 : 카톡친구를 누르면 그 사람의 프로필이 뜸. 버튼을 누르면 프사가 뜸. 주소값만 알면 들어갈 수 있겠네	
		
        //String str = new String("My String");
        //String str2 = new String("Your String");
        //앞의 str값에 뒤 " "안의 My string을 넣어놈  
		
        //System.out.println("str : "+str);
        //System.out.println("str2: "+str2);
        //str을 출력하면 My string이 나옴
        
		//String str2 = "abc";
		//String이 적혀진 주소값가서 메모리가 string인 공간을 만들어줘
		//heap영역 안 어딘가에 String pool공간이 있다. 그 곳에 abc가 들어가있는 String 공간을 먼저 만들어줌(0x1111)
		//String string2 0x11FF가 stack에 만들어짐 근데 연결되는 값이 없다. 알 바x
		//그냥 변수여서 스트링 풀에 잇는 0x111로 초기화하면
		//0x11FF는 그냥 참조

		//모든 클래스변수는 이런 구조를 가지게 된다.
		//순서만 바뀌는 것
		
		/* String의 경우, 더하기 연산이 가능하다
		 * String에 더하기 연산을 하면
		 * 앞의 내용과 뒤의 내용을 모두 String으로 만들고
		 * 두 내용을 이어 붙여라 라는 뜻이 된다.
		 * 
		 * 예를 들어서
		 * String + "DEF" 를 하게 되면?
		 * String의 현재 해당 주소값에 저장된 "abc"라는 글자와
		 * "DEF"를 연결해서
		 * "abcDEF"라는 String을 만들라는 의미가 된다.
		 * 
		 * "number의 현재값: " + number의 경우
		 * number 변수 안에 저장된 값은 String, 즉 글자로 바꾸고
		 * "number의 현재값: " 뒤에 이어붙이라는 뜻이 된다.
		 */
		
	}
	}