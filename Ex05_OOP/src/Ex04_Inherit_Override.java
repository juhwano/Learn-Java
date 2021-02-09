/*
Today Point
상속관계에서 override 정의 (Overriding 올라타다)
>> 상속관계에서 자식이 부모의 함수를 "재정의"
>> "상속관계"에서 "자식 클래스"가 "부모 클래스"의 함수의 내용을 바꾼다. { } 안 재정의
>> 부모가 가지고 있는 메소드와 똑같은 모양의 메소드를 자식이 가지고 있는 것
>> 메소드를 재정의하는 것
>> 부모가 물려준 기능이 내가 필요는 하지만, 그대로 사용하기는 ... 그러면 메소드를 재정의해서 사용한다. 올라타있는 상태

재정의 : 틀(함수의 이름, 타입, parameter)의 변화는 없고, 내용만 변환
*/
class Point2{
	int x = 4; //한 점은 x,y좌표를 갖고 있다.
	int y = 5;
	
	String getPosition() {
		return this.x + " / " + this.y; //x,y좌표 간단히 출력
	}
	//3차원 점을 그리기
}
class Point3D extends Point2{
	int z = 6; //점 2개는 부모클래스에서.. 문제는 출력
	
//	String getPosition3() {
//		return null;
//	}
//	부모가 가진 것 재사용 . . . "재 정 의"
	
//	함수가 반드시 재정의함수였으면 하고 쓰는데, o을 하나 빼먹어도 문제(x) -> Point3D에 속하는 함수
//	Annotation은 Java code만으로 전달할 수 없는 부가적인 정보를 "컴파일러"나 "개발툴"로 전달할 수 있다.
//	@Override : 지금 이 함수가 재정의가 맞게 되었는지 확인해봐
	@Override
	String getPosition() {
		return this.x + " / " + this.y + " / " + this.z;
	}
	/*
	오버로딩
	하나의 이름(생성자)로 여러 가지 기능을 하는 것
	
	오버라이드
	상속관계에서 부모(상위 클래스)의 메소드를 재정의하는 것입니다.
	*/
}



public class Ex04_Inherit_Override {
	public static void main(String[] args) {
		Point3D point = new Point3D();
		String result = point.getPosition();
		System.out.println(result);
	}

}
