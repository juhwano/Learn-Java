class Human3 {
	String name;
	int age;
}

class Test2 {
	Human3 add(Human3 h) {
		h.name = "아무개";
		h.age = 200;
		return h;
//		return null;
	}

	Human3 add(Human3 h , Human3 h2) {
		h2.name = h.name;
		h2.age = h.age;
		return h2;
	}

}

public class Ex15_Method_Overloading {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		Human3 h = new Human3();
		t2.add(h);
		
		t2.add(new Human3(), new Human3());
		
		
		
		
		
		
		

	}

}
