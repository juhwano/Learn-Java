package kr.or.bit;
/*
우리 회사는 비행기를 주문 제작 판매 하는 회사입니다
우리 회사는 비행기를 생산하는 설계도를 작성하려고 합니다.

 요구사항
 1.비행기를 생산하고 비행기의 이름과 번호를 부여해야 합니다.
 2.비행기가 생산되면 비행기의 이름과 번호가 맞게 부여되는지 확인 하는 작업 필요합니다(출력 정보 확인)
 3.공장장은 현재까지 만들어진 비행기의 총대수(누적)을 확인할 수 있습니다.
 
 AirPlane air = new AirPlane();
 AirPlane air2 = new AirPlane();
 AirPlane air3 = new AirPlane();
 
public class AirPlane {
    //번호가 필요
    private int airnum;
    //이름이 필요
    private String airname;
    //누적 대수(비행기 토탈 에어카운트가 같은 곳을 가르켜야함), 스태틱이어도 클래스 내부에서는 접근 가능
    private static int airtotalcount;
    
    
    
    //생산되면 이름,번호 부여
    public void makeAirPlane(int num , String name)
    {
        airnum = num;
        airname = name;
        //강제로 누적하는 코드
        airtotalcount++;
        
        AirPlaneInfo();
    }
    private void AirPlaneInfo() {
        System.out.println("비행기이름 : " + airname + " , 번호 : " + airnum);
    }
    
    public void airPlaneTotalCount() {
        System.out.printf("비행기 누적 대수 : [%d]\n", airtotalcount);
    }

}
*/   //this를 활용한 리팩토링
public class AirPlane {
    private int airnumber;
    private String airname;
    private static int airtotalcount;

    
    public static int getAirtotalcount() {
        return airtotalcount;
    }
    
//    public AirPlane() {}  >> default (x) 오버로딩(o)  
    //강제
    public AirPlane(int airnumber , String airname) {
        this.airnumber = airnumber;
        this.airname = airname;
        airtotalcount++;
        
        
    }
    public void AirPlaneInfo() {
        System.out.println("비행기이름 : " + this.airname + " , 번호 : " + this.airnumber);
    }
    
    public void airPlaneTotalCount() {
        System.out.printf("비행기 누적 대수 : [%d]\n", airtotalcount);
    }
    
}