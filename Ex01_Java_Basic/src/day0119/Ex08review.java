package day0119;
//이름,나이,국어,영어,수학
//총점,평균,졸업여부에 해당하는
//변수를 각각 만들어주고
//해당 변수들을 올바른 값으로 초기화해서
//전부 다 출력하는 프로그램을 작성하시오
public class Ex08review {
	public static void main(String[] args) {
		final double NUMBER_OF_SUBJECT = 3.0;
		String name = "오주환";
		int age = 12;
		
		int korean = 80;
		int english = 79;
		int math = 79;
		
		int sum = korean + english + math;
		double average = sum / NUMBER_OF_SUBJECT;
		
		boolean isGraduated = true;
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		
		System.out.println("국어: "+korean);
		System.out.println("영어: "+english);
		System.out.println("수학: "+math);
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+average);
		
		System.out.println("졸업여부: "+isGraduated);
	}

}
