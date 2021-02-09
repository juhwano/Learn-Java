/*
 * 함수의 parameter가 주소값일 수도 있지만 값일 수도 있다.
 * call by value
 * call by reference
 * 
 */
class Data{
	int i;
}

public class Ex13_Method_Call {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.i = 100;
		System.out.println("d.i : " + d.i);
		
		scall(d); //Data 타입을 갖는 "주소값"을 parameter로!
		
		System.out.println("after : d.i : " + d.i);
		
		//call by reference
		//서로 영향이 없는 건 값타입
		
		vcall(d.i); //vcall이 바라보는 애는 안 바뀐다. 주소가 아니니까
		System.out.println("d.i : " + d.i);

	}
	
	static void scall(Data sdata) {
		System.out.println("함수 : " + sdata.i);
		sdata.i = 111;
	}

	static void vcall(int x) { //주소가 아니라 값을 받는다.
		System.out.println("before x : " + x);
		x = 8888;
		System.out.println("after x : " + x);
		
		
	}
	
	
}