import kr.or.bit.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("부모 함수 Test2");
	}
}

class Test3 extends Test2 {
	int x = 300;  //c# 부모 무시하기. 쓰지말자
	
	@Override
	void print() {
		System.out.println("자식이 부모 함수를 재정의");
	}
	//Over loading
	void print(String str) {
		System.out.println("나 오버로딩이야" + str);
	}
	
	
}




public class Ex05_Inherit_Override {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		System.out.println(t3.x); //자식 것이 나옴.
		
		t3.print();
		t3.print("hello");
		
		
	
		/////////////////////////////////
		Emp emp = new Emp(1000, "홍길동");
		System.out.println(emp); //조작된 주소 : kr.or.bit.Emp@33e5ccce
		System.out.println(emp.toString()); //   kr.or.bit.Emp@33e5ccce  Object 부모거 자식이 쓸 수 있다.
//		emp 라고 출력하면 사실은 toString()이 뒤에 숨어있다.
//		toString()은 Object가 가지는 자원
//		[toString]
//		오브젝트가 가지는 투스트링을 재정의해서 멤버필드가 가지는 값을 재정의했다.
//		어떤 클래스에서 주소값이 안 나오고 hello가 찍힌다? 100% toString을 자기 마음에 맞게 재정의했다.라고 생각
		
		int[] arr = new int[] {1,2,3};
		System.out.println(arr); //arr의 toString
		
	}

}
