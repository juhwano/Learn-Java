
/*
현업(실무 개발 환경)
설계도 1개..? 설계도 매우 많다.(업무가 복잡하다.)
하나의 설계도로 해결 불가 >> 여러개의 설계도 나누어서 작업
쇼핑몰 > 회원, 배송, 주문, 상품 (각 설계도가 관련 있다.)

여러 개의 설계도를 어떤 기준으로 분류할까??
개발자들이 기준을 만듬


학자들이 정의   책
클래스와 클래스의 관계
1. is ~ a      //   은 ~이다. (부모를 뒤에) >> 상속
2. has ~ a     //   은 ~을 가지고 있다. >> 포함 

ex)
원   도형
원은 도형이다.(o)
원은 도형을 가지고 있다.(x)
>>원 extends 도형
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
원   점
원은 점이다.(x)
원은 점을 가지고 있다.(o)
>>class 원 { 점 }

has a > 과제로 했던 모니터 - 컴퓨터 관계
컴퓨터는 cpu를 가지고 있다. >> 클래스 안에 표현

나머지는 경험 ...
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
경찰   권총
경찰은 권총이다.(x)
경찰은 권총을 가지고 있다.(o)
has a인데 좀 다르다.
>>class 권총{}                  사물함에 있다.
>>class 경찰{}
    void 출동(권총){}           항상 권총을 지니고 있지 않다. 출동할 때 차고 나감.
    
    
ex)
원, 삼각형, 사각형 만드는 설계도를 작성하세요.
구체화된 것 > 추상화된 개념을 뽑자(도형)

삼각형은 도형이다
원은 도형이다
사각형은 도형이다.

도형 : 추상화 , 일반화 >> 공통자원  >> 그리다, 색상 
원 : 구체화, 특수화  >> 원만이 갖고 있는 특징 >> 반지름 , 한 점

점 : 좌표값 >> (x,y)
-원은 점을 가지고 있다.
-삼각형은 점을 가지고 있다.
-사각형은 점을 가지고 있다.

class Shape{ 그리다, 색상 } >> 상속관계 (부모)
class Point { x , y } >> 포함

원

*/

class Shape{
	String color="gold"; //생성자에서 초기화하는 게 맞다. 하지만 연습 default에서 초기화
	void draw() {
		System.out.println("그리다");
	}
}
class Point{
	int x;
	int y;
	Point(){
//		this.x = 1; //초기값 1 .점을 설정하지 않아도 기본값이 잡히고
//		this.y = 1;
		this(1,1);  //할당하는 부분이 위,아래 반복되니까 코드 모으기
	}
	Point(int x , int y){
		this.x = x;
		this.y = y;
	}
}

//원을 만드세요. (원의 정의는 한 점과 반지름을 가지고 있다.)
//1.원은 도형이다.
//2.원은 점을 가지고 있다.  (member field >> Point)
//3.원은 반지름을 가지고 있다. 특수성 (r)

//원의 반지름은 초기값 10을 가진다.
//원의 좌표는 초기값 (10,10) 가진다.

//기본(초기값)을 설정하지 않으면 반지름과 점의 값을 입력받을 수 있다.

//원의 방정식 (x-a)^2 + (y-b)^2 = r^2

class Circle extends Shape{
	Point point; //has a  포함관계
	int r; //원의 구체화,특수성
	
	Circle(){  //초기화를 통한 디폴트
//		this.r = 10;
//		this.point = new Point(10,15);
		this(10,new Point(10,15));  //x,y 좌표값
	}
	//초기화 x 사용자를 통한 초기화
	Circle(int r , Point point){
		this.r = r;
		this.point = point;
	}
	
}

//위 원만든 것을 참조 하셔서
//문제
//삼각형 클래스를 만드세요
//삼각형은 3개의 점과 그리고 그리다라는 기능을 가지고 있다
//위에서 만든  Shape  와 Point  제공 받아서 사용
//default 삼각형을 만들 수도 있고 3점을 받아서 그림을 그릴 수 있다
//class Triangle ...

//60점

//80점 (반복코드 제거)

//100점  (Point x;Point y;Point z;) >> Point[] pointarray
class Triangle extends Shape{
	Point x;
	Point y;
	Point z;
	
	Triangle() {
		//this.x = new Point(10,20);
		//this.y = new Point(30,40);
		//this.z = new Point(50,60);
		this(new Point(10,20),new Point(30,40),new Point(50,60));
	}
	
	Triangle(Point x, Point y , Point z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//구체화 , 특수화 
	//추가적인 기능 언제나 가능
	void trianglePoint() {
		System.out.printf("x : (%d,%d)\t",x.x,x.y);
		System.out.printf("y : (%d,%d)\t",y.x,y.y);
		System.out.printf("z : (%d,%d)\t",z.x,z.y);
		System.out.println();
	}
}

//100점 + 가산점  Triangle2  삼각형 클래스
class Triangle2 extends Shape{
	Point[] pointarray;
	
	Triangle2() {
		/*
		this.pointarray = new Point[3];
		pointarray[0] = new Point(10,20);
		pointarray[1] = new Point(30,40);
		pointarray[2] = new Point(50,60);
		this(this.pointarray);
		*/
		
		//int[] arr = new int[] {1,2,3}
		this(new Point[] {new Point(10,20) , new Point(30,40) , new Point(50,60)});
	}
	
	Triangle2(Point[] pointarray){
		this.pointarray = pointarray;
	}
	
	//기능
	void trianglePoint() {
		for(Point point : this.pointarray) {
			System.out.printf("point : (%d , %d)\t\n",point.x ,point.y);
		}
	}
}

public class Ex02_Inherit_Composition {
	public static void main(String[] args) {

		Circle circle = new Circle();
		System.out.println("반지름 : " + circle.r);
		System.out.println("부모자원 : " + circle.color);
		System.out.println("x 좌표 : " + circle.point.x);
		System.out.println("y 좌표 : " + circle.point.y);
		circle.draw();
		System.out.println("---------------------------");
		
		Circle circle2 = new Circle(20,new Point(10,20));
		System.out.println("반지름 : " + circle2.r);
		System.out.println("부모자원 : " + circle2.color);
		System.out.println("x 좌표 : " + circle2.point.x);
		System.out.println("y 좌표 : " + circle2.point.y);
		circle.draw();
		System.out.println("---------------------------");
		
		Triangle triangle = new Triangle();
		triangle.trianglePoint();
		triangle.draw();
		
		System.out.println("************************");
		Triangle triangle2 = new Triangle(new Point(1,2),new Point(3,4),new Point(5,6));
		triangle2.trianglePoint();
		triangle2.draw();
		
		System.out.println("*************************");
		Point[] pointarr = {new Point(11,21),new Point(31,41),new Point(51,61)};
		Triangle2 tri3 = new Triangle2(pointarr);
		tri3.trianglePoint();
		tri3.draw();
		
	}

}