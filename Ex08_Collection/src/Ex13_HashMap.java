import java.util.HashMap;
import java.util.Scanner;
/*
Map이 어떤 데이터를 다룰때 활용 가능한가?
Map을 이용하면 어떤 데이터를 검증하거나 활용할 수 있다.
*/
public class Ex13_HashMap {
	
	public static void main(String[] args) {
	
//		지역번호, 출석부, 우편번호, 회원가입
//		ex)회원가입
		HashMap loginMap = new HashMap();
		loginMap.put("kim", "kim1004");
		loginMap.put("scott", "tiger");
		loginMap.put("lee", "kim1004");
		
//		회원가입 완료(회원정보 갖고있음)
		
//		로그인
//		id(0) , pw(0)  >> 회원님 하이
//		id(0) , pw(x)  >> 입력횟수 초과하면 계정 막거나, 다시 입력 받거나 .. 여기선 재입력을 받자
		
//		id(x) , pw(0)  >> id가 틀리면 뒤에거 볼 필요 없어 
//		id(x) , pw(x) 
		
//		4가지 case지만 다 잡을 필요 x
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("ID , PW 입력해주세요");
			System.out.printf("ID : ");
			String id = sc.nextLine().trim().toLowerCase(); //양쪽 공백 제거 후 소문자로만 받기
			
			System.out.printf("PW : ");
			String pw = sc.nextLine().trim();  //양쪽 공백 제거
			
			if(!loginMap.containsKey(id)) {
//				id(x)
				System.out.println("ID가 맞지 않습니다 재입력");
			}else {
//				id(0)
				if(loginMap.get(id).equals(pw)) {
					System.out.println("회원님 하위^^");
					break;  //while 탈출
				}else {
					System.out.println("비번확인");
				}
				
				
		}
		
	}

}
}