package kr.or.bit;

public class Program {

    public static void main(String[] args) {
        Pclass pc = new Pclass();
        pc.k = 10;
        pc.p = 11; //같은 패키지면 의미 없다.
        
//      결국, protected는 상속에서만 써야된다.

    }

}
