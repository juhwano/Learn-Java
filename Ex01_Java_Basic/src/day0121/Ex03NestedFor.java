package day0121;

public class Ex03NestedFor {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 101; j <= 102; j++) {
				System.out.printf("i의 현재값: %d, j의 현재값: %d\n", i, j);
				// i가 한번 실행될때 j는 2번
				// 1. i= 1로 초기화
				// 2. 1<=3 true
				// 3. 안의 코드 모두 실행(j for 문)
				// 4. j가 101로 초기화
				// 5. 101<=102 true
				// 6. System.out.printf() 실행 첫번째줄 출력 i=1 j=101

				// 7. j++ j=102
				// 8. 102<=102 true
				// 9. System.out.printf() 실행 두번째줄 출력 i=1 j=102

				// 10. i=2

			}
		}
		
		
		
		int[] arr = {1,2,3,4,5};
		//초기값; 조건식; 증가감;
		for(int i = 0; i < 10 ; i++) {
			System.out.println(i);
		}
		
//		--개선된 for 문--
		// : 뒤 배열이름
		// : 앞에는 배열의 데이터타입
		//for문이 알아서 loop 돌면서 값을 알아서 던짐
		for(int i : arr) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
