package day0121;

import java.util.Scanner;
public class StarPrinter10If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 10번*****");
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 2 * number - 1; i++) {
            String stars = new String();
            // 총 폭의 갯수, 총 폭 - 별의 갯수 = 공백의 갯수(변수설정)
            int totalWidth = 2 * number - 1;
            if (i == 1 || i == totalWidth) {
                // 첫번째 줄 혹은 제일 마지막 줄인 경우
                // 별을 2 * num - 1개 만큼 넣어준다.
                for (int j = 1; j <= totalWidth; j++) {
                    stars += "*";
                }
            }else if (i <= number - 1) {
                // 첫번째 줄을 제외한 윗부분 ( 2 ~ 4 )
                // 폭 : 2 * number - 1 (변수설정)
                // 2~4번째 줄이지만, 1~3으로 바꿔서 하면 편하지(변수 설정)
                int upperI = i - 1;
                // 별의 갯수 5-1 5-2 5-3이네
                // 해당 줄의 왼쪽or오른쪽 별의 갯수(변수 설정)
                int starWidth = number - upperI;
                // 왼쪽 별 부분
                for (int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                // 해당 줄의 공백의 갯수(변수 설정)
                // = 총 너비 - 별의 갯수
                // totalWidth - 2*starWidth
                int spaceWidth = totalWidth - 2 * starWidth;
                // 가운데 공백 부분
                for (int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                // 오른쪽 별 부분
                for (int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
            }else { //맨 마지막을 제외한 아랫부분
                int lowerI = i - number + 1;
                
                //해당 줄의 별의 갯수
                int starWidth = lowerI;
                
                //왼쪽 별을 담당하는 j for 문
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*"; //stars에 별을 넣어줘
                }
                
                //해당 줄의 공백의 갯수
                int spaceWidth = totalWidth - 2 * starWidth;
                
                //가운데 공백을 담당하는 j for 문
                for(int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                
                //오른쪽 별을 담당하는 j for 문
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
                
            }

            System.out.println(stars);
        }
        scanner.close();
    }
}
