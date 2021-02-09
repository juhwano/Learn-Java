package kr.or.bit;

//창문의 수를 가지고 있다
//속도를 가지고 있다

//2가지 속성을 캡슐화
//setter,getter를 만들겠지?

//속도는 -값이 오면 0으로 초기화한다.


//속도를 10씩 올리거나 감소하는 기능을 만들어보세요.
//속도가 마이너스 값을 가지면 0으로 초기화

public class Car {
    private int windows;
    private int speed;
    
    public int getWindows() {
        return windows;
    }
    public void setWindows(int windows) {
        this.windows = windows;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0; //객체 자신. Car의 speed. 앞에 없으면 파라미터의 speed
        }else {
            this.speed = speed;   
        }
        
    }
   
    public void speed_Up() {
       this.speed+=10;
    }
    public void speed_Down() {
        if(this.speed > 0) {
            speed -= 10;
        }else {
            this.speed = 0;
        }
    }
    public void car_Info() {
        System.out.printf("창문의 개수 : [%d] , 현재 속도 : [%d] \n",windows ,speed);
    }
    

}
