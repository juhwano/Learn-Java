import java.util.ArrayList;

/*
Today Point
Generic jdk 1.5
c# , java  >> 필수 기능

Collection 클래스 >> 데이터 저장 공간 타입 >> 초창기 Object
1. Object 타입에 저항감 생김 >> 타입 문제 >> 처음 객체를 생성할때 Type을 강제하자 >> 이거를 제너릭이라 부름
2. 타입 안정성 (타입 강제성)
3. 강제 형변환(casting) :  Car c = (car)obj (x) 이런 식의 문법은 더 이상 No

클래스 설계 단계에서 제너릭을 적용해서 생성할 수 있다.
*/
class MyGen<T> { //type parameter
    T obj;
    
    void add(T obj) {
        this.obj = obj;
    }
    T get(){
        return this.obj;
    }
}

class Person extends Object{
    int age = 100;
}

public class Ex06_Generic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        MyGen<String> mygen = new MyGen<String>(); //T라는 자리를 String으로 전부 바뀜. String강제해서 heap영역에 올라감
        
        mygen.add("문자열");
        String str = mygen.get();
        System.out.println(str);
        
        ArrayList list = new ArrayList();
        //내부적인 저장 공간의 타입  :  Object[] elements
        list.add(10);
        list.add(new Person());
        list.add("홍길동");
        
        for(Object obj : list) {
            System.out.println(obj);  //출력이 되긴 하는데 원하는 형태가 아님.주소값이 아닌 값을 출력하고싶다.방 안에 있는 녀석들의 타입정보를 알아야함
        }
        
        for(Object obj : list) {
            if(obj instanceof Person) {  //Person타입이랑 동일한 타입이어야.. 타입을 그럼 1000개 이상 비교해야함??
                Person p = (Person)obj;
                System.out.println(p.age);
            }
        }
        
        //solution
        System.out.println("ㅡㅡㅡ");
        ArrayList<Person> plist = new ArrayList<Person>();
        plist.add(new Person());
        plist.add(new Person());
        
        for(Person p : plist) {
            System.out.println(p.age);
        }
        

    }

}
