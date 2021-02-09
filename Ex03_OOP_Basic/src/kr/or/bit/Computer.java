// 컴퓨터 설계도
package kr.or.bit;

public class Computer {
    // 가격, 브랜드, 시리얼넘버, 색깔, 절전모드
    private int price;
    private String brand;
    private String serialNumber;
    private String color; 
    private boolean saveMode;
    
  
    
    public Computer(int price, String brand, String serialNumber,
            String color, boolean saveMode) {
        this.price = price;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.saveMode = saveMode;
    }
    // 메인바디, 키보드, 모니터 생성 
    MainBody mainBody = new MainBody(39800,"samsung",12345,2,16,false);
    Keyboard keyboard = new Keyboard("입력가능","red","logitech");
    Monitor monitor = new Monitor("화면출력","standard","samgsung",3);

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSaveMode() {
        return saveMode;
    }

    public void setSaveMode(boolean saveMode) {
        this.saveMode = saveMode;
    }
    
    // 지금부터 나오는 코드는 기능을 다루고 있습니다.
    
    // 입력
    void Input() {
        keyboard.setButton("안녕하세요.");
    }
    // 출력
    void Output() {
        monitor.setDisplay(keyboard.getButton());
        System.out.println(monitor.getDisplay());
    }
    
    // 전원 off
    void offPower() {
        mainBody.setPower(false);
        System.out.println("전원이 꺼졌습니다.");
    }
    // 전원on
    void onPower(){
        mainBody.setPower(true);
        System.out.println("전원이 켜졌습니다.");
    }
    // 절전모드 off
    void offSaveMode() {
        this.setSaveMode(false);
        System.out.println("절전모드가 꺼졌습니다.");
    }
    // 절전모드 on
    void onSaveMode(){
        this.setSaveMode(true);
        System.out.println("절전모드가 켜졌습니다.");
    }
    // 사칙연산 1) 더하기
    public int add(int i, int j) {
        int result = i+j;
        return result; 
        
    }
    // 사칙연산 2) 빼기
    public int minus(int i, int j) {
        int result = i-j;
        return result; 
    }
    // 사칙연산 3) 곱하기
    public int multiplication(int i, int j) {
        int result = i*j;
        return result;        
    }
    // 사칙연산 4) 나누기
    public int division(int i, int j) {
        int result = i/j;
        return result; 
        
    }
}