package kr.or.bit;
/*
Quiz.생성자가 있는 설계도 만들기

책은 책이름을 가지고 있고 가격을 가지고 있다.
책이 출판되면 "반드시" 책이름과 책의 가격을 가지고 있어야 한다.

책의 이름과 가격 정보는 "특정 기능"을 통해서만 볼 수 있고, 출판된 이후 "수정할 수 없다."
책 이름과 가격정보는 각각 확인할 수 있다.
*/

public class Book{
    //캡슐화
    private String bname;
    private int price;
    //모든 멤버 필드는 프라이빗이다.
    //모든 멤버 필드는 this이다.
    
    //각각 >> getter를 만들어라. 쓰게하면 수정할 수 있기 떄문에 getter만
    public String getBname() {
        return bname;
    }
    public int getPrice() {
        return price;
    }
    //default생성자 (x) >> 강제 오버로딩
    //public Book(){} (x)
    public Book(String name, int money) {
        bname = name;
        price  = money;
    }
    public void bookInfo() {
        System.out.println("책이름 : " + bname +  " ,  " + price);
    }
    
    
    
}