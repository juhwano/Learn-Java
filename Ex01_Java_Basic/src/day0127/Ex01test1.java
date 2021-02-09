package day0127;

//문제 [1]

/* (1) ->최솟값,최댓값 구하기(?)
 * 제어문, 조건문,반복문을 사용해서  max  라는 변수에 시험점수 최대값을
 * min  라는 변수에 시험점수 최소값을 담으세요
 * 출력결과 : max > 97 , min > 54 
 * 단 for 문을 한번만 사용하세요 (max , min 하나의  for문)
 * 
 * 
 */ 

/* (2)
 * int[] number = new int[10];
 * 10개의 방의 값을 1~10까지 값으로 초기화 해라
 */

/* (3) 
 *		 어느 학생의 기말고사 시험점수 (5과목)
 *				 int sum=0;
 *				 float average = 0f;
 *				 int[] jumsu = {100,55,90,60,78};
 *				 
 *				 1. 총과목의 수  ->배열의 수 구하기(?)
 *				 2. 과목의 합
 *				 3. 과목의 평균
 *				 단 2,3  문제는 하나의  for  으로 해결하세요
 */

public class Ex01test1 {
	public static void main(String[] args) {
		/* (1)
		 * 제어문, 조건문,반복문을 사용해서  
		 * max  라는 변수에 시험점수 최대값을
		 * min  라는 변수에 시험점수 최소값을 담으세요.
		 * 
		 * 출력결과 : max > 97 , min > 54 
		 * 단 for 문을 한번만 사용하세요 (max , min 하나의  for문)
		 */
		
		//수학과 학생들의 기말고사 시험점수(79, 88, 97, 54, 56, 95)
		
	    //크기가 6인 배열을 만들고 선언
		// int[] score = new int[];   ,   int[i] = i;
		int[] score = {79, 88, 97, 54, 56, 95}; 
		//최대값,최소값 초기 설정
		//int max; int min;  , max = score[i], min = score[i];
		int max = score[0]; 
		int min = score[0];
		for(int i = 0; i <score.length; i++) {
			if(max < score[i]) { //최대값 비교
				max = score[i]; //최대값 할당
			}
			if(min > score[i]) { //최소값 비교
				min = score[i]; //최소값 할당
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);

		System.out.println("--------------------------------------");
		
		/* (2)
		 * 10개의 방의 값을 1~10까지 값으로 초기화 해라
		 */
		
		//방 10개 만들기
		int[] number = new int[10];
		//1부터 10까지 차례대로 선언해주기
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		number[3] = 4;
		number[4] = 5;
		number[5] = 6;
		number[6] = 7;
		number[7] = 8;
		number[8] = 9;
		number[9] = 10;
		
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("--------------------------------------");
		
		
//		 (3) 어느 학생의 기말고사 시험점수 (5과목)
		 int sum= 0;
		 float average = 0f;
		 int[] jumsu = {100,55,90,60,78};
		 			 
//		 1. 총과목의 수 = 배열의수, 배열의 마지막 요소 출력하기.
		 System.out.println(jumsu.length); 
		 System.out.println(jumsu[jumsu.length - 1]);
//		 2. 과목의 합
		 for(int i = 0; i < jumsu.length; i++) {
			 sum += jumsu[i];
		 }
		 System.out.println("과목의 합 : " + sum + "점");
		 
//		 3. 과목의 평균
		 average = (float)sum / jumsu.length;
		 
		 System.out.println("과목의 평균 : " + average + "점");

		 
//		 단 2,3  문제는 하나의  for  으로 해결하세요
		 
		 
		 
	
		
		
		
		
}
}	


