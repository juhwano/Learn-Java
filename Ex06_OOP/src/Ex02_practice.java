

abstract class Animal{
    abstract void cry();
}

class Cat extends Animal{

    @Override
    void cry() {
        System.out.println("냐옹냐옹!");
    }

        // TODO Auto-generated method stub
        
    }


class Dog extends Animal{

    @Override
    void cry() {
        System.out.println("멍멍!");
    }
    
}

public class Ex02_practice {

    public static void main(String[] args) {
        //Animal a = new Animal(); 추상 클래스는 인스턴스를 생성할 수 없음.
        Cat c = new Cat();
        Dog d = new Dog();
        
        c.cry();
        d.cry();

    }

}
