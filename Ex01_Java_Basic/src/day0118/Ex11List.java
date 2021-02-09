package day0118;

//List
//
//리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을 많이 가지고 있다.
//
//배열은 크기가 정해져 있다. 예를 들어 배열의 크기를 10개로 정했다면 10개 이상의 값을 담을 수는 없다.
//
//박찬호 선수의 투구스피드를 저장해야 한다고 가정해 보자. 
//배열을 이용하여 투구수를 저장할 수 있을까? 1회에 투구수가 3개도 될 수 있고 100개도 될 수 있지 않은가? 
//프로그래밍 시 크기를 알 수 있는 상황도 있지만 명확한 크기를 알 수 없는 경우가 더 많다. 

//이렇게 동적으로 자료형의 갯수가 가변하는 상황이라면 List를 사용하는 것이 유리하다.
//
//List 자료형 중 가장 간단한 형태의 자료형인 ArrayList에 대해서 알아보자.
//
//List 자료형에는 ArrayList, LinkedList 등의 List 인터페이스를 구현한 자료형이 있다. 
//여기서 말하는 List 자료형은 인터페이스인데 인터페이스에 대해서는 뒤에서 자세히 다루도록 한다.

// 1. add
// 박찬호 선수가 총 3번의 투구를 138, 129, 142(km) 의 속도록 던졌다면 다음과 같이 코드를 작성할 수 있다.
//
// ArrayList pitches = new ArrayList();
// pitches.add("138");
// pitches.add("129");
// pitches.add("142");
// add 라는 메소드를 이용하여 투구 스피드를 저장했다.
//
// 만약 첫번째 위치에 "133"이라는 투구 스피드를 삽입하고 싶다면 아래와 같이 코딩하면 된다.
//
// pitches.add(0, "133");    // 첫번째 위치에 133 삽입.
// 만약 2번 째 위치에 133을 삽입 할 경우에는 다음과 같이 코딩하면 된다.
//
// pitches.add(1, "133");
// ※ 자바는 J2SE 5.0 버전 이후부터 ArrayList<String> pitches = new ArrayList<String>(); 이런식으로 객체를 포함하는 자료형도 
// 어떤 객체를 포함하는지에 대해서 명확하게 표현하는것을 권고하고 있다. 
// 이클립스에서 위와 같이 코딩하면 명확한 타입을 명시하라는 warning이 표시될 것이다. 
// 이 부분에 대한 자세한 내용은 다음 장인 제네릭스에서 자세하게 설명한다.

// 2. get
// 박찬호 선수의 2번째 투구 스피드를 알고 싶다면 다음과 같이 하면 된다.
//
// System.out.println(pitches.get(1));
// ArrayList의 get 메소드를 이용하면 특정 인덱스의 값을 추출할 수 있다.

// 3. size
// size 메소드는 ArrayList의 갯수를 리턴한다.
//
// System.out.println(pitches.size());
// 현재 pitches에 담긴 갯수에 해당되는 값이 출력될 것이다.

// 4. contains
// contains 메소드는 리스트 안에 항목값이 있는지를 판별하여 그 결과를 boolean으로 리턴한다.
//
// System.out.println(pitches.contains("142"));
// 142라는 값을 포함하고 있으므로 true가 출력될 것이다.

// 5. remove
// remove 메소드에는 2개의 방식이 있다. (이름은 같지만 입력파라미터가 다르다)
//
// (1) remove(객체)
// (2) remove(인덱스)

// (1)remove(객체)의 경우는 리스트에서 객체에 해당되는 항목을 삭제하고 삭제한 결과를 리턴한다.
// System.out.println(pitches.remove("129"));
// 수행결과는 다음과 같다.
//
// true
// "129"라는 항목이 성공적으로 삭제되고 true를 리턴한다.
//
// (2)remove(인덱스)의 경우는 해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴한다.
// System.out.println(pitches.remove(0));
// 수행결과는 다음과 같다.
//
// 138
// pitches의 첫번째 항목은 "138"이므로 "138"이 삭제된 후 "138"을 리턴했다.


import java.util.ArrayList;
public class Ex11List {
	public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        System.out.println(pitches.get(1));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("142"));

        System.out.println(pitches.remove("129"));
        System.out.println(pitches.size());
        System.out.println(pitches.remove(0));
    }
}
