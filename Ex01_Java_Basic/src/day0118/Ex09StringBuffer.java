package day0118;

//Stringbuffer란?
//문자열을 추가하거나 변경 할 때 주로 사용하는 자료형이다.


public class Ex09StringBuffer {
	public static void main(String [] args) {
//		StringBuffer는 다음과 같이 사용된다.
//		1.append
		 StringBuffer sb = new StringBuffer();
	        sb.append("hello");
	        sb.append(" ");
	        sb.append("jump to java");
	        System.out.println(sb.toString()); //String 자료형으로 변경
//	        StringBuffer 자료형은 append 라는 메소드를 이용하여 계속해서 문자열을 추가해 나갈 수 있다. 
//	        그리고 위 예제와 같이 toString() 메소드를 이용하면 String 자료형으로 변경할 수 있다.

//	        위 예제를 String 자료형만 가지고 표현하면 다음과 같이 작성할 수 있다.
	        String temp = "";
	        temp += "hello";
	        temp += " ";
	        temp += "jump to java";
	        System.out.println(temp);
	        
//	        두 개의 예제 모두 결과는 동일하지만 내부적으로 객체가 생성되고 메모리가 사용되는 과정은 다르다.
//	        첫번째 예제의 경우 StringBuffer 객체는 단 한번만 생성된다. 

//	        두번째 예제는 String 자료형에 + 연산이 있을 때마다 새로운 String 객체가 생성된다
//	        (문자열 간 + 연산이 있는 경우 자바는 자동으로 새로운 String 객체를 만들어 낸다). 
//	        두번째 예제에서는 총 4개의 String 자료형 객체가 만들어지게 된다.
	        
//	        ※ String 자료형은 한번 값이 생성되면 그 값을 변경할 수가 없다. 이렇게 값을 변경할 수 없는 것을 immutable 하다고 한다. 
//	        trim, toUpperCase 등의 메소드를 보면 문자열이 변경되는 것 처럼 생각 될 수도 있겠지만 해당 메소드 수행 시 또 다른 String 객체를 생성하여 리턴할 뿐이다. 
//	        StringBuffer 는 이와 반대로 값을 변경할 수 있다(mutable 하다). 즉 한번 생성된 값을 언제든지 수정할 수 있다.
//
//	        그렇다면 무조건 StringBuffer를 사용하는 것이 좋을까?
//
//	        그건 상황에 따라 다르다. StringBuffer 자료형은 String 자료형보다 무거운 편에 속한다. 
//	        new StringBuffer() 로 객체를 생성하는 것은 일반 String을 사용하는 것보다 메모리 사용량도 많고 속도도 느리다. 
//	        따라서 문자열 추가나 변경등의 작업이 많을 경우에는 StringBuffer를, 문자열 변경 작업이 거의 없는 경우에는 그냥 String을 사용하는 것이 유리하다.
//	        
//	     2.insert
//	        insert 메소드는 특정 위치에 원하는 문자열을 삽입할 수 있다.
//            StringBuffer sb = new StringBuffer();
//            sb.append("jump to java");
//            sb.insert(0, "hello ");
//            System.out.println(sb.toString());
//	        결과값은 다음과 같다.
//	        hello jump to java

//          위 예는 0 번째 위치에 "hello " 라는 문자열을 삽입하는 방법을 보여준다.
//	     3.substring
//	        substring 메소드는 String 자료형의 substring 메소드와 사용법이 동일하다.
//	                StringBuffer sb = new StringBuffer();
//	                sb.append("Hello jump to java");
//	                System.out.println(sb.substring(0, 4));
//	        결과값은 다음과 같다.
//	        Hell
//	        substring(시작위치, 끝위치)와 같이 사용하면 StringBuffer 객체의 시작위치에서 끝위치까지의 문자를 뽑아내게 된다.
	        
	        
	}

}
