package day0127;

public class Ex01test1review {
	public static void main(String[] args) {
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0];  //max 변수 >> 79
		int min  = score[0]; //min  변수 >> 54
		
//		1번 문제
		for(int i = 1 ; i < score.length ; i++) {
			//System.out.println(score[i]);
			//if(score[i] > max) { max = score[i];}
			//if(score[i] < min) { min = score[i];}
			max = (score[i] > max ) ? score[i] : max;
			min = (score[i] < min  ) ? score[i] : min;
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);

				

//		2번 문제
		int[] number = new int[10];
		
		for(int i = 0 ; i < number.length ; i++) {
			number[i] = i+1;
		}
//		3번 문제
		int sum = 0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		
		for(int i = 0 ; i < jumsu.length ; i++) {
			 sum += jumsu[i];
			 if( i == jumsu.length-1) { //마지막 배열 요소와 같다면
				 average = sum / (float)jumsu.length;
			 }
		}	
		 System.out.println(average);
		 System.out.printf("총 과목수 : [%d] , 총점 : [%d] , 평균 : [%f]" , jumsu.length , sum, average);	    


}
}