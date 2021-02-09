package day0119;
//이름 나이 국어 영어 수학
//총점 평균 졸업여부에 해당하는
//변수를 각각 만들고
//해당 변수들을 올바른 값으로 초기화해서
//전부 다 출력
public class Ex08ex {
	public static void main(String[] args) {
		//이름
		
		String name;
        name = new String("오주환");
        System.out.println("name :"+name);
        		
		int age = 32;
		
		int korean = 53;
		int english = 55;
		int math = 99;
		
		//총점
		int sum = 0;
		sum = korean + english + math;
		
		//평균
		double average = 0;
		
		
		
		//졸업여부
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("국어 : "+korean);
		System.out.println("영어 : "+english);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+sum);
			
		
		
		
		
		
		
	}

}
