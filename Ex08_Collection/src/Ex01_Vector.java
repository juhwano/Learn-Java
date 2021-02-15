import java.util.Vector;

/*

Collection FrameWork
"다수의 데이터"를 다루는 "표준화된 인터페이스"를 구현하고 있는 "클래스 집합"
->자료구조 클래스들
자료구조  :자료를 저장할 수 있는 구조
다양한 자료들을 다양한 방식으로 관리


Collection 인터페이스  ->  List 인터페이스  -> ArrayList(구현 : 수많은 약속을)
                       ->  Set  인터페이스  -> HashSet, TreeSet(구현)

 
Map 인터페이스 (key, value)  -> HashMap(구현)

1. List(줄을 서시오: 번호표) : 순서 보장, 중복 허용 >> 내부적으로 데이터(자료, 객체)를 "배열"로 관리하겠다
예) [홍길동][홍길동][홍길동]

구현하고 있는 클래스
1.1 Vector(구버전)            ->동기화 보장(멀티 스레드 지원) -> Lock장치 보유 -> 성능 떨어짐 -> 안전성 보장
1.2 ArrayList(신버전)         ->동기화 보장하지않음(멀티 스레드 환경) -> Lock장치 없음 -> 필요에 따라 사용 가능 -> 성능 우선 -> 안전성 떨어짐
ex)
한강 화장실, 배아픈 사람1=스레드1
한명이 들어가서 문 잠금. 다른 애들 대기 상태로 대기
한 놈이 어떤 자원 점유 -> lock

*기존의 여러 개의 같은 타입의 데이터 관리 : Array 정적(고정)
-방의 개수가 한번 정해지면 (방의크기는 변경 불가)
int[] arr = new int[5];
arr[0] = 100;
problem: ...10개의 방이 필요해 ..[줄이거나 늘리는 방법 불가]

다시 만드는 수밖에
int[] arr2 = new int[10]
arr 자원을 arr2 이관

Array
1. 배열의 크기 고정 : Car[] cars = {new Car(), new Car()}; 방2개 만듬
2. 접근 방법(index) : 방 번호, cars[0] ... n번방까지 : length-1
3. 초기 설정 불가

<-> Collection
List > Vector , ArrayList
1. 배열의 크기를 동적으로 확장축소 -> 말도 안되는 이야기(?) >> **사실은 "배열의 재할당" 이용
2. 순서를 유지(내부적으로 index 배열) , 중복값 허용
3. 데이터 저장 공간 :Array
 */
public class Ex01_Vector {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Vector v = new Vector();
        System.out.println("초기 default 용량 : " + v.capacity());
        System.out.println("size : " +v.size());
        
        v.add("AA");
        v.add("AA");
        v.add("AA");
        
        System.out.println("데이터 크기 : size :" + v.size());
        System.out.println(v.toString()); //[AA,AA,AA] 재정의
                //Array : length
                //Collection : size
        for(int i=0;i<v.size();i++) {
            System.out.println(v.get(i)); //array[i] // 함수 get()
        }
        
        for(Object obj : v) {
            System.out.println(obj);
        }
        
        //제너릭 >> 타입을 강제 >> 추후 별도 학습
        Vector<String> v2 = new Vector<String>();

        v2.add("hello");
        v2.add("world");
        v2.add("king");
        for(String str : v2) {
            System.out.println(str);
        }
        //////////////////////////
        
        Vector v3 = new Vector();
        System.out.println(v3.capacity());
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        System.out.println(v3.capacity()); //20
        System.out.println(v3.size());
        
        
    }

}
