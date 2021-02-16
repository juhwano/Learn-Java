import java.util.HashSet;
import java.util.Iterator;

class Myclass{
	private int id;
	private String name;
	
	public Myclass() {}

	public Myclass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Myclass [id=" + id + ", name=" + name + "]";
	}	
	
	public void displayInfo() {
		System.out.println("학번 : " + this.id);
		System.out.println("이름 : " + this.name);
	}
	
}

public class Ex10_Set_Object {

	public static void main(String[] args) {
//		해쉬셋은 같은 타입 안된다 하셧자나용~ 근데 인티저가 아니라 상관 없다.
//		add는 주소가 add되는거라 다른 거라 보면 된다
		HashSet<Myclass> hset = new HashSet<Myclass>();
		hset.add(new Myclass(1, "Abc"));
		hset.add(new Myclass(2, "Def"));
		hset.add(new Myclass(3, "Asdf"));
		
		for(Myclass m : hset) {
			m.displayInfo();
		}
		
		Iterator<Myclass> itr = hset.iterator();
		while(itr.hasNext()) {
//			itr.next().displayInfo();
			Myclass mc = itr.next();
			mc.displayInfo();
		}

	}

}
