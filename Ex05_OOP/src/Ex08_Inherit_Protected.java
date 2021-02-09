import kr.or.bit.Pclass;

/*
private ,          default , public , 상속관계에서 protected
다 막겟다 캡슐화, 같은 폴더, 다 푼다, 상속관계에서만 존재하는 접근자

protected : 박쥐(양면성) > 어떨때는 default , 어떨때는 public

>>상속이 없는 클래스 안에서 protected 접근자는 default와 같다. (같은 폴더 내에서 사용)
>>결국 상속관계에서만 의미를 가진다.

*/

class Dclass{
    public int i;
    private int p;
    int s; //default
    protected int k; //default (일반 클래스에서 사용할 이유 x)
    
}

class Child2 extends Pclass{
    void method() {
        this.k = 100; //상속관계 protected = public처럼 사용
        System.out.println(this.k);
    }
    
}

public class Ex08_Inherit_Protected {
    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.method();
//        멤버필드에 프로텍티드 를썼다. 상속관계에서 니가 나를 써줫음 좋겟다. 부모의 약간의 의지
        
        
        
        
        
        
        
    }
}
