
public class Ex03_Cinema {
    public static void main(String[] args) {
        String[][] seat = new String[3][5];
        
        for(int i = 0; i < seat.length; i++) {
            for(int j = 0; j < seat[i].length; j++){
                seat[i][j] = "*"; //좌석
            }
        }
        
        for(int i = 0; i < seat.length; i++) {
            for(int j = 0; j < seat[i].length; j++){
                System.out.print(seat[i][j]);
            }
            System.out.println();
        }
        
        //좌석예매
        seat[2][1] = "홍길동";
        seat[0][0] = "김유신";
        
        for(int i = 0; i < seat.length; i++) {
            for(int j = 0; j < seat[i].length; j++){
                System.out.printf("[%s]", seat[i][j].equals("*")? "좌석" : "예매");
            }
            System.out.println();
        }
        
        int row , col; //사용자에게 행 열 값을 받았다고 가정하고
        row=0;
        col=0;
        //예매를 하겠다고 데이터 입력...
        if(seat[row][col].equals("*")) {
            System.out.println("예약 가능한 좌석입니다.");
        }else {
            System.out.println("이미 예약되었습니다.");
        }
        
        //좌석 초기화
        for(int i = 0; i < seat.length; i++) {
            for(int j = 0; j < seat[i].length; j++){
                seat[i][j] = "*"; //좌석
            }
        }
        
    }

}
