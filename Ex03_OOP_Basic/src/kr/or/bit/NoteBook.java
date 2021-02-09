package kr.or.bit;

public class NoteBook {
    private String color;
    private int year;
    
//    직접할당을 막고 간접 할당
//    간접할당의 구현? >> 함수(특수목적) setter, getter
//    자동화 코드 (이점 ... 코드 생략)
    public void setYear(int y) { //setter
        if(y <= 0) {
            year = 1999;
        }else {
            year = y;
        }
    }
    
    public int getYear() { //getter
        return year;
    }
    
//    자동화(알트+쉬프트+s)

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
//    마우스를 가지고 있다.
//    여러 개의 속성과 기능
//    Mouse mouse;
    
    public void handle(Mouse m) { //Mouse 주소값을 받아서
        m.x = 100;
        m.y = 200;
    }
    
    public void noteBookInfo() {
        System.out.println("color : "+ color + " year : "+ year);
    }


}
