/*

추상클래스
>> 미완성 클래스(완성되지 않은 설계도)
1. 완성된 코드 + 미완성 코드
2. 완성된 코드(함수 .. 실행블럭이 있는 함수 : void run() {} ) + 미완성 코드(함수.. 실행블럭이 없는 함수:void run();)
3. 완성된 클래스(new 가능) : 미완성 클래스(스스로 객체 생성 불가능)

정리
1. 추상클래스(미완성) : 스스로 객체 생성 불가( new 사용 불가)
2. 추상클래스 결국 ... 완성된 클래스로 만드는 것이 목적 [ 상속을 통해서 ... ]
3. 상속관계에서 미완성된 자원(abstract method)을 완성(구현)해라 >> 함수는 있으니까 안은 니가 재정의 (Override)해라. 안의 내용은 강제 x

설계자 입장에서
>>의도? 상속하면 반드시 재정의해라 >> 강제적 구현 (나는 너를 믿지 못하니까)
>>누군가에게 반드시 무엇을 하도록 강제하는 것!

*/

class Car {
    void run() {
    }
}

class Hcar extends Car {
    // Hcar입장에서 run()을 재정의해도 되고, 안해도 문제없다.
}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

abstract class AbClass { // abstract 클래스 안에 최소 1개의 추상자원을 만들겠다.
    // 완성된 코드
    int pos;

    void run() {
        ++pos;
    }

    // 미완성된 코드
    abstract void stop(); // { x } >> 추상함수 >> 반드시 재정의 사용
}

class Child extends AbClass {

    @Override
    void stop() { // 강제적 구현
        this.pos = 0; // this ->Child . 부모 pos 내가 0으로 만들고
        System.out.println("stop : " + this.pos);
    }
}

class Child2 extends AbClass {

    @Override
    void stop() { // 구현은 하는데, 재정의는 니가 혀~~
        // TODO Auto-generated method stub
        this.pos = -1;
        System.out.println("stop : " + this.pos);

    }

}

public class Ex01_abstract_class {

    public static void main(String[] args) {
        Child ch = new Child();
        ch.run();
        ch.run();
        System.out.println(ch.pos);
        ch.stop();
        System.out.println("----");

        Child2 ch2 = new Child2();
        ch2.run();
        ch2.run();
        System.out.println(ch2.pos);
        ch2.stop();
        System.out.println("----");

        /////////////////////////////////////
        // 다형성
        AbClass ab = ch;
        // 부모 타입의 참조변수는 자식타입 객체의 주소를 가질 수 있다.(다형성)
        // 기억이 안 나면 전자제품 함수를 떠올려라. 냉장고를 프로덕트를 받고 프로덕트는 부모
        // 단, 부모는 자기 타입의 자원만 볼 수 있다.

        ab.run(); // 자기 타입이라 할 수 있다.
        ab.stop(); // 재정의되있기 떄문에 부모타입으로 접근하더라도 실행을 못한다. 실행블럭이 없어서 추상함수 실행안됨
        // 결국 예외적으로 재정의(자식) 된 함수를 호출

    }

}
