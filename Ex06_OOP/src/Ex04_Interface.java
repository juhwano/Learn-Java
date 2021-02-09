//같은 패키지 내 같은 클래스 이름을 둘 수 없다.

interface Irepairable{  //내용이 없어도 된다! 묶어주는 역할만 해도 된다!
    
}
//게임에서 유닛을 만들엇고 기본 최대hp가 잇고
//그 유닛은 지상,공중유닛이 있고
//지상유닛은 탱크,마린,scv로 분류가 됐다.

//그리고 우리는 건물도 있다.
//그런데 어떤 문제가 있냐면 특정한 유닛이 다른 유닛을 치료할 수 있다.

//그러면 리페어에서 전자제품처럼 함수처리를 해주면 안될까? >> 종족이 늘어날 수 있다. >>평생 탱크 ,scv만 있으면 그래도 되지만;;
//리페어 하나로 원하는 유닛만 치료하길 원했다.

//근데 연관성이 없어서 막힘
//그러면 같은 부모를 만들어주자 > 인터페이스 

//리페어가 인터페이스를 받으면 마린은 못옴
//또 문제 발생

//Q.리페어가 인터페이스인데 수리할 수 있는 대상이 다르다.
//A. 들어오는 유닛의 부모타입은 instanceof로 판단

//또 다른 문제
//리페어가 인터페이스라 접근 x
//다운캐스팅해서 내려서 접근!



class Unit2{
    int hitpoint; //기본 hp
    final int MAX_HP;  //최대 hp
    //상수 보장해주는 메소드
    Unit2(int hp){
        this.MAX_HP = hp;
    }
}
//지상 유닛
class GroundUnit extends Unit2{ //유닛2를 상속하는 그라운드유닛

    GroundUnit(int hp) { //기본 디폴트가 없어서 생성자 초기화 코드를 생성
        super(hp);
    }  
    
}

//공중 유닛
class AirUnit extends Unit2{  //유닛2를 상속하는 에어유닛

    AirUnit(int hp) {
        super(hp);
    }
    
}

//건물
class CommandCenter implements Irepairable{  //인터페이스 ~할 수 있는! 이렇게 묶어줌
    
}
//탱크
class Tank2 extends GroundUnit implements Irepairable{

    Tank2() {
        super(200);  //입력값 말고 그냥 임의값을 넣어도 된다.
        this.hitpoint = this.MAX_HP; // 처음 시작할 때 hit포인트 채워줌. 맞으면 감소됨. maxhp만큼 충전시켜줄거임
    }

    @Override
    public String toString() {
        return "[Tank2]";
    }
}

class Marine2 extends GroundUnit{

    Marine2() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }

    @Override
    public String toString() {
        return "[Marine2]";
    }
    
    
}
//Scv 자원채취 (광물 , 치료 .. 에너지)
class  Scv extends GroundUnit implements Irepairable{
    Scv() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }

    @Override
    public String toString() {
        return "[Scv]";
    }
    
    //scv만의 구체화, 특수화된 기능
    //repair(수리하다)
    /*
    void repair(Tank2 tank) {
        if(tank.hitpoint != tank.MAX_HP) {
            System.out.println("파손...");
            tank.hitpoint += 5;
        }
    }
    void repair(Scv scv) {
        if(scv.hitpoint != scv.MAX_HP) {
            System.out.println("파손...");
            scv.hitpoint += 5;
        }
    }
    */
    
    /*
    Unit 종류가 30개 (Scv가 25개 치료 가능)
    Scv repair 해야하는 Unit 개수가 증가하면 함수의 개수도 같이 비례
    
    [Problem] : 하나의 함수가 Unit repair 할 수 있다면
    전자제품 할 때 상속관계에서 부모타입...다형성 사용.. 같은거 아니야?
    
    void repair(unit2 unit){} >> Marine2(x) , Scv(o) , Tank2(o)
    void repair(GroudUnit unit) >> Marine2(x) , Scv(o) , Tank2(o)
    
    +CommandCenter도 repair 대상 (유닛과 연관성이 없어요)
    
    
    [Solution] : 인터페이스는 연관 없는 클래스를 묶어준다. 내가 너희의 부모가 되겠다.
    
    인터페이스 Irepairable 부모로 해볼까? 
    
    유사성을 많이 찾아야한다.
      
      
    class Tank2 extends GroundUnit implements Irepairable{  
    class  Scv extends GroundUnit implements Irepairable{  
    class CommandCenter implements Irepairable{
    
    Irepairable는 Scv 부모타입이다.
    Irepairable는 Tank2 부모타입이다.
    Irepairable는 CommandCenter 부모타입이다.
    
    >>부모타입은 자식타입의 주소를 가질 수 있다. >> 전자제품 다이랑 유사함.
    */
    
    void repair(Irepairable repairunit) {
    /*
    repairunit parameter는      Irepairable 인터페이스를 구현하는 객체의 주소값이 올 수 있다.
    void repair(new Tank2())
    void repair(new CommandCenter())
    void repair(new Scv())
        
    Problem : 인터페이스(부모)도 자기 것만 봄. 자식의 프라이버시를 침해하지않아.
    repair 인터페이스는 자원이 아무것도 없다. repair는 hitpoint를 MAX_HP만큼 채워줘야하는데 부모거엔 비어있다.
    
        
    Problem2 :
    1) CommandCenter 와 Tank2 , Scv 수리 방법이 다르다.
    2) Irepairable repairunit은 수리할 자원을 가지고 있지 않다.(접근x)
       그럼 Irepairable repairunit 통해서 위 3가지 Unit2이 온다고 가정하고 분류해보자.
    
    CommandCenter와 Tank2 , Scv 구분점?      Unit2 인지 아닌지
    타입비교 (연산자 : insanceof )       >> https://cafe.naver.com/bit2021/141  //참조변수가 참조하는 인스턴스의 실제 타입을 체크하는데 사용
    */
        if(repairunit instanceof Unit2) { //나 Unit2 타입이에요  ex)Tank2, CC
            Unit2 unit = (Unit2)repairunit; //downCasting,  Unit2 : Tank2 , Marine
            //Tank2에서 부모타입인 Unit2 자원만 접근
            
            //부모타입의 주소를 자식이 가지려면 자식으로 캐스팅 해야 한다 ********
            if(unit.hitpoint != unit.MAX_HP) {
                unit.hitpoint = unit.MAX_HP;
            }
        }else { //부모 타입이 Unit2가 아니다.
            System.out.println("다른 충전 방식을 통해서 .. Unit2 타입이 아니에요");
        }
    }
    
}

public class Ex04_Interface {
    public static void main(String[] args) {
        Tank2 tank = new Tank2();
        Marine2 marine = new Marine2();
        Scv scv = new Scv();
        
        //전투
        tank.hitpoint -= 20;
        System.out.println("탱크 : " + tank.hitpoint);
        System.out.println("Scv 수리 요청");
        
        scv.repair(tank);
        System.out.println("탱크 수리 완료 : " + tank.hitpoint);
        
        scv.hitpoint -= 10;
        System.out.println("scv : " + scv.hitpoint);
        System.out.println("Scv 수리 요청");
        scv.repair(scv);
        System.out.println("scv 수리 완료 : " + scv.hitpoint);
        
        CommandCenter center = new CommandCenter();
        scv.repair(center);
        
//        scv.repair(marine);  컴파일조차 안된다. 잘 막은것
        
    }

}
