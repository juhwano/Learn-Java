package day0125;
/* Random 클래스
 * Random 클래스란 말 그대로 "랜덤"한 숫자를 생성해주는 클래스다.
 * 스캐너와 마찬가지로 외부 클래스이므로 import해주어야한다.
 */
import java.util.Random;
public class Ex03Random {
	public static void main(String[] args) {
		Random random = new Random();
		
		/* Random의 원리 :
		 * 0 ~ 1 사이의 수많은 실수가 랜덤 안에 있다.
		 * 또 그 실수들은 뒤죽박죽 순서를 가지고 있고
		 * 사용자마다 그 순서도 다르다.
		 * 예를 들어
		 * 어떤 컴퓨터에서는 0.81 0.000123 0.7182 이런 식으로 되어있고
		 * 다른 컴퓨터에서는 0.11 0.425 0.023 이런 식으로 되어있는 형식이다.
		 * 만약 우리가 nextInt()를 사용하면
		 * 각 실수에 int 범위의 최소 최대값을 곱해준다.
		 */
		
		/* 또한 nextInt() 등의 랜덤한 "정수"를 뽑아줄 때
		 * 우리가 범위를 지정해줄 수도 있다.
		 * 예를 들어서 nextInt(100) 이라고 하면
		 * 0부터 99까지의 랜덤한 숫자들이 나오게 된다!
		 */

		/* random.nextInt()를 사용해서
		 * 4번의 랜덤한 숫자를 뽑아보자.
		 */
		for(int i = 0; i < 4; i++) {
			System.out.println(random.nextInt());
		}
		System.out.println("---------------------------------");
		/* random.nextInt()를 사용해서
		 * 0~10 사이의 랜덤한 5개의 숫자를 뽑아보자.
		 */
		for(int i = 0; i < 5; i++) {
			System.out.println(random.nextInt(10));
		}
		
		//게임을 만들 때, 데미지가 5~200까지 랜덤하게 뜬다던지, 가위바위보 게임
		
		
		
		
	}

}
