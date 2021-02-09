package day0126;
/* 배열 안에서 중복을 찾는 방법
 * 사용자로부터 입력을 받아서
 * int[] 안에 넣어준다. (크기는 4)
 * 만약 그 값이 이미 존재하는 경우에는 
 * 다시 입력하라고 한다.
 */

/* 중복 != 값이 같을 때
 * | 1 | 3 | 3 | 4 | 
 * "다른 칸에 똑같은 값이 있으면 중복이다."
 */

import java.util.Scanner;
public class Ex01Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //크기가 4인 int배열 생성
        int[] intArray = new int[4];
        
        //1.사용자로부터 입력을 받아 int[]안에 넣어준다.
        for(int i = 0; i < intArray.length; i++) {
            System.out.print(i+"번째 값: ");
            int userInput = scanner.nextInt();
            //중복 검사(j for 문)
            for(int j = 0; j < intArray.length; j++) {
                if(userInput == intArray[j]) {
                    System.out.println("중복된 값입니다.");
                    System.out.print(i+"번째 값: ");
                    userInput = scanner.nextInt();
                    j = -1;
                    //j=0이 된다.
                    //중복이 잇으면 앞으로 돌아가 검사하는 j for문
                }
                
            }
            
            //중복검사가 끝난 입력값은 문제 없기 때문에 넣는다.
            intArray[i] = userInput;
            
            
        }
        
        //2.무사히 끝났다 -> 중복된 값이 x -> 출력
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        
        
        scanner.close();
    }

}
