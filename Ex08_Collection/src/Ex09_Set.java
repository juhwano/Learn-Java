import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set 인터페이스를 구현하는 클래스
Set : 원 안에 들어가세요 (순서 보장(x), 중복(x)) : 순서가 없고 중복을 허락하지 않는 데이터 집합 : Set

HashSet, TreeSet

책에서 xx 를 찾을때 맨 뒤의 index로 가서 맵핑된 페이지를 찾는다 -> 하나의 자료구조

*/
public class Ex09_Set {

	public static void main(String[] args) {
//		뒤의 제너릭 안 쓰면 하위 버젼 오류남
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(100);
		boolean bo2 = hs.add(55);
		System.out.println(bo2);  //true -> 자루 안에 55라는 값이 정상적으로 들어갔다.
		
		bo2 = hs.add(1);  //아까 1이 들어갔으니까 중복값은 안된다.  보장 : 중복값
		System.out.println(bo2);  //false -> 이미 1은 가지고있으니 못 들어감
		
//		배열 아님! key가 있고 랜덤하게 어느 주소에 저장되있다. 원 안의 랜덤위치에 있다고 생각하자
		System.out.println(hs.toString());
		
		hs.add(2);
		System.out.println(hs.toString());  //순서가 보장되지않는다. 배열이 아님! 자루자루자루자루
		
		HashSet<String> hs2 = new HashSet<String>();
//		대소문자 구분함
		hs2.add("b"); 
		hs2.add("A"); 
		hs2.add("F"); 
		hs2.add("c"); 
		hs2.add("Z"); 
		hs2.add("A"); 
		hs2.add("A"); 
		hs2.add("A");
		
//		중복값 x
		System.out.println(hs2.toString());
		
//		글에서 같은 단어를 뽑거나, 같은 단어를 제외할 수 있다.
		
//		수많은 데이터가 있는 객체를 가정해보자. 중복되지 않은 데이터를 뽑고싶다. set을 사용하자.
		String[] obj = {"A", "B", "C", "D", "D", "A"};
		HashSet<String> hs3 = new HashSet<String>();
		for(int i = 0; i < obj.length; i++) {
//			add만 걸면 돌면서 중복검사하고 알아서 넣음
			hs3.add(obj[i]);
		}
		
		System.out.println(hs3.toString());
		
//		Quiz
//		HashSet을 사용해서 1~45까지 난수 6개 넣으세요.
//		기존 방법
//		int[] lotto = new int[6];
//		for(int i = 0; i< 6; i++) {
//			lotto[i] = (int)(Math.random()*45 + 1);
//			for(int j = 0; j < i; j++) {   //j < i (채워진 개수 만큼 비교)
//				if(lotto[i] == lotto[j]) {
//					i--;    //point 같은 방의 값을 바꿔야한다.
//					break;
//				}
//			}
//		}
		
//		위 코드의 it문에서 같은 값이면 i--; 해서 for 문을 한번 더 돌게 햇는데 아래는 그 논리가 빠짐
		HashSet<Integer> lotto = new HashSet<Integer>();
		for(int i = 0; lotto.size() < 6; i++) {     //lotto.size() < 6 이  위 코드의 i--;와 같다.
			int num = (int)(Math.random()*45 + 1);
			lotto.add(num);
			System.out.println("i : " + i + " num : " + num);
		}
		System.out.println(lotto.toString());
		System.out.println("ㅡㅡㅡㅡㅡㅡ");
		System.out.println(lotto.size());

		System.out.println("ㅡㅡㅡㅡㅡㅡ");
		Set set2 = new HashSet(); //부모타입 set 인터페이스. >> 다형성 Set 인터페이스로 받는 연습
		while(set2.size() < 6) {
			int num = (int)(Math.random()*45 + 1);
			set2.add(num);
		}
		
		System.out.println("lotto : " + set2);
//		순서 보장 (x) 작은 값부터 나열 (x)
		System.out.println("ㅡㅡㅡㅡㅡㅡ");
		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFF");
		System.out.println(set3.toString());
		System.out.println("ㅡㅡㅡㅡㅡㅡ");
//		iterator로 출력
		Iterator<String> st = set3.iterator();
		while(st.hasNext()) {
			System.out.println(st.next());  //set은 배열이 아님!!!!! 그렇지만 순차적으로 데이터는 출력할 수 있다.순서x중복x 데이터출력 가능
		}
		
	}

}
