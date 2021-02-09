package day0118;
//‘사람’을 예로 들면 누구든지 "이름" = "홍길동", "생일" = "몇 월 몇 일" 등으로 구분할 수 있다. 

//자바의 맵(Map)은 이러한 대응관계를 쉽게 표현할 수 있게 해 주는 자료형이다. 

//이것은 요즘 나오는 대부분의 언어들도 갖고 있는 자료형으로 Associative array, Hash라고도 불린다.
//
//맵(Map)은 사전(dictionary)과 비슷하다. 
//즉, people 이란 단어에 "사람", baseball 이라는 단어에 "야구"라는 뜻이 부합되듯이 Map은 Key와 Value라는 것을 한 쌍으로 갖는 자료형이다.
//
//key	    value
//people	사람
//baseball	야구

//Map은 리스트나 배열처럼 순차적으로(sequential) 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다. 
//맵(Map)의 가장 큰 특징이라면 key로 value를 얻어낸다는 점이다. 
//baseball이란 단어의 뜻을 찾기 위해서 사전의 내용을 순차적으로 모두 검색하는 것이 아니라 baseball이라는 단어가 있는 곳만을 펼쳐보는 것이다.


//LinkedHashMap과 TreeMap
//
//Map의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져오는데 있다. 하지만 가끔은 Map에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고 때로는 입력된 key에 의해 소트된 데이터를 가져오고 싶을 수도 있을 것이다. 이런경우에는 LinkedHashMap과 TreeMap을 사용하는 것이 유리하다.
//
//LinkedHashMap은 입력된 순서대로 데이터가 출력되는 특징을 가지고 있다.
//TreeMap은 입력된 key의 소트순으로 데이터가 출력되는 특징을 가지고 있다.


import java.util.HashMap;
public class Ex13Map {
	public static void main(String[] args) {
	//1.put
	//자바의 맵(Map)중 가장 간단한 HashMap에 대해서 알아보자.
	//
	//Map 역시 List와 마찬가지로 인터페이스이다. Map 인터페이스를 구현한 Map자료형에는 HashMap, LinkedHashMap, TreeMap등이 있다. 
	//인터페이스에 대해서는 객체지향 챕터에서 자세하게 다룰 것이다.		
      HashMap<String, String> map = new HashMap<String, String>();
      map.put("people", "사람");
      map.put("baseball", "야구");
    //key와 value가 String 형태인 HashMap을 만들고 위에서 보았던 예제의 항목값들을 입력해 보았다. 
    //key와 value는 위 예제에서 보듯이 put메소드를 이용하여 입력한다.
    //※ HashMap 역시 제네릭스를 이용한다. 위의 HashMap 의 제네릭스는 Key, Value 모두 String 타입이다.
      
      
    //2.get
    //key에 해당되는 값을 얻기 위해서는 다음과 같이 한다.
    //
      System.out.println(map.get("people"));
    //위와같이 get 메소드를 이용하면 value값을 얻을 수 있다. 위 예제는 결과로 "사람"이라는 문자열을 출력할 것이다.
      
      
    //3.containsKey
    //containsKey 메소드는 맵(Map)에 해당 키(key)가 있는지를 조사하여 그 결과값을 리턴한다.
      System.out.println(map.containsKey("people"));
    //"people"이라는 키는 존재하므로 true가 출력될 것이다.
      
    //4.remove
    //remove 메소드는 맵(Map)의 항목을 삭제하는 메소드로 key값에 해당되는 아이템(key, value)을 삭제한 후 그 value 값을 리턴한다.
      
      System.out.println(map.remove("people"));
    //"people"에 해당되는 아이템(people:사람)이 삭제된 후 "사람"이 출력될 것이다.
      
      
    //5. size
    //size 메소드는 Map의 갯수를 리턴한다.
      System.out.println(map.size());
    //"people", "baseball" 두 값을 가지고 있다가 "people"항목이 삭제되었으므로 1이 출력될 것이다.
      
      
  }

}
