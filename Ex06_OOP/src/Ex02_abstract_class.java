//게임 : Unit()

//Unit : 공통기능 >> (이동좌표 , 이동 , 멈춘다)  : 추상화, 일반화
//Unit : 이동방법은 다르다. (이동 방법은 Unit마다 별도의 구현이 필요하다)
//추상클래스


abstract class Unit{
    int x, y;
    
    void stop() {
        System.out.println("Unit stop");
    }
    
    abstract void move(int x, int y); //추상 자원 //너가 구현해! 강제 구현
        
}

//Tank
class Tank extends Unit{

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Tank 이동 :" + this.x + " , " + this.y);
        
    }
    
    //Tank 구체화,특수화
    void changeMode() {
        System.out.println("Tank 변환 모드");
    }
    
}

class Marine extends Unit{

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Marine 이동 :" + this.x + " , " + this.y);
        
    }
    
    //Marine 구체화,특수화
    void stimpack() {
        System.out.println("stimpack 활성화");
    }
    
}

class DropShip extends Unit{

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("DropShip 이동 :" + this.x + " , " + this.y);
        
    }
    
    void load() {
        System.out.println("Unit Load..");
    }
    
    void unload() {
        System.out.println("Unit Unload..");
    }
    
}




public class Ex02_abstract_class {

    public static void main(String[] args) {
        Tank t = new Tank();
        t.move(500, 200);
        t.stop();
        t.changeMode();
        
        Marine m = new Marine();
        m.move(500, 200);
        m.stop();
        m.stimpack();
        System.out.println("-----");
        //Q1. 탱크 3대를 만들고 [같은 좌표]로 이동시키세요. (555,444)
        //  >>같은 타입은 배열로 가자
        // 연속적으로 나오는 같은 타입
        //게임할떄 그룹 잡는것!! 한번에 클릭. 공통점
        Tank[] tanklist = {new Tank() , new Tank() , new Tank()};
           for(Tank tank : tanklist) {
               tank.move(555, 444);
           }
           System.out.println("---------");
        //Q2. 탱크 1, 마린 1, 드랍쉽 1 같은 좌표로 이동시키세요. (666,444)
        // 공통적인 특징은 다 부모가 유닛이다.
        // 전자제품의 카트랑 같은것!!!!
        // 부모타입이니까 자식 객체의 new tv, new 냉장고   
           
        Unit[] unitlist = {new Tank(), new Marine() , new DropShip()};
           for(Unit unit : unitlist) {
               unit.move(666, 444);
               //체인지모드는 자식거라 못 건드림
           }
        
        
        

    }

}
