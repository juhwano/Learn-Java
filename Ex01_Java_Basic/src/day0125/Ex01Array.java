package day0125;
/* 배열(Array)
 배열이란 지정된 크기만큼의 똑같은 데이터타입이 모여있는 하나의 자료형을
 배열이라고 한다.

 변수가 많아져 하나하나 선언하기 힘들 때 배열 사용
 
  배열은 다음과 같이 선언을 하게 된다.
  데이터타입[] 배열이름 = new 데이터타입[크기]
  자료형[] 변수 = {데이터1, 데이터2, 데이터3, ... };

  배열을 선언하는 방법
  1. 데이터들의 값을 알고 있을 때
  자료형[] 변수 = {데이터1,데이터2,데이터3 ..};

  2.값을 모르지만 향후 값을 저장하기 위한 배열을 생성할때
  new라는 연산자로 배열을 생성
  자료형[]변수 = new 자료형[배열 크기]; //좌항과 우항의 자료형 통일
  변수[0] = 데이터 값;
  변수[1] = 데이터 값;
  
  배열은 우리가 맨 처음에 지정한 크기만 다룰 수 있다.
  예를 들어 선언할 때 크기를 4라고하면
  총 4개의 데이터타입을 묶어서 다루게 된다.
*/

/* 또한 우리가 변수를 일일이 이름을 붙여서 다루는 것이 아니라
 * 배열의 "몇 번째" 라는 식으로 다루게 된다.
 */

/* 예를 들어 우리가 int 배열 intArray의 2번째에 값을 할당할 때에는
 * intArray[2] = 30; 요런 식으로
 * 값을 할당하거나
 * 값을 호출할 때에는
 * System.out.println(intArray[2]);
 * 이렇게 호출 가능하다.
 */

// 기본형 데이터타입의 배열은 모든 위치를 0으로 초기화한다.
// 참조형 데이터타입의 배열은 모든 위치를 null로 초기화한다.
// null이란 특수한 "상태"로써, 참조형 데이터타입이 메모리 주소값을 부여가 되었지만
// 해당 메모리 주소값을 참조해서 들어가면 아무것도 없는 상태를 null이라고 하고
// null인 상태에서는 새로운 값을 할당하는 것 외에는 아무것도 할 수 없다.

// 예시
// stack메모리값을 "참조"해서 heap실제 값으로 들어간다.
// 파고들어갔는데 아무것도 없다. 아예 빈 공간 null. 기능 실현 x . null point exceptiono(NPE) 발생
// 모델하우스 쇼핑백 호객행위 가구들도 빌트인 잘되잇고, 인천공항 쪽에 존재, 상주 직원들에게 세를 줘서 그 사람들이 월세 형식으로 세를 우리가 줌
// 얼추 3년 이내 원금 회수 혹햇는데 계약 못함. 여행갈 계획이 있었는데 위치 생각->구경 감. 소가 밭을 갈고있음. 
// 인터넷으로 tv 세탁기 냉장고 사서 배송시켯는데 전화옴 " 고객님 여기 밭밖에 없는데요."

/* 데이터 타입 만듬 stack 참조형 변수 0x00ff
 * 그 주소를 따라 heap 메모리로 감. -> 소 있다
 * string은 기본위치가 null로 초기화 
 * 배열같은 경우 (intArray 가정)
 * 가보면 1 14 21 9 (배열값 4)
 * -1번 칸에 30 넣어줘. 30번째칸에 50 넣어줘 x
 */
// " "와는 틀리다. <String 은 만들어졋고 빈 문자열이다.>

/* 또한 배열은 존재하지 않는 위치에 접근하려고 하면
 * ArrayIndexOutofBoundsException. 즉 잘못된 위치 접근 에러가 발생하게 된다.
 * 위치를 지정하는 "위치 번호"는 우리가 index라고 한다.
 * 배열의 인덱스는 0부터(해당 배열 크기 -1)까지다.
 * 
 * Q:그렇다면 크기가 5인 배열의 인덱스 범위는?
 * A: 0~4
 */

public class Ex01Array {
	public static void main(String[] args) {
		// int 타입의 배열 intArray
		int[] intArray = new int[5];
		// 배열의 각 인덱스를 접근할 때에는 
		// 변수를 써서 접근 가능하다.
		
		// 그렇다면 0부터 4번까지 차례대로 출력하고 싶다면
		// 무엇을 사용해야할까?
		
		// for 반복문을 사용하면 된다!
		for(int i = 0; i < 5; i++) {
			System.out.printf("intArray[%d]: %d\n", i, intArray[i]);
		}
		// 배열의 2번 인덱스에 45를 넣어보자
		intArray[2] = 45;
		// 배열의 2번 인덱스에 할당된 값을 출력해보자
		System.out.println(intArray[2]);
		
		String[] stringArray = new String[3]; //크기는 3
		// 배열의 지정된 크기를 호출할 때에는
		// 배열이름.length 로 호출가능하다.
		
		System.out.println("intArray 배열의 크기: "+intArray.length);
		System.out.println("stringArray 배열의 크기: "+stringArray.length);
		
		// 참조형 데이터타입의 배열인 stringArray의 값을 출력해보자.
		for(int i = 0; i < stringArray.length; i++) {
			System.out.printf("stringArray[%d]: %s\n", i, stringArray[i]);
		}
		/* 참조형 데이터타입의 배열만 초기화하면
		 * 각 인덱스에 있는 String은 null 상태가 된다.
		 * null 상태에서는 아무런 메소드도 실행할 수 없다.
		 */
		//System.out.println(stringArray[0].equals("abc"));
		//stringArray[0]은 null이었기 때문에 오류 메시지 발생
		
		//그렇다면 null은 어떻게 비교해야할까?
		//null은 "상태"이므로 비교연산자를 사용하여 비교해야한다.
		System.out.println(stringArray[0] == null);
		
		// 배열의 크기도 우리가 변수를 통해서 지정해줄 수 있다.
		int size = 4;
		int[] intArray2 = new int[size];
		System.out.println("intArray2의 크기: "+intArray2.length);
		
		
		
	}

}
