import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
크게 보면 컬렉션과 맵 인터페이스로 나뉨

Map 인터페이스
Map (key, value) 쌍의 구조를 갖는 배열
ex) (02, 서울) (031, 경기)

key값을 던지면 거기에 맵핑되는 value값을 찾을 수 있다.
key : 중복(x)
value : 중복(o)
generic 지원  (key, value 타입을 강제 가능)

Map 인터페이스 구현
구버전 : HashTable 동기화  >> 동기화(lock 보장)
신버전 : HashMap(동기화 강제x) : 성능 고려


*/
public class Ex12_Map_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<K, V>
		HashMap map = new HashMap();
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		map.put("superman", "1004");
//		사용자 ID PW 관리
		System.out.println(map.containsKey("tiger")); //대소문자구분 false
//		중복 ID 검사
		System.out.println(map.containsKey("scott"));
		System.out.println(map.containsValue("1004"));
		System.out.println(map.containsValue("1007"));
		
//		point
//		key 제공하면 value 값을 알 수 있다. (비번 찾기?에 활용)
		System.out.println(map.get("superman")); //value return
		System.out.println(map.get("hong")); //해당 키에 해당하는 .. > null
		
		map.put("Tiger", "1007");   //key가 동일하다면 덮어쓰기 .. key 중복(x) value값을 overwrite
		
		System.out.println(map.get("Tiger"));
		System.out.println(map.size());    //key - value 묶어서 한 쌍
		
		
		Object value = map.remove("superman");  //key값이 사라질 때 value값 마지막으로 던져줌. 마지막 불꽃? key를 날리면 value도 날아감.혼자 존재하진 못해
		System.out.println("value : " + value);
		
		System.out.println(map.toString());
//		{scott=1004, Tiger=1007} 재정의
		
//		key들의 집합을 뽑아낸것  >> 규칙이 있다 >> 순서(x) >> 중복(x) -> Set 안에 add add add 하고 return한 것
//		왜 리턴값이 Set일까? Set객체를 만들고 거기에 집어넣는것
		Set set = map.keySet();  
		Iterator it = set.iterator(); //순차적인 출력이 가능하니까
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		왜 list계열? value는 중복이 있어. 원 안에 x. 그래서 콜렉션 안에 집어넣는것
		Collection clist = map.values();
		System.out.println(clist.toString());
		
		HashMap<String,List> room = new HashMap<String,List>();
//		그룹방,사람들, 채팅방관리
//		실제 활용 사례 맵+리스트
		
//		room.add("1", new ArrayList()); 룸 추가.. ArrayList가 사람들 관리

	}

}
