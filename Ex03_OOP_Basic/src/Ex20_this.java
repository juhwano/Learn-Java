/*
원칙 : 생성자는 객체 생성시 1개만 호출 (Car c = new Car() or Car c = new Car(100))
예외 : this를 활용하면 여러 개의 생성자를 호출할 수 있다.



*/

//Q. 아래코드 중복이 보여요 . . .
//값을 할당하는 부분이 중복적으로 보임 > > 할당하는 부분을 1개로 표현?
//A. this

////원코드
//class Zcar{
//    String color;
//    String geartype;
//    int door;
//    
//    Zcar(){  //default constructor
//        this.color = "red";
//        this.geartype = "auto";
//        this.door = 2;
//    }
//    
//    Zcar(String color , String geartype, int door){
//        this.color = color;
//        this.geartype = geartype;
//        this.door = door;
//    }
//    
//    void print() {
//        System.out.println(this.door + "," + this.geartype + "," + this.door);
//    }
//    
//}


////할당 중복 제거한 코드
//class Zcar{
//    String color;
//    String geartype;
//    int door;
//    
//    Zcar(){ //생성자를 호출하는 this ...
//        this("red", "auto", 2);   //다시 자기자신을 호출^^ //parameter 3개 함수 호출
//        System.out.println("default constuctor");
//    }
//    
//    Zcar(String color , String geartype, int door){
//        this.color = color;
//        this.geartype = geartype;
//        this.door = door;
//        System.out.println("overloading constructor");
//    }
    
//    void print() {
//        System.out.println(this.color + "," + this.geartype + "," + this.door);
//    }
    
//}

class Zcar2{
    String color;
    String geartype;
    int door;
    //기본 레드 , 1 오토
    Zcar2(){
        this("red", 1);
        System.out.println("default constructor");
    }
    Zcar2(String color , int door){  //색상과 문을 바꿀 수 있다.
        this(color, door, "auto");
        System.out.println("overloading constructor param 2개");
    }
        
    Zcar2(String color , int door , String geartype){  //색상과 문, 기어타입을 바꿀 수 있다.
        this.color = color;
        this.door = door;
        this.geartype = geartype;
        System.out.println("overloading constructor param 3개");
    }
    
    void print() {
        System.out.println(this.color + "," + this.geartype + "," + this.door);
    }


}

public class Ex20_this {
    public static void main(String[] args) {
//        Zcar zcar = new Zcar();
//        zcar.print();
        
//        Zcar zcar = new Zcar("pink", "auto", 10);
//        Zcar2 zcar = new Zcar2();   //레드,1,오토
//        zcar.print();
        
        Zcar2 zcar2 = new Zcar2("gold", 2);
        zcar2.print();
        
//        Zcar2 zcar3 = new Zcar2("red", 10, "auto");
//        zcar3.print();
        
        
    }    
}

