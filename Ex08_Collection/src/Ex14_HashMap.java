import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
HashMap<k,v>     - generic 지원

HashMap<String, String>
HashMap<Integer, String>
HashMap<String, Emp>
>> put("kim", new Emp());

*value값은 여러개의 값을 쓸 수 있다.*
project 시 hashMap 밥먹듯이 쓴다.

*/

class Student{
	int kor;
	int math;
	int eng;
	String name;
	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [kor=" + kor + ", math=" + math + ", eng=" + eng + ", name=" + name + "]";
	}
	
	
}
public class Ex14_HashMap {

	public static void main(String[] args) {
		
//		선생님 학생마다 ID 부여
		HashMap<String, Student> sts = new HashMap<String, Student>();
		sts.put("kim", new Student(100, 99, 88, "홍길동"));
		sts.put("hong", new Student(50, 40, 60, "김유신"));
		
//		반 20명 관리
//		value를 봐야하니 value는 Student타입
		Student std = sts.get("hong"); 
		System.out.println(std);
		
//		어떤 상황에 어떤 자료구조를 쓸 것인가?  >> 맵? 스택? 큐? 이게 중요하다
		
//		Tip 1.
//		Map <key , value>로 데이터 관리 .. 두 가지를 한번에 볼 수 있는 방법?
		Set set = sts.entrySet(); // key + "=" + value를 하나의 문자열로 만들어서 관리
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		왜 set타입으로 관리할까?
	    
//		hong=Student [kor=50, math=40, eng=60, name=김유신]
//		kim=Student [kor=100, math=99, eng=88, name=홍길동]
//		투스트링 오버라이드를 해놔서 주소값이 아닌 값이 출력
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
//		Tip 2.
//		분리된 key , value를 획득할 방법?? get으로 따로 따로 얻을 수 있다. 둘 다 Entry set인데 위는 동시, 이것은 따로
//		class Entry {Object key, Object value}
//		Map{Entry[] elements } >> Map.Entry 인터페이스
		for(Map.Entry m : sts.entrySet()) {
			System.out.println(m.getKey() + "/" + ((Student)m.getValue()).name);
		}
//		Map.Entry 타입으로 받으면 key , value를 분리해서 얻을 수 있다.
	}

}
