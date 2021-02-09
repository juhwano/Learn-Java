package day0119;
/* 자바 콘솔화면에 출력하는 3가지 방법
 * 1. print()
 *    print()는 괄호 안의 내용을 출력하고, 그 다음 출력할 것이 있으면
 *    출력한 내용 바로 다음 칸부터 출력을 시작한다.
 *    
 * 2. println()
 *    print a line의 줄임말로
 *    println()은 괄호 안의 내용을 출력하고 그 다음 출력할 것이 있으면
 *    그 다음줄 첫번째 칸부터 출력을 시작한다.   
 * 
 * 3. printf()
 *    print in format의 줄임말로
 *    괄호 안의 내용을 형식에 맞춰 출력하고 그 다음 출력할 것이 있으면
 *    printf()가 출력한 내용 바로 다음 칸부터 출력을 시작한다. 
 * 
 * 4. 공백문자
 *    공백문자란, \ + 알파벳으로 이루어진 "한개"의 문자이다.
 *    엔터키, 탭공백 등의 공백문자가 있으며, 엔터키는 \n(두 글자지만 한개의 실제론 엔터라는 한개의 문자), 
 *    탭공백은 \t 등으로 표시한다.
 *    *엔터키 위쪽 \(백슬러쉬,역슬러쉬)
 */
public class Ex11Print {
	public static void main(String[] args) {
        //String str1 = "abc";
        //String str2 = "DEF";
		//앞으로 String은 위 코드 표현 말고 아래의 정석적인 표현으로 만들자.
		String str1 = new String("abc");
		String str2 = new String("DEF");
		
		//1. print ()
		System.out.print(str1);
		System.out.print(str2);
		//abc 출력하고나서 그 다음 출력할 게 있으면 다음칸으로 보내버림. 결국 한줄출력이 된다.
		
		
		//2. println()
		System.out.println(str1);
		//abc가 출력됨.
		System.out.println(str2);
		//DEF는 그 다음줄 맨 앞부터 출력
		
		//3. printf()
		System.out.printf(str1);
		System.out.printf(str2);
		
		//4. 공백문자
		System.out.println();
		//줄이 강제로 바뀜
		System.out.print(str1+'\n');
		System.out.print(str2+'\t'+str2);
		System.out.print(str2+"\t"+str2);
		//상관 없다.
		//왜 쌍따옴표냐?
		//char c = 'ab'; 
		//에러난다.
		//' '는 한번에 한글자만 다룬다. 두 글자는 에러남
		//엔터키라는 하나의 문자가 된다. 탭공백도 하나의 문자로 취급
		//쌍따옴표, 따옴표 상관없다.
		
		
		
	}

}
