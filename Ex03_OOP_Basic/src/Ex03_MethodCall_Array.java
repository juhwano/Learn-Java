//접근자 다 default

class Human{
	String name;
}
class Test{ //같은 패키지 안 클래스 는 딱 한개뿐
	int add(int i  , int j) {
		return i + j;
	}
//	리턴타입이 배열이네. 배열은 객체다. 배열은 주소값을 가지고있다. 배열은 heap에 생성된다. 배열도 타입이다. Array타입
	int[] add2(int[] param) { //int[] 주소값을 리턴하겠다.      int[] 배열의 주소값을 받겟다.
//		return null; 최초개발할때 null로 채워서 줌
//		return new int[5]; //return new tv() 와 같다. 배열을 5개 만들고 주소값을 너에게 주겠다.
		int[] arr = new int[param.length]; //배열을 새로 생성하는데, param의 배열의크기와 같은 크기의 배열을 생성하겠다.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = param[i]+1;
		}
		return arr;
	}
	
	//배열을 생성하는 3가지 방법
	int[] ar = new int[10];
//	int[] ar = new int[10]; 크기가 10인 배열		
	int[] ar2 = new int[] {10,20,30};
//	int[] ar2 = new int[] {10,20,30}; 값이 주어진 배열+생성
	int[] ar3 = {10,20,30};
//	int[] ar3 = {10,20,30}; 값이 주어진 배열
	//>> 컴파일러가 new 생성
	
	
	
	
	int[] add3(int[] so, int[] so2) {
		int[] arr2 = new int[so.length];
		for(int i = 0; i< so.length; i++) {
			arr2[i] = so[i] + so2[i];
			
		}
		
		return arr2;
		
	}
//	add3 갖고 놀아봐라
//	메인함수 안에서 호출해서 갖고 놀아봐라.
		//test.add3
     }

public class Ex03_MethodCall_Array {
	public static void main(String[] args) {
		Test t = new Test();
		int result = t.add(10,10);
		System.out.println("result : "+ result);
		
		int[] array = {10,20,30};
		int[] resultArray = t.add2(array);
		for(int i : resultArray) {
			System.out.println("i : " + i);
		}
		
		int[] array2 = {9,14,1};
		int[] array3 = {7,13,8};
		int[] resultArray2 = t.add3(array2, array3);
		for(int i : resultArray2) {
			System.out.println("두개의 합 : " + i);
		}
		
		
		
	}
	


}
