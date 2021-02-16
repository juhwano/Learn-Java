import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
Collection FrameWork
표준화
[나열된 자원에 대해 순차적으로 접근해서 값을 리턴하는 표준] >> 인터페이스 설계

Iterator 인터페이스
>> hasNext(),  Next(),   remove() 추상함수
>> 구현  : ArrayList >> Iterator 구현

public Iterator iterator(){
    return new A implements Iterator
*/
public class Ex08_Collection_iterator {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		
//		출력(내 마음대로 쓴 것,논리 x)
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		표준화된 출력 방식(나열된 자원에 대해서) >> 너를 못 믿어! Iterator를 쓰자
		Iterator it = list.iterator(); 
//		ArrayList가 Collection 인터페이스가 가지고 있는 추상함수 구현
//		public Iterator iterator(); >> 구현
		while(it.hasNext()) {  //값 가지고 있니? 그 안의 코드 구현 x
			System.out.println(it.next());  //코드 가지고오기
		}
		
//		Wrapper class를 활용하면 정수 값타입을 갖는 ArrayList도 만들 수 있다.
		ArrayList<Integer> intlist = new ArrayList<>();
		intlist.add(10);
		intlist.add(11);
		intlist.add(12);
		
		Iterator<Integer> it2 = intlist.iterator();
		while(it2.hasNext()) {  //hasNext로~ 데이터 가지고 있니?물어보고 next로 끄집어내~
			System.out.println(it2.next());
		}
//		iterator는 -1부터 하나하나 hasNext로 검사하는 단 방향이다. for 문은 거꾸로 돌리면 되는데 iterator는 안됨
//		자바를 만든 사람이 다시 Listiterator 만듬 -> 양방향 가능, previous 추가
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		하나를 100% 이해하려고 잡고있으면 지구가 멸망할 때까지 잡고있어야함. 자바를 만든 사람도 모르는 게 있다.
//		println 을 알려면 static부터 공부해야함. 잠깐동안 스치듯이 이해하자. 지금은 넘어가도 나중에 이해된다. 암기를 해야하는 부분도 있다. 뒤에서 풀어진다.
		
//		Iterator 인터페이스
//		역방향 조회(조건 : 순방향 -> 역방향, 바로 역방향 검사는 안됨)
		
		ListIterator<Integer> it3 = intlist.listIterator();
		
//		순방향
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
//		역방향
		while(it3.hasPrevious()) {
			System.out.println(it3.previous());
		}
		
	}

}
